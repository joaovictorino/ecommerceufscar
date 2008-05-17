<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : criarAdministrador
    Created on : 01/01/2008, 20:45:31
    Author     : Cliente
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{criarAdministrador.page1}" id="page1">
            <webuijsf:html binding="#{criarAdministrador.html1}" id="html1">
                <webuijsf:head binding="#{criarAdministrador.head1}" id="head1">
                    <webuijsf:link binding="#{criarAdministrador.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{criarAdministrador.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{criarAdministrador.form1}" id="form1">
                        <webuijsf:textField binding="#{criarAdministrador.txtLogin}" id="txtLogin" style="left: 264px; top: 144px; position: absolute" tabIndex="1"/>
                        <webuijsf:label binding="#{criarAdministrador.lblSenha}" id="lblSenha" style="left: 192px; top: 168px; position: absolute" text="Senha"/>
                        <webuijsf:passwordField binding="#{criarAdministrador.txtSenha}" id="txtSenha" style="left: 264px; top: 168px; position: absolute" tabIndex="2"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtNome}" id="txtNome" style="left: 264px; top: 336px; position: absolute" tabIndex="5"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtCPF}" id="txtCPF" style="left: 264px; top: 360px; position: absolute" tabIndex="6"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtRG}" id="txtRG" style="left: 264px; top: 384px; position: absolute" tabIndex="7"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtOrgaoExp}" columns="4" id="txtOrgaoExp" maxLength="4"
                            style="left: 264px; top: 408px; position: absolute" tabIndex="8"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtFrase}" columns="35" id="txtFrase"
                            style="left: 192px; top: 240px; position: absolute" tabIndex="3" valueChangeListenerExpression="#{criarAdministrador.txtFrase_processValueChange}"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtTitulo}" id="txtTitulo" style="left: 264px; top: 504px; position: absolute" tabIndex="12"/>
                        <webuijsf:label binding="#{criarAdministrador.lblCPF}" id="lblCPF" style="left: 192px; top: 360px; position: absolute" text="CPF"/>
                        <webuijsf:label binding="#{criarAdministrador.lblNome}" id="lblNome" style="left: 192px; top: 336px; position: absolute" text="Nome"/>
                        <webuijsf:label binding="#{criarAdministrador.lblRG}" id="lblRG" style="left: 192px; top: 384px; position: absolute" text="RG"/>
                        <webuijsf:label binding="#{criarAdministrador.lblLogin}" id="lblLogin" style="left: 192px; top: 144px; position: absolute" text="Login"/>
                        <webuijsf:label binding="#{criarAdministrador.lblOrgaoExp}" id="lblOrgaoExp" style="left: 192px; top: 408px; position: absolute" text="Órgao Exp."/>
                        <webuijsf:calendar binding="#{criarAdministrador.txtDataExp}" id="txtDataExp" style="left: 264px; top: 432px; position: absolute" tabIndex="9"/>
                        <webuijsf:label binding="#{criarAdministrador.lblDataExp}" id="lblDataExp" style="left: 192px; top: 432px; position: absolute" text="Data Exp."/>
                        <webuijsf:label binding="#{criarAdministrador.lblPassaporte}" id="lblPassaporte"
                            style="height: 24px; left: 192px; top: 480px; position: absolute" text="Passaporte"/>
                        <webuijsf:label binding="#{criarAdministrador.lblTitulo}" id="lblTitulo"
                            style="height: 24px; left: 192px; top: 504px; position: absolute" text="Titulo eleit."/>
                        <webuijsf:label binding="#{criarAdministrador.lblFrase}" id="lblFrase" style="left: 192px; top: 216px; position: absolute" text="Frase de Segurança"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtDDDCelular}" columns="2" id="txtDDDCelular" maxLength="2"
                            style="left: 264px; top: 576px; position: absolute" tabIndex="13"/>
                        <webuijsf:label binding="#{criarAdministrador.lblCelular}" id="lblCelular" style="left: 192px; top: 576px; position: absolute" text="Celular"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtRamal}" columns="4" id="txtRamal" maxLength="4"
                            style="left: 432px; top: 600px; position: absolute" tabIndex="17"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtTelefone}" columns="10" id="txtTelefone" maxLength="8"
                            style="left: 312px; top: 600px; position: absolute" tabIndex="16"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtDDDTelefone}" columns="2" id="txtDDDTelefone" maxLength="2"
                            style="left: 264px; top: 600px; position: absolute" tabIndex="15"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtCelular}" columns="10" id="txtCelular" maxLength="8"
                            style="left: 312px; top: 576px; position: absolute" tabIndex="14"/>
                        <webuijsf:label binding="#{criarAdministrador.lblTelefone}" id="lblTelefone" style="left: 192px; top: 600px; position: absolute" text="Telefone"/>
                        <webuijsf:label binding="#{criarAdministrador.lblRamal}" id="lblRamal" style="left: 408px; top: 600px; position: absolute" text="R."/>
                        <webuijsf:calendar binding="#{criarAdministrador.txtDataNasc}" id="txtDataNasc" style="left: 264px; top: 456px; position: absolute" tabIndex="10"/>
                        <webuijsf:label binding="#{criarAdministrador.lblDataNasc}" id="lblDataNasc" style="left: 192px; top: 456px; position: absolute" text="Data Nasc."/>
                        <webuijsf:label binding="#{criarAdministrador.lblTipoEnd}" id="lblTipoEnd" style="left: 192px; top: 672px; position: absolute" text="Tipo end."/>
                        <webuijsf:label binding="#{criarAdministrador.lblEndereco}" id="lblEndereco" style="left: 192px; top: 696px; position: absolute" text="Endereço"/>
                        <webuijsf:label binding="#{criarAdministrador.lblBairro}" id="lblBairro" style="left: 192px; top: 840px; position: absolute" text="Bairro"/>
                        <webuijsf:label binding="#{criarAdministrador.lblCidade}" id="lblCidade" style="left: 192px; top: 816px; position: absolute" text="Cidade"/>
                        <webuijsf:label binding="#{criarAdministrador.lblEstado}" id="lblEstado" style="left: 192px; top: 792px; position: absolute" text="Estado"/>
                        <webuijsf:label binding="#{criarAdministrador.lblNumero}" id="lblNumero" style="left: 192px; top: 720px; position: absolute" text="Nº"/>
                        <webuijsf:label binding="#{criarAdministrador.lblCEP}" id="lblCEP" style="left: 192px; top: 744px; position: absolute" text="Cep"/>
                        <webuijsf:label binding="#{criarAdministrador.lblPais}" id="lblPais" style="left: 192px; top: 768px; position: absolute" text="País"/>
                        <webuijsf:dropDown binding="#{criarAdministrador.ddlTipoEnd}" id="ddlTipoEnd"
                            items="#{criarAdministrador.ddlTipoEndDefaultOptions.options}" style="left: 264px; top: 672px; position: absolute" tabIndex="18"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtEndereco}" id="txtEndereco" style="left: 264px; top: 696px; position: absolute" tabIndex="19"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtNumero}" id="txtNumero" style="left: 264px; top: 720px; position: absolute" tabIndex="20"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtPais}" id="txtPais" style="left: 264px; top: 768px; position: absolute" tabIndex="23"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtCep1}" columns="5" id="txtCep1" maxLength="5"
                            style="left: 264px; top: 744px; position: absolute" tabIndex="21"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtEstado}" columns="2" id="txtEstado" maxLength="2"
                            style="left: 264px; top: 792px; position: absolute" tabIndex="24"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtCidade}" id="txtCidade" style="left: 264px; top: 816px; position: absolute" tabIndex="25"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtBairro}" id="txtBairro" style="left: 264px; top: 840px; position: absolute" tabIndex="26"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtEmail}" id="txtEmail" style="left: 264px; top: 264px; position: absolute" tabIndex="4"/>
                        <webuijsf:label binding="#{criarAdministrador.lblEmail}" id="lblEmail" style="left: 192px; top: 264px; position: absolute" text="E-mail"/>
                        <webuijsf:button actionExpression="#{criarAdministrador.btnSalvar_action}" binding="#{criarAdministrador.btnSalvar}" id="btnSalvar"
                            style="left: 263px; top: 888px; position: absolute" tabIndex="27" text="Salvar"/>
                        <webuijsf:label binding="#{criarAdministrador.label5}" id="label5" style="left: 336px; top: 744px; position: absolute" text="-"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtCep2}" columns="3" id="txtCep2" maxLength="3"
                            style="left: 360px; top: 744px; position: absolute" tabIndex="22"/>
                        <webuijsf:textField binding="#{criarAdministrador.txtPassaporte}" id="txtPassaporte" style="left: 264px; top: 480px; position: absolute" tabIndex="11"/>
                        <webuijsf:label binding="#{criarAdministrador.lblResultado}" id="lblResultado" style="left: 360px; top: 888px; position: absolute"/>
                        <div style="left: 0px; top: 0px; position: absolute">
                            <jsp:directive.include file="cabecalhoAdm.jspf"/>
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
