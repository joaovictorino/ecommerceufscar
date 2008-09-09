<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : editarDadosCliente
    Created on : 14/07/2008, 17:54:45
    Author     : Cliente
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{editarDadosCliente.page1}" id="page1">
            <webuijsf:html binding="#{editarDadosCliente.html1}" id="html1">
                <webuijsf:head binding="#{editarDadosCliente.head1}" id="head1">
                    <webuijsf:link binding="#{editarDadosCliente.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{editarDadosCliente.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{editarDadosCliente.form1}" id="form1">
                        <div style="height: 94px; left: 0px; top: 0px; position: absolute; width: 1222px">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="height: 454px; left: 0px; top: 312px; position: absolute; width: 142px">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <webuijsf:textField binding="#{editarDadosCliente.telFixo1}" id="telFixo1" style="left: 312px; top: 864px; position: absolute" text="#{editarDadosCliente.cliente.telefone}"/>
                        <webuijsf:textField binding="#{editarDadosCliente.emailSecundario1}" id="emailSecundario1"
                            style="left: 504px; top: 480px; position: absolute" text="#{editarDadosCliente.cliente.email}"/>
                        <webuijsf:textField binding="#{editarDadosCliente.nomeCompleto1}" id="nomeCompleto1" style="left: 312px; top: 696px; position: absolute" text="#{editarDadosCliente.cliente.nome}"/>
                        <webuijsf:textField binding="#{editarDadosCliente.dddCelular1}" columns="8" id="dddCelular1"
                            style="left: 456px; top: 912px; position: absolute" text="#{editarDadosCliente.cliente.dddcelular}" valueChangeListenerExpression="#{editarDadosCliente.dddCelular_processValueChange}"/>
                        <webuijsf:label binding="#{editarDadosCliente.label1}" id="label1" style="left: 504px; top: 456px; position: absolute"
                            styleClass="outrosSmallText" text="e-mail secundário:"/>
                        <webuijsf:textField binding="#{editarDadosCliente.emailPrincipal1}" id="emailPrincipal1"
                            style="left: 312px; top: 480px; position: absolute" text="#{editarDadosCliente.cliente.email}"/>
                        <webuijsf:checkbox binding="#{editarDadosCliente.checkbox1}" id="checkbox1"
                            style="color: rgb(0, 0, 153); left: 336px; top: 528px; position: absolute" styleClass="outrosSmallText"/>
                        <webuijsf:label binding="#{editarDadosCliente.label3}" id="label3" style="left: 336px; top: 528px; position: absolute"
                            styleClass="outrosSmallText" text="       Desejo receber informações de produtos do meu interesse!"/>
                        <webuijsf:label binding="#{editarDadosCliente.label5}" id="label5"
                            style="color: rgb(0, 0, 51); font-size: 20px; font-style: normal; font-weight: lighter; left: 312px; top: 600px; position: absolute"
                            styleClass="outros" text="Informações obrigatórias para efetuar compras"/>
                        <webuijsf:textField binding="#{editarDadosCliente.celular1}" id="celular1" style="left: 312px; top: 912px; position: absolute" text="#{editarDadosCliente.cliente.celular}"/>
                        <webuijsf:label binding="#{editarDadosCliente.label6}" id="label6" style="left: 312px; top: 840px; position: absolute"
                            styleClass="outrosSmallText" text="Telefone fixo 2:"/>
                        <webuijsf:textField binding="#{editarDadosCliente.cpf1}" id="cpf1" style="left: 504px; top: 696px; position: absolute" text="#{editarDadosCliente.cliente.cpf}"/>
                        <webuijsf:label binding="#{editarDadosCliente.label7}" id="label7" style="left: 672px; top: 456px; position: absolute"
                            styleClass="outrosSmallText" text="data de nascimento:"/>
                        <webuijsf:label binding="#{editarDadosCliente.label9}" id="label9" style="left: 312px; top: 672px; position: absolute"
                            styleClass="outrosSmallText" text="Nome completo:"/>
                        <webuijsf:label binding="#{editarDadosCliente.label13}" id="label13" style="left: 456px; top: 792px; position: absolute"
                            styleClass="outrosSmallText" text="DDD:"/>
                        <webuijsf:label binding="#{editarDadosCliente.label14}" id="label14" style="left: 552px; top: 840px; position: absolute"
                            styleClass="outrosSmallText" text="Ramal:"/>
                        <webuijsf:label binding="#{editarDadosCliente.label15}" id="label15"
                            style="color: rgb(0, 0, 51); font-size: 16px; font-style: normal; font-weight: normal; left: 312px; top: 744px; position: absolute"
                            styleClass="outros" text="Telefones"/>
                        <webuijsf:label binding="#{editarDadosCliente.label16}" id="label16" style="left: 504px; top: 672px; position: absolute"
                            styleClass="outrosSmallText" text="C.P.F.:"/>
                        <webuijsf:label binding="#{editarDadosCliente.label17}" id="label17" style="left: 312px; top: 456px; position: absolute"
                            styleClass="outrosSmallText" text="e-mail principal:"/>
                        <webuijsf:label binding="#{editarDadosCliente.label18}" id="label18" style="left: 552px; top: 792px; position: absolute"
                            styleClass="outrosSmallText" text="Ramal:"/>
                        <webuijsf:label binding="#{editarDadosCliente.label19}" id="label19" style="left: 456px; top: 888px; position: absolute"
                            styleClass="outrosSmallText" text="DDD:"/>
                        <webuijsf:label binding="#{editarDadosCliente.label21}" id="label21" style="left: 456px; top: 840px; position: absolute"
                            styleClass="outrosSmallText" text="DDD:"/>
                        <webuijsf:textField binding="#{editarDadosCliente.ramalTelFixo1}" columns="8" id="ramalTelFixo1"
                            style="left: 552px; top: 864px; position: absolute" text="#{editarDadosCliente.cliente.ramal}"/>
                        <webuijsf:calendar binding="#{editarDadosCliente.dataNascimento1}" id="dataNascimento1"
                            selectedDate="#{editarDadosCliente.cliente.dataNasc}" style="left: 672px; top: 480px; position: absolute"/>
                        <webuijsf:textField binding="#{editarDadosCliente.telFixo2}" id="telFixo2" style="left: 312px; top: 816px; position: absolute" text="#{editarDadosCliente.cliente.telefone}"/>
                        <webuijsf:textField binding="#{editarDadosCliente.dddTelFixo1}" columns="8" id="dddTelFixo1"
                            style="left: 456px; top: 816px; position: absolute" text="#{editarDadosCliente.cliente.dddtelefone}"/>
                        <webuijsf:textField binding="#{editarDadosCliente.dddTelFixo2}" columns="8" id="dddTelFixo2"
                            style="left: 456px; top: 864px; position: absolute" text="#{editarDadosCliente.cliente.dddtelefone}"/>
                        <webuijsf:label binding="#{editarDadosCliente.label25}" id="label25" style="left: 312px; top: 408px; position: absolute"
                            styleClass="outrosSmallText" text="Login:"/>
                        <webuijsf:label binding="#{editarDadosCliente.label27}" id="label27" style="left: 312px; top: 888px; position: absolute"
                            styleClass="outrosSmallText" text="Celular:"/>
                        <webuijsf:label binding="#{editarDadosCliente.label28}" id="label28" style="left: 312px; top: 792px; position: absolute"
                            styleClass="outrosSmallText" text="Telefone fixo 1:"/>
                        <webuijsf:label binding="#{editarDadosCliente.label29}" id="label29"
                            style="color: rgb(0, 0, 51); font-size: 20px; font-style: normal; font-weight: lighter; left: 312px; top: 360px; position: absolute; text-decoration: none"
                            styleClass="titulo01" text="Informações obrigatórias do  cadastro"/>
                        <webuijsf:textField binding="#{editarDadosCliente.ramalTelFixo2}" columns="8" id="ramalTelFixo2"
                            style="left: 552px; top: 816px; position: absolute" text="#{editarDadosCliente.cliente.ramal}"/>
                        <webuijsf:hyperlink binding="#{editarDadosCliente.hyperlink1}" id="hyperlink1"
                            style="left: 312px; top: 312px; position: absolute; text-decoration: none" styleClass="outrosSmallText" text="Incluir endereço" url="/faces/incluirEnderecoCliente.jsp"/>
                        <webuijsf:hyperlink binding="#{editarDadosCliente.hyperlink2}" id="hyperlink2"
                            style="left: 456px; top: 312px; position: absolute; text-decoration: none" styleClass="outrosSmallText" text="Alterar Senha" url="/faces/alterarSenhaCliente.jsp"/>
                        <webuijsf:label binding="#{editarDadosCliente.login2}" id="login2"
                            style="color: rgb(0, 51, 204); font-family: 'Comic Sans MS','Arial','Helvetica',sans-serif; font-style: normal; font-weight: lighter; left: 312px; top: 624px; position: absolute" text="* além de possuir um endereço cadastrado."/>
                        <webuijsf:label binding="#{editarDadosCliente.login3}" id="login3"
                            style="color: rgb(0, 51, 204); font-family: 'Comic Sans MS','Arial','Helvetica',sans-serif; font-style: normal; font-weight: lighter; left: 768px; top: 600px; position: absolute" text="*"/>
                        <webuijsf:checkbox binding="#{editarDadosCliente.checkbox2}" id="checkbox2"
                            style="color: rgb(0, 0, 153); left: 312px; top: 528px; position: absolute" styleClass="outrosSmallText"/>
                        <webuijsf:button actionExpression="#{editarDadosCliente.button1_action}" binding="#{editarDadosCliente.button1}" id="button1"
                            style="left: 719px; top: 912px; position: absolute" text="Salvar Alterações"/>
                        <webuijsf:button actionExpression="#{editarDadosCliente.button1_action}" binding="#{editarDadosCliente.button2}" id="button2"
                            style="left: 719px; top: 312px; position: absolute" text="Salvar Alterações"/>
                        <webuijsf:label binding="#{editarDadosCliente.login1}" id="login1"
                            style="color: rgb(0, 51, 204); font-family: 'Comic Sans MS','Arial','Helvetica',sans-serif; font-style: normal; font-weight: lighter; left: 312px; top: 432px; position: absolute" text="#{editarDadosCliente.cliente.loginPes}"/>
                        <webuijsf:label binding="#{editarDadosCliente.msgEditarDadosCliente}" id="msgEditarDadosCliente"
                            style="height: 24px; left: 192px; top: 96px; position: absolute" text="Label" visible="#{editarDadosCliente.mostraMensagem}"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
