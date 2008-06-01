/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author João Henrique
 */
@Entity
@Table(name = "acompanhamento_produtos_em_falta")
@NamedQueries({@NamedQuery(name = "AcompanhamentoProdutosEmFalta.findByCodProduto", query = "SELECT a FROM AcompanhamentoProdutosEmFalta a WHERE a.acompanhamentoProdutosEmFaltaPK.codProduto = :codProduto"), @NamedQuery(name = "AcompanhamentoProdutosEmFalta.findByCodVisitante", query = "SELECT a FROM AcompanhamentoProdutosEmFalta a WHERE a.acompanhamentoProdutosEmFaltaPK.codVisitante = :codVisitante"), @NamedQuery(name = "AcompanhamentoProdutosEmFalta.findByDataAtual", query = "SELECT a FROM AcompanhamentoProdutosEmFalta a WHERE a.dataAtual = :dataAtual"), @NamedQuery(name = "AcompanhamentoProdutosEmFalta.findByDataEnvio", query = "SELECT a FROM AcompanhamentoProdutosEmFalta a WHERE a.dataEnvio = :dataEnvio")})
public class AcompanhamentoProdutosEmFalta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AcompanhamentoProdutosEmFaltaPK acompanhamentoProdutosEmFaltaPK;
    @Column(name = "data_atual")
    @Temporal(TemporalType.DATE)
    private Date dataAtual;
    @Column(name = "data_envio")
    @Temporal(TemporalType.DATE)
    private Date dataEnvio;
    @JoinColumn(name = "cod_produto", referencedColumnName = "cod_produto", insertable = false, updatable = false)
    @ManyToOne
    private Produtos produtos;
    @JoinColumn(name = "cod_visitante", referencedColumnName = "cod_visitante", insertable = false, updatable = false)
    @ManyToOne
    private Visitante visitante;

    public AcompanhamentoProdutosEmFalta() {
    }

    public AcompanhamentoProdutosEmFalta(AcompanhamentoProdutosEmFaltaPK acompanhamentoProdutosEmFaltaPK) {
        this.acompanhamentoProdutosEmFaltaPK = acompanhamentoProdutosEmFaltaPK;
    }

    public AcompanhamentoProdutosEmFalta(int codProduto, int codVisitante) {
        this.acompanhamentoProdutosEmFaltaPK = new AcompanhamentoProdutosEmFaltaPK(codProduto, codVisitante);
    }

    public AcompanhamentoProdutosEmFaltaPK getAcompanhamentoProdutosEmFaltaPK() {
        return acompanhamentoProdutosEmFaltaPK;
    }

    public void setAcompanhamentoProdutosEmFaltaPK(AcompanhamentoProdutosEmFaltaPK acompanhamentoProdutosEmFaltaPK) {
        this.acompanhamentoProdutosEmFaltaPK = acompanhamentoProdutosEmFaltaPK;
    }

    public Date getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acompanhamentoProdutosEmFaltaPK != null ? acompanhamentoProdutosEmFaltaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcompanhamentoProdutosEmFalta)) {
            return false;
        }
        AcompanhamentoProdutosEmFalta other = (AcompanhamentoProdutosEmFalta) object;
        if ((this.acompanhamentoProdutosEmFaltaPK == null && other.acompanhamentoProdutosEmFaltaPK != null) || (this.acompanhamentoProdutosEmFaltaPK != null && !this.acompanhamentoProdutosEmFaltaPK.equals(other.acompanhamentoProdutosEmFaltaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.AcompanhamentoProdutosEmFalta[acompanhamentoProdutosEmFaltaPK=" + acompanhamentoProdutosEmFaltaPK + "]";
    }

}
