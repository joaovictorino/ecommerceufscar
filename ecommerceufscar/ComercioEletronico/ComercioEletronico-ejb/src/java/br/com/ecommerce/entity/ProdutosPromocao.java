/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author João Henrique
 */
@Entity
@Table(name = "produtos_promocao")
@NamedQueries({@NamedQuery(name = "ProdutosPromocao.findByCodProduto", query = "SELECT p FROM ProdutosPromocao p WHERE p.produtosPromocaoPK.codProduto = :codProduto"), @NamedQuery(name = "ProdutosPromocao.findByCodPromocao", query = "SELECT p FROM ProdutosPromocao p WHERE p.produtosPromocaoPK.codPromocao = :codPromocao"), @NamedQuery(name = "ProdutosPromocao.findByDataFimPromocao", query = "SELECT p FROM ProdutosPromocao p WHERE p.dataFimPromocao = :dataFimPromocao"), @NamedQuery(name = "ProdutosPromocao.findByDataInicioPromocao", query = "SELECT p FROM ProdutosPromocao p WHERE p.dataInicioPromocao = :dataInicioPromocao"), @NamedQuery(name = "ProdutosPromocao.findByObservacoes", query = "SELECT p FROM ProdutosPromocao p WHERE p.observacoes = :observacoes"), @NamedQuery(name = "ProdutosPromocao.findByPrecoPromocional", query = "SELECT p FROM ProdutosPromocao p WHERE p.precoPromocional = :precoPromocional")})
public class ProdutosPromocao implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProdutosPromocaoPK produtosPromocaoPK;
    @Column(name = "data_fim_promocao")
    @Temporal(TemporalType.DATE)
    private Date dataFimPromocao;
    @Column(name = "data_inicio_promocao")
    @Temporal(TemporalType.DATE)
    private Date dataInicioPromocao;
    @Column(name = "observacoes")
    private String observacoes;
    @Column(name = "preco_promocional")
    private Double precoPromocional;
    @JoinColumn(name = "cod_produto", referencedColumnName = "cod_produto", insertable = false, updatable = false)
    @ManyToOne
    private Produtos produtos;

    public ProdutosPromocao() {
    }

    public ProdutosPromocao(ProdutosPromocaoPK produtosPromocaoPK) {
        this.produtosPromocaoPK = produtosPromocaoPK;
    }

    public ProdutosPromocao(int codProduto, int codPromocao) {
        this.produtosPromocaoPK = new ProdutosPromocaoPK(codProduto, codPromocao);
    }

    public ProdutosPromocaoPK getProdutosPromocaoPK() {
        return produtosPromocaoPK;
    }

    public void setProdutosPromocaoPK(ProdutosPromocaoPK produtosPromocaoPK) {
        this.produtosPromocaoPK = produtosPromocaoPK;
    }

    public Date getDataFimPromocao() {
        return dataFimPromocao;
    }

    public void setDataFimPromocao(Date dataFimPromocao) {
        this.dataFimPromocao = dataFimPromocao;
    }

    public Date getDataInicioPromocao() {
        return dataInicioPromocao;
    }

    public void setDataInicioPromocao(Date dataInicioPromocao) {
        this.dataInicioPromocao = dataInicioPromocao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Double getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(Double precoPromocional) {
        this.precoPromocional = precoPromocional;
    }

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (produtosPromocaoPK != null ? produtosPromocaoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdutosPromocao)) {
            return false;
        }
        ProdutosPromocao other = (ProdutosPromocao) object;
        if ((this.produtosPromocaoPK == null && other.produtosPromocaoPK != null) || (this.produtosPromocaoPK != null && !this.produtosPromocaoPK.equals(other.produtosPromocaoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.ProdutosPromocao[produtosPromocaoPK=" + produtosPromocaoPK + "]";
    }

}
