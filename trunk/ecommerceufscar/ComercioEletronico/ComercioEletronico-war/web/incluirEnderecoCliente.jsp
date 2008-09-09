<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : incluirEnderecoCliente
    Created on : 18/07/2008, 16:43:56
    Author     : Cliente
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{incluirEnderecoCliente.page1}" id="page1">
            <webuijsf:html binding="#{incluirEnderecoCliente.html1}" id="html1">
                <webuijsf:head binding="#{incluirEnderecoCliente.head1}" id="head1">
                    <webuijsf:link binding="#{incluirEnderecoCliente.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{incluirEnderecoCliente.body1}" id="body1" style="-rave-layout: grid">
                    <div style="height: 94px; left: 0px; top: 0px; position: absolute; width: 1222px">
                        <jsp:directive.include file="cabecalho.jspf"/>
                    </div>
                    <div style="height: 454px; left: 0px; top: 312px; position: absolute; width: 142px">
                        <jsp:directive.include file="menu.jspf"/>
                    </div>
                    <webuijsf:form binding="#{incluirEnderecoCliente.form1}" id="form1">
                        <webuijsf:label binding="#{incluirEnderecoCliente.label1}" id="label1" style="left: 288px; top: 408px; position: absolute"
                            styleClass="outrosSmallText" text="Tipo de endereço:"/>
                        <webuijsf:label binding="#{incluirEnderecoCliente.label2}" id="label2" style="left: 864px; top: 456px; position: absolute"
                            styleClass="outrosSmallText" text="País:"/>
                        <webuijsf:label binding="#{incluirEnderecoCliente.label3}" id="label3" style="left: 696px; top: 456px; position: absolute"
                            styleClass="outrosSmallText" text="C.E.P.:"/>
                        <webuijsf:textField binding="#{incluirEnderecoCliente.cidade1}" id="cidade1" style="left: 432px; top: 480px; position: absolute" tabIndex="5"/>
                        <webuijsf:textField binding="#{incluirEnderecoCliente.numEndereco1}" columns="6" id="numEndereco1"
                            style="left: 864px; top: 432px; position: absolute" tabIndex="3"/>
                        <webuijsf:table augmentTitle="false" binding="#{incluirEnderecoCliente.tabEnderecos1}" id="tabEnderecos1"
                            style="color: rgb(0, 0, 102); font-size: 12px; font-style: normal; font-weight: lighter; left: 288px; top: 528px; position: absolute; text-decoration: none; width: 840px"
                            styleClass="outrosSmallText" title="Endereços já cadastrados:" width="840">
                            <webuijsf:tableRowGroup binding="#{incluirEnderecoCliente.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{incluirEnderecoCliente.enderecos}" sourceVar="currentRow">
                                <webuijsf:tableColumn binding="#{incluirEnderecoCliente.tableColumn9}" headerText="Tipo de endereço" id="tableColumn9" sort="tipoEndereco">
                                    <webuijsf:staticText binding="#{incluirEnderecoCliente.staticText9}" id="staticText9" text="#{currentRow.value['tipoEndereco']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{incluirEnderecoCliente.tableColumn10}" headerText="Endereco" id="tableColumn10" sort="endereco">
                                    <webuijsf:staticText binding="#{incluirEnderecoCliente.staticText10}" id="staticText10" text="#{currentRow.value['endereco']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{incluirEnderecoCliente.tableColumn11}" headerText="Numero" id="tableColumn11" sort="numero">
                                    <webuijsf:staticText binding="#{incluirEnderecoCliente.staticText11}" id="staticText11" text="#{currentRow.value['numero']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{incluirEnderecoCliente.tableColumn12}" headerText="Bairro" id="tableColumn12" sort="bairro">
                                    <webuijsf:staticText binding="#{incluirEnderecoCliente.staticText12}" id="staticText12" text="#{currentRow.value['bairro']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{incluirEnderecoCliente.tableColumn13}" headerText="C.E.P." id="tableColumn13" sort="cep">
                                    <webuijsf:staticText binding="#{incluirEnderecoCliente.staticText13}" id="staticText13" text="#{currentRow.value['cep']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{incluirEnderecoCliente.tableColumn14}" headerText="Cidade" id="tableColumn14" sort="cidade">
                                    <webuijsf:staticText binding="#{incluirEnderecoCliente.staticText14}" id="staticText14" text="#{currentRow.value['cidade']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{incluirEnderecoCliente.tableColumn15}" headerText="Estado" id="tableColumn15" sort="estado">
                                    <webuijsf:staticText binding="#{incluirEnderecoCliente.staticText15}" id="staticText15" text="#{currentRow.value['estado']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{incluirEnderecoCliente.tableColumn16}" headerText="País" id="tableColumn16" sort="pais">
                                    <webuijsf:staticText binding="#{incluirEnderecoCliente.staticText16}" id="staticText16" text="#{currentRow.value['pais']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:textField binding="#{incluirEnderecoCliente.cep1}" columns="8" id="cep1" style="left: 696px; top: 480px; position: absolute" tabIndex="7"/>
                        <webuijsf:label binding="#{incluirEnderecoCliente.login1}" id="login1"
                            style="color: rgb(0, 51, 204); font-family: 'Comic Sans MS','Arial','Helvetica',sans-serif; font-style: normal; font-weight: lighter; left: 744px; top: 456px; position: absolute" text="-"/>
                        <webuijsf:textField binding="#{incluirEnderecoCliente.bairro1}" id="bairro1" style="left: 288px; top: 480px; position: absolute" tabIndex="4"/>
                        <webuijsf:label binding="#{incluirEnderecoCliente.label4}" id="label4"
                            style="color: rgb(0, 0, 51); font-size: 20px; font-style: normal; font-weight: lighter; left: 288px; top: 360px; position: absolute; text-decoration: none"
                            styleClass="titulo01" text="Incluir novo endereço"/>
                        <webuijsf:label binding="#{incluirEnderecoCliente.label5}" id="label5" style="left: 432px; top: 456px; position: absolute"
                            styleClass="outrosSmallText" text="Cidade:"/>
                        <webuijsf:textField binding="#{incluirEnderecoCliente.cep2}" columns="4" id="cep2" style="left: 768px; top: 480px; position: absolute" tabIndex="8"/>
                        <webuijsf:button actionExpression="#{incluirEnderecoCliente.button1_action}" binding="#{incluirEnderecoCliente.button1}" id="button1"
                            style="left: 1031px; top: 480px; position: absolute" text="Incluir endereço"/>
                        <webuijsf:label binding="#{incluirEnderecoCliente.label6}" id="label6" style="left: 600px; top: 456px; position: absolute"
                            styleClass="outrosSmallText" text="Estado:"/>
                        <webuijsf:hyperlink binding="#{incluirEnderecoCliente.hyperlink1}" id="hyperlink1"
                            style="left: 456px; top: 312px; position: absolute; text-decoration: none" styleClass="outrosSmallText" text="Alterar Senha" url="/faces/alterarSenhaCliente.jsp"/>
                        <webuijsf:textField binding="#{incluirEnderecoCliente.tipoEndereco1}" id="tipoEndereco1"
                            style="left: 288px; top: 432px; position: absolute" tabIndex="1"/>
                        <webuijsf:textField binding="#{incluirEnderecoCliente.endereco1}" columns="73" id="endereco1"
                            style="left: 432px; top: 432px; position: absolute" tabIndex="2"/>
                        <webuijsf:label binding="#{incluirEnderecoCliente.label7}" id="label7" style="left: 432px; top: 408px; position: absolute"
                            styleClass="outrosSmallText" text="Endereço:"/>
                        <webuijsf:label binding="#{incluirEnderecoCliente.label8}" id="label8" style="left: 864px; top: 408px; position: absolute"
                            styleClass="outrosSmallText" text="Número:"/>
                        <webuijsf:hyperlink binding="#{incluirEnderecoCliente.hyperlink2}" id="hyperlink2"
                            style="left: 288px; top: 312px; position: absolute; text-decoration: none" styleClass="outrosSmallText" text="Editar meus dados" url="/faces/editarDadosCliente.jsp"/>
                        <webuijsf:textField binding="#{incluirEnderecoCliente.pais1}" columns="15" id="pais1"
                            style="left: 864px; top: 480px; position: absolute" tabIndex="9"/>
                        <webuijsf:textField binding="#{incluirEnderecoCliente.estado1}" columns="5" id="estado1"
                            style="left: 600px; top: 480px; position: absolute" tabIndex="6"/>
                        <webuijsf:label binding="#{incluirEnderecoCliente.label9}" id="label9" style="left: 288px; top: 456px; position: absolute"
                            styleClass="outrosSmallText" text="Bairro:"/>
                        <webuijsf:label binding="#{incluirEnderecoCliente.msgIncluirEnderecoCliente}" id="msgIncluirEnderecoCliente"
                            style="left: 192px; top: 96px; position: absolute" visible="#{incluirEnderecoCliente.mostraMensagem}"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
