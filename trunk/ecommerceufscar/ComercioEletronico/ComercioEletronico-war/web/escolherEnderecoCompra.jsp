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
                    <webuijsf:form binding="#{escolherEnderecoCompra.form1}" id="form1">
                        <div style="left: 0px; top: 0px; position: absolute">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="left: 0px; top: 96px; position: absolute">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <div style="left: 1080px; top: 96px; position: absolute">
                            <jsp:directive.include file="homeRight.jspf"/>
                        </div>
                        <webuijsf:table augmentTitle="false" binding="#{escolherEnderecoCompra.table1}" id="table1"
                            style="height: 101px; left: 264px; top: 168px; position: absolute" title="Carrinho de Compras" width="528">
                            <webuijsf:tableRowGroup binding="#{escolherEnderecoCompra.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{escolherEnderecoCompra.produtos}" sourceVar="currentRow">
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn4}" id="tableColumn4" sort="imagem">
                                    <webuijsf:imageHyperlink binding="#{escolherEnderecoCompra.imageHyperlink2}" id="imageHyperlink2"
                                        imageURL="/resources/#{currentRow.value['imagem']}" text=""/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn5}" headerText="Nome" id="tableColumn5" sort="nomeProduto">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText5}" id="staticText5" text="#{currentRow.value['nomeProduto']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn6}" headerText="Qtde" id="tableColumn6" sort="qtdeCompras">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText6}" id="staticText6" text="#{currentRow.value['qtdeCompras']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn7}" headerText="Valor" id="tableColumn7" sort="preco">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText7}" id="staticText7" text="#{currentRow.value['preco']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:label binding="#{escolherEnderecoCompra.label1}" id="label1" style="left: 336px; top: 312px; position: absolute" text="#{escolherEnderecoCompra.calculoTotal}"/>
                        <webuijsf:label binding="#{escolherEnderecoCompra.label2}" id="label2"
                            style="font-size: 14px; left: 264px; top: 312px; position: absolute" text="Total:"/>
                        <webuijsf:table augmentTitle="false" binding="#{escolherEnderecoCompra.table2}" id="table2"
                            style="left: 264px; top: 360px; position: absolute; width: 528px; z-index: 500" title="Endereços" width="528">
                            <webuijsf:tableRowGroup binding="#{escolherEnderecoCompra.tableRowGroup2}" id="tableRowGroup2" rows="10"
                                sourceData="#{escolherEnderecoCompra.enderecos}" sourceVar="currentRow">
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn8}" id="tableColumn8">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText1}" id="staticText1" text=""/>
                                    <webuijsf:radioButton binding="#{escolherEnderecoCompra.radioButton2}" id="radioButton2" selectedValue="#{currentRow.value['codEndereco']}" name="radioButton-group-tableColumn8"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn9}" id="tableColumn9" sort="tipoEndereco" width="41">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText9}" id="staticText9" text="#{currentRow.value['tipoEndereco']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn10}" headerText="Endereço" id="tableColumn10" sort="endereco" width="58">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText10}" id="staticText10" text="#{currentRow.value['endereco']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn11}" headerText="No" id="tableColumn11" sort="numero">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText11}" id="staticText11" text="#{currentRow.value['numero']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn12}" headerText="Bairro" id="tableColumn12" sort="bairro">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText12}" id="staticText12" text="#{currentRow.value['bairro']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn13}" headerText="CEP" id="tableColumn13" sort="cep">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText13}" id="staticText13" text="#{currentRow.value['cep']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn14}" headerText="Cidade" id="tableColumn14" sort="cidade">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText14}" id="staticText14" text="#{currentRow.value['cidade']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn15}" headerText="Estado" id="tableColumn15" sort="estado" width="95">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText15}" id="staticText15" text="#{currentRow.value['estado']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{escolherEnderecoCompra.tableColumn16}" headerText="Pais" height="22" id="tableColumn16"
                                    sort="pais" width="65">
                                    <webuijsf:staticText binding="#{escolherEnderecoCompra.staticText16}" id="staticText16" text="#{currentRow.value['pais']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:button actionExpression="#{escolherEnderecoCompra.btnComprar_action}" binding="#{escolherEnderecoCompra.btnComprar1}"
                            id="btnComprar1" style="left: 263px; top: 528px; position: absolute" text="Finalizar Comprar"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
