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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author João Henrique
 */
@Entity
@Table(name = "pessoa")
@NamedQueries({@NamedQuery(name = "Pessoa.findByLoginPes", query = "SELECT p FROM Pessoa p WHERE p.loginPes = :loginPes"), @NamedQuery(name = "Pessoa.findByCelular", query = "SELECT p FROM Pessoa p WHERE p.celular = :celular"), @NamedQuery(name = "Pessoa.findByCpf", query = "SELECT p FROM Pessoa p WHERE p.cpf = :cpf"), @NamedQuery(name = "Pessoa.findByDataNasc", query = "SELECT p FROM Pessoa p WHERE p.dataNasc = :dataNasc"), @NamedQuery(name = "Pessoa.findByDddcelular", query = "SELECT p FROM Pessoa p WHERE p.dddcelular = :dddcelular"), @NamedQuery(name = "Pessoa.findByDddtelefone", query = "SELECT p FROM Pessoa p WHERE p.dddtelefone = :dddtelefone"), @NamedQuery(name = "Pessoa.findByEmail", query = "SELECT p FROM Pessoa p WHERE p.email = :email"), @NamedQuery(name = "Pessoa.findByNome", query = "SELECT p FROM Pessoa p WHERE p.nome = :nome"), @NamedQuery(name = "Pessoa.findByRamal", query = "SELECT p FROM Pessoa p WHERE p.ramal = :ramal"), @NamedQuery(name = "Pessoa.findBySenha", query = "SELECT p FROM Pessoa p WHERE p.senha = :senha"), @NamedQuery(name = "Pessoa.findByTelefone", query = "SELECT p FROM Pessoa p WHERE p.telefone = :telefone")})
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "login_pes", nullable = false)
    private String loginPes;
    @Column(name = "celular")
    private String celular;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "data_nasc")
    @Temporal(TemporalType.DATE)
    private Date dataNasc;
    @Column(name = "dddcelular")
    private String dddcelular;
    @Column(name = "dddtelefone")
    private String dddtelefone;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "nome")
    private String nome;
    @Column(name = "ramal")
    private String ramal;
    @Column(name = "senha", nullable = false)
    private String senha;
    @Column(name = "telefone")
    private String telefone;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pessoa")
    private Administrador administrador;
    @OneToOne(mappedBy = "loginCli")
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "loginEnd")
    private Collection<Endereco> enderecoCollection;

    public Pessoa() {
    }

    public Pessoa(String loginPes) {
        this.loginPes = loginPes;
    }

    public Pessoa(String loginPes, String email, String senha) {
        this.loginPes = loginPes;
        this.email = email;
        this.senha = senha;
    }

    public String getLoginPes() {
        return loginPes;
    }

    public void setLoginPes(String loginPes) {
        this.loginPes = loginPes;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getDddcelular() {
        return dddcelular;
    }

    public void setDddcelular(String dddcelular) {
        this.dddcelular = dddcelular;
    }

    public String getDddtelefone() {
        return dddtelefone;
    }

    public void setDddtelefone(String dddtelefone) {
        this.dddtelefone = dddtelefone;
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

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Collection<Endereco> getEnderecoCollection() {
        return enderecoCollection;
    }

    public void setEnderecoCollection(Collection<Endereco> enderecoCollection) {
        this.enderecoCollection = enderecoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loginPes != null ? loginPes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.loginPes == null && other.loginPes != null) || (this.loginPes != null && !this.loginPes.equals(other.loginPes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.Pessoa[loginPes=" + loginPes + "]";
    }

}
