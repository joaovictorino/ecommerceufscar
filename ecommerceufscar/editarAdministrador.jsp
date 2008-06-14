<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : editarAdministrador
    Created on : Jun 14, 2008, 3:11:09 PM
    Author     : sronly
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{interfaces$editarAdministrador.page1}" id="page1">
            <webuijsf:html binding="#{interfaces$editarAdministrador.html1}" id="html1">
                <webuijsf:head binding="#{interfaces$editarAdministrador.head1}" id="head1">
                    <webuijsf:link binding="#{interfaces$editarAdministrador.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{interfaces$editarAdministrador.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{interfaces$editarAdministrador.form1}" id="form1">
                        <webuijsf:label binding="#{interfaces$editarAdministrador.label1}" id="label1" style="left: 360px; top: 816px; position: absolute" text="-"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblEstado1}" id="lblEstado1"
                            style="left: 216px; top: 864px; position: absolute" text="Estado"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblCEP1}" id="lblCEP1" style="left: 216px; top: 816px; position: absolute" text="Cep"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtDDDCelular1}" columns="2" id="txtDDDCelular1" maxLength="2"
                            style="left: 288px; top: 648px; position: absolute" tabIndex="13"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblFrase1}" id="lblFrase1" style="left: 216px; top: 288px; position: absolute" text="Frase de Segurança"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtCep1}" columns="5" id="txtCep1" maxLength="5"
                            style="left: 288px; top: 816px; position: absolute" tabIndex="21"/>
                        <webuijsf:calendar binding="#{interfaces$editarAdministrador.txtDataExp1}" id="txtDataExp1"
                            style="left: 288px; top: 504px; position: absolute" tabIndex="9"/>
                        <webuijsf:passwordField binding="#{interfaces$editarAdministrador.txtSenha1}" id="txtSenha1"
                            style="left: 288px; top: 240px; position: absolute" tabIndex="2"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtOrgaoExp1}" columns="4" id="txtOrgaoExp1" maxLength="4"
                            style="left: 288px; top: 480px; position: absolute" tabIndex="8"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblPais1}" id="lblPais1" style="left: 216px; top: 840px; position: absolute" text="País"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblSenha1}" id="lblSenha1" style="left: 216px; top: 240px; position: absolute" text="Senha"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblRG1}" id="lblRG1" style="left: 216px; top: 456px; position: absolute" text="RG"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtTitulo1}" id="txtTitulo1"
                            style="left: 288px; top: 576px; position: absolute" tabIndex="12"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblTelefone1}" id="lblTelefone1"
                            style="left: 216px; top: 672px; position: absolute" text="Telefone"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtLogin1}" id="txtLogin1"
                            style="left: 288px; top: 216px; position: absolute" tabIndex="1"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblTitulo1}" id="lblTitulo1"
                            style="height: 24px; left: 216px; top: 576px; position: absolute" text="Titulo eleit."/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtPais1}" id="txtPais1"
                            style="left: 288px; top: 840px; position: absolute" tabIndex="23"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblEndereco1}" id="lblEndereco1"
                            style="left: 216px; top: 768px; position: absolute" text="Endereço"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtCidade1}" id="txtCidade1"
                            style="left: 288px; top: 888px; position: absolute" tabIndex="25"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtPassaporte1}" id="txtPassaporte1"
                            style="left: 288px; top: 552px; position: absolute" tabIndex="11"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtEstado1}" columns="2" id="txtEstado1" maxLength="2"
                            style="left: 288px; top: 864px; position: absolute" tabIndex="24"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtFrase1}" columns="35" id="txtFrase1"
                            style="left: 216px; top: 312px; position: absolute" tabIndex="3" valueChangeListenerExpression="#{interfaces$editarAdministrador.txtFrase_processValueChange}"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtEmail1}" id="txtEmail1"
                            style="left: 288px; top: 336px; position: absolute" tabIndex="4"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtEndereco1}" id="txtEndereco1"
                            style="left: 288px; top: 768px; position: absolute" tabIndex="19"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblCPF1}" id="lblCPF1" style="left: 216px; top: 432px; position: absolute" text="CPF"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblNome1}" id="lblNome1" style="left: 216px; top: 408px; position: absolute" text="Nome"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtNumero1}" id="txtNumero1"
                            style="left: 288px; top: 792px; position: absolute" tabIndex="20"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtCPF1}" id="txtCPF1" style="left: 288px; top: 432px; position: absolute" tabIndex="6"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblRamal1}" id="lblRamal1" style="left: 432px; top: 672px; position: absolute" text="R."/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtCelular1}" columns="10" id="txtCelular1" maxLength="8"
                            style="left: 336px; top: 648px; position: absolute" tabIndex="14"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtNome1}" id="txtNome1"
                            style="left: 288px; top: 408px; position: absolute" tabIndex="5"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblCelular1}" id="lblCelular1"
                            style="left: 216px; top: 648px; position: absolute" text="Celular"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblResultado1}" id="lblResultado1" style="left: 384px; top: 960px; position: absolute"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblDataExp1}" id="lblDataExp1"
                            style="left: 216px; top: 504px; position: absolute" text="Data Exp."/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtDDDTelefone1}" columns="2" id="txtDDDTelefone1" maxLength="2"
                            style="left: 288px; top: 672px; position: absolute" tabIndex="15"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtRamal1}" columns="4" id="txtRamal1" maxLength="4"
                            style="left: 456px; top: 672px; position: absolute" tabIndex="17"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblPassaporte1}" id="lblPassaporte1"
                            style="height: 24px; left: 216px; top: 552px; position: absolute" text="Passaporte"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblDataNasc1}" id="lblDataNasc1"
                            style="left: 216px; top: 528px; position: absolute" text="Data Nasc."/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblLogin1}" id="lblLogin1" style="left: 216px; top: 216px; position: absolute" text="Login"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtBairro1}" id="txtBairro1"
                            style="left: 288px; top: 912px; position: absolute" tabIndex="26"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblBairro1}" id="lblBairro1"
                            style="left: 216px; top: 912px; position: absolute" text="Bairro"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblTipoEnd1}" id="lblTipoEnd1"
                            style="left: 216px; top: 744px; position: absolute" text="Tipo end."/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblOrgaoExp1}" id="lblOrgaoExp1"
                            style="left: 216px; top: 480px; position: absolute" text="Órgao Exp."/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtRG1}" id="txtRG1" style="left: 288px; top: 456px; position: absolute" tabIndex="7"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtTelefone1}" columns="10" id="txtTelefone1" maxLength="8"
                            style="left: 336px; top: 672px; position: absolute" tabIndex="16"/>
                        <webuijsf:dropDown binding="#{interfaces$editarAdministrador.ddlTipoEnd1}" id="ddlTipoEnd1"
                            items="#{interfaces$editarAdministrador.ddlTipoEnd1DefaultOptions.options}" style="left: 288px; top: 744px; position: absolute" tabIndex="18"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblNumero1}" id="lblNumero1"
                            style="left: 216px; top: 792px; position: absolute" text="Nº"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblCidade1}" id="lblCidade1"
                            style="left: 216px; top: 888px; position: absolute" text="Cidade"/>
                        <webuijsf:calendar binding="#{interfaces$editarAdministrador.txtDataNasc1}" id="txtDataNasc1"
                            style="left: 288px; top: 528px; position: absolute" tabIndex="10"/>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.lblEmail1}" id="lblEmail1" style="left: 216px; top: 336px; position: absolute" text="E-mail"/>
                        <webuijsf:textField binding="#{interfaces$editarAdministrador.txtCep2}" columns="3" id="txtCep2" maxLength="3"
                            style="left: 384px; top: 816px; position: absolute" tabIndex="22"/>
                        <div style="left: 0px; top: 48px; position: absolute">
                            <jsp:directive.include file="../cabecalho.jspf"/>
                        </div>
                        <div style="left: 0px; top: 144px; position: absolute">
                            <jsp:directive.include file="../menuAdm.jspf"/>
                        </div>
                        <webuijsf:label binding="#{interfaces$editarAdministrador.label2}" id="label2"
                            style="font-family: 'Arial','Helvetica',sans-serif; font-size: 18px; left: 192px; top: 168px; position: absolute" text="Administração &gt;&gt; Administradores &gt;&gt; Editar"/>
                        <webuijsf:button actionExpression="#{interfaces$editarAdministrador.button1_action}" binding="#{interfaces$editarAdministrador.button1}"
                            id="button1" style="height: 24px; left: 287px; top: 960px; position: absolute; width: 72px" text="Salvar"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
