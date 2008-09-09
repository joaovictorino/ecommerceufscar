<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : alterarSenhaCliente
    Created on : 15/07/2008, 10:10:36
    Author     : Cliente
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{alterarSenhaCliente.page1}" id="page1">
            <webuijsf:html binding="#{alterarSenhaCliente.html1}" id="html1">
                <webuijsf:head binding="#{alterarSenhaCliente.head1}" id="head1">
                    <webuijsf:link binding="#{alterarSenhaCliente.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{alterarSenhaCliente.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{alterarSenhaCliente.form1}" id="form1">
                        <div style="height: 94px; left: 0px; top: 0px; position: absolute; width: 1222px">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="height: 454px; left: 0px; top: 312px; position: absolute; width: 142px">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <webuijsf:hyperlink binding="#{alterarSenhaCliente.hyperlink1}" id="hyperlink1"
                            style="left: 552px; top: 312px; position: absolute; text-decoration: none" styleClass="outrosSmallText" text="Incluir endereço" url="/faces/incluirEnderecoCliente.jsp"/>
                        <webuijsf:hyperlink binding="#{alterarSenhaCliente.hyperlink2}" id="hyperlink2"
                            style="left: 384px; top: 312px; position: absolute; text-decoration: none" styleClass="outrosSmallText" text="Editar meus dados" url="/faces/editarDadosCliente.jsp"/>
                        <webuijsf:passwordField binding="#{alterarSenhaCliente.senhaAtual}" id="senhaAtual" style="left: 384px; top: 432px; position: absolute"/>
                        <webuijsf:passwordField binding="#{alterarSenhaCliente.novaSenha1}" id="novaSenha1" style="left: 384px; top: 504px; position: absolute"/>
                        <webuijsf:passwordField binding="#{alterarSenhaCliente.novaSenha2}" id="novaSenha2" style="left: 552px; top: 504px; position: absolute"/>
                        <webuijsf:label binding="#{alterarSenhaCliente.label1}" id="label1"
                            style="color: rgb(0, 0, 51); font-size: 20px; font-style: normal; font-weight: lighter; left: 384px; top: 360px; position: absolute; text-decoration: none"
                            styleClass="titulo01" text="Alterar senha"/>
                        <webuijsf:label binding="#{alterarSenhaCliente.label2}" id="label2" style="left: 384px; top: 408px; position: absolute"
                            styleClass="outrosSmallText" text="Digite sua senha atual:"/>
                        <webuijsf:label binding="#{alterarSenhaCliente.label3}" id="label3" style="left: 384px; top: 480px; position: absolute"
                            styleClass="outrosSmallText" text="Digite sua nova senha:"/>
                        <webuijsf:label binding="#{alterarSenhaCliente.label4}" id="label4" style="left: 552px; top: 480px; position: absolute"
                            styleClass="outrosSmallText" text="Confirme sua nova senha:"/>
                        <webuijsf:button actionExpression="#{alterarSenhaCliente.button1_action}" binding="#{alterarSenhaCliente.button1}" id="button1"
                            style="left: 743px; top: 504px; position: absolute" text="Alterar"/>
                        <webuijsf:label binding="#{alterarSenhaCliente.msgAlterarSenhaCliente}" id="msgAlterarSenhaCliente"
                            style="position: absolute; left: 696px; top: 144px" visible="#{alterarSenhaCliente.mostraMensagem}"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
