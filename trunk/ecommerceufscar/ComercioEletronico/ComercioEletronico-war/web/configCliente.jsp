<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : configCliente
    Created on : 14/07/2008, 15:29:29
    Author     : Cliente
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{configCliente.page1}" id="page1">
            <webuijsf:html binding="#{configCliente.html1}" id="html1">
                <webuijsf:head binding="#{configCliente.head1}" id="head1">
                    <webuijsf:link binding="#{configCliente.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{configCliente.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{configCliente.form1}" id="form1">
                        <div style="left: 0px; top: 0px; position: absolute">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="left: 0px; top: 96px; position: absolute">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <webuijsf:hyperlink binding="#{configCliente.hyperlink1}" id="hyperlink1"
                            style="left: 192px; top: 120px; position: absolute; text-decoration: none" styleClass="outrosSmallText" text="Editar meus dados" url="/faces/editarDadosCliente.jsp"/>
                        <webuijsf:hyperlink binding="#{configCliente.hyperlink2}" id="hyperlink2"
                            style="left: 336px; top: 120px; position: absolute; text-decoration: none" styleClass="outrosSmallText" text="Incluir endereço" url="/faces/incluirEnderecoCliente.jsp"/>
                        <webuijsf:label binding="#{configCliente.label1}" id="label1" style="left: 192px; top: 264px; position: absolute"
                            styleClass="outrosSmallText" text="e-mail principal:"/>
                        <webuijsf:label binding="#{configCliente.label3}" id="label3" style="left: 432px; top: 552px; position: absolute"
                            styleClass="outrosSmallText" text="Ramal:"/>
                        <webuijsf:label binding="#{configCliente.label4}" id="label4"
                            style="color: rgb(0, 0, 51); font-size: 20px; font-style: normal; font-weight: lighter; left: 192px; top: 168px; position: absolute; text-decoration: none"
                            styleClass="titulo01" text="Informações obrigatórias para se cadastrar"/>
                        <webuijsf:label binding="#{configCliente.label5}" id="label5" style="left: 552px; top: 264px; position: absolute"
                            styleClass="outrosSmallText" text="data de nascimentos:"/>
                        <webuijsf:label binding="#{configCliente.label6}" id="label6" style="left: 192px; top: 648px; position: absolute"
                            styleClass="outrosSmallText" text="Celular:"/>
                        <webuijsf:label binding="#{configCliente.label7}" id="label7" style="left: 192px; top: 216px; position: absolute"
                            styleClass="outrosSmallText" text="Login:"/>
                        <webuijsf:label binding="#{configCliente.label9}" id="label9" style="left: 336px; top: 648px; position: absolute"
                            styleClass="outrosSmallText" text="DDD:"/>
                        <webuijsf:label binding="#{configCliente.label10}" id="label10" style="left: 432px; top: 600px; position: absolute"
                            styleClass="outrosSmallText" text="Ramal:"/>
                        <webuijsf:label binding="#{configCliente.label11}" id="label11"
                            style="color: rgb(0, 0, 51); font-size: 20px; font-style: normal; font-weight: lighter; left: 192px; top: 384px; position: absolute"
                            styleClass="outros" text="Informações obrigatórias para efetuar compras"/>
                        <webuijsf:label binding="#{configCliente.label12}" id="label12" style="left: 192px; top: 552px; position: absolute"
                            styleClass="outrosSmallText" text="Telefone fixo 1:"/>
                        <webuijsf:label binding="#{configCliente.label16}" id="label16" style="left: 384px; top: 264px; position: absolute"
                            styleClass="outrosSmallText" text="e-mail secundário:"/>
                        <webuijsf:label binding="#{configCliente.label17}" id="label17" style="left: 336px; top: 600px; position: absolute"
                            styleClass="outrosSmallText" text="DDD:"/>
                        <webuijsf:label binding="#{configCliente.label19}" id="label19" style="left: 192px; top: 432px; position: absolute"
                            styleClass="outrosSmallText" text="Nome completo:"/>
                        <webuijsf:label binding="#{configCliente.label23}" id="label23" style="left: 216px; top: 336px; position: absolute"
                            styleClass="outrosSmallText" text="       Desejo receber informações de produtos do meu interesse!"/>
                        <webuijsf:label binding="#{configCliente.label24}" id="label24" style="left: 192px; top: 600px; position: absolute"
                            styleClass="outrosSmallText" text="Telefone fixo 2:"/>
                        <webuijsf:label binding="#{configCliente.label25}" id="label25"
                            style="color: rgb(0, 0, 51); font-size: 16px; font-style: normal; font-weight: normal; left: 192px; top: 504px; position: absolute"
                            styleClass="outros" text="Telefones"/>
                        <webuijsf:label binding="#{configCliente.label26}" id="label26" style="left: 384px; top: 432px; position: absolute"
                            styleClass="outrosSmallText" text="C.P.F.:"/>
                        <webuijsf:checkbox binding="#{configCliente.checkbox1}" id="checkbox1" readOnly="true"
                            style="color: rgb(0, 0, 153); left: 192px; top: 336px; position: absolute" styleClass="outrosSmallText"/>
                        <webuijsf:label binding="#{configCliente.label28}" id="label28" style="left: 336px; top: 552px; position: absolute"
                            styleClass="outrosSmallText" text="DDD:"/>
                        <webuijsf:label binding="#{configCliente.dataNascimento}" id="dataNascimento" style="left: 552px; top: 288px; position: absolute"
                            styleClass="textoUsuario" text="#{configCliente.cliente.dataNasc}"/>
                        <webuijsf:label binding="#{configCliente.login}" id="login"
                            style="color: rgb(0, 51, 204); font-family: 'Comic Sans MS',Arial,Helvetica,sans-serif; font-style: normal; font-weight: lighter; left: 192px; top: 240px; position: absolute" text="#{configCliente.cliente.loginPes}"/>
                        <webuijsf:label binding="#{configCliente.emailPrincipal}" id="emailPrincipal" style="left: 192px; top: 288px; position: absolute"
                            styleClass="textoUsuario" text="#{configCliente.cliente.email}"/>
                        <webuijsf:label binding="#{configCliente.nomeCompleto}" id="nomeCompleto" style="left: 192px; top: 456px; position: absolute"
                            styleClass="textoUsuario" text="#{configCliente.cliente.nome}"/>
                        <webuijsf:label binding="#{configCliente.emailSecundario}" id="emailSecundario" style="left: 384px; top: 288px; position: absolute"
                            styleClass="textoUsuario" text="#{configCliente.cliente.email}"/>
                        <webuijsf:label binding="#{configCliente.cpf}" id="cpf" style="left: 384px; top: 456px; position: absolute" styleClass="textoUsuario" text="#{configCliente.cliente.cpf}"/>
                        <webuijsf:label binding="#{configCliente.telFixo1}" id="telFixo1" style="left: 192px; top: 576px; position: absolute"
                            styleClass="textoUsuario" text="#{configCliente.cliente.telefone}"/>
                        <webuijsf:label binding="#{configCliente.dddFixo1}" id="dddFixo1" style="left: 336px; top: 576px; position: absolute"
                            styleClass="textoUsuario" text="#{configCliente.cliente.dddtelefone}"/>
                        <webuijsf:label binding="#{configCliente.ramalFixo1}" id="ramalFixo1" style="left: 432px; top: 576px; position: absolute"
                            styleClass="textoUsuario" text="#{configCliente.cliente.ramal}"/>
                        <webuijsf:label binding="#{configCliente.ramalFixo2}" id="ramalFixo2" style="left: 432px; top: 624px; position: absolute"
                            styleClass="textoUsuario" text="#{configCliente.cliente.ramal}"/>
                        <webuijsf:label binding="#{configCliente.dddFixo2}" id="dddFixo2" style="left: 336px; top: 624px; position: absolute"
                            styleClass="textoUsuario" text="#{configCliente.cliente.dddtelefone}"/>
                        <webuijsf:label binding="#{configCliente.telFixo2}" id="telFixo2" style="left: 192px; top: 624px; position: absolute"
                            styleClass="textoUsuario" text="#{configCliente.cliente.telefone}"/>
                        <webuijsf:label binding="#{configCliente.celular}" id="celular" style="left: 192px; top: 672px; position: absolute"
                            styleClass="textoUsuario" text="#{configCliente.cliente.celular}"/>
                        <webuijsf:label binding="#{configCliente.dddCelular}" id="dddCelular" style="left: 336px; top: 672px; position: absolute"
                            styleClass="textoUsuario" text="#{configCliente.cliente.dddcelular}"/>
                        <webuijsf:label binding="#{configCliente.label2}" id="label2"
                            style="color: rgb(0, 0, 51); font-size: 16px; font-style: normal; font-weight: normal; left: 192px; top: 720px; position: absolute"
                            styleClass="outros" text="Endereços"/>
                        <webuijsf:table augmentTitle="false" binding="#{configCliente.tabEnderecos}" id="tabEnderecos"
                            style="color: #000066; font-size: 12px; font-style: normal; font-weight: lighter; left: 192px; top: 768px; position: absolute; text-decoration: none"
                            styleClass="outrosSmallText" title="." width="840">
                            <webuijsf:tableRowGroup binding="#{configCliente.tableRowGroup1}" id="tableRowGroup1" rows="10"
                                sourceData="#{configCliente.enderecos}" sourceVar="currentRow">
                                <webuijsf:tableColumn binding="#{configCliente.tableColumn4}" headerText="Tipo de Endereço" id="tableColumn4"
                                    sort="tipoEndereco" styleClass="textoUsuario">
                                    <webuijsf:staticText binding="#{configCliente.staticText4}" id="staticText4" text="#{currentRow.value['tipoEndereco']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{configCliente.tableColumn5}" headerText="Endereço" id="tableColumn5" sort="endereco" styleClass="textoUsuario">
                                    <webuijsf:staticText binding="#{configCliente.staticText5}" id="staticText5" text="#{currentRow.value['endereco']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{configCliente.tableColumn6}" headerText="Número" id="tableColumn6" sort="numero" styleClass="textoUsuario">
                                    <webuijsf:staticText binding="#{configCliente.staticText6}" id="staticText6" text="#{currentRow.value['numero']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{configCliente.tableColumn7}" headerText="Bairro" id="tableColumn7" sort="bairro" styleClass="textoUsuario">
                                    <webuijsf:staticText binding="#{configCliente.staticText7}" id="staticText7" text="#{currentRow.value['bairro']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{configCliente.tableColumn8}" headerText="C.E.P." id="tableColumn8" sort="cep" styleClass="textoUsuario">
                                    <webuijsf:staticText binding="#{configCliente.staticText8}" id="staticText8" text="#{currentRow.value['cep']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{configCliente.tableColumn9}" headerText="Cidade" id="tableColumn9" sort="cidade" styleClass="textoUsuario">
                                    <webuijsf:staticText binding="#{configCliente.staticText9}" id="staticText9" text="#{currentRow.value['cidade']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{configCliente.tableColumn10}" headerText="Estado" id="tableColumn10" sort="estado" styleClass="textoUsuario">
                                    <webuijsf:staticText binding="#{configCliente.staticText10}" id="staticText10" text="#{currentRow.value['estado']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn binding="#{configCliente.tableColumn11}" headerText="País" id="tableColumn11" sort="pais" styleClass="textoUsuario">
                                    <webuijsf:staticText binding="#{configCliente.staticText11}" id="staticText11" text="#{currentRow.value['pais']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <webuijsf:hyperlink binding="#{configCliente.hyperlink3}" id="hyperlink3"
                            style="left: 480px; top: 120px; position: absolute; text-decoration: none" styleClass="outrosSmallText" text="Alterar Senha" url="/faces/alterarSenhaCliente.jsp"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
