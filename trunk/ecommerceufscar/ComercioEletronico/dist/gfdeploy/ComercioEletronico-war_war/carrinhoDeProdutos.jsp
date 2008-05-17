<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : carrinhoDeProdutos
    Created on : 10/05/2008, 08:59:01
    Author     : João Henrique
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{carrinhoDeProdutos.page1}" id="page1">
            <webuijsf:html binding="#{carrinhoDeProdutos.html1}" id="html1">
                <webuijsf:head binding="#{carrinhoDeProdutos.head1}" id="head1">
                    <webuijsf:link binding="#{carrinhoDeProdutos.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{carrinhoDeProdutos.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{carrinhoDeProdutos.form1}" id="form1">
                        <div style="left: 0px; top: 0px; position: absolute">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="left: 0px; top: 96px; position: absolute">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <div style="height: 272px; left: 1080px; top: 96px; position: absolute; width: 142px">
                            <jsp:directive.include file="homeRight.jspf"/>
                        </div>
                        <webuijsf:table augmentTitle="false" binding="#{carrinhoDeProdutos.table1}" id="table1"
                            style="left: 192px; top: 144px; position: absolute; width: 850px" title="Carrinho de Compras" width="850">
                            <webuijsf:tableRowGroup binding="#{carrinhoDeProdutos.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{carrinhoDeProdutos.produtos}" sourceVar="currentRow">
                                <webuijsf:tableColumn align="center" binding="#{carrinhoDeProdutos.tableColumn6}" id="tableColumn6" spacerColumn="true"
                                    valign="middle" width="20">
                                    <webuijsf:imageHyperlink binding="#{carrinhoDeProdutos.imageHyperlink1}" id="imageHyperlink1"
                                        imageURL="/resources/ico_excluir.jpg" text=""/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{carrinhoDeProdutos.tableColumn2}" headerText="Produto" id="tableColumn2" sort="nomeProduto" width="545">
                                    <webuijsf:staticText binding="#{carrinhoDeProdutos.staticText1}" id="staticText1" text="#{currentRow.value['nomeProduto']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{carrinhoDeProdutos.tableColumn5}" headerText="Quantidade" id="tableColumn5" width="100">
                                    <webuijsf:textField binding="#{carrinhoDeProdutos.textField2}" columns="10" id="textField2" text="#{currentRow.value['qtdeCompras']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{carrinhoDeProdutos.tableColumn4}" headerText="Preço (R$)" id="tableColumn4" sort="preco" width="100">
                                    <webuijsf:staticText binding="#{carrinhoDeProdutos.staticText2}" id="staticText2" text="#{currentRow.value['preco']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:label binding="#{carrinhoDeProdutos.label1}" id="label1" style="font-size: 14px; left: 192px; top: 312px; position: absolute" text="Total:"/>
                        <webuijsf:label binding="#{carrinhoDeProdutos.label2}" id="label2" style="left: 264px; top: 312px; position: absolute" text="#{carrinhoDeProdutos.calculoTotal}"/>
                        <webuijsf:button actionExpression="#{carrinhoDeProdutos.btnAtualizar_action}" binding="#{carrinhoDeProdutos.btnAtualizar1}"
                            id="btnAtualizar1" style="left: 191px; top: 264px; position: absolute" text="Atualizar"/>
                        <webuijsf:button actionExpression="#{carrinhoDeProdutos.btnComprar_action}" binding="#{carrinhoDeProdutos.btnComprar1}" id="btnComprar1"
                            style="left: 911px; top: 312px; position: absolute" text="Finalizar Comprar"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
