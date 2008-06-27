<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : cadastrarProdutos
    Created on : 09/06/2008, 17:13:38
    Author     : HAPPY
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{cadastrarProdutos.pageCaProd}" id="pageCadProd">
            <webuijsf:html binding="#{cadastrarProdutos.htmlCaProd }" id="htmlCadProd" lang="">
                <webuijsf:head binding="#{cadastrarProdutos.headCaProd}" id="headCadProd">
                    <webuijsf:link binding="#{cadastrarProdutos.linkCaProd}" id="linkCadProd" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{cadastrarProdutos.bodyCaProd}" id="bodyCadProd" style="-rave-layout: grid">
                    <webuijsf:form binding="#{cadastrarProdutos.formCaProd}" id="formCadProd">
                        <div style="left: 0px; top: 0px; position: absolute">
                            <jsp:directive.include file="cabecalhoAdm.jspf"/>
                            <webuijsf:label id="label1"
                                style="color: blue; font-family: 'Verdana','Arial','Helvetica',sans-serif; font-size: 24px; font-weight: bold; height: 40px; left: 384px; top: 48px; position: absolute; width: 298px" text="Cadastro de Produtos"/>
                        </div>
                        <div style="left: 0px; top: 96px; position: absolute">
                            <jsp:directive.include file="menuAdm.jspf"/>
                        </div>
                        <webuijsf:tabSet binding="#{cadastrarProdutos.tabSetCadProd}" id="tabSetCadProd" selected="tabIncluir" style="border-width: 1px; border-style: solid; height: 466px; left: 191px; top: 107px; position: absolute; width: 671px">
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
                            <webuijsf:tab id="tbAlterar" text="Alterar">
                                <webuijsf:panelLayout id="layoutPanel1" style="height: 429px; position: relative; width: 100%; -rave-layout: grid">
                                    <webuijsf:label id="lblNomeProd1" style="left: 259px; top: 11px; position: absolute" text="Nome Produto:"/>
                                    <webuijsf:textField columns="50" id="txtFldNomeProduto1" maxLength="50" style="left: 349px; top: 8px; position: absolute"/>
                                    <webuijsf:label id="lblDescDetalhad1" style="left: 14px; top: 41px; position: absolute" text="Descrição Detalhada: "/>
                                    <webuijsf:textArea columns="80" id="txtFldDescrDetalhada1" rows="5" style="left: 139px; top: 41px; position: absolute"/>
                                    <webuijsf:label id="lblDadosTecnicos1" style="left: 14px; top: 131px; position: absolute" text="Dados Técnicos:"/>
                                    <webuijsf:textArea columns="80" id="txtFldDadosTecnicos1" rows="5" style="left: 139px; top: 131px; position: absolute"/>
                                    <webuijsf:label id="lblCategoria1" style="left: 14px; top: 218px; position: absolute" text="Categoria:"/>
                                    <webuijsf:label id="lblQtdEstoque1" style="left: 14px; top: 252px; position: absolute" text="Qtde Estoque: "/>
                                    <webuijsf:textField columns="10" id="txtFldQtdeEstoque1" maxLength="10" style="left: 102px; top: 252px; position: absolute"/>
                                    <webuijsf:label id="lblPrecoUnit1" style="left: 14px; top: 282px; position: absolute" text="Preço Unitario:"/>
                                    <webuijsf:textField id="txtFldPrecoUnit1" style="left: 102px; top: 282px; position: absolute"/>
                                    <webuijsf:label id="lblImagem1" style="left: 14px; top: 313px; position: absolute" text="Imagem:"/>
                                    <webuijsf:textField columns="50" id="txtFldImagem1" style="left: 102px; top: 313px; position: absolute" toolTip="Digite o &quot;caminho&quot;  onde se encontra a imagem do produto "/>
                                    <webuijsf:button actionExpression="#{cadastrarProdutos.buttonIncluir_action}" id="buttonIncluir1"
                                        style="font-family: 'Verdana','Arial','Helvetica',sans-serif; font-size: 12px; height: 24px; left: 311px; top: 395px; position: absolute; width: 71px" text="Alterar"/>
                                    <webuijsf:button id="btnCancelar1" reset="true"
                                        style="font-family: 'Verdana','Arial','Helvetica',sans-serif; font-size: 12px; height: 24px; left: 455px; top: 395px; position: absolute" text="Cancelar"/>
                                    <webuijsf:label id="lblMensagem1" style="height: 24px; left: 384px; top: 347px; position: absolute; width: 240px" text="Alteração bem sucedida"/>
                                    <webuijsf:textField columns="50" id="textField2" style="left: 102px; top: 219px; position: absolute"/>
                                    <webuijsf:label id="lblQtdEstoque2" style="left: 276px; top: 252px; position: absolute" text="Qtde Comprada: "/>
                                    <webuijsf:label id="lblQtdEstoque3" style="left: 272px; top: 282px; position: absolute" text="Qtde Vizualizada: "/>
                                    <webuijsf:textField id="textField3" style="left: 384px; top: 252px; position: absolute"/>
                                    <webuijsf:textField id="textField4" style="left: 384px; top: 282px; position: absolute"/>
                                    <webuijsf:label id="lblQtdEstoque4" style="left: 14px; top: 11px; position: absolute" text="Código Produto: "/>
                                    <webuijsf:textField columns="10" id="textField5" style="left: 107px; top: 8px; position: absolute"/>
                                </webuijsf:panelLayout>
                            </webuijsf:tab>
                            <webuijsf:tab id="tbApagar" text="Excluir">
                                <webuijsf:panelLayout id="layoutPanel2" style="height: 427px; position: relative; width: 100%; -rave-layout: grid">
                                    <webuijsf:label id="lblNomeProd2" style="left: 257px; top: 8px; position: absolute" text="Nome Produto:"/>
                                    <webuijsf:textField columns="50" id="txtFldNomeProduto2" maxLength="50" style="left: 353px; top: 8px; position: absolute"/>
                                    <webuijsf:label id="lblDescDetalhad2" style="left: 17px; top: 32px; position: absolute" text="Descrição Detalhada: "/>
                                    <webuijsf:textArea columns="80" id="txtFldDescrDetalhada2" rows="5" style="left: 137px; top: 32px; position: absolute"/>
                                    <webuijsf:label id="lblDadosTecnicos2" style="left: 17px; top: 128px; position: absolute" text="Dados Técnicos:"/>
                                    <webuijsf:textArea columns="80" id="txtFldDadosTecnicos2" rows="5" style="left: 137px; top: 128px; position: absolute"/>
                                    <webuijsf:label id="lblCategoria2" style="left: 17px; top: 224px; position: absolute" text="Categoria:"/>
                                    <webuijsf:label id="lblQtdEstoque5" style="left: 17px; top: 248px; position: absolute" text="Qtde Estoque: "/>
                                    <webuijsf:textField columns="10" id="txtFldQtdeEstoque2" maxLength="10" style="left: 113px; top: 248px; position: absolute"/>
                                    <webuijsf:label id="lblPrecoUnit2" style="left: 17px; top: 272px; position: absolute" text="Preço Unitario:"/>
                                    <webuijsf:textField id="txtFldPrecoUnit2" style="left: 113px; top: 272px; position: absolute"/>
                                    <webuijsf:label id="lblImagem2" style="left: 17px; top: 320px; position: absolute" text="Imagem:"/>
                                    <webuijsf:button actionExpression="#{cadastrarProdutos.buttonIncluir_action}" id="buttonIncluir2"
                                        style="font-family: 'Verdana','Arial','Helvetica',sans-serif; font-size: 12px; height: 24px; left: 304px; top: 392px; position: absolute; width: 71px" text="Excluir"/>
                                    <webuijsf:button id="btnCancelar2" reset="true"
                                        style="font-family: 'Verdana','Arial','Helvetica',sans-serif; font-size: 12px; height: 24px; left: 448px; top: 392px; position: absolute" text="Cancelar"/>
                                    <webuijsf:label id="lblMensagem2" style="height: 24px; left: 377px; top: 344px; position: absolute; width: 240px" text="Exclusão bem sucedida"/>
                                    <webuijsf:textField columns="50" id="textField6" style="left: 113px; top: 224px; position: absolute"/>
                                    <webuijsf:label id="lblQtdEstoque6" style="left: 281px; top: 248px; position: absolute" text="Qtde Comprada: "/>
                                    <webuijsf:label id="lblQtdEstoque7" style="left: 281px; top: 272px; position: absolute" text="Qtde Vizualizada: "/>
                                    <webuijsf:textField id="textField7" style="left: 377px; top: 248px; position: absolute"/>
                                    <webuijsf:textField id="textField8" style="left: 377px; top: 272px; position: absolute"/>
                                    <webuijsf:label id="lblQtdEstoque8" style="left: 17px; top: 8px; position: absolute" text="Código Produto: "/>
                                    <webuijsf:textField columns="10" id="textField9" style="left: 113px; top: 8px; position: absolute"/>
                                    <webuijsf:image border="1" height="104" id="image1" style="left: 96px; top: 317px; position: absolute"
                                        url="/resources/HP%20Latitude%20DV6232%20P.jpg" width="144"/>
                                </webuijsf:panelLayout>
                            </webuijsf:tab>
                            <webuijsf:tab id="tab1" text="Consultar">
                                <webuijsf:panelLayout id="layoutPanel3" style="height: 428px; position: relative; width: 100%; -rave-layout: grid">
                                    <webuijsf:label id="lblNomeProd3" style="left: 256px; top: 9px; position: absolute" text="Nome Produto:"/>
                                    <webuijsf:textField columns="50" id="txtFldNomeProduto3" maxLength="50" style="left: 352px; top: 9px; position: absolute"/>
                                    <webuijsf:label id="lblDescDetalhad3" style="left: 16px; top: 40px; position: absolute" text="Descrição Detalhada: "/>
                                    <webuijsf:textArea columns="80" id="txtFldDescrDetalhada3" rows="5" style="left: 136px; top: 40px; position: absolute"/>
                                    <webuijsf:label id="lblDadosTecnicos3" style="left: 16px; top: 129px; position: absolute" text="Dados Técnicos:"/>
                                    <webuijsf:textArea columns="80" id="txtFldDadosTecnicos3" rows="5" style="left: 136px; top: 129px; position: absolute"/>
                                    <webuijsf:label id="lblCategoria3" style="left: 16px; top: 218px; position: absolute" text="Categoria:"/>
                                    <webuijsf:label id="lblQtdEstoque9" style="left: 16px; top: 249px; position: absolute" text="Qtde Estoque: "/>
                                    <webuijsf:textField columns="10" id="txtFldQtdeEstoque3" maxLength="10" style="left: 112px; top: 249px; position: absolute"/>
                                    <webuijsf:label id="lblPrecoUnit3" style="left: 16px; top: 277px; position: absolute" text="Preço Unitario:"/>
                                    <webuijsf:textField id="txtFldPrecoUnit3" style="left: 112px; top: 277px; position: absolute"/>
                                    <webuijsf:label id="lblImagem3" style="left: 16px; top: 312px; position: absolute" text="Imagem:"/>
                                    <webuijsf:button actionExpression="#{cadastrarProdutos.buttonIncluir_action}" id="buttonIncluir3"
                                        style="font-family: 'Verdana','Arial','Helvetica',sans-serif; font-size: 12px; height: 24px; left: 384px; top: 360px; position: absolute; width: 71px" text="OK"/>
                                    <webuijsf:textField columns="50" id="textField10" style="left: 112px; top: 218px; position: absolute"/>
                                    <webuijsf:label id="lblQtdEstoque10" style="left: 280px; top: 249px; position: absolute" text="Qtde Comprada: "/>
                                    <webuijsf:label id="lblQtdEstoque11" style="left: 280px; top: 277px; position: absolute" text="Qtde Vizualizada: "/>
                                    <webuijsf:textField id="textField11" style="left: 376px; top: 249px; position: absolute"/>
                                    <webuijsf:textField id="textField12" style="left: 376px; top: 277px; position: absolute"/>
                                    <webuijsf:label id="lblQtdEstoque12" style="left: 16px; top: 9px; position: absolute" text="Código Produto: "/>
                                    <webuijsf:textField columns="10" id="textField13" style="left: 112px; top: 9px; position: absolute"/>
                                    <webuijsf:image border="1" height="104" id="image2" style="left: 88px; top: 312px; position: absolute"
                                        url="/resources/HP%20Latitude%20DV6232%20P.jpg" width="144"/>
                                </webuijsf:panelLayout>
                            </webuijsf:tab>
                        </webuijsf:tabSet>
                        <br/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
