<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : homeAdm
    Created on : 03/02/2008, 15:04:23
    Author     : Cliente
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{homeAdm.page1}" id="page1">
            <webuijsf:html binding="#{homeAdm.html1}" id="html1">
                <webuijsf:head binding="#{homeAdm.head1}" id="head1">
                    <webuijsf:link binding="#{homeAdm.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{homeAdm.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{homeAdm.form1}" id="form1">
                        <div style="height: 94px; left: 0px; top: 0px; position: absolute; width: 1222px">
                            <jsp:directive.include file="cabecalhoAdm.jspf"/>
                        </div>
                        <div style="height: 454px; left: 0px; top: 96px; position: absolute; width: 142px">
                            <jsp:directive.include file="menuAdm.jspf"/>
                        </div>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
