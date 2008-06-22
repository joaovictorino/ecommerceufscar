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
import br.com.ecommerce.remote.CompraRemote;
import br.com.ecommerce.remote.PessoaRemote;
import br.com.ecommerce.remote.ProdutoRemote;
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

    public Integer efetuarCompra(String login_cli, Map<Integer, Integer> mapProdutos) {
        double valorTotal = 0.0;
        Pessoa pessoa = new Pessoa();
        pessoa.setLoginPes(login_cli);
        Pessoa cliente = pessoaBean.getPessoaByLogin(pessoa);

        Compras compras = new Compras();

        Date now = new Date();
        compras.setDataPedido(now);
        compras.setDesconto(0.0);
        compras.setFormaPagamento("");
        compras.setLoginCli(cliente.getCliente());
        compras.setStatusCompra("Aprovado");
        compras.setObservacoes("");
        compras.setValorFrete(0.0);

        Collection<Endereco> listEnd = cliente.getEnderecoCollection();
        compras.setCodEndereco((Endereco) listEnd.toArray()[0]);
        
        em.persist(compras);

        for (Map.Entry<Integer, Integer> item : mapProdutos.entrySet()) {
            Produtos produtoItem = new Produtos();
            produtoItem.setCodProduto(item.getKey());
            produtoItem = produtoBean.buscarProdutoPorId(produtoItem);
            produtoItem.setQtdeCompras(produtoItem.getQtdeCompras() + item.getValue());
            produtoItem.setQtdeEstoque(produtoItem.getQtdeEstoque() - item.getValue());        
            ItensCompras itens = new ItensCompras(produtoItem.getCodProduto(), compras.getNumCompra());
            itens.setPrecoProduto(produtoItem.getPreco());
            itens.setQuantidade(item.getValue());
            valorTotal += produtoItem.getPreco() * item.getValue();
            
            em.merge(produtoItem);
            
            em.persist(itens);
        }
        
        compras.setValorTotal(valorTotal);
        em.persist(compras);
        
        return compras.getNumCompra();
    }
}
