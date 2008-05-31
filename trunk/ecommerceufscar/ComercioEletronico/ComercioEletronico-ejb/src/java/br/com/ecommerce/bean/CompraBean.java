/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecommerce.bean;

import br.com.ecommerce.entity.Compras;
import br.com.ecommerce.entity.Endereco;
import br.com.ecommerce.entity.ItensCompras;
import br.com.ecommerce.entity.Pessoa;
import br.com.ecommerce.entity.Produtos;
import br.com.ecommerce.entity.ItensCompras;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author João Henrique
 */
@Stateless(mappedName = "CompraBean")
@Remote({CompraRemote.class})
public class CompraBean implements CompraRemote {

    @PersistenceContext(unitName = "ComercioEletronico-ejbPU")
    private EntityManager em;
    @EJB(beanName = "ProdutoBean")
    private ProdutoRemote produtoBean;
    @EJB(beanName = "PessoaBean")
    private PessoaRemote pessoaBean;

    public boolean efetuarCompra(String login_cli, Map<Integer, Integer> mapProdutos) {
        double valorTotal = 0.0;
        Pessoa pessoa = new Pessoa();
        pessoa.setLoginPes(login_cli);
        Pessoa cliente = pessoaBean.getPessoaByLogin(pessoa);

        Compras compras = new Compras();

        Date now = new Date();
        compras.setDataPedido(now);
        compras.setDesconto(0.0);
        compras.setFormaPagamento(login_cli);
        compras.setLoginCli(cliente.getCliente());
        compras.setStatusCompra("Aprovado");
        compras.setObservacoes("");
        compras.setValorFrete(0.0);

        Collection<Endereco> listEnd = cliente.getEnderecoCollection();
        compras.setCodEndereco((Endereco) listEnd.toArray()[0]);
        
        em.persist(compras);

        for (Map.Entry<Integer, Integer> item : mapProdutos.entrySet()) {
            Produtos produtos = new Produtos();
            produtos.setCodProduto(item.getKey());
            Produtos produtoItem = produtoBean.buscarProdutoPorId(produtos);
            ItensCompras itens = new ItensCompras(compras.getNumCompra(), produtoItem.getCodProduto());
            itens.setPrecoProduto(produtoItem.getPreco());
            itens.setQuantidade(item.getValue());
            valorTotal += produtos.getPreco() * item.getValue();
            em.persist(itens);
        }
        
        compras.setValorTotal(valorTotal);
        
        em.persist(compras);
        
        return true;
    }
}
