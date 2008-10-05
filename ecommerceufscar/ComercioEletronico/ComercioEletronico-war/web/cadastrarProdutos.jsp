<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : cadastrarProdutos
    Created on : 09/06/2008, 17:13:38
    Author     : HAPPY
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{cadastrarProdutos.pageCaProd}" id="pageCaProd">
            <webuijsf:html binding="#{cadastrarProdutos.htmlCaProd }" id="htmlCadProd" lang="">
                <webuijsf:head binding="#{cadastrarProdutos.headCaProd}" id="headCaProd">
                    <webuijsf:link binding="#{cadastrarProdutos.linkCaProd}" id="linkCaProd" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{cadastrarProdutos.bodyCaProd}" id="bodyCaProd" style="-rave-layout: grid; background-color:#F6F6F6;">
                    <webuijsf:form binding="#{cadastrarProdutos.formCaProd}" id="formCaProd">
                        <div style="left: 0px; top: 0px; position: absolute">
                            <jsp:directive.include file="cabecalhoAdm.jspf"/>
                          
                        </div>
                        <div style="left: 0px; top: 132px; position: absolute">
                            <jsp:directive.include file="menuAdm.jspf"/>
                        </div>
                        <webuijsf:tabSet binding="#{cadastrarProdutos.tabSetCadProd}" id="tabSetCadProd" selected="tabIncluir" style="border-width: 1px; border-style: solid; height: 466px; left: 192px; top: 192px; position: absolute; width: 671px">
                            <webuijsf:tab binding="#{cadastrarProdutos.tabIncluir}" id="tabIncluir" text="Incluir">
                                <webuijsf:panelLayout binding="#{cadastrarProdutos.layoutPanelIncluir}" id="layoutPanelIncluir" style="height: 432px; position: relative; width: 100%; -rave-layout: grid">
                                    <webuijsf:label binding="#{cadastrarProdutos.lblNomeProd_incl}" id="lblNomeProd_incl"
                                        style="left: 14px; top: 11px; position: absolute" text="Nome Produto:"/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldNomeProduto_incl}" columns="50" id="txtFldNomeProduto_incl"
                                        maxLength="50" style="left: 102px; top: 8px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblDescDetalhad_incl}" id="lblDescDetalhad_incl"
                                        style="left: 14px; top: 40px; position: absolute" text="Descrição Detalhada: "/>
                                    <webuijsf:textArea binding="#{cadastrarProdutos.txtFldDescrDetalhada_incl}" columns="80" id="txtFldDescrDetalhada_incl"
                                        rows="5" style="left: 139px; top: 40px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblDadosTecnicos_incl}" id="lblDadosTecnicos_incl"
                                        style="left: 14px; top: 128px; position: absolute" text="Dados Técnicos:"/>
                                    <webuijsf:textArea binding="#{cadastrarProdutos.txtFldDadosTecnicos_incl}" columns="80" id="txtFldDadosTecnicos_incl"
                                        rows="5" style="left: 139px; top: 128px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblCategoria_incl}" id="lblCategoria_incl"
                                        style="left: 14px; top: 215px; position: absolute" text="Categoria:"/>
                                    <webuijsf:textField columns="50" id="textFieldCategoria_incl" style="left: 102px; top: 216px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblQtdEstoque_incl}" id="lblQtdEstoque_incl"
                                        style="left: 14px; top: 248px; position: absolute" text="Qtde Estoque:"/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldQtdeEstoque_incl}" columns="10" id="txtFldQtdeEstoque_incl"
                                        maxLength="10" style="left: 102px; top: 248px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblPrecoUnit_incl}" id="lblPrecoUnit_incl"
                                        style="left: 14px; top: 280px; position: absolute" text="Preço Unitario:"/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldPrecoUnit_incl}" id="txtFldPrecoUnit_incl" style="left: 102px; top: 280px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblImagem_incl}" id="lblImagem_incl"
                                        style="left: 14px; top: 312px; position: absolute" text="Imagem:"/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldImagem_incl}" columns="50" id="txtFldImagem_incl"
                                        style="left: 102px; top: 312px; position: absolute" toolTip="Digite o &quot;caminho&quot;  onde se encontra a imagem do produto "/>
                                    <webuijsf:button actionExpression="#{cadastrarProdutos.buttonIncluir_action}" binding="#{cadastrarProdutos.buttonIncluir}"
                                        id="buttonIncluir"
                                        style="font-family: 'Verdana','Arial','Helvetica',sans-serif; font-size: 12px; height: 24px; left: 311px; top: 395px; position: absolute; width: 71px" text="Incluir"/>
                                    <webuijsf:button binding="#{cadastrarProdutos.btnCancelar_incl}" id="btnCancelar_incl" reset="true"
                                        style="font-family: 'Verdana','Arial','Helvetica',sans-serif; font-size: 12px; height: 24px; left: 455px; top: 395px; position: absolute" text="Cancelar"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblMensagem_incl}" id="lblMensagem_incl" style="height: 24px; left: 384px; top: 347px; position: absolute; width: 240px"/>
                                </webuijsf:panelLayout>
                            </webuijsf:tab>
                            <webuijsf:tab binding="#{cadastrarProdutos.tabAlterar}" id="tabAlterar" text="Alterar">
                                <webuijsf:panelLayout binding="#{cadastrarProdutos.layoutPanelAlterar}" id="layoutPanelAlterar" style="height: 429px; position: relative; width: 100%; -rave-layout: grid">
                                    <webuijsf:label binding="#{cadastrarProdutos.lblCodProdAlt}" id="lblCodProdAlt"
                                        style="left: 14px; top: 11px; position: absolute" text="Código Produto: "/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldCodProdAlt}" columns="10" id="txtFldCodProdAlt" style="left: 107px; top: 8px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblNomeProdAlt}" id="lblNomeProdAlt"
                                        style="left: 259px; top: 11px; position: absolute" text="Nome Produto:"/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldNomeProdAlt}" columns="50" id="txtFldNomeProdAlt" maxLength="50" style="left: 349px; top: 8px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblDescDetAlt}" id="lblDescDetAlt"
                                        style="left: 14px; top: 41px; position: absolute" text="Descrição Detalhada: "/>
                                    <webuijsf:textArea binding="#{cadastrarProdutos.txtFldDescrDetalhadaAlt}" columns="80" id="txtFldDescrDetalhadaAlt" rows="5" style="left: 139px; top: 41px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblDadosTecnicosAlt}" id="lblDadosTecnicosAlt"
                                        style="left: 14px; top: 131px; position: absolute" text="Dados Técnicos:"/>
                                    <webuijsf:textArea binding="#{cadastrarProdutos.txtFldDadosTecnicosAlt}" columns="80" id="txtFldDadosTecnicosAlt" rows="5" style="left: 139px; top: 131px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblCategoriaAlt}" id="lblCategoriaAlt"
                                        style="left: 14px; top: 218px; position: absolute" text="Categoria:"/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldCategoriaAlt}" columns="50" id="txtFldCategoriaAlt" style="left: 102px; top: 219px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblQtdEstoqueAlt}" id="lblQtdEstoqueAlt"
                                        style="left: 14px; top: 252px; position: absolute" text="Qtde Estoque: "/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldQtdeEstoqueAlt}" columns="10" id="txtFldQtdeEstoqueAlt"
                                        maxLength="10" style="left: 102px; top: 252px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblQtdCompradaAlt}" id="lblQtdCompradaAlt"
                                        style="left: 276px; top: 252px; position: absolute" text="Qtde Comprada: "/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldQtdeCompradaAlt}" id="txtFldQtdeCompradaAlt" style="left: 384px; top: 252px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblPrecoUnitAlt}" id="lblPrecoUnitAlt"
                                        style="left: 14px; top: 282px; position: absolute" text="Preço Unitario:"/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldPrecoUnitAlt}" id="txtFldPrecoUnitAlt" style="left: 102px; top: 282px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblQtdVisualizAlt}" id="lblQtdVisualizAlt"
                                        style="left: 272px; top: 282px; position: absolute" text="Qtde Vizualizada: "/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldQtdVisualizAlt}" id="txtFldQtdVisualizAlt" style="left: 384px; top: 282px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblImagemAlt}" id="lblImagemAlt"
                                        style="left: 14px; top: 313px; position: absolute" text="Imagem:"/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldImagemAlt}" columns="50" id="txtFldImagemAlt"
                                        style="left: 102px; top: 313px; position: absolute" toolTip="Digite o &quot;caminho&quot;  onde se encontra a imagem do produto "/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblMensagemAlter}" id="lblMensagemAlter" style="height: 24px; left: 384px; top: 347px; position: absolute; width: 240px"/>
                                    <webuijsf:button binding="#{cadastrarProdutos.buttonAlterar}" id="buttonAlterar"
                                        style="font-family: 'Verdana','Arial','Helvetica',sans-serif; font-size: 12px; height: 24px; left: 311px; top: 395px; position: absolute; width: 71px" text="Alterar"/>
                                    <webuijsf:button binding="#{cadastrarProdutos.btnCancelarAlter}" id="btnCancelarAlter" reset="true"
                                        style="font-family: 'Verdana','Arial','Helvetica',sans-serif; font-size: 12px; height: 24px; left: 455px; top: 395px; position: absolute" text="Cancelar"/>
                                </webuijsf:panelLayout>
                            </webuijsf:tab>
                            <webuijsf:tab binding="#{cadastrarProdutos.tabExcluir}" id="tabExcluir" text="Excluir">
                                <webuijsf:panelLayout binding="#{cadastrarProdutos.layoutPanelExcluir}" id="layoutPanelExcluir" style="height: 427px; position: relative; width: 100%; -rave-layout: grid">
                                    <webuijsf:label binding="#{cadastrarProdutos.lblCodProdExcl}" id="lblCodProdExcl"
                                        style="left: 17px; top: 8px; position: absolute" text="Código Produto: "/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldCodProdExcl}" columns="10" id="txtFldCodProdExcl" style="left: 113px; top: 8px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblNomeProdExcl}" id="lblNomeProdExcl"
                                        style="left: 257px; top: 8px; position: absolute" text="Nome Produto:"/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldNomeProdutoExcl}" columns="50" id="txtFldNomeProdutoExcl"
                                        maxLength="50" style="left: 353px; top: 8px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblDescDetalhadExcl}" id="lblDescDetalhadExcl"
                                        style="left: 17px; top: 32px; position: absolute" text="Descrição Detalhada: "/>
                                    <webuijsf:textArea binding="#{cadastrarProdutos.txtFldDescrDetalhadaExcl}" columns="80" id="txtFldDescrDetalhadaExcl"
                                        rows="5" style="left: 137px; top: 32px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblDadosTecnicosExcl}" id="lblDadosTecnicosExcl"
                                        style="left: 17px; top: 128px; position: absolute" text="Dados Técnicos:"/>
                                    <webuijsf:textArea binding="#{cadastrarProdutos.txtFldDadosTecnicosExcl}" columns="80" id="txtFldDadosTecnicosExcl" rows="5" style="left: 137px; top: 128px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblCategoriaExcl}" id="lblCategoriaExcl"
                                        style="left: 17px; top: 214px; position: absolute" text="Categoria:"/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldCategoriaExcl}" columns="50" id="txtFldCategoriaExcl" style="left: 113px; top: 214px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblQtdEstoqueExcl}" id="lblQtdEstoqueExcl"
                                        style="left: 17px; top: 248px; position: absolute" text="Qtde Estoque: "/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldQtdeEstoqueExcl}" columns="10" id="txtFldQtdeEstoqueExcl"
                                        maxLength="10" style="left: 113px; top: 248px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblQtdeCompradaExcl}" id="lblQtdeCompradaExcl"
                                        style="left: 281px; top: 248px; position: absolute" text="Qtde Comprada: "/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldQtdeCompradaExcl}" id="txtFldQtdeCompradaExcl" style="left: 377px; top: 248px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblPrecoUnitExcl}" id="lblPrecoUnitExcl"
                                        style="left: 17px; top: 272px; position: absolute" text="Preço Unitario:"/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldPrecoUnitExcl}" id="txtFldPrecoUnitExcl" style="left: 113px; top: 272px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblQtdeVisualizExcl}" id="lblQtdeVisualizExcl"
                                        style="left: 281px; top: 272px; position: absolute" text="Qtde Vizualizada: "/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldQtdeVisualizExcl}" id="txtFldQtdeVisualizExcl" style="left: 377px; top: 272px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblImagemExcl}" id="lblImagemExcl"
                                        style="left: 17px; top: 320px; position: absolute" text="Imagem:"/>
                                    <webuijsf:image binding="#{cadastrarProdutos.imageExcl}" border="1" height="104" id="imageExcl"
                                        style="left: 96px; top: 312px; position: absolute" url="" width="144"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblMensagemExcl}" id="lblMensagemExcl" style="height: 24px; left: 377px; top: 344px; position: absolute; width: 240px"/>
                                    <webuijsf:button binding="#{cadastrarProdutos.buttonExcluir}" id="buttonExcluir"
                                        style="font-family: 'Verdana','Arial','Helvetica',sans-serif; font-size: 12px; height: 24px; left: 304px; top: 392px; position: absolute; width: 71px" text="Excluir"/>
                                    <webuijsf:button binding="#{cadastrarProdutos.btnCancelarExcl}" id="btnCancelarExcl" reset="true"
                                        style="font-family: 'Verdana','Arial','Helvetica',sans-serif; font-size: 12px; height: 24px; left: 448px; top: 392px; position: absolute" text="Cancelar"/>
                                </webuijsf:panelLayout>
                            </webuijsf:tab>
                            <webuijsf:tab binding="#{cadastrarProdutos.tabConsultar}" id="tabConsultar" text="Consultar">
                                <webuijsf:panelLayout binding="#{cadastrarProdutos.layoutPanelConsulta}" id="layoutPanelConsulta" style="height: 428px; position: relative; width: 100%; -rave-layout: grid">
                                    <webuijsf:label binding="#{cadastrarProdutos.lblCodProdCons}" id="lblCodProdCons"
                                        style="left: 16px; top: 9px; position: absolute" text="Código Produto: "/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldCodProdCons}" columns="10" id="txtFldCodProdCons" style="left: 112px; top: 9px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblNomeProdCons}" id="lblNomeProdCons"
                                        style="left: 256px; top: 9px; position: absolute" text="Nome Produto:"/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldNomeProdutoCons}" columns="50" id="txtFldNomeProdutoCons"
                                        maxLength="50" style="left: 352px; top: 9px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblDescDetalhadCons}" id="lblDescDetalhadCons"
                                        style="left: 16px; top: 40px; position: absolute" text="Descrição Detalhada: "/>
                                    <webuijsf:textArea binding="#{cadastrarProdutos.txtFldDescrDetalhadaCons}" columns="80" id="txtFldDescrDetalhadaCons"
                                        rows="5" style="left: 136px; top: 40px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblDadosTecnicosCons}" id="lblDadosTecnicosCons"
                                        style="left: 16px; top: 129px; position: absolute" text="Dados Técnicos:"/>
                                    <webuijsf:textArea binding="#{cadastrarProdutos.txtFldDadosTecnicosCons}" columns="80" id="txtFldDadosTecnicosCons" rows="5" style="left: 136px; top: 129px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblCategoriaCons}" id="lblCategoriaCons"
                                        style="left: 16px; top: 218px; position: absolute" text="Categoria:"/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldCategoriaCons}" columns="50" id="txtFldCategoriaCons" style="left: 112px; top: 218px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblQtdEstoqueCons}" id="lblQtdEstoqueCons"
                                        style="left: 16px; top: 249px; position: absolute" text="Qtde Estoque: "/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldQtdeEstoqueCons}" columns="10" id="txtFldQtdeEstoqueCons"
                                        maxLength="10" style="left: 112px; top: 249px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblQtdeCompradaCons}" id="lblQtdeCompradaCons"
                                        style="left: 280px; top: 249px; position: absolute" text="Qtde Comprada: "/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldQtdeCompradaCons}" id="txtFldQtdeCompradaCons" style="left: 376px; top: 249px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblPrecoUnitCons}" id="lblPrecoUnitCons"
                                        style="left: 16px; top: 277px; position: absolute" text="Preço Unitario:"/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldPrecoUnitCons}" id="txtFldPrecoUnitCons" style="left: 112px; top: 277px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblQtdeVisualizCons}" id="lblQtdeVisualizCons"
                                        style="left: 280px; top: 277px; position: absolute" text="Qtde Vizualizada: "/>
                                    <webuijsf:textField binding="#{cadastrarProdutos.txtFldQtdeVisualizCons}" id="txtFldQtdeVisualizCons" style="left: 376px; top: 277px; position: absolute"/>
                                    <webuijsf:label binding="#{cadastrarProdutos.lblImagemCons}" id="lblImagemCons"
                                        style="left: 16px; top: 312px; position: absolute" text="Imagem:"/>
                                    <webuijsf:image binding="#{cadastrarProdutos.imageConsulta}" border="1" height="104" id="imageConsulta"
                                        style="left: 88px; top: 312px; position: absolute" url="" width="144"/>
                                    <webuijsf:button binding="#{cadastrarProdutos.buttonOK}" id="buttonOK"
                                        style="font-family: 'Verdana','Arial','Helvetica',sans-serif; font-size: 12px; height: 24px; left: 384px; top: 360px; position: absolute; width: 71px" text="OK"/>
                                </webuijsf:panelLayout>
                            </webuijsf:tab>
                        </webuijsf:tabSet>
                        <br/>
                        <div style="left: 124px; top: 131px; height:25px; width:1099px; position: absolute; background-color:#196395;color:white; vertical-align:middle;">
                            <div style="padding-left:20px;padding-top:3px;"><b>CADASTRAR PRODUTO</b></div>
                        </div>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
