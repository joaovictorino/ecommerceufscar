<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : cadastroCliente
    Created on : 14/07/2008, 09:46:17
    Author     : Cliente
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{cadastroCliente.page1}" id="page1">
            <webuijsf:html binding="#{cadastroCliente.html1}" id="html1">
                <webuijsf:head binding="#{cadastroCliente.head1}" id="head1">
                    <webuijsf:link binding="#{cadastroCliente.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{cadastroCliente.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{cadastroCliente.form1}" id="form1">
                        <div style="height: 94px; left: 0px; top: 0px; position: absolute; width: 1222px">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="height: 454px; left: 0px; top: 312px; position: absolute; width: 142px">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <webuijsf:label binding="#{cadastroCliente.label1}" id="label1" style="left: 408px; top: 336px; position: absolute"
                            styleClass="outrosSmallText" text="Login:"/>
                        <webuijsf:label binding="#{cadastroCliente.label2}" id="label2" style="left: 600px; top: 336px; position: absolute"
                            styleClass="outrosSmallText" text="Senha:"/>
                        <webuijsf:label binding="#{cadastroCliente.label3}" id="label3" style="left: 768px; top: 336px; position: absolute"
                            styleClass="outrosSmallText" text="Confirme a senha:"/>
                        <webuijsf:textField binding="#{cadastroCliente.login}" id="login" style="height: 0px; left: 408px; top: 360px; position: absolute; width: 24px"/>
                        <webuijsf:passwordField binding="#{cadastroCliente.senha}" id="senha" style="left: 600px; top: 360px; position: absolute"/>
                        <webuijsf:passwordField binding="#{cadastroCliente.confirSenha}" id="confirSenha" style="left: 768px; top: 360px; position: absolute"/>
                        <webuijsf:pageSeparator binding="#{cadastroCliente.pageSeparator1}" id="pageSeparator1" style="height: 7px; left: 360px; top: 504px; position: absolute; width: 1080px"/>
                        <webuijsf:label binding="#{cadastroCliente.label4}" id="label4"
                            style="color: rgb(0, 0, 51); font-size: 20px; font-style: normal; font-weight: lighter; left: 408px; top: 288px; position: absolute; text-decoration: none"
                            styleClass="titulo01" text="Informações obrigatórias para se cadastrar"/>
                        <webuijsf:label binding="#{cadastroCliente.label5}" id="label5" style="left: 408px; top: 384px; position: absolute"
                            styleClass="outrosSmallText" text="e-mail principal:"/>
                        <webuijsf:label binding="#{cadastroCliente.label6}" id="label6" style="left: 600px; top: 384px; position: absolute"
                            styleClass="outrosSmallText" text="e-mail secundário:"/>
                        <webuijsf:label binding="#{cadastroCliente.label7}" id="label7" style="left: 768px; top: 384px; position: absolute"
                            styleClass="outrosSmallText" text="data de nascimento:"/>
                        <webuijsf:checkbox binding="#{cadastroCliente.checkbox1}" id="checkbox1"
                            style="color: rgb(0, 0, 153); left: 408px; top: 456px; position: absolute" styleClass="outrosSmallText"/>
                        <webuijsf:textField binding="#{cadastroCliente.emailPrincipal}" id="emailPrincipal" style="left: 408px; top: 408px; position: absolute"/>
                        <webuijsf:textField binding="#{cadastroCliente.emailSecundario}" id="emailSecundario" style="left: 600px; top: 408px; position: absolute"/>
                        <webuijsf:calendar binding="#{cadastroCliente.dataNascimento}" id="dataNascimento" style="left: 768px; top: 408px; position: absolute"/>
                        <webuijsf:label binding="#{cadastroCliente.label8}" id="label8"
                            style="color: rgb(0, 0, 51); font-size: 20px; font-style: normal; font-weight: lighter; left: 408px; top: 552px; position: absolute"
                            styleClass="outros" text="Informações obrigatórias para efetuar compras"/>
                        <webuijsf:label binding="#{cadastroCliente.label9}" id="label9" style="left: 408px; top: 600px; position: absolute"
                            styleClass="outrosSmallText" text="Nome completo:"/>
                        <webuijsf:label binding="#{cadastroCliente.label10}" id="label10" style="left: 600px; top: 600px; position: absolute"
                            styleClass="outrosSmallText" text="C.P.F.:"/>
                        <webuijsf:textField binding="#{cadastroCliente.nomeCompleto}" id="nomeCompleto" style="left: 408px; top: 624px; position: absolute"/>
                        <webuijsf:textField binding="#{cadastroCliente.cpf}" id="cpf" style="left: 600px; top: 624px; position: absolute"/>
                        <webuijsf:label binding="#{cadastroCliente.label11}" id="label11"
                            style="color: rgb(0, 0, 51); font-size: 16px; font-style: normal; font-weight: normal; left: 408px; top: 672px; position: absolute"
                            styleClass="outros" text="Endereço"/>
                        <webuijsf:label binding="#{cadastroCliente.label12}" id="label12" style="left: 408px; top: 720px; position: absolute"
                            styleClass="outrosSmallText" text="Tipo de endereço:"/>
                        <webuijsf:textField binding="#{cadastroCliente.tipoEndereco}" columns="8" id="tipoEndereco" style="left: 408px; top: 744px; position: absolute"/>
                        <webuijsf:label binding="#{cadastroCliente.label13}" id="label13" style="left: 552px; top: 720px; position: absolute"
                            styleClass="outrosSmallText" text="Endereço:"/>
                        <webuijsf:label binding="#{cadastroCliente.label14}" id="label14" style="left: 984px; top: 720px; position: absolute"
                            styleClass="outrosSmallText" text="Número:"/>
                        <webuijsf:label binding="#{cadastroCliente.label15}" id="label15" style="left: 408px; top: 768px; position: absolute"
                            styleClass="outrosSmallText" text="Bairro:"/>
                        <webuijsf:label binding="#{cadastroCliente.label16}" id="label16" style="left: 816px; top: 768px; position: absolute"
                            styleClass="outrosSmallText" text="C.E.P.:"/>
                        <webuijsf:label binding="#{cadastroCliente.label17}" id="label17" style="left: 552px; top: 768px; position: absolute"
                            styleClass="outrosSmallText" text="Cidade:"/>
                        <webuijsf:label binding="#{cadastroCliente.label18}" id="label18" style="left: 720px; top: 768px; position: absolute"
                            styleClass="outrosSmallText" text="Estado:"/>
                        <webuijsf:label binding="#{cadastroCliente.label19}" id="label19" style="left: 984px; top: 768px; position: absolute"
                            styleClass="outrosSmallText" text="País:"/>
                        <webuijsf:label binding="#{cadastroCliente.label20}" id="label20" style="left: 552px; top: 888px; position: absolute"
                            styleClass="outrosSmallText" text="DDD:"/>
                        <webuijsf:label binding="#{cadastroCliente.label21}" id="label21" style="left: 408px; top: 888px; position: absolute"
                            styleClass="outrosSmallText" text="Telefone fixo 1:"/>
                        <webuijsf:label binding="#{cadastroCliente.label22}" id="label22" style="left: 648px; top: 888px; position: absolute"
                            styleClass="outrosSmallText" text="Ramal:"/>
                        <webuijsf:label binding="#{cadastroCliente.label24}" id="label24" style="left: 408px; top: 984px; position: absolute"
                            styleClass="outrosSmallText" text="Celular:"/>
                        <webuijsf:label binding="#{cadastroCliente.label25}" id="label25" style="left: 552px; top: 984px; position: absolute"
                            styleClass="outrosSmallText" text="DDD:"/>
                        <webuijsf:textField binding="#{cadastroCliente.endereco}" columns="73" id="endereco" style="left: 552px; top: 744px; position: absolute"/>
                        <webuijsf:textField binding="#{cadastroCliente.bairro}" id="bairro" style="left: 408px; top: 792px; position: absolute"/>
                        <webuijsf:textField binding="#{cadastroCliente.telFixo1}" id="telFixo1" style="left: 408px; top: 912px; position: absolute"/>
                        <webuijsf:textField binding="#{cadastroCliente.pais}" columns="15" id="pais" style="left: 984px; top: 792px; position: absolute"/>
                        <webuijsf:textField binding="#{cadastroCliente.cep}" id="cep" style="left: 816px; top: 792px; position: absolute"/>
                        <webuijsf:textField binding="#{cadastroCliente.celular}" id="celular" style="left: 408px; top: 1008px; position: absolute"/>
                        <webuijsf:textField binding="#{cadastroCliente.cidade}" id="cidade" style="left: 552px; top: 792px; position: absolute"/>
                        <webuijsf:label binding="#{cadastroCliente.label26}" id="label26"
                            style="color: rgb(0, 0, 51); font-size: 16px; font-style: normal; font-weight: normal; left: 408px; top: 840px; position: absolute"
                            styleClass="outros" text="Telefones"/>
                        <webuijsf:textField binding="#{cadastroCliente.numEndereco}" columns="6" id="numEndereco" style="left: 840px; top: 744px; position: absolute"/>
                        <webuijsf:textField binding="#{cadastroCliente.ramalTelFixo1}" columns="8" id="ramalTelFixo1" style="left: 504px; top: 912px; position: absolute"/>
                        <webuijsf:textField binding="#{cadastroCliente.dddTelFixo1}" columns="8" id="dddTelFixo1" style="left: 552px; top: 912px; position: absolute"/>
                        <webuijsf:textField binding="#{cadastroCliente.dddCelular}" columns="8" id="dddCelular"
                            style="left: 552px; top: 1008px; position: absolute" valueChangeListenerExpression="#{cadastroCliente.dddCelular_processValueChange}"/>
                        <webuijsf:textField binding="#{cadastroCliente.estado}" columns="5" id="estado" style="left: 720px; top: 792px; position: absolute"/>
                        <webuijsf:button actionExpression="#{cadastroCliente.button1_action}" binding="#{cadastroCliente.button1}" id="button1"
                            style="left: 839px; top: 1008px; position: absolute" text="Efetuar Cadastro"/>
                        <webuijsf:label binding="#{cadastroCliente.label23}" id="label23" style="left: 432px; top: 456px; position: absolute"
                            styleClass="outrosSmallText" text="       Desejo receber informações de produtos do meu interesse!"/>
                        <webuijsf:label binding="#{cadastroCliente.label27}" id="label27" style="left: 552px; top: 936px; position: absolute"
                            styleClass="outrosSmallText" text="DDD:"/>
                        <webuijsf:label binding="#{cadastroCliente.label28}" id="label28" style="left: 408px; top: 936px; position: absolute"
                            styleClass="outrosSmallText" text="Telefone fixo 2:"/>
                        <webuijsf:label binding="#{cadastroCliente.label29}" id="label29" style="left: 648px; top: 936px; position: absolute"
                            styleClass="outrosSmallText" text="Ramal:"/>
                        <webuijsf:textField binding="#{cadastroCliente.telFixo2}" id="telFixo2" style="left: 408px; top: 960px; position: absolute"/>
                        <webuijsf:textField binding="#{cadastroCliente.dddTelFixo2}" columns="8" id="dddTelFixo2" style="left: 552px; top: 960px; position: absolute"/>
                        <webuijsf:textField binding="#{cadastroCliente.ramalTelFixo2}" columns="8" id="ramalTelFixo2" style="left: 648px; top: 960px; position: absolute"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
