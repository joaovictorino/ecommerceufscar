<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : CompraEfetuada
    Created on : 22/06/2008, 18:14:45
    Author     : Cliente
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{CompraEfetuada.page1}" id="page1">
            <webuijsf:html binding="#{CompraEfetuada.html1}" id="html1">
                <webuijsf:head binding="#{CompraEfetuada.head1}" id="head1">
                    <webuijsf:link binding="#{CompraEfetuada.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{CompraEfetuada.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{CompraEfetuada.form1}" id="form1">
                        <div style="left: 0px; top: 0px; position: absolute">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="left: 0px; top: 96px; position: absolute">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <div style="left: 1080px; top: 96px; position: absolute">
                            <jsp:directive.include file="homeRight.jspf"/>
                        </div>
                        <webuijsf:label binding="#{CompraEfetuada.label1}" id="label1" style="left: 480px; top: 168px; position: absolute" text="Compra realizada com sucesso!"/>
                        <webuijsf:label binding="#{CompraEfetuada.label2}" id="label2" style="left: 600px; top: 192px; position: absolute; width: 48px" text="#{SessionBean1.numCompra}"/>
                        <webuijsf:label binding="#{CompraEfetuada.label3}" id="label3" style="left: 480px; top: 192px; position: absolute" text="Número da compra:"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
