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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Cliente
 */
@Entity
@Table(name = "produtos")
@NamedQueries({@NamedQuery(name = "Produtos.findByCodProduto", query = "SELECT p FROM Produtos p WHERE p.codProduto = :codProduto"), @NamedQuery(name = "Produtos.findByNomeProduto", query = "SELECT p FROM Produtos p WHERE p.nomeProduto = :nomeProduto"), @NamedQuery(name = "Produtos.findByDescricaoDetalhada", query = "SELECT p FROM Produtos p WHERE p.descricaoDetalhada = :descricaoDetalhada"), @NamedQuery(name = "Produtos.findByDadosTecnicos", query = "SELECT p FROM Produtos p WHERE p.dadosTecnicos = :dadosTecnicos"), @NamedQuery(name = "Produtos.findByPreco", query = "SELECT p FROM Produtos p WHERE p.preco = :preco"), @NamedQuery(name = "Produtos.findByQtdeCompras", query = "SELECT p FROM Produtos p WHERE p.qtdeCompras = :qtdeCompras"), @NamedQuery(name = "Produtos.findByNumeroVisualizacao", query = "SELECT p FROM Produtos p WHERE p.numeroVisualizacao = :numeroVisualizacao"), @NamedQuery(name = "Produtos.findByQuantidade", query = "SELECT p FROM Produtos p WHERE p.quantidade = :quantidade"), @NamedQuery(name = "Produtos.findByQtdeEstoque", query = "SELECT p FROM Produtos p WHERE p.qtdeEstoque = :qtdeEstoque"),
@NamedQuery(name = "Produtos.findAllByParametters", query = "SELECT p FROM Produtos p WHERE (UPPER(p.nomeProduto) LIKE UPPER(:nomeProduto) or :nomeProduto is null) AND (p.preco between :preco1 AND :preco2) AND (UPPER(p.categoria) LIKE UPPER(:categoria) or :categoria is null)")})
public class Produtos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cod_produto", nullable = false)
    private Integer codProduto;
    @Column(name = "nome_produto", nullable = false)
    private String nomeProduto;
    @Column(name = "descricao_detalhada")
    private String descricaoDetalhada;
    @Column(name = "dados_tecnicos")
    private String dadosTecnicos;
    @Column(name = "preco", nullable = false)
    private double preco;
    @Column(name = "qtde_compras", nullable = false)
    private int qtdeCompras;
    @Column(name = "numero_visualizacao", nullable = false)
    private int numeroVisualizacao;
    @Column(name = "quantidade", nullable = false)
    private String quantidade;
    @Column(name = "imagem", nullable = false)
    private String imagem;
    @Column(name = "qtde_estoque")
    private Integer qtdeEstoque;
    @ManyToMany(mappedBy = "codProdutoCollection")
    private Collection<GrupoInteresse> codGrupoCollection;
    @JoinColumn(name = "categoria", referencedColumnName = "categoria")
    @ManyToOne
    private Categorias categoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produtos")
    private Collection<AcompanhamentoProdutosEmFalta> acompanhamentoProdutosEmFaltaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codProduto")
    private Collection<HistoricoNavegacao> historicoNavegacaoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produtos")
    private Collection<ProdutosPromocao> produtosPromocaoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produtos")
    private Collection<ItensCompras> itensComprasCollection;
    
    public Produtos() {
    }

    public Produtos(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public Produtos(Integer codProduto, String nomeProduto, double preco, int qtdeCompras, int numeroVisualizacao, String quantidade) {
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.qtdeCompras = qtdeCompras;
        this.numeroVisualizacao = numeroVisualizacao;
        this.quantidade = quantidade;
    }

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoDetalhada() {
        return descricaoDetalhada;
    }

    public void setDescricaoDetalhada(String descricaoDetalhada) {
        this.descricaoDetalhada = descricaoDetalhada;
    }

    public String getDadosTecnicos() {
        return dadosTecnicos;
    }

    public void setDadosTecnicos(String dadosTecnicos) {
        this.dadosTecnicos = dadosTecnicos;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdeCompras() {
        return qtdeCompras;
    }

    public void setQtdeCompras(int qtdeCompras) {
        this.qtdeCompras = qtdeCompras;
    }

    public int getNumeroVisualizacao() {
        return numeroVisualizacao;
    }

    public void setNumeroVisualizacao(int numeroVisualizacao) {
        this.numeroVisualizacao = numeroVisualizacao;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Integer getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(Integer qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public Collection<GrupoInteresse> getCodGrupoCollection() {
        return codGrupoCollection;
    }

    public void setCodGrupoCollection(Collection<GrupoInteresse> codGrupoCollection) {
        this.codGrupoCollection = codGrupoCollection;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public Collection<AcompanhamentoProdutosEmFalta> getAcompanhamentoProdutosEmFaltaCollection() {
        return acompanhamentoProdutosEmFaltaCollection;
    }

    public void setAcompanhamentoProdutosEmFaltaCollection(Collection<AcompanhamentoProdutosEmFalta> acompanhamentoProdutosEmFaltaCollection) {
        this.acompanhamentoProdutosEmFaltaCollection = acompanhamentoProdutosEmFaltaCollection;
    }

    public Collection<HistoricoNavegacao> getHistoricoNavegacaoCollection() {
        return historicoNavegacaoCollection;
    }

    public void setHistoricoNavegacaoCollection(Collection<HistoricoNavegacao> historicoNavegacaoCollection) {
        this.historicoNavegacaoCollection = historicoNavegacaoCollection;
    }

    public Collection<ProdutosPromocao> getProdutosPromocaoCollection() {
        return produtosPromocaoCollection;
    }

    public void setProdutosPromocaoCollection(Collection<ProdutosPromocao> produtosPromocaoCollection) {
        this.produtosPromocaoCollection = produtosPromocaoCollection;
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
        hash += (codProduto != null ? codProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produtos)) {
            return false;
        }
        Produtos other = (Produtos) object;
        if ((this.codProduto == null && other.codProduto != null) || (this.codProduto != null && !this.codProduto.equals(other.codProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ecommerce.entity.Produtos[codProduto=" + codProduto + "]";
    }
    
}
