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
public class ClienteEstaGprPK implements Serializable {
    @Column(name = "cod_cliente", nullable = false)
    private int codCliente;
    @Column(name = "cod_grupo", nullable = false)
    private int codGrupo;

    public ClienteEstaGprPK() {
    }

    public ClienteEstaGprPK(int codCliente, int codGrupo) {
        this.codCliente = codCliente;
        this.codGrupo = codGrupo;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(int codGrupo) {
        this.codGrupo = codGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codCliente;
        hash += (int) codGrupo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClienteEstaGprPK)) {
            return false;
        }
        ClienteEstaGprPK other = (ClienteEstaGprPK) object;
        if (this.codCliente != other.codCliente) {
            return false;
        }
        if (this.codGrupo != other.codGrupo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.ClienteEstaGprPK[codCliente=" + codCliente + ", codGrupo=" + codGrupo + "]";
    }

}
