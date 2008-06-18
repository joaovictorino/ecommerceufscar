<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : consultarClientes
    Created on : Jun 14, 2008, 3:30:16 PM
    Author     : sronly
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{consultarClientes.page1}" id="page1">
            <webuijsf:html binding="#{consultarClientes.html1}" id="html1">
                <webuijsf:head binding="#{consultarClientes.head1}" id="head1">
                    <webuijsf:link binding="#{consultarClientes.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{consultarClientes.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{consultarClientes.form1}" id="form1">
                        <webuijsf:label binding="#{consultarClientes.label1}" id="label1"
                            style="font-family: 'Arial','Helvetica',sans-serif; font-size: 18px; left: 168px; top: 120px; position: absolute" text="Administração &gt;&gt; Clientes"/>
                        <webuijsf:table augmentTitle="false" binding="#{consultarClientes.table1}" id="table1"
                            style="left: 168px; top: 168px; position: absolute" width="744">
                            <webuijsf:tableRowGroup binding="#{consultarClientes.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{consultarClientes.defaultTableDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn binding="#{consultarClientes.tableColumn1}" headerText="ID" id="tableColumn1" sort="column1">
                                    <webuijsf:staticText binding="#{consultarClientes.staticText1}" id="staticText1" text="#{currentRow.value['column1']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{consultarClientes.tableColumn2}" headerText="Nome" id="tableColumn2" sort="column2">
                                    <webuijsf:staticText binding="#{consultarClientes.staticText2}" id="staticText2" text="#{currentRow.value['column2']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{consultarClientes.tableColumn3}" headerText="email" id="tableColumn3" sort="column3">
                                    <webuijsf:staticText binding="#{consultarClientes.staticText3}" id="staticText3" text="#{currentRow.value['column3']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{consultarClientes.tableColumn4}" headerText="Qtde Compras" id="tableColumn4">
                                    <webuijsf:staticText binding="#{consultarClientes.staticText4}" id="staticText4" text="10"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{consultarClientes.tableColumn5}" headerText="Total Gasto" id="tableColumn5" width="82">
                                    <webuijsf:staticText binding="#{consultarClientes.staticText5}" id="staticText5" text="R$ 1000,00"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{consultarClientes.tableColumn6}" headerText="Data Ultima Compra" id="tableColumn6">
                                    <webuijsf:staticText binding="#{consultarClientes.staticText6}" id="staticText6" text="14/06/2008"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <div style="left: 0px; top: 0px; position: absolute">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="left: 0px; top: 96px; position: absolute">
                            <jsp:directive.include file="menuAdm.jspf"/>
                        </div>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
