/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author João Henrique
 */
@Embeddable
public class ItensComprasPK implements Serializable {
    @Column(name = "cod_produto", nullable = false)
    private int codProduto;
    @Column(name = "num_compra", nullable = false)
    private int numCompra;

    public ItensComprasPK() {
    }

    public ItensComprasPK(int codProduto, int numCompra) {
        this.codProduto = codProduto;
        this.numCompra = numCompra;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getNumCompra() {
        return numCompra;
    }

    public void setNumCompra(int numCompra) {
        this.numCompra = numCompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codProduto;
        hash += (int) numCompra;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensComprasPK)) {
            return false;
        }
        ItensComprasPK other = (ItensComprasPK) object;
        if (this.codProduto != other.codProduto) {
            return false;
        }
        if (this.numCompra != other.numCompra) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.ItensComprasPK[codProduto=" + codProduto + ", numCompra=" + numCompra + "]";
    }

}
