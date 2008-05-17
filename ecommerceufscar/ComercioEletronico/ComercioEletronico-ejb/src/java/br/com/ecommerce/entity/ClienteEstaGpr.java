/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Cliente
 */
@Entity
@Table(name = "cliente_esta_gpr")
@NamedQueries({@NamedQuery(name = "ClienteEstaGpr.findByCodCliente", query = "SELECT c FROM ClienteEstaGpr c WHERE c.clienteEstaGprPK.codCliente = :codCliente"), @NamedQuery(name = "ClienteEstaGpr.findByCodGrupo", query = "SELECT c FROM ClienteEstaGpr c WHERE c.clienteEstaGprPK.codGrupo = :codGrupo")})
public class ClienteEstaGpr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClienteEstaGprPK clienteEstaGprPK;
    @JoinColumn(name = "cod_cliente", referencedColumnName = "cod_cliente", insertable = false, updatable = false)
    @ManyToOne
    private Cliente cliente;
    @JoinColumn(name = "login_cli", referencedColumnName = "login_cli")
    @ManyToOne
    private Cliente loginCli;
    @JoinColumn(name = "cod_grupo", referencedColumnName = "cod_grupo", insertable = false, updatable = false)
    @ManyToOne
    private GrupoInteresse grupoInteresse;

    public ClienteEstaGpr() {
    }

    public ClienteEstaGpr(ClienteEstaGprPK clienteEstaGprPK) {
        this.clienteEstaGprPK = clienteEstaGprPK;
    }

    public ClienteEstaGpr(int codCliente, int codGrupo) {
        this.clienteEstaGprPK = new ClienteEstaGprPK(codCliente, codGrupo);
    }

    public ClienteEstaGprPK getClienteEstaGprPK() {
        return clienteEstaGprPK;
    }

    public void setClienteEstaGprPK(ClienteEstaGprPK clienteEstaGprPK) {
        this.clienteEstaGprPK = clienteEstaGprPK;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getLoginCli() {
        return loginCli;
    }

    public void setLoginCli(Cliente loginCli) {
        this.loginCli = loginCli;
    }

    public GrupoInteresse getGrupoInteresse() {
        return grupoInteresse;
    }

    public void setGrupoInteresse(GrupoInteresse grupoInteresse) {
        this.grupoInteresse = grupoInteresse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clienteEstaGprPK != null ? clienteEstaGprPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClienteEstaGpr)) {
            return false;
        }
        ClienteEstaGpr other = (ClienteEstaGpr) object;
        if ((this.clienteEstaGprPK == null && other.clienteEstaGprPK != null) || (this.clienteEstaGprPK != null && !this.clienteEstaGprPK.equals(other.clienteEstaGprPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.ClienteEstaGpr[clienteEstaGprPK=" + clienteEstaGprPK + "]";
    }

}
