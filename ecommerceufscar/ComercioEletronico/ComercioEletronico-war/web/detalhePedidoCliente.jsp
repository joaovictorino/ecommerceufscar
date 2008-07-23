<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : detalhePedidoCliente
    Created on : 18/07/2008, 20:12:28
    Author     : Cliente
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{detalhePedidoCliente.page1}" id="page1">
            <webuijsf:html binding="#{detalhePedidoCliente.html1}" id="html1">
                <webuijsf:head binding="#{detalhePedidoCliente.head1}" id="head1">
                    <webuijsf:link binding="#{detalhePedidoCliente.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{detalhePedidoCliente.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{detalhePedidoCliente.form1}" id="form1">
                        <div style="left: -24px; top: 0px; position: absolute">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="left: 0px; top: 96px; position: absolute">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <webuijsf:label binding="#{detalhePedidoCliente.label1}" id="label1"
                            style="color: rgb(0, 0, 51); font-size: 20px; font-style: normal; font-weight: lighter; left: 192px; top: 120px; position: absolute; text-decoration: none"
                            styleClass="titulo01" text="Detalhe do meu pedido:"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label2}" id="label2"
                            style="font-weight: normal; left: 384px; top: 168px; position: absolute" styleClass="textoUsuario" text="#{detalhePedidoCliente.pedido.formaPagamento}"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label3}" id="label3"
                            style="font-weight: normal; left: 576px; top: 240px; position: absolute" styleClass="outrosSmallText" text="Valor total:"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label4}" converter="#{configComprasCliente.carrinhoProdutos.realConverter1}" id="label4"
                            style="font-weight: normal; left: 744px; top: 240px; position: absolute" styleClass="textoUsuario" text="#{configComprasCliente.ultimaCompra.valorTotal}"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label5}" id="label5"
                            style="font-weight: normal; left: 192px; top: 192px; position: absolute" styleClass="outrosSmallText" text="Data do pedido:"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label6}" id="label6"
                            style="font-weight: normal; left: 384px; top: 192px; position: absolute" styleClass="textoUsuario" text="#{detalhePedidoCliente.pedido.dataPedido}"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label7}" id="label7"
                            style="font-weight: normal; left: 192px; top: 168px; position: absolute" styleClass="outrosSmallText" text="Forma de pagamento:"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label8}" id="label8"
                            style="color: rgb(0, 0, 51); font-size: 20px; font-style: normal; font-weight: lighter; left: 432px; top: 120px; position: absolute; text-decoration: none"
                            styleClass="titulo01" text="#{detalhePedidoCliente.pedido.numCompra}"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label9}" id="label9"
                            style="font-weight: normal; left: 192px; top: 216px; position: absolute" styleClass="outrosSmallText" text="Data Prevista para a entrega:"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label10}" id="label10"
                            style="font-weight: normal; left: 384px; top: 216px; position: absolute" styleClass="textoUsuario" text="#{detalhePedidoCliente.pedido.dataPrevistaEntrega}"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label11}" id="label11"
                            style="font-weight: normal; left: 192px; top: 240px; position: absolute" styleClass="outrosSmallText" text="Data da entrega:"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label12}" id="label12"
                            style="font-weight: normal; left: 384px; top: 240px; position: absolute" styleClass="textoUsuario" text="#{detalhePedidoCliente.pedido.dataEntrega}"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label13}" id="label13"
                            style="font-weight: normal; left: 744px; top: 168px; position: absolute" styleClass="textoUsuario" text="#{detalhePedidoCliente.pedido.statusCompra}"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label14}" id="label14"
                            style="font-weight: normal; left: 576px; top: 168px; position: absolute" styleClass="outrosSmallText" text="Status do pedido:"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label15}" id="label15"
                            style="font-weight: normal; left: 192px; top: 360px; position: absolute" styleClass="outrosSmallText" text="Endereço de entrega:"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label17}" id="label17"
                            style="font-weight: normal; left: 576px; top: 192px; position: absolute" styleClass="outrosSmallText" text="Valor do frete:"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label18}" id="label18"
                            style="font-weight: normal; left: 576px; top: 216px; position: absolute" styleClass="outrosSmallText" text="Desconto concedido:"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label19}" id="label19"
                            style="font-weight: normal; left: 192px; top: 312px; position: absolute" styleClass="outrosSmallText" text="Observações:"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label20}" id="label20"
                            style="font-weight: normal; left: 336px; top: 360px; position: absolute" styleClass="textoUsuario" text="#{detalhePedidoCliente.stgEndereco}"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label22}" id="label22"
                            style="font-weight: normal; left: 744px; top: 192px; position: absolute" styleClass="textoUsuario" text="#{detalhePedidoCliente.pedido.valorFrete}"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label23}" id="label23"
                            style="font-weight: normal; left: 744px; top: 216px; position: absolute" styleClass="textoUsuario" text="#{detalhePedidoCliente.pedido.desconto}"/>
                        <webuijsf:label binding="#{detalhePedidoCliente.label24}" id="label24"
                            style="font-weight: normal; left: 336px; top: 312px; position: absolute" styleClass="textoUsuario" text="#{detalhePedidoCliente.pedido.observacoes}"/>
                        <webuijsf:table augmentTitle="false" binding="#{detalhePedidoCliente.table1}" id="table1"
                            style="left: 192px; top: 408px; position: absolute" title="Itens do Pedido" width="624">
                            <webuijsf:tableRowGroup binding="#{detalhePedidoCliente.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{detalhePedidoCliente.produtosDTOs}" sourceVar="currentRow">
                                <webuijsf:tableColumn binding="#{detalhePedidoCliente.tableColumn4}" id="tableColumn4" sort="imagem">
                                    <webuijsf:staticText binding="#{detalhePedidoCliente.staticText4}" id="staticText4" text="#{currentRow.value['imagem']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{detalhePedidoCliente.tableColumn5}" headerText="Nome do produto" id="tableColumn5" sort="nomeProduto">
                                    <webuijsf:staticText binding="#{detalhePedidoCliente.staticText5}" id="staticText5" text="#{currentRow.value['nomeProduto']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{detalhePedidoCliente.tableColumn6}" headerText="Valor unitário" id="tableColumn6" sort="precoProduto">
                                    <webuijsf:staticText binding="#{detalhePedidoCliente.staticText6}" id="staticText6" text="#{currentRow.value['precoProduto']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{detalhePedidoCliente.tableColumn7}" headerText="Qtde comprada" id="tableColumn7" sort="quantidade">
                                    <webuijsf:staticText binding="#{detalhePedidoCliente.staticText7}" id="staticText7" text="#{currentRow.value['quantidade']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{detalhePedidoCliente.tableColumn8}" headerText="Valor * qtde comprada" id="tableColumn8" sort="preco">
                                    <webuijsf:staticText binding="#{detalhePedidoCliente.staticText8}" id="staticText8" text="#{currentRow.value['preco']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
