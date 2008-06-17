/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.bean;

import br.com.ecommerce.entity.Produtos;
import br.com.ecommerce.remote.ProdutoRemote;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Cliente
 */
@Stateless(mappedName="ProdutoBean")
@Remote({ProdutoRemote.class})
public class ProdutoBean implements ProdutoRemote {
    @PersistenceContext(unitName = "ComercioEletronico-ejbPU")
    private EntityManager em;
    
    public Produtos buscarProdutoPorId(Produtos produto) {
        try {
            Query query = em.createNamedQuery("Produtos.findByCodProduto");
            query.setParameter("codProduto", produto.getCodProduto());
            return (Produtos)query.getSingleResult();
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Produtos> listarProdutosParaUsuarios(Produtos produto){
        try {
             //TODO melhorar essa query: deixar os preços serem nulos tb
             // deixar pesquisar por categoria pai e filho?
            Query query = em.createNamedQuery("Produtos.findAllByParametters");
            query.setParameter("nomeProduto", "%"+produto.getNomeProduto()+"%");
            query.setParameter("preco1", produto.getPreco());
            query.setParameter("preco2", Double.parseDouble(produto.getDadosTecnicos()));
            query.setParameter("categoria", produto.getCategoria().getCategoria());
            return query.getResultList();
        }catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Produtos> listaProdutosPorId(List<Integer> ids){
        List<Produtos> produtos = new ArrayList<Produtos>();
        Produtos produto = null;
        for(Integer id : ids){
            produto = new Produtos();
            produto.setCodProduto(id);
            produtos.add(this.buscarProdutoPorId(produto));
        }
        return produtos;
    }

    public void incrementarNroVisita(Integer intCodProduto) {
        Produtos produto = new Produtos();
        produto.setCodProduto(intCodProduto);
        Produtos result = this.buscarProdutoPorId(produto);
        result.setNumeroVisualizacao(result.getNumeroVisualizacao() + 1);
        em.persist(result);
    }
}
