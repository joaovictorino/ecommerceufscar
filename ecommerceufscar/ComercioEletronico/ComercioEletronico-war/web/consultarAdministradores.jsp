<?xml version="1.0" encoding="ISO-8859-1"?>
<!-- 
    Document   : consultarAdministradores
    Created on : Jun 14, 2008, 1:30:09 PM
    Author     : sronly
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="ISO-8859-1"/>
    <f:view>
        <webuijsf:page binding="#{consultarAdministradores.page1}" id="page1">
            <webuijsf:html binding="#{consultarAdministradores.html1}" id="html1">
                <webuijsf:head binding="#{consultarAdministradores.head1}" id="head1">
                    <webuijsf:link binding="#{consultarAdministradores.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{consultarAdministradores.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{consultarAdministradores.form1}" id="form1">
                         <div style="height: 94px; left: 0px; top: 0px; position: absolute; width: 1222px">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="height: 454px; left: 0px; top: 312px; position: absolute; width: 142px">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <webuijsf:table augmentTitle="false" binding="#{consultarAdministradores.table1}" id="table1"
                            style="left: 312px; top: 480px; position: absolute; width: 696px" width="696">
                            <webuijsf:tableRowGroup binding="#{consultarAdministradores.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{consultarAdministradores.defaultTableDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn binding="#{consultarAdministradores.tableColumn1}" headerText="ID" id="tableColumn1" sort="column1">
                                    <webuijsf:staticText binding="#{consultarAdministradores.staticText1}" id="staticText1" text="#{currentRow.value['column1']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{consultarAdministradores.tableColumn2}" headerText="Nome" id="tableColumn2" sort="column2">
                                    <webuijsf:staticText binding="#{consultarAdministradores.staticText2}" id="staticText2" text="#{currentRow.value['column2']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{consultarAdministradores.tableColumn3}" headerText="email" id="tableColumn3" sort="column3">
                                    <webuijsf:staticText binding="#{consultarAdministradores.staticText3}" id="staticText3" text="#{currentRow.value['column3']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{consultarAdministradores.tableColumn4}" headerText="login" id="tableColumn4">
                                    <webuijsf:staticText binding="#{consultarAdministradores.staticText4}" id="staticText4" text="text"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="right" binding="#{consultarAdministradores.tableColumn5}" id="tableColumn5">
                                    <webuijsf:staticText binding="#{consultarAdministradores.staticText5}" id="staticText5" text="editar"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn align="right" binding="#{consultarAdministradores.tableColumn6}" id="tableColumn6">
                                    <webuijsf:staticText binding="#{consultarAdministradores.staticText6}" id="staticText6" text="editar"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:label binding="#{consultarAdministradores.label1}" id="label1"
                            style="font-family: 'Arial','Helvetica',sans-serif; font-size: 18px; left: 312px; top: 312px; position: absolute" text="Administração &gt;&gt; Administradores"/>
                        <webuijsf:label binding="#{consultarAdministradores.label2}" id="label2" style="left: 312px; top: 360px; position: absolute" text="Nome:"/>
                        <webuijsf:textField binding="#{consultarAdministradores.textField1}" columns="30" id="textField1" style="left: 408px; top: 360px; position: absolute"/>
                        <webuijsf:label binding="#{consultarAdministradores.label3}" id="label3" style="left: 312px; top: 384px; position: absolute" text="Email:"/>
                        <webuijsf:textField binding="#{consultarAdministradores.textField2}" columns="30" id="textField2" style="left: 408px; top: 384px; position: absolute"/>
                        <webuijsf:textField binding="#{consultarAdministradores.textField3}" columns="30" id="textField3" style="left: 408px; top: 408px; position: absolute"/>
                        <webuijsf:label binding="#{consultarAdministradores.label4}" id="label4" style="left: 312px; top: 408px; position: absolute" text="Login:"/>
                        <webuijsf:button binding="#{consultarAdministradores.button1}" id="button1"
                            style="height: 24px; left: 527px; top: 432px; position: absolute; width: 72px" text="Procurar"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
