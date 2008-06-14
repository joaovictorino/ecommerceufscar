<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : editarCategorias
    Created on : Jun 14, 2008, 1:26:45 PM
    Author     : sronly
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{interfaces$editarCategorias.page1}" id="page1">
            <webuijsf:html binding="#{interfaces$editarCategorias.html1}" id="html1">
                <webuijsf:head binding="#{interfaces$editarCategorias.head1}" id="head1">
                    <webuijsf:link binding="#{interfaces$editarCategorias.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{interfaces$editarCategorias.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{interfaces$editarCategorias.form1}" id="form1">
                        <webuijsf:dropDown binding="#{interfaces$editarCategorias.dropDown1}" id="dropDown1"
                            items="#{interfaces$editarCategorias.dropDown1DefaultOptions.options}" style="left: 240px; top: 144px; position: absolute" valueChangeListenerExpression="#{interfaces$editarCategorias.dropDown1_processValueChange}"/>
                        <webuijsf:label binding="#{interfaces$editarCategorias.label1}" id="label1" style="left: 144px; top: 168px; position: absolute" text="Nome:"/>
                        <webuijsf:button actionExpression="#{interfaces$editarCategorias.button1_action}" binding="#{interfaces$editarCategorias.button1}"
                            id="button1" style="left: 239px; top: 192px; position: absolute" text="Editar"/>
                        <webuijsf:textField binding="#{interfaces$editarCategorias.textField1}" id="textField1"
                            style="left: 240px; top: 168px; position: absolute" text="CDs"/>
                        <webuijsf:label binding="#{interfaces$editarCategorias.label3}" id="label3" style="left: 144px; top: 144px; position: absolute" text="Categoria-Pai:"/>
                        <webuijsf:label binding="#{interfaces$editarCategorias.label2}" id="label2"
                            style="font-family: 'Arial','Helvetica',sans-serif; font-size: 18px; left: 144px; top: 96px; position: absolute" text="Administração &gt;&gt; Categorias &gt;&gt; Editar"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
