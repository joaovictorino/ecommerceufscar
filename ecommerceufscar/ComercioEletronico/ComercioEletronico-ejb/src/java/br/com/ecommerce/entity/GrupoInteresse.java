/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cliente
 */
@Entity
@Table(name = "grupo_interesse")
@NamedQueries({@NamedQuery(name = "GrupoInteresse.findByCodGrupo", query = "SELECT g FROM GrupoInteresse g WHERE g.codGrupo = :codGrupo"), @NamedQuery(name = "GrupoInteresse.findByDataCriacao", query = "SELECT g FROM GrupoInteresse g WHERE g.dataCriacao = :dataCriacao")})
public class GrupoInteresse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cod_grupo", nullable = false)
    private Integer codGrupo;
    @Column(name = "data_criacao")
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;
    @JoinTable(name = "grp_tem_produto", joinColumns = {@JoinColumn(name = "cod_grupo", referencedColumnName = "cod_grupo")}, inverseJoinColumns = {@JoinColumn(name = "cod_produto", referencedColumnName = "cod_produto")})
    @ManyToMany
    private Collection<Produtos> codProdutoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "grupoInteresse")
    private Collection<ClienteEstaGpr> clienteEstaGprCollection;

    public GrupoInteresse() {
    }

    public GrupoInteresse(Integer codGrupo) {
        this.codGrupo = codGrupo;
    }

    public Integer getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(Integer codGrupo) {
        this.codGrupo = codGrupo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Collection<Produtos> getCodProdutoCollection() {
        return codProdutoCollection;
    }

    public void setCodProdutoCollection(Collection<Produtos> codProdutoCollection) {
        this.codProdutoCollection = codProdutoCollection;
    }

    public Collection<ClienteEstaGpr> getClienteEstaGprCollection() {
        return clienteEstaGprCollection;
    }

    public void setClienteEstaGprCollection(Collection<ClienteEstaGpr> clienteEstaGprCollection) {
        this.clienteEstaGprCollection = clienteEstaGprCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codGrupo != null ? codGrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupoInteresse)) {
            return false;
        }
        GrupoInteresse other = (GrupoInteresse) object;
        if ((this.codGrupo == null && other.codGrupo != null) || (this.codGrupo != null && !this.codGrupo.equals(other.codGrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.GrupoInteresse[codGrupo=" + codGrupo + "]";
    }

}
