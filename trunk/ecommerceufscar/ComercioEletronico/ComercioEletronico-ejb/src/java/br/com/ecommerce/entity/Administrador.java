/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cliente
 */
@Entity
@Table(name = "administrador")
@NamedQueries({@NamedQuery(name = "Administrador.findByLoginAdm", query = "SELECT a FROM Administrador a WHERE a.loginAdm = :loginAdm"), @NamedQuery(name = "Administrador.findByFraseSeguranca", query = "SELECT a FROM Administrador a WHERE a.fraseSeguranca = :fraseSeguranca"), @NamedQuery(name = "Administrador.findByRg", query = "SELECT a FROM Administrador a WHERE a.rg = :rg"), @NamedQuery(name = "Administrador.findByPassaporte", query = "SELECT a FROM Administrador a WHERE a.passaporte = :passaporte"), @NamedQuery(name = "Administrador.findByOrgaoExpedicao", query = "SELECT a FROM Administrador a WHERE a.orgaoExpedicao = :orgaoExpedicao"), @NamedQuery(name = "Administrador.findByTituloEleitor", query = "SELECT a FROM Administrador a WHERE a.tituloEleitor = :tituloEleitor"), @NamedQuery(name = "Administrador.findByDataExpedicao", query = "SELECT a FROM Administrador a WHERE a.dataExpedicao = :dataExpedicao")})
public class Administrador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "login_adm", nullable = false)
    private String loginAdm;
    @Column(name = "frase_seguranca", nullable = false)
    private String fraseSeguranca;
    @Column(name = "rg", nullable = false)
    private String rg;
    @Column(name = "passaporte")
    private String passaporte;
    @Column(name = "orgao_expedicao")
    private String orgaoExpedicao;
    @Column(name = "titulo_eleitor")
    private String tituloEleitor;
    @Column(name = "data_expedicao")
    @Temporal(TemporalType.DATE)
    private Date dataExpedicao;
    @JoinColumn(name = "login_adm", referencedColumnName = "login_pes", insertable = false, updatable = false)
    @OneToOne
    private Pessoa pessoa;

    public Administrador() {
    }

    public Administrador(String loginAdm) {
        this.loginAdm = loginAdm;
    }

    public Administrador(String loginAdm, String fraseSeguranca, String rg) {
        this.loginAdm = loginAdm;
        this.fraseSeguranca = fraseSeguranca;
        this.rg = rg;
    }

    public String getLoginAdm() {
        return loginAdm;
    }

    public void setLoginAdm(String loginAdm) {
        this.loginAdm = loginAdm;
    }

    public String getFraseSeguranca() {
        return fraseSeguranca;
    }

    public void setFraseSeguranca(String fraseSeguranca) {
        this.fraseSeguranca = fraseSeguranca;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public String getOrgaoExpedicao() {
        return orgaoExpedicao;
    }

    public void setOrgaoExpedicao(String orgaoExpedicao) {
        this.orgaoExpedicao = orgaoExpedicao;
    }

    public String getTituloEleitor() {
        return tituloEleitor;
    }

    public void setTituloEleitor(String tituloEleitor) {
        this.tituloEleitor = tituloEleitor;
    }

    public Date getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(Date dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loginAdm != null ? loginAdm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrador)) {
            return false;
        }
        Administrador other = (Administrador) object;
        if ((this.loginAdm == null && other.loginAdm != null) || (this.loginAdm != null && !this.loginAdm.equals(other.loginAdm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.Administrador[loginAdm=" + loginAdm + "]";
    }

}
