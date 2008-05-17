/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Cliente
 */
@Entity
@Table(name = "cliente")
@NamedQueries({@NamedQuery(name = "Cliente.findByCodCliente", query = "SELECT c FROM Cliente c WHERE c.codCliente = :codCliente"), @NamedQuery(name = "Cliente.findByEmailSecundario", query = "SELECT c FROM Cliente c WHERE c.emailSecundario = :emailSecundario"), @NamedQuery(name = "Cliente.findByDesejaReceberEmail", query = "SELECT c FROM Cliente c WHERE c.desejaReceberEmail = :desejaReceberEmail")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cod_cliente", nullable = false)
    private Integer codCliente;
    @Column(name = "email_secundario")
    private String emailSecundario;
    @Column(name = "deseja_receber_email", nullable = false)
    private String desejaReceberEmail;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private Collection<ClienteEstaGpr> clienteEstaGprCollection;
    @OneToMany(mappedBy = "loginCli")
    private Collection<ClienteEstaGpr> clienteEstaGprCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codClienteVisitante")
    private Collection<HistoricoNavegacao> historicoNavegacaoCollection;
    @JoinColumn(name = "login_cli", referencedColumnName = "login_pes")
    @OneToOne
    private Pessoa loginCli;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "loginCli")
    private Collection<Compras> comprasCollection;

    public Cliente() {
    }

    public Cliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public Cliente(Integer codCliente, String desejaReceberEmail) {
        this.codCliente = codCliente;
        this.desejaReceberEmail = desejaReceberEmail;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getEmailSecundario() {
        return emailSecundario;
    }

    public void setEmailSecundario(String emailSecundario) {
        this.emailSecundario = emailSecundario;
    }

    public String getDesejaReceberEmail() {
        return desejaReceberEmail;
    }

    public void setDesejaReceberEmail(String desejaReceberEmail) {
        this.desejaReceberEmail = desejaReceberEmail;
    }

    public Collection<ClienteEstaGpr> getClienteEstaGprCollection() {
        return clienteEstaGprCollection;
    }

    public void setClienteEstaGprCollection(Collection<ClienteEstaGpr> clienteEstaGprCollection) {
        this.clienteEstaGprCollection = clienteEstaGprCollection;
    }

    public Collection<ClienteEstaGpr> getClienteEstaGprCollection1() {
        return clienteEstaGprCollection1;
    }

    public void setClienteEstaGprCollection1(Collection<ClienteEstaGpr> clienteEstaGprCollection1) {
        this.clienteEstaGprCollection1 = clienteEstaGprCollection1;
    }

    public Collection<HistoricoNavegacao> getHistoricoNavegacaoCollection() {
        return historicoNavegacaoCollection;
    }

    public void setHistoricoNavegacaoCollection(Collection<HistoricoNavegacao> historicoNavegacaoCollection) {
        this.historicoNavegacaoCollection = historicoNavegacaoCollection;
    }

    public Pessoa getLoginCli() {
        return loginCli;
    }

    public void setLoginCli(Pessoa loginCli) {
        this.loginCli = loginCli;
    }

    public Collection<Compras> getComprasCollection() {
        return comprasCollection;
    }

    public void setComprasCollection(Collection<Compras> comprasCollection) {
        this.comprasCollection = comprasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCliente != null ? codCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codCliente == null && other.codCliente != null) || (this.codCliente != null && !this.codCliente.equals(other.codCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.Cliente[codCliente=" + codCliente + "]";
    }

}
