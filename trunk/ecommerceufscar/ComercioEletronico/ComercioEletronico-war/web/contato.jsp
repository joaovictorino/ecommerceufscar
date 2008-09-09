<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : contato
    Created on : Aug 30, 2008, 4:04:27 PM
    Author     : sronly
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page binding="#{contato.page1}" id="page1">
            <webuijsf:html binding="#{contato.html1}" id="html1">
                <webuijsf:head binding="#{contato.head1}" id="head1">
                    <webuijsf:link binding="#{contato.link1}" id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body binding="#{contato.body1}" id="body1" style="-rave-layout: grid">
                    <webuijsf:form binding="#{contato.form1}" id="form1">
                        <div style="height: 94px; left: 0px; top: 0px; position: absolute; width: 1222px">
                            <jsp:directive.include file="cabecalho.jspf"/>
                        </div>
                        <div style="height: 454px; left: 0px; top: 312px; position: absolute; width: 142px">
                            <jsp:directive.include file="menu.jspf"/>
                        </div>
                        <table width="700" style="left: 264px; top: 312px; position: absolute" border="0" id="conteudo">
                            <tr>
                                <td>
                                    
                                    
                                    <!-- produto inicio //-->
                                 
                                    <table cellpadding="0" cellspacing="0" border="0" class="cont_heading_table" style="width:100%">
                                        <tr>
                                            <td><img src="images/cont_heading_tl.gif" border="0" alt="" width="38" height="5" /></td>
                                            
                                            <td class="cont_heading_t"><img src="images/spacer.gif" border="0" alt="" width="1" height="1" /></td>
                                            <td><img src="images/cont_heading_tr.gif" border="0" alt="" width="5" height="5" /></td>
                                        </tr>
                                        <tr><td><img src="images/cont_heading_l.gif" border="0" alt="" width="38" height="26" /></td>
                                            <td style="width:100%" class="cont_heading_td">Contato</td>
                                        <td><img src="images/cont_heading_r.gif" border="0" alt="" width="5" height="26" /></td></tr>
                                        <tr>
                                            <td><img src="images/cont_heading_bl.gif" border="0" alt="" width="38" height="5" /></td>
                                            <td class="cont_heading_b"><img src="images/spacer.gif" border="0" alt="" width="1" height="1" /></td>
                                            <td><img src="images/cont_heading_br.gif" border="0" alt="" width="5" height="5" /></td>
                                        </tr>					
                                    </table>	<br />								
                                    
                                    
                                    
                                    <form id="form1" name="form1" method="post" action="">
                                        <table width="100%" border="0">
                                            <tr>
                                                <td width="19%">Nome:</td>
                                                <td width="81%">
                                                <input type="text" name="textfield"  style="width:440px;"/>                </td>
                                            </tr>
                                            <tr>
                                                <td>Email:</td>
                                                <td>
                                                <input type="text" name="textfield2"  style="width:440px;" />                 </td>
                                            </tr>
                                            <tr>
                                                <td>Assunto:</td>
                                                <td>
                                                    <select name="select"  style="width:440px;">
                                                        <option>Comercial</option>
                                                        <option>Dúvidas</option>
                                                        <option>Sugestões</option>
                                                        <option>Reclamações</option>
                                                        <option>Trocas</option>
                                                </select>                 </td>
                                            </tr>
                                            <tr>
                                                <td>Mensagem:</td>
                                                <td><textarea name="textfield3" cols="40" rows="5"></textarea></td>
                                            </tr>
                                            <tr>
                                                <td colspan="2"><div align="right">
                                                        <input type="submit" name="Submit" value="Enviar" />
                                                </div></td>
                                            </tr>
                                        </table>
                                        <br />
                                        <br />
                                <br /></form><p> </p></td>
                            </tr>
                            <tr>
                                <td><table cellpadding="0" cellspacing="0" border="0" class="cont_heading_table" style="width:100%">
                                        <tr>
                                            <td><img src="images/cont_heading_tl.gif" border="0" alt="" width="38" height="5" /></td>
                                            <td class="cont_heading_t"><img src="images/spacer.gif" border="0" alt="" width="1" height="1" /></td>
                                            <td><img src="images/cont_heading_tr.gif" border="0" alt="" width="5" height="5" /></td>
                                        </tr>
                                        <tr>
                                            <td><img src="images/cont_heading_l.gif" border="0" alt="" width="38" height="26" /></td>
                                            <td style="width:100%" class="cont_heading_td">FALE CONOSCO </td>
                                            <td><img src="images/cont_heading_r.gif" border="0" alt="" width="5" height="26" /></td>
                                        </tr>
                                        <tr>
                                            <td><img src="images/cont_heading_bl.gif" border="0" alt="" width="38" height="5" /></td>
                                            <td class="cont_heading_b"><img src="images/spacer.gif" border="0" alt="" width="1" height="1" /></td>
                                            <td><img src="images/cont_heading_br.gif" border="0" alt="" width="5" height="5" /></td>
                                        </tr>
                                </table></td>
                            </tr>
                            <tr>
                                <td> </td>
                            </tr>
                            <tr>
                                <td><p>Se preferir entre em contato conosco pelo telefone<strong> (16) 3333-3333</strong> ou através do nosso atendimento online disponível de Seg a Sex, das 9h30 as 18h.</p>
                                </td>
                            </tr>
                            <tr>
                                <td><div align="right">
                                        <input type="submit" name="Submit2" value="Inicar atendimento online" />
                                </div></td>
                            </tr>
                        </table>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
    </jsp:root>
    