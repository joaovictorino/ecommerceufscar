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
                <webuijsf:body binding="#{login.body1}" id="body1" style="-rave-layout: grid; background-color:#196395">
                    <div style="background: url(http://localhost:8080/ComercioEletronico-war/resources/images/bg_top-1.gif) repeat-x; height: 189px; left: 0px; top: 0px; position: absolute; width: 100%"></div>
                    <div style="background-image: url(http://localhost:8080/ComercioEletronico-war/resources/images/logo.gif); height: 130px; left: 504px; top: 0px; position: absolute; width: 253px"></div>
                    <div style="border: 3px solid white; background-color: rgb(44, 44, 44); height: 140px; left: 0px; top: 132px; position: absolute; width: 100%;"></div>
                    <webuijsf:form binding="#{login.form1}" id="form1" style="z-index: 1000">
                        <div style="color: white; left: 66px; top: 20px; position: absolute; width: 100px; font-weight:bold;font-family:Arial, Helvetica, sans-serif; font-size:12px; positon: absolute">ADMINISTRAÇÃO</div>
                        <webuijsf:label binding="#{login.lblLogin}" id="lblLogin" style="color: white; left: 28px; top: 48px; position: absolute" text="Login"/>
                        <webuijsf:label binding="#{login.lblSenha}" id="lblSenha" style="color: white; left: 28px; top: 72px; position: absolute" text="Senha"/>
                        <webuijsf:textField binding="#{login.txtLogin}" id="txtLogin" style="left: 76px; top: 48px; position: absolute"/>
                        <webuijsf:passwordField binding="#{login.txtSenha}" id="txtSenha" style="left: 76px; top: 72px; position: absolute"/>
                        <webuijsf:button actionExpression="#{login.btnLogin_action}" binding="#{login.btnLogin}" id="btnLogin"
                            style="left: 147px; top: 96px; position: absolute" text="Login"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
