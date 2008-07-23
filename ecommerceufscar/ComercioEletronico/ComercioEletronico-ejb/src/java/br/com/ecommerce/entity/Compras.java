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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author João Henrique
 */
@Entity
@Table(name = "compras")
@NamedQueries({@NamedQuery(name = "Compras.findByLoginCli", query = "SELECT c FROM Compras c WHERE c.loginCli = :loginCli order by numCompra desc"), @NamedQuery(name = "Compras.findByNumCompra", query = "SELECT c FROM Compras c WHERE c.numCompra = :numCompra"), @NamedQuery(name = "Compras.findByDataEntrega", query = "SELECT c FROM Compras c WHERE c.dataEntrega = :dataEntrega"), @NamedQuery(name = "Compras.findByDataPedido", query = "SELECT c FROM Compras c WHERE c.dataPedido = :dataPedido"), @NamedQuery(name = "Compras.findByDataPrevistaEntrega", query = "SELECT c FROM Compras c WHERE c.dataPrevistaEntrega = :dataPrevistaEntrega"), @NamedQuery(name = "Compras.findByDesconto", query = "SELECT c FROM Compras c WHERE c.desconto = :desconto"), @NamedQuery(name = "Compras.findByFormaPagamento", query = "SELECT c FROM Compras c WHERE c.formaPagamento = :formaPagamento"), @NamedQuery(name = "Compras.findByObservacoes", query = "SELECT c FROM Compras c WHERE c.observacoes = :observacoes"), @NamedQuery(name = "Compras.findByStatusCompra", query = "SELECT c FROM Compras c WHERE c.statusCompra = :statusCompra"), @NamedQuery(name = "Compras.findByValorFrete", query = "SELECT c FROM Compras c WHERE c.valorFrete = :valorFrete"), @NamedQuery(name = "Compras.findByValorTotal", query = "SELECT c FROM Compras c WHERE c.valorTotal = :valorTotal")})
public class Compras implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "compras_num_compra_seq")
    @SequenceGenerator(name="compras_num_compra_seq", sequenceName="compras_num_compra_seq", initialValue=1, allocationSize=1)
    @Column(name = "num_compra", nullable = false)
    private Integer numCompra;
    @Column(name = "data_entrega")
    @Temporal(TemporalType.DATE)
    private Date dataEntrega;
    @Column(name = "data_pedido")
    @Temporal(TemporalType.DATE)
    private Date dataPedido;
    @Column(name = "data_prevista_entrega")
    @Temporal(TemporalType.DATE)
    private Date dataPrevistaEntrega;
    @Column(name = "desconto")
    private Double desconto;
    @Column(name = "forma_pagamento")
    private String formaPagamento;
    @Column(name = "observacoes")
    private String observacoes;
    @Column(name = "status_compra")
    private String statusCompra;
    @Column(name = "valor_frete")
    private Double valorFrete;
    @Column(name = "valor_total")
    private Double valorTotal;
    @JoinColumn(name = "login_cli", referencedColumnName = "login_cli")
    @ManyToOne
    private Cliente loginCli;
    @JoinColumn(name = "cod_endereco", referencedColumnName = "cod_endereco")
    @ManyToOne
    private Endereco codEndereco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compras")
    private Collection<ItensCompras> itensComprasCollection;

    public Compras() {
    }

    public Compras(Integer numCompra) {
        this.numCompra = numCompra;
    }

    public Integer getNumCompra() {
        return numCompra;
    }

    public void setNumCompra(Integer numCompra) {
        this.numCompra = numCompra;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Date getDataPrevistaEntrega() {
        return dataPrevistaEntrega;
    }

    public void setDataPrevistaEntrega(Date dataPrevistaEntrega) {
        this.dataPrevistaEntrega = dataPrevistaEntrega;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getStatusCompra() {
        return statusCompra;
    }

    public void setStatusCompra(String statusCompra) {
        this.statusCompra = statusCompra;
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getLoginCli() {
        return loginCli;
    }

    public void setLoginCli(Cliente loginCli) {
        this.loginCli = loginCli;
    }

    public Endereco getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(Endereco codEndereco) {
        this.codEndereco = codEndereco;
    }

    public Collection<ItensCompras> getItensComprasCollection() {
        return itensComprasCollection;
    }

    public void setItensComprasCollection(Collection<ItensCompras> itensComprasCollection) {
        this.itensComprasCollection = itensComprasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numCompra != null ? numCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compras)) {
            return false;
        }
        Compras other = (Compras) object;
        if ((this.numCompra == null && other.numCompra != null) || (this.numCompra != null && !this.numCompra.equals(other.numCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.Compras[numCompra=" + numCompra + "]";
    }

}
