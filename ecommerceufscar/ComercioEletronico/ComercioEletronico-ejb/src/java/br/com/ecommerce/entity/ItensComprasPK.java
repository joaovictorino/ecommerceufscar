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
 * @author Cliente
 */
@Embeddable
public class ItensComprasPK implements Serializable {
    @Column(name = "num_compra", nullable = false)
    private int numCompra;
    @Column(name = "cod_produto", nullable = false)
    private int codProduto;

    public ItensComprasPK() {
    }

    public ItensComprasPK(int numCompra, int codProduto) {
        this.numCompra = numCompra;
        this.codProduto = codProduto;
    }

    public int getNumCompra() {
        return numCompra;
    }

    public void setNumCompra(int numCompra) {
        this.numCompra = numCompra;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) numCompra;
        hash += (int) codProduto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItensComprasPK)) {
            return false;
        }
        ItensComprasPK other = (ItensComprasPK) object;
        if (this.numCompra != other.numCompra) {
            return false;
        }
        if (this.codProduto != other.codProduto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.ItensComprasPK[numCompra=" + numCompra + ", codProduto=" + codProduto + "]";
    }

}
