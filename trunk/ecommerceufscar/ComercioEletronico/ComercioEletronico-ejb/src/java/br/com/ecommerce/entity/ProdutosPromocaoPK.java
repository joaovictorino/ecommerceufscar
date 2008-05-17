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
public class ProdutosPromocaoPK implements Serializable {
    @Column(name = "cod_promocao", nullable = false)
    private int codPromocao;
    @Column(name = "cod_produto", nullable = false)
    private int codProduto;

    public ProdutosPromocaoPK() {
    }

    public ProdutosPromocaoPK(int codPromocao, int codProduto) {
        this.codPromocao = codPromocao;
        this.codProduto = codProduto;
    }

    public int getCodPromocao() {
        return codPromocao;
    }

    public void setCodPromocao(int codPromocao) {
        this.codPromocao = codPromocao;
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
        hash += (int) codPromocao;
        hash += (int) codProduto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdutosPromocaoPK)) {
            return false;
        }
        ProdutosPromocaoPK other = (ProdutosPromocaoPK) object;
        if (this.codPromocao != other.codPromocao) {
            return false;
        }
        if (this.codProduto != other.codProduto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.ProdutosPromocaoPK[codPromocao=" + codPromocao + ", codProduto=" + codProduto + "]";
    }

}
