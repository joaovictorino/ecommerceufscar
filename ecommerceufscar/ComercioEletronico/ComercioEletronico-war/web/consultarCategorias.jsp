<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : consultarCategorias
    Created on : Jun 14, 2008, 1:10:12 PM
    Author     : sronly
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{consultarCategorias.page1}" id="page1">
            <webuijsf:html binding="#{consultarCategorias.html1}" id="html1">
                <webuijsf:head binding="#{consultarCategorias.head1}" id="head1">
                    <webuijsf:link binding="#{consultarCategorias.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{consultarCategorias.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{consultarCategorias.form1}" id="form1">
                        <div style="height: 94px; left: 0px; top: 0px; position: absolute; width: 1222px">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="height: 454px; left: 0px; top: 312px; position: absolute; width: 142px">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <webuijsf:table augmentTitle="false" binding="#{consultarCategorias.table1}" id="table1"
                            style="height: 312px; left: 312px; top: 432px; position: absolute; width: 696px" width="696">
                            <webuijsf:tableRowGroup binding="#{consultarCategorias.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{consultarCategorias.defaultTableDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn binding="#{consultarCategorias.tableColumn1}" headerText="ID" id="tableColumn1" sort="column1" width="175">
                                    <webuijsf:staticText binding="#{consultarCategorias.staticText1}" id="staticText1" text="#{currentRow.value['column1']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{consultarCategorias.tableColumn2}" headerText="Nome" id="tableColumn2" sort="column2">
                                    <webuijsf:staticText binding="#{consultarCategorias.staticText2}" id="staticText2" text="#{currentRow.value['column2']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{consultarCategorias.tableColumn3}" headerText="Categoria-Pai" id="tableColumn3" sort="column3" width="164">
                                    <webuijsf:staticText binding="#{consultarCategorias.staticText3}" id="staticText3" text="#{currentRow.value['column3']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="right" binding="#{consultarCategorias.tableColumn4}" id="tableColumn4">
                                    <webuijsf:staticText binding="#{consultarCategorias.staticText4}" id="staticText4" text="editar"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="right" binding="#{consultarCategorias.tableColumn5}" id="tableColumn5">
                                    <webuijsf:staticText binding="#{consultarCategorias.staticText5}" id="staticText5" text="excluir"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:label binding="#{consultarCategorias.label1}" id="label1"
                            style="font-family: 'Arial','Helvetica',sans-serif; font-size: 18px; left: 312px; top: 312px; position: absolute" text="Administra��o &gt;&gt; Categorias"/>
                        <webuijsf:textField binding="#{consultarCategorias.textField1}" columns="30" id="textField1" style="left: 408px; top: 360px; position: absolute"/>
                        <webuijsf:button actionExpression="#{consultarCategorias.buttonProcurarProduto_action}"
                            binding="#{consultarCategorias.buttonProcurarProduto1}" id="buttonProcurarProduto1"
                            style="height: 24px; left: 527px; top: 384px; position: absolute; width: 72px" text="Procurar"/>
                        <webuijsf:label binding="#{consultarCategorias.label2}" id="label2" style="left: 312px; top: 360px; position: absolute" text="Nome:"/>
                        <webuijsf:label binding="#{consultarCategorias.label3}" id="label3" style="left: 312px; top: 384px; position: absolute" text="Categoria-Pai:"/>
                        <webuijsf:dropDown binding="#{consultarCategorias.dropDown1}" id="dropDown1"
                            items="#{consultarCategorias.dropDown1DefaultOptions.options}" style="left: 408px; top: 384px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
