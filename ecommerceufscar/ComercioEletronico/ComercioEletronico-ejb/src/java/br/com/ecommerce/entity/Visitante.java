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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author João Henrique
 */
@Entity
@Table(name = "visitante")
@NamedQueries({@NamedQuery(name = "Visitante.findByCodVisitante", query = "SELECT v FROM Visitante v WHERE v.codVisitante = :codVisitante"), @NamedQuery(name = "Visitante.findByEmail", query = "SELECT v FROM Visitante v WHERE v.email = :email"), @NamedQuery(name = "Visitante.findByNome", query = "SELECT v FROM Visitante v WHERE v.nome = :nome")})
public class Visitante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cod_visitante", nullable = false)
    private Integer codVisitante;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "nome", nullable = false)
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visitante")
    private Collection<AcompanhamentoProdutosEmFalta> acompanhamentoProdutosEmFaltaCollection;

    public Visitante() {
    }

    public Visitante(Integer codVisitante) {
        this.codVisitante = codVisitante;
    }

    public Visitante(Integer codVisitante, String email, String nome) {
        this.codVisitante = codVisitante;
        this.email = email;
        this.nome = nome;
    }

    public Integer getCodVisitante() {
        return codVisitante;
    }

    public void setCodVisitante(Integer codVisitante) {
        this.codVisitante = codVisitante;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<AcompanhamentoProdutosEmFalta> getAcompanhamentoProdutosEmFaltaCollection() {
        return acompanhamentoProdutosEmFaltaCollection;
    }

    public void setAcompanhamentoProdutosEmFaltaCollection(Collection<AcompanhamentoProdutosEmFalta> acompanhamentoProdutosEmFaltaCollection) {
        this.acompanhamentoProdutosEmFaltaCollection = acompanhamentoProdutosEmFaltaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codVisitante != null ? codVisitante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visitante)) {
            return false;
        }
        Visitante other = (Visitante) object;
        if ((this.codVisitante == null && other.codVisitante != null) || (this.codVisitante != null && !this.codVisitante.equals(other.codVisitante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.Visitante[codVisitante=" + codVisitante + "]";
    }

}
