<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : incluirCategorias
    Created on : Jun 14, 2008, 1:03:00 PM
    Author     : sronly
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{incluirCategorias.page1}" id="page1">
            <webuijsf:html binding="#{incluirCategorias.html1}" id="html1">
                <webuijsf:head binding="#{incluirCategorias.head1}" id="head1">
                    <webuijsf:link binding="#{incluirCategorias.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{incluirCategorias.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{incluirCategorias.form1}" id="form1">
                        <webuijsf:label binding="#{incluirCategorias.label2}" id="label2" style="left: 192px; top: 192px; position: absolute" text="Categoria-Pai:"/>
                        <webuijsf:label binding="#{incluirCategorias.label3}" id="label3" style="left: 192px; top: 216px; position: absolute" text="Nome:"/>
                        <webuijsf:dropDown binding="#{incluirCategorias.categoria_pai}" id="categoria_pai"
                            items="#{incluirCategorias.categoria_paiDefaultOptions.options}" style="left: 288px; top: 192px; position: absolute" valueChangeListenerExpression="#{incluirCategorias.categoria_pai_processValueChange}"/>
                        <webuijsf:textField binding="#{incluirCategorias.categoria}" id="categoria" style="left: 288px; top: 216px; position: absolute"/>
                        <webuijsf:button actionExpression="#{incluirCategorias.button1_action}" binding="#{incluirCategorias.button1}" id="button1"
                            style="left: 287px; top: 240px; position: absolute" text="Incluir"/>
                        <webuijsf:label binding="#{incluirCategorias.label1}" id="label1"
                            style="font-family: 'Arial','Helvetica',sans-serif; font-size: 18px; left: 192px; top: 144px; position: absolute" text="Administração &gt;&gt; Categorias &gt;&gt; Incluir"/>
                        <div style="left: -24px; top: 0px; position: absolute">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="left: 0px; top: 96px; position: absolute">
                            <jsp:directive.include file="menuAdm.jspf"/>
                        </div>
                        <webuijsf:label binding="#{incluirCategorias.lblResultado}" id="lblResultado" style="left: 408px; top: 240px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
