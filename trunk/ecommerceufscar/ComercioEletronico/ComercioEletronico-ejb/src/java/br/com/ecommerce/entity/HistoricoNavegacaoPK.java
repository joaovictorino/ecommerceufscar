/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author João Henrique
 */
@Embeddable
public class HistoricoNavegacaoPK implements Serializable {
    @Column(name = "data_hora_acesso", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraAcesso;
    @Column(name = "endereco_ip", nullable = false)
    private String enderecoIp;

    public HistoricoNavegacaoPK() {
    }

    public HistoricoNavegacaoPK(Date dataHoraAcesso, String enderecoIp) {
        this.dataHoraAcesso = dataHoraAcesso;
        this.enderecoIp = enderecoIp;
    }

    public Date getDataHoraAcesso() {
        return dataHoraAcesso;
    }

    public void setDataHoraAcesso(Date dataHoraAcesso) {
        this.dataHoraAcesso = dataHoraAcesso;
    }

    public String getEnderecoIp() {
        return enderecoIp;
    }

    public void setEnderecoIp(String enderecoIp) {
        this.enderecoIp = enderecoIp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataHoraAcesso != null ? dataHoraAcesso.hashCode() : 0);
        hash += (enderecoIp != null ? enderecoIp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricoNavegacaoPK)) {
            return false;
        }
        HistoricoNavegacaoPK other = (HistoricoNavegacaoPK) object;
        if ((this.dataHoraAcesso == null && other.dataHoraAcesso != null) || (this.dataHoraAcesso != null && !this.dataHoraAcesso.equals(other.dataHoraAcesso))) {
            return false;
        }
        if ((this.enderecoIp == null && other.enderecoIp != null) || (this.enderecoIp != null && !this.enderecoIp.equals(other.enderecoIp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.HistoricoNavegacaoPK[dataHoraAcesso=" + dataHoraAcesso + ", enderecoIp=" + enderecoIp + "]";
    }

}
