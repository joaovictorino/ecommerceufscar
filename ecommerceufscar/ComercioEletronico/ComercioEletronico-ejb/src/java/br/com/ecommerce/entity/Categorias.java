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
 * @author Cliente
 */
@Entity
@Table(name = "categorias")
@NamedQueries({@NamedQuery(name = "Categorias.findByCategoria", query = "SELECT c FROM Categorias c WHERE c.categoria = :categoria"), @NamedQuery(name = "Categorias.findByCategoriaPai", query = "SELECT c FROM Categorias c WHERE c.categoriaPai = :categoriaPai")})
public class Categorias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "categoria", nullable = false)
    private String categoria;
    @Column(name = "categoria_pai")
    private String categoriaPai;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoria")
    private Collection<Produtos> produtosCollection;

    public Categorias() {
    }

    public Categorias(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoriaPai() {
        return categoriaPai;
    }

    public void setCategoriaPai(String categoriaPai) {
        this.categoriaPai = categoriaPai;
    }

    public Collection<Produtos> getProdutosCollection() {
        return produtosCollection;
    }

    public void setProdutosCollection(Collection<Produtos> produtosCollection) {
        this.produtosCollection = produtosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (categoria != null ? categoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorias)) {
            return false;
        }
        Categorias other = (Categorias) object;
        if ((this.categoria == null && other.categoria != null) || (this.categoria != null && !this.categoria.equals(other.categoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.Categorias[categoria=" + categoria + "]";
    }

}
