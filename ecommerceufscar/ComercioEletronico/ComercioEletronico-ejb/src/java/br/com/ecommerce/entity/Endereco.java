/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author João Henrique
 */
@Entity
@Table(name = "endereco")
@NamedQueries({@NamedQuery(name = "Endereco.findByCodEndereco", query = "SELECT e FROM Endereco e WHERE e.codEndereco = :codEndereco"), @NamedQuery(name = "Endereco.findByBairro", query = "SELECT e FROM Endereco e WHERE e.bairro = :bairro"), @NamedQuery(name = "Endereco.findByCep", query = "SELECT e FROM Endereco e WHERE e.cep = :cep"), @NamedQuery(name = "Endereco.findByCidade", query = "SELECT e FROM Endereco e WHERE e.cidade = :cidade"), @NamedQuery(name = "Endereco.findByEndereco", query = "SELECT e FROM Endereco e WHERE e.endereco = :endereco"), @NamedQuery(name = "Endereco.findByEstado", query = "SELECT e FROM Endereco e WHERE e.estado = :estado"), @NamedQuery(name = "Endereco.findByNumero", query = "SELECT e FROM Endereco e WHERE e.numero = :numero"), @NamedQuery(name = "Endereco.findByPais", query = "SELECT e FROM Endereco e WHERE e.pais = :pais"), @NamedQuery(name = "Endereco.findByTipoEndereco", query = "SELECT e FROM Endereco e WHERE e.tipoEndereco = :tipoEndereco")})
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "endereco_cod_endereco_seq")
    @SequenceGenerator(name="endereco_cod_endereco_seq", sequenceName="endereco_cod_endereco_seq", initialValue=1, allocationSize=1)
    @Column(name = "cod_endereco", nullable = false)
    private Integer codEndereco;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cep", nullable = false)
    private String cep;
    @Column(name = "cidade", nullable = false)
    private String cidade;
    @Column(name = "endereco", nullable = false)
    private String endereco;
    @Column(name = "estado", nullable = false)
    private String estado;
    @Column(name = "numero", nullable = false)
    private int numero;
    @Column(name = "pais")
    private String pais;
    @Column(name = "tipo_endereco", nullable = false)
    private String tipoEndereco;
    @OneToMany(mappedBy = "codEndereco")
    private Collection<Compras> comprasCollection;
    @JoinColumn(name = "login_end", referencedColumnName = "login_pes")
    @ManyToOne
    private Pessoa loginEnd;

    public Endereco() {
    }

    public Endereco(Integer codEndereco) {
        this.codEndereco = codEndereco;
    }

    public Endereco(Integer codEndereco, String cep, String cidade, String endereco, String estado, int numero, String tipoEndereco) {
        this.codEndereco = codEndereco;
        this.cep = cep;
        this.cidade = cidade;
        this.endereco = endereco;
        this.estado = estado;
        this.numero = numero;
        this.tipoEndereco = tipoEndereco;
    }

    public Integer getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(Integer codEndereco) {
        this.codEndereco = codEndereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(String tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public Collection<Compras> getComprasCollection() {
        return comprasCollection;
    }

    public void setComprasCollection(Collection<Compras> comprasCollection) {
        this.comprasCollection = comprasCollection;
    }

    public Pessoa getLoginEnd() {
        return loginEnd;
    }

    public void setLoginEnd(Pessoa loginEnd) {
        this.loginEnd = loginEnd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEndereco != null ? codEndereco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Endereco)) {
            return false;
        }
        Endereco other = (Endereco) object;
        if ((this.codEndereco == null && other.codEndereco != null) || (this.codEndereco != null && !this.codEndereco.equals(other.codEndereco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.Endereco[codEndereco=" + codEndereco + "]";
    }

}
