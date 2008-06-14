<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : consultarCategorias
    Created on : Jun 14, 2008, 1:10:12 PM
    Author     : sronly
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{interfaces$consultarCategorias.page1}" id="page1">
            <webuijsf:html binding="#{interfaces$consultarCategorias.html1}" id="html1">
                <webuijsf:head binding="#{interfaces$consultarCategorias.head1}" id="head1">
                    <webuijsf:link binding="#{interfaces$consultarCategorias.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{interfaces$consultarCategorias.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{interfaces$consultarCategorias.form1}" id="form1">
                        <webuijsf:table augmentTitle="false" binding="#{interfaces$consultarCategorias.table1}" id="table1"
                            style="height: 312px; left: 192px; top: 240px; position: absolute; width: 696px" width="696">
                            <webuijsf:tableRowGroup binding="#{interfaces$consultarCategorias.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{interfaces$consultarCategorias.defaultTableDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn binding="#{interfaces$consultarCategorias.tableColumn1}" headerText="ID" id="tableColumn1" sort="column1" width="175">
                                    <webuijsf:staticText binding="#{interfaces$consultarCategorias.staticText1}" id="staticText1" text="#{currentRow.value['column1']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{interfaces$consultarCategorias.tableColumn2}" headerText="Nome" id="tableColumn2" sort="column2">
                                    <webuijsf:staticText binding="#{interfaces$consultarCategorias.staticText2}" id="staticText2" text="#{currentRow.value['column2']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{interfaces$consultarCategorias.tableColumn3}" headerText="Categoria-Pai" id="tableColumn3"
                                    sort="column3" width="164">
                                    <webuijsf:staticText binding="#{interfaces$consultarCategorias.staticText3}" id="staticText3" text="#{currentRow.value['column3']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="right" binding="#{interfaces$consultarCategorias.tableColumn4}" id="tableColumn4">
                                    <webuijsf:staticText binding="#{interfaces$consultarCategorias.staticText4}" id="staticText4" text="editar"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="right" binding="#{interfaces$consultarCategorias.tableColumn5}" id="tableColumn5">
                                    <webuijsf:staticText binding="#{interfaces$consultarCategorias.staticText5}" id="staticText5" text="excluir"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:label binding="#{interfaces$consultarCategorias.label1}" id="label1"
                            style="font-family: 'Arial','Helvetica',sans-serif; font-size: 18px; left: 192px; top: 120px; position: absolute" text="Administração &gt;&gt; Categorias"/>
                        <div style="left: 0px; top: 0px; position: absolute">
                            <jsp:directive.include file="../cabecalho.jspf"/>
                        </div>
                        <div style="left: 0px; top: 96px; position: absolute">
                            <jsp:directive.include file="../menuAdm.jspf"/>
                        </div>
                        <webuijsf:textField binding="#{interfaces$consultarCategorias.textField1}" columns="30" id="textField1" style="left: 288px; top: 168px; position: absolute"/>
                        <webuijsf:button actionExpression="#{interfaces$consultarCategorias.buttonProcurarProduto_action}"
                            binding="#{interfaces$consultarCategorias.buttonProcurarProduto1}" id="buttonProcurarProduto1"
                            style="height: 24px; left: 407px; top: 192px; position: absolute; width: 72px" text="Procurar"/>
                        <webuijsf:label binding="#{interfaces$consultarCategorias.label2}" id="label2" style="left: 192px; top: 168px; position: absolute" text="Nome:"/>
                        <webuijsf:label binding="#{interfaces$consultarCategorias.label3}" id="label3" style="left: 192px; top: 192px; position: absolute" text="Categoria-Pai:"/>
                        <webuijsf:dropDown binding="#{interfaces$consultarCategorias.dropDown1}" id="dropDown1"
                            items="#{interfaces$consultarCategorias.dropDown1DefaultOptions.options}" style="left: 288px; top: 192px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
