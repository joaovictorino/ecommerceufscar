<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : editarCategorias
    Created on : Jun 14, 2008, 1:26:45 PM
    Author     : sronly
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{editarCategorias.page1}" id="page1">
            <webuijsf:html binding="#{editarCategorias.html1}" id="html1">
                <webuijsf:head binding="#{editarCategorias.head1}" id="head1">
                    <webuijsf:link binding="#{editarCategorias.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{editarCategorias.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{editarCategorias.form1}" id="form1">
                        <div style="height: 94px; left: 0px; top: 0px; position: absolute; width: 1222px">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="height: 454px; left: 0px; top: 312px; position: absolute; width: 142px">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <webuijsf:dropDown binding="#{editarCategorias.dropDown1}" id="dropDown1" items="#{editarCategorias.dropDown1DefaultOptions.options}"
                            style="left: 408px; top: 360px; position: absolute" valueChangeListenerExpression="#{editarCategorias.dropDown1_processValueChange}"/>
                        <webuijsf:label binding="#{editarCategorias.label1}" id="label1" style="left: 312px; top: 384px; position: absolute" text="Nome:"/>
                        <webuijsf:button actionExpression="#{editarCategorias.button1_action}" binding="#{editarCategorias.button1}" id="button1"
                            style="left: 407px; top: 408px; position: absolute" text="Editar"/>
                        <webuijsf:textField binding="#{editarCategorias.textField1}" id="textField1" style="left: 408px; top: 384px; position: absolute" text="CDs"/>
                        <webuijsf:label binding="#{editarCategorias.label3}" id="label3" style="left: 312px; top: 360px; position: absolute" text="Categoria-Pai:"/>
                        <webuijsf:label binding="#{editarCategorias.label2}" id="label2"
                            style="font-family: 'Arial','Helvetica',sans-serif; font-size: 18px; left: 312px; top: 312px; position: absolute" text="Administra��o &gt;&gt; Categorias &gt;&gt; Editar"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
