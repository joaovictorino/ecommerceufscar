<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : loginUsuario
    Created on : Aug 23, 2008, 3:06:34 PM
    Author     : sronly
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{loginUsuario.page1}" id="page1">
            <webuijsf:html binding="#{loginUsuario.html1}" id="html1">
                <webuijsf:head binding="#{loginUsuario.head1}" id="head1">
                    <webuijsf:link binding="#{loginUsuario.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{loginUsuario.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{loginUsuario.form1}" id="form1">
                        <div style="height: 94px; left: 0px; top: 0px; position: absolute; width: 1222px">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="height: 454px; left: 0px; top: 312px; position: absolute; width: 142px">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <webuijsf:label binding="#{loginUsuario.lblSenha1}" id="lblSenha1"
                            style="color: white; font-family: 'Comic Sans MS',Arial,Helvetica,sans-serif; left: 960px; top: 68px; position: absolute" text="Senha" visible="#{loginUsuario.mostrarCamposLogin}"/>
                        <webuijsf:label binding="#{loginUsuario.lblLogin1}" id="lblLogin1"
                            style="color: white; font-family: 'Comic Sans MS',Arial,Helvetica,sans-serif; left: 768px; top: 68px; position: absolute" text="Login" visible="#{loginUsuario.mostrarCamposLogin}"/>
                        <webuijsf:textField binding="#{loginUsuario.txtLogin1}" id="txtLogin1" style="left: 816px; top: 68px; position: absolute" visible="#{loginUsuario.mostrarCamposLogin}"/>
                        <webuijsf:passwordField binding="#{loginUsuario.txtSenha1}" id="txtSenha1" style="left: 1008px; top: 68px; position: absolute" visible="#{loginUsuario.mostrarCamposLogin}"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
