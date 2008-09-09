<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : escolherEnderecoCompra
    Created on : 22/06/2008, 16:52:24
    Author     : Cliente
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{escolherEnderecoCompra.page1}" id="page1">
            <webuijsf:html binding="#{escolherEnderecoCompra.html1}" id="html1">
                <webuijsf:head binding="#{escolherEnderecoCompra.head1}" id="head1">
                    <webuijsf:link binding="#{escolherEnderecoCompra.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{escolherEnderecoCompra.body1}" id="body1" style="-rave-layout: grid">
                    <div style="height: 94px; left: 0px; top: 0px; position: absolute; width: 1222px">
                        <jsp:directive.include file="cabecalho.jspf"/>
                    </div>
                    <div style="height: 454px; left: 0px; top: 312px; position: absolute; width: 142px">
                        <jsp:directive.include file="menu.jspf"/>
                    </div>
                    <webuijsf:table augmentTitle="false" binding="#{escolherEnderecoCompra.table1}" id="table1"
                        style="color: rgb(0, 0, 102); font-size: 12px; font-style: normal; font-weight: lighter; height: 53px; left: 288px; top: 480px; position: absolute; width: 720px"
                        styleClass="outrosSmallText" title="Carrinho de Compras" width="720">
                        <webuijsf:tableRowGroup binding="#{escolherEnderecoCompra.tableRowGroup1}" id="tableRowGroup1" rows="10"
                            sourceData="#{escolherEnderecoCompra.produtos}" sourceVar="currentRow">
                            <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn5}" headerText="Nome" id="tableColumn5" sort="nomeProduto">
                                <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText5}" id="staticText5" text="#{currentRow.value['nomeProduto']}"/>
                            </webuijsf:tableColumn>
                            <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn6}" headerText="Qtde" id="tableColumn6" sort="qtdeCompras" width="60">
                                <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText6}" id="staticText6" text="#{currentRow.value['qtdeCompras']}"/>
                            </webuijsf:tableColumn>
                            <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn7}" headerText="Valor" id="tableColumn7" sort="preco" width="80">
                                <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText7}"
                                    converter="#{escolherEnderecoCompra.carrinhoProdutos.realConverter1}" id="staticText7" text="#{currentRow.value['preco']}"/>
                            </webuijsf:tableColumn>
                        </webuijsf:tableRowGroup>
                    </webuijsf:table>
                    <webuijsf:form binding="#{escolherEnderecoCompra.form1}" id="form1">
                        <webuijsf:label binding="#{escolherEnderecoCompra.label1}" id="label1"
                            style="font-family: 'Comic Sans MS','Arial','Helvetica',sans-serif; left: 360px; top: 312px; position: absolute" text="#{escolherEnderecoCompra.calculoTotal}"/>
                        <webuijsf:label binding="#{escolherEnderecoCompra.label2}" id="label2"
                            style="font-family: 'Comic Sans MS','Arial','Helvetica',sans-serif; font-size: 14px; left: 288px; top: 312px; position: absolute" text="Total:"/>
                        <webuijsf:button actionExpression="#{escolherEnderecoCompra.btnComprar_action}" binding="#{escolherEnderecoCompra.btnComprar1}"
                            id="btnComprar1" style="left: 887px; top: 312px; position: absolute" text="Finalizar Comprar"/>
                        <webuijsf:table augmentTitle="false" binding="#{escolherEnderecoCompra.table3}" id="table3"
                            style="color: rgb(0, 0, 102); font-size: 12px; font-style: normal; font-weight: lighter; left: 288px; top: 336px; position: absolute; width: 720px"
                            styleClass="outrosSmallText" title="Escolha o endereço para a entrega de sua compra:" width="720">
                            <webuijsf:tableRowGroup binding="#{escolherEnderecoCompra.tableRowGroup3}" id="tableRowGroup3" rows="10"
                                sourceData="#{escolherEnderecoCompra.enderecos}" sourceVar="currentRow">
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn4}" id="tableColumn4">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText18}" id="staticText18" text=""/>
                                    <webuijsf:radioButton binding="#{escolherEnderecoCompra.radioButton3}" id="radioButton3"
                                        name="radioButton-group-tableColumn4" selectedValue="#{escolherEnderecoCompra.enderecos}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn17}" id="tableColumn17" sort="tipoEndereco">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText19}" id="staticText19" text="#{currentRow.value['tipoEndereco']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn18}" headerText="Endereço" id="tableColumn18" sort="endereco">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText20}" id="staticText20" text="#{currentRow.value['endereco']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn19}" headerText="No" id="tableColumn19" sort="numero">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText21}" id="staticText21" text="#{currentRow.value['numero']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn20}" headerText="Bairro" id="tableColumn20" sort="bairro">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText22}" id="staticText22" text="#{currentRow.value['bairro']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn21}" headerText="CEP" id="tableColumn21" sort="cep">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText23}" id="staticText23" text="#{currentRow.value['cep']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn22}" headerText="Cidade" id="tableColumn22" sort="cidade">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText24}" id="staticText24" text="#{currentRow.value['cidade']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn23}" headerText="Estado" id="tableColumn23" sort="estado">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText25}" id="staticText25" text="#{currentRow.value['estado']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn24}" headerText="País" id="tableColumn24" sort="pais">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText26}" id="staticText26" text="#{currentRow.value['pais']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
