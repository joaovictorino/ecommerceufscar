<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : buscarProduto
    Created on : 26/01/2008, 14:30:13
    Author     : Cliente
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{buscarProduto.page1}" id="page1">
            <webuijsf:html binding="#{buscarProduto.html1}" id="html1">
                <webuijsf:head binding="#{buscarProduto.head1}" id="head1">
                    <webuijsf:link binding="#{buscarProduto.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{buscarProduto.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{buscarProduto.form1}" id="form1">
                        <div style="height: 94px; left: 0px; top: 0px; position: absolute; width: 1222px">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="height: 454px; left: 0px; top: 312px; position: absolute; width: 142px">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <webuijsf:button actionExpression="#{buscarProduto.buttonProcurarProduto_action}" binding="#{buscarProduto.buttonProcurarProduto}"
                            id="buttonProcurarProduto" style="height: 24px; left: 815px; top: 384px; position: absolute; width: 72px" text="Procurar"/>
                        <webuijsf:textField binding="#{buscarProduto.nomeProdutoProcurar}" columns="68" id="nomeProdutoProcurar"
                            style="left: 432px; top: 360px; position: absolute" valueChangeListenerExpression="#{buscarProduto.nomeProdutoProcurar_processValueChange}"/>
                        <webuijsf:textField binding="#{buscarProduto.precoMinProcurar}" id="precoMinProcurar" style="left: 432px; top: 384px; position: absolute"/>
                        <webuijsf:textField binding="#{buscarProduto.precoMaxProcurar}" id="precoMaxProcurar" style="left: 672px; top: 384px; position: absolute"/>
                        <webuijsf:label binding="#{buscarProduto.labelNomeProdutoProcurar}" id="labelNomeProdutoProcurar"
                            style="left: 336px; top: 360px; position: absolute" styleClass="outros" text="Produto:"/>
                        <webuijsf:label binding="#{buscarProduto.labelPrecoMinProcurar}" id="labelPrecoMinProcurar"
                            style="left: 336px; top: 384px; position: absolute" styleClass="outros" text="Preço Min.:"/>
                        <webuijsf:label binding="#{buscarProduto.labelpPrecoMaxProcurar}" id="labelpPrecoMaxProcurar"
                            style="left: 576px; top: 384px; position: absolute" styleClass="outros" text="Preço Max.:"/>
                        <webuijsf:table augmentTitle="false" binding="#{buscarProduto.table2}" id="table2" paginateButton="true" paginationControls="true"
                            style="left: 336px; top: 432px; position: absolute; width: 552px" title="Produtos" width="552">
                            <webuijsf:tableRowGroup binding="#{buscarProduto.tableRowGroup2}" id="tableRowGroup2" rows="10"
                                sourceData="#{buscarProduto.listaTabelaProdutosEncontrados}" sourceVar="currentRow">
                                <webuijsf:tableColumn align="center" binding="#{buscarProduto.tableColumn7}" headerText="Foto" id="tableColumn7"
                                    styleClass="outros" width="80">
                                    <webuijsf:imageHyperlink binding="#{buscarProduto.imageHyperlink2}" id="imageHyperlink2"
                                        imageURL="/resources/#{currentRow.value['imagem']}" text="" url="produto.jsp?id=#{currentRow.value['codProduto']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{buscarProduto.tableColumn8}" headerText="Produto" id="tableColumn8" sort="nomeProduto" styleClass="outros">
                                    <webuijsf:staticText binding="#{buscarProduto.staticText8}" id="staticText8" text="#{currentRow.value['nomeProduto']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{buscarProduto.tableColumn9}" headerText="Preço" id="tableColumn9" sort="preco" styleClass="outros">
                                    <webuijsf:staticText binding="#{buscarProduto.staticText9}" converter="#{buscarProduto.realConverter1}" id="staticText9" text="#{currentRow.value['preco']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <div style="left: 48px; top: 336px; position: absolute"></div>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
