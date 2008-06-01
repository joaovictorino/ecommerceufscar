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
public class AcompanhamentoProdutosEmFaltaPK implements Serializable {
    @Column(name = "cod_produto", nullable = false)
    private int codProduto;
    @Column(name = "cod_visitante", nullable = false)
    private int codVisitante;

    public AcompanhamentoProdutosEmFaltaPK() {
    }

    public AcompanhamentoProdutosEmFaltaPK(int codProduto, int codVisitante) {
        this.codProduto = codProduto;
        this.codVisitante = codVisitante;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getCodVisitante() {
        return codVisitante;
    }

    public void setCodVisitante(int codVisitante) {
        this.codVisitante = codVisitante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codProduto;
        hash += (int) codVisitante;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcompanhamentoProdutosEmFaltaPK)) {
            return false;
        }
        AcompanhamentoProdutosEmFaltaPK other = (AcompanhamentoProdutosEmFaltaPK) object;
        if (this.codProduto != other.codProduto) {
            return false;
        }
        if (this.codVisitante != other.codVisitante) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.AcompanhamentoProdutosEmFaltaPK[codProduto=" + codProduto + ", codVisitante=" + codVisitante + "]";
    }

}
