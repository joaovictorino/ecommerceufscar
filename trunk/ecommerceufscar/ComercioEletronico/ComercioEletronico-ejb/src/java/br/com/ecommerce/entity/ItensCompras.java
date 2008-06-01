/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author João Henrique
 */
@Entity
@Table(name = "itens_compras")
@NamedQueries({@NamedQuery(name = "ItensCompras.findByCodProduto", query = "SELECT i FROM ItensCompras i WHERE i.itensComprasPK.codProduto = :codProduto"), @NamedQuery(name = "ItensCompras.findByNumCompra", query = "SELECT i FROM ItensCompras i WHERE i.itensComprasPK.numCompra = :numCompra"), @NamedQuery(name = "ItensCompras.findByPrecoProduto", query = "SELECT i FROM ItensCompras i WHERE i.precoProduto = :precoProduto"), @NamedQuery(name = "ItensCompras.findByQuantidade", query = "SELECT i FROM ItensCompras i WHERE i.quantidade = :quantidade")})
public class ItensCompras implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItensComprasPK itensComprasPK;
    @Column(name = "preco_produto")
    private Double precoProduto;
    @Column(name = "quantidade")
    private Integer quantidade;
    @JoinColumn(name = "num_compra", referencedColumnName = "num_compra", insertable = false, updatable = false)
    @ManyToOne
    private Compras compras;
    @JoinColumn(name = "cod_produto", referencedColumnName = "cod_produto", insertable = false, updatable = false)
    @ManyToOne
    private Produtos produtos;

    public ItensCompras() {
    }

    public ItensCompras(ItensComprasPK itensComprasPK) {
        this.itensComprasPK = itensComprasPK;
    }

    public ItensCompras(int codProduto, int numCompra) {
        this.itensComprasPK = new ItensComprasPK(codProduto, numCompra);
    }

    public ItensComprasPK getItensComprasPK() {
        return itensComprasPK;
    }

    public void setItensComprasPK(ItensComprasPK itensComprasPK) {
        this.itensComprasPK = itensComprasPK;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Compras getCompras() {
        return compras;
    }

    public void setCompras(Compras compras) {
        this.compras = compras;
    }

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itensComprasPK != null ? itensComprasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensCompras)) {
            return false;
        }
        ItensCompras other = (ItensCompras) object;
        if ((this.itensComprasPK == null && other.itensComprasPK != null) || (this.itensComprasPK != null && !this.itensComprasPK.equals(other.itensComprasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.ItensCompras[itensComprasPK=" + itensComprasPK + "]";
    }

}
