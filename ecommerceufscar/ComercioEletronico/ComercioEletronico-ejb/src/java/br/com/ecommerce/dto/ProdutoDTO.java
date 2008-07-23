/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ecommerce.dto;

import br.com.ecommerce.entity.AcompanhamentoProdutosEmFalta;
import br.com.ecommerce.entity.Categorias;
import br.com.ecommerce.entity.Compras;
import br.com.ecommerce.entity.GrupoInteresse;
import br.com.ecommerce.entity.HistoricoNavegacao;
import br.com.ecommerce.entity.ItensCompras;
import br.com.ecommerce.entity.ProdutosPromocao;
import br.com.ecommerce.entity.Produtos;
import java.util.Collection;

/**
 *
 * @author Cliente
 */
public class ProdutoDTO {

    public ProdutoDTO(){}
    
    // Atributos de Produto
    private Integer codProduto;
    private String dadosTecnicos;
    private String descricaoDetalhada;
    private String nomeProduto;
    private int numeroVisualizacao;
    private double preco;
    private int qtdeCompras;
    private Integer qtdeEstoque;
    private String imagem;
    private Collection<GrupoInteresse> codGrupoCollection;
    private Categorias categoria;
    private Collection<AcompanhamentoProdutosEmFalta> acompanhamentoProdutosEmFaltaCollection;
    private Collection<HistoricoNavegacao> historicoNavegacaoCollection;
    private Collection<ProdutosPromocao> produtosPromocaoCollection;
    private Collection<ItensCompras> itensComprasCollection;
    
    //Atributos de itensCompras
    private Double precoProduto;
    private Integer quantidade;
    private Compras compras;
    private Produtos produtos;

    public Integer getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Integer codProduto) {
        this.codProduto = codProduto;
    }

    public String getDadosTecnicos() {
        return dadosTecnicos;
    }

    public void setDadosTecnicos(String dadosTecnicos) {
        this.dadosTecnicos = dadosTecnicos;
    }

    public String getDescricaoDetalhada() {
        return descricaoDetalhada;
    }

    public void setDescricaoDetalhada(String descricaoDetalhada) {
        this.descricaoDetalhada = descricaoDetalhada;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getNumeroVisualizacao() {
        return numeroVisualizacao;
    }

    public void setNumeroVisualizacao(int numeroVisualizacao) {
        this.numeroVisualizacao = numeroVisualizacao;
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

    public Integer getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(Integer qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
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

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Compras getCompras() {
        return compras;
    }

    public void setCompras(Compras compras) {
        this.compras = compras;
    }

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }
}
