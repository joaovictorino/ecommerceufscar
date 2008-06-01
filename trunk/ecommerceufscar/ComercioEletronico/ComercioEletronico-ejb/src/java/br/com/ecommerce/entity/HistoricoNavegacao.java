/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.entity;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "historico_navegacao")
@NamedQueries({@NamedQuery(name = "HistoricoNavegacao.findByDataHoraAcesso", query = "SELECT h FROM HistoricoNavegacao h WHERE h.historicoNavegacaoPK.dataHoraAcesso = :dataHoraAcesso"), @NamedQuery(name = "HistoricoNavegacao.findByEnderecoIp", query = "SELECT h FROM HistoricoNavegacao h WHERE h.historicoNavegacaoPK.enderecoIp = :enderecoIp")})
public class HistoricoNavegacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HistoricoNavegacaoPK historicoNavegacaoPK;
    @JoinColumn(name = "cod_cliente_visitante", referencedColumnName = "cod_cliente")
    @ManyToOne
    private Cliente codClienteVisitante;
    @JoinColumn(name = "cod_produto", referencedColumnName = "cod_produto")
    @ManyToOne
    private Produtos codProduto;

    public HistoricoNavegacao() {
    }

    public HistoricoNavegacao(HistoricoNavegacaoPK historicoNavegacaoPK) {
        this.historicoNavegacaoPK = historicoNavegacaoPK;
    }

    public HistoricoNavegacao(Date dataHoraAcesso, String enderecoIp) {
        this.historicoNavegacaoPK = new HistoricoNavegacaoPK(dataHoraAcesso, enderecoIp);
    }

    public HistoricoNavegacaoPK getHistoricoNavegacaoPK() {
        return historicoNavegacaoPK;
    }

    public void setHistoricoNavegacaoPK(HistoricoNavegacaoPK historicoNavegacaoPK) {
        this.historicoNavegacaoPK = historicoNavegacaoPK;
    }

    public Cliente getCodClienteVisitante() {
        return codClienteVisitante;
    }

    public void setCodClienteVisitante(Cliente codClienteVisitante) {
        this.codClienteVisitante = codClienteVisitante;
    }

    public Produtos getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Produtos codProduto) {
        this.codProduto = codProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historicoNavegacaoPK != null ? historicoNavegacaoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricoNavegacao)) {
            return false;
        }
        HistoricoNavegacao other = (HistoricoNavegacao) object;
        if ((this.historicoNavegacaoPK == null && other.historicoNavegacaoPK != null) || (this.historicoNavegacaoPK != null && !this.historicoNavegacaoPK.equals(other.historicoNavegacaoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.HistoricoNavegacao[historicoNavegacaoPK=" + historicoNavegacaoPK + "]";
    }

}
