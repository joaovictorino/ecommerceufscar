<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : configComprasCliente
    Created on : 15/07/2008, 10:27:28
    Author     : Cliente
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{configComprasCliente.page1}" id="page1">
            <webuijsf:html binding="#{configComprasCliente.html1}" id="html1">
                <webuijsf:head binding="#{configComprasCliente.head1}" id="head1">
                    <webuijsf:link binding="#{configComprasCliente.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{configComprasCliente.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{configComprasCliente.form1}" id="form1">
                        <div style="height: 94px; left: 0px; top: 0px; position: absolute; width: 1222px">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="height: 454px; left: 0px; top: 312px; position: absolute; width: 142px">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <webuijsf:label binding="#{configComprasCliente.label1}" id="label1"
                            style="font-weight: normal; left: 288px; top: 360px; position: absolute" styleClass="outrosSmallText" text="Número do Útimo Pedido:"/>
                        <webuijsf:imageHyperlink binding="#{configComprasCliente.imageHyperlink1}" id="imageHyperlink1"
                            style="left: 288px; top: 456px; position: absolute; text-decoration: none" styleClass="textoUsuario" text="ver detalhe deste pedido" url="/faces/detalhePedidoCliente.jsp"/>
                        <webuijsf:radioButtonGroup binding="#{configComprasCliente.radioButtonGroup1}" id="radioButtonGroup1"
                            items="#{configComprasCliente.radioButtonGroup1DefaultOptions.options}"
                            selected="#{configComprasCliente.radioButtonGroup1DefaultOptions.selectedValue}"
                            style="color: rgb(0, 0, 153); font-family: 'Comic Sans MS','Arial','Helvetica',sans-serif; font-size: 12px; font-style: normal; font-weight: lighter; height: 96px; left: 624px; top: 360px; position: absolute; text-decoration: none; width: 144px"
                            styleClass="outrosSmallText" valueChangeListenerExpression="#{configComprasCliente.radioButtonGroup1_processValueChange}"/>
                        <webuijsf:calendar binding="#{configComprasCliente.calendar1}" id="calendar1" style="left: 768px; top: 432px; position: absolute"/>
                        <webuijsf:calendar binding="#{configComprasCliente.calendar2}" columns="18" id="calendar2" style="left: 984px; top: 432px; position: absolute"/>
                        <webuijsf:textField binding="#{configComprasCliente.textField1}" columns="11" id="textField1" style="left: 768px; top: 408px; position: absolute"/>
                        <webuijsf:label binding="#{configComprasCliente.label7}" id="label7"
                            style="color: rgb(0, 0, 51); font-size: 20px; font-style: normal; font-weight: lighter; left: 288px; top: 312px; position: absolute; text-decoration: none"
                            styleClass="titulo01" text="Minha última compra"/>
                        <webuijsf:label binding="#{configComprasCliente.label2}" id="label2"
                            style="font-weight: normal; left: 288px; top: 408px; position: absolute" styleClass="outrosSmallText" text="Data do pedido:"/>
                        <webuijsf:label binding="#{configComprasCliente.label8}" id="label8"
                            style="font-weight: normal; left: 288px; top: 384px; position: absolute" styleClass="outrosSmallText" text="Forma de pagamento:"/>
                        <webuijsf:label binding="#{configComprasCliente.label9}" id="label9"
                            style="font-weight: normal; left: 288px; top: 432px; position: absolute" styleClass="outrosSmallText" text="Valor:"/>
                        <webuijsf:label binding="#{configComprasCliente.label3}" id="label3"
                            style="font-weight: normal; left: 456px; top: 360px; position: absolute" styleClass="textoUsuario" text="#{configComprasCliente.ultimaCompra.numCompra}"/>
                        <webuijsf:label binding="#{configComprasCliente.label4}" id="label4"
                            style="font-weight: normal; left: 456px; top: 384px; position: absolute" styleClass="textoUsuario" text="#{configComprasCliente.ultimaCompra.formaPagamento}"/>
                        <webuijsf:label binding="#{configComprasCliente.label5}" id="label5"
                            style="font-weight: normal; left: 456px; top: 408px; position: absolute" styleClass="textoUsuario" text="#{configComprasCliente.ultimaCompra.dataPedido}"/>
                        <webuijsf:label binding="#{configComprasCliente.label10}" converter="#{configComprasCliente.carrinhoProdutos.realConverter1}"
                            id="label10" style="font-weight: normal; left: 456px; top: 432px; position: absolute" styleClass="textoUsuario" text="#{configComprasCliente.ultimaCompra.valorTotal}"/>
                        <webuijsf:label binding="#{configComprasCliente.label15}" id="label15"
                            style="color: rgb(0, 0, 0); font-size: 12px; font-weight: bold; left: 936px; top: 432px; position: absolute"
                            styleClass="outrosSmallText" text="até"/>
                        <webuijsf:button actionExpression="#{configComprasCliente.button1_action}" binding="#{configComprasCliente.button1}" id="button1"
                            style="left: 1055px; top: 480px; position: absolute; width: 72px" text="Pesquisar"/>
                        <webuijsf:label binding="#{configComprasCliente.label6}" id="label6"
                            style="color: rgb(0, 0, 51); font-size: 20px; font-style: normal; font-weight: lighter; left: 624px; top: 312px; position: absolute; text-decoration: none"
                            styleClass="titulo01" text="Pesquisar minhas compras"/>
                        <webuijsf:table augmentTitle="false" binding="#{configComprasCliente.table1}" id="table1"
                            style="left: 288px; top: 504px; position: absolute; width: 840px" title="Pedidos pesquisados:" width="840">
                            <webuijsf:tableRowGroup binding="#{configComprasCliente.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{configComprasCliente.compras}" sourceVar="currentRow">
                                <webuijsf:tableColumn binding="#{configComprasCliente.tableColumn4}" headerText="Número do Pedido" id="tableColumn4" sort="numCompra">
                                    <webuijsf:hyperlink binding="#{configComprasCliente.hyperlink2}" id="hyperlink2" text="#{currentRow.value['numCompra']}" url="/faces/detalhePedidoCliente.jsp"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{configComprasCliente.tableColumn5}" headerText="Status" id="tableColumn5" sort="statusCompra">
                                    <webuijsf:staticText binding="#{configComprasCliente.staticText5}" id="staticText5" text="#{currentRow.value['statusCompra']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{configComprasCliente.tableColumn6}" headerText="Forma de pagamento" id="tableColumn6" sort="formaPagamento">
                                    <webuijsf:staticText binding="#{configComprasCliente.staticText6}" id="staticText6" text="#{currentRow.value['formaPagamento']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{configComprasCliente.tableColumn7}" headerText="Data do Pedido" id="tableColumn7" sort="dataPedido">
                                    <webuijsf:staticText binding="#{configComprasCliente.staticText7}" id="staticText7" text="#{currentRow.value['dataPedido']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{configComprasCliente.tableColumn8}" headerText="Valor" id="tableColumn8" sort="valorTotal">
                                    <webuijsf:staticText binding="#{configComprasCliente.staticText8}" id="staticText8" text="#{currentRow.value['valorTotal']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{configComprasCliente.tableColumn9}" headerText="Observações" id="tableColumn9" sort="observacoes">
                                    <webuijsf:staticText binding="#{configComprasCliente.staticText9}" id="staticText9" text="#{currentRow.value['observacoes']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
