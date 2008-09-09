<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Produto
    Created on : 25/01/2008, 14:30:14
    Author     : Cliente
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{produto.page1}" id="page1">
            <webuijsf:html binding="#{produto.html1}" id="html1">
                <webuijsf:head binding="#{produto.head1}" id="head1">
                    <webuijsf:link binding="#{produto.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{produto.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{produto.form1}" id="form1">
                        <div style="height: 94px; left: 0px; top: 0px; position: absolute; width: 1222px">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="height: 454px; left: 0px; top: 312px; position: absolute; width: 142px">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <webuijsf:label binding="#{produto.label2}" converter="#{produto.realConverter1}" id="label2"
                            style="left: 480px; top: 360px; position: absolute" styleClass="outrosSmallText"/>
                        <webuijsf:image binding="#{produto.image1}" id="image1" style="left: 288px; top: 312px; position: absolute" url=""/>
                        <webuijsf:hiddenField binding="#{produto.hiddenField1}" id="hiddenField1"/>
                        <webuijsf:label binding="#{produto.label7}" id="label7" style="left: 432px; top: 360px; position: absolute" styleClass="outrosSmallText" text="Por:"/>
                        <webuijsf:label binding="#{produto.label9}" id="label9" style="font-size: 16px; left: 288px; top: 408px; position: absolute"
                            styleClass="outrosSmallText" text="Descrição"/>
                        <webuijsf:label binding="#{produto.label10}" id="label10" style="font-size: 16px; left: 288px; top: 600px; position: absolute"
                            styleClass="outrosSmallText" text="Dados Técnicos"/>
                        <webuijsf:label binding="#{produto.label4}" converter="#{produto.characterConverter1}" id="label4"
                            style="height: 142px; left: 288px; top: 624px; position: absolute; width: 840px" styleClass="outrosSmallText"/>
                        <webuijsf:label binding="#{produto.label5}" converter="#{produto.characterConverter1}" id="label5"
                            style="height: 142px; line-height: normal; left: 288px; top: 432px; position: absolute; width: 840px; background-attachment: fixed" styleClass="outrosSmallText"/>
                        <webuijsf:label binding="#{produto.carrinhoDeProdutos.msgCarrinhoDeProdutos}" id="msgCarrinhoDeProdutos" visible="#{produto.carrinhoDeProdutos.mostraMensagem}"/>
                        <webuijsf:imageHyperlink actionExpression="#{produto.btnAdd_action}" alt="Incluir produto no carrinho."
                            binding="#{produto.imageHyperlink1}" id="imageHyperlink1" imageURL="/resources/itensPagina/carrinhoIncluirAzul.jpg" style="left: 960px; top: 312px; position: absolute"/>
                        <webuijsf:imageHyperlink actionExpression="#{produto.btnVoltar_action}" binding="#{produto.imageHyperlink2}" id="imageHyperlink2"
                            imageURL="/resources/itensPagina/setaAzulPq.jpg" style="left: 1104px; top: 768px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
