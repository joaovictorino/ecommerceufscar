<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Login
    Created on : 26/01/2008, 14:29:36
    Author     : Cliente
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{login.page1}" id="page1">
            <webuijsf:html binding="#{login.html1}" id="html1">
                <webuijsf:head binding="#{login.head1}" id="head1">
                    <webuijsf:link binding="#{login.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{login.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{login.form1}" id="form1">
                        <webuijsf:label binding="#{login.lblLogin}" id="lblLogin" style="left: 528px; top: 216px; position: absolute" text="Login"/>
                        <webuijsf:label binding="#{login.lblSenha}" id="lblSenha" style="left: 528px; top: 264px; position: absolute" text="Senha"/>
                        <webuijsf:textField binding="#{login.txtLogin}" id="txtLogin" style="left: 600px; top: 216px; position: absolute"/>
                        <webuijsf:passwordField binding="#{login.txtSenha}" id="txtSenha" style="left: 600px; top: 264px; position: absolute"/>
                        <webuijsf:button actionExpression="#{login.btnLogin_action}" binding="#{login.btnLogin}" id="btnLogin"
                            style="left: 671px; top: 312px; position: absolute" text="Login"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
