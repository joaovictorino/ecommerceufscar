/*
 * cadastroCliente.java
 *
 * Created on 14/07/2008, 09:46:18
 */
 
package comercioeletronicowar;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.Checkbox;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.Link;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.PageSeparator;
import com.sun.webui.jsf.component.PasswordField;
import com.sun.webui.jsf.component.TextField;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author Cliente
 */
public class cadastroCliente extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    private Page page1 = new Page();
    
    public Page getPage1() {
        return page1;
    }
    
    public void setPage1(Page p) {
        this.page1 = p;
    }
    
    private Html html1 = new Html();
    
    public Html getHtml1() {
        return html1;
    }
    
    public void setHtml1(Html h) {
        this.html1 = h;
    }
    
    private Head head1 = new Head();
    
    public Head getHead1() {
        return head1;
    }
    
    public void setHead1(Head h) {
        this.head1 = h;
    }
    
    private Link link1 = new Link();
    
    public Link getLink1() {
        return link1;
    }
    
    public void setLink1(Link l) {
        this.link1 = l;
    }
    
    private Body body1 = new Body();
    
    public Body getBody1() {
        return body1;
    }
    
    public void setBody1(Body b) {
        this.body1 = b;
    }
    
    private Form form1 = new Form();
    
    public Form getForm1() {
        return form1;
    }
    
    public void setForm1(Form f) {
        this.form1 = f;
    }
    private Label label1 = new Label();

    public Label getLabel1() {
        return label1;
    }

    public void setLabel1(Label l) {
        this.label1 = l;
    }
    private Label label2 = new Label();

    public Label getLabel2() {
        return label2;
    }

    public void setLabel2(Label l) {
        this.label2 = l;
    }
    private Label label3 = new Label();

    public Label getLabel3() {
        return label3;
    }

    public void setLabel3(Label l) {
        this.label3 = l;
    }
    private TextField login = new TextField();

    public TextField getLogin() {
        return login;
    }

    public void setLogin(TextField tf) {
        this.login = tf;
    }
    private PasswordField senha = new PasswordField();

    public PasswordField getSenha() {
        return senha;
    }

    public void setSenha(PasswordField pf) {
        this.senha = pf;
    }
    private PasswordField confirSenha = new PasswordField();

    public PasswordField getConfirSenha() {
        return confirSenha;
    }

    public void setConfirSenha(PasswordField pf) {
        this.confirSenha = pf;
    }
    private PageSeparator pageSeparator1 = new PageSeparator();

    public PageSeparator getPageSeparator1() {
        return pageSeparator1;
    }

    public void setPageSeparator1(PageSeparator ps) {
        this.pageSeparator1 = ps;
    }
    private Label label4 = new Label();

    public Label getLabel4() {
        return label4;
    }

    public void setLabel4(Label l) {
        this.label4 = l;
    }
    private Label label5 = new Label();

    public Label getLabel5() {
        return label5;
    }

    public void setLabel5(Label l) {
        this.label5 = l;
    }
    private Label label6 = new Label();

    public Label getLabel6() {
        return label6;
    }

    public void setLabel6(Label l) {
        this.label6 = l;
    }
    private Label label7 = new Label();

    public Label getLabel7() {
        return label7;
    }

    public void setLabel7(Label l) {
        this.label7 = l;
    }
    private Checkbox checkbox1 = new Checkbox();

    public Checkbox getCheckbox1() {
        return checkbox1;
    }

    public void setCheckbox1(Checkbox c) {
        this.checkbox1 = c;
    }
    private TextField emailPrincipal = new TextField();

    public TextField getEmailPrincipal() {
        return emailPrincipal;
    }

    public void setEmailPrincipal(TextField tf) {
        this.emailPrincipal = tf;
    }
    private TextField emailSecundario = new TextField();

    public TextField getEmailSecundario() {
        return emailSecundario;
    }

    public void setEmailSecundario(TextField tf) {
        this.emailSecundario = tf;
    }
    private Calendar dataNascimento = new Calendar();

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar c) {
        this.dataNascimento = c;
    }
    private Label label8 = new Label();

    public Label getLabel8() {
        return label8;
    }

    public void setLabel8(Label l) {
        this.label8 = l;
    }
    private Label label9 = new Label();

    public Label getLabel9() {
        return label9;
    }

    public void setLabel9(Label l) {
        this.label9 = l;
    }
    private Label label10 = new Label();

    public Label getLabel10() {
        return label10;
    }

    public void setLabel10(Label l) {
        this.label10 = l;
    }
    private TextField nomeCompleto = new TextField();

    public TextField getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(TextField tf) {
        this.nomeCompleto = tf;
    }
    private TextField cpf = new TextField();

    public TextField getCpf() {
        return cpf;
    }

    public void setCpf(TextField tf) {
        this.cpf = tf;
    }
    private Label label11 = new Label();

    public Label getLabel11() {
        return label11;
    }

    public void setLabel11(Label l) {
        this.label11 = l;
    }
    private Label label12 = new Label();

    public Label getLabel12() {
        return label12;
    }

    public void setLabel12(Label l) {
        this.label12 = l;
    }
    private TextField tipoEndereco = new TextField();

    public TextField getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TextField tf) {
        this.tipoEndereco = tf;
    }
    private Label label13 = new Label();

    public Label getLabel13() {
        return label13;
    }

    public void setLabel13(Label l) {
        this.label13 = l;
    }
    private Label label14 = new Label();

    public Label getLabel14() {
        return label14;
    }

    public void setLabel14(Label l) {
        this.label14 = l;
    }
    private Label label15 = new Label();

    public Label getLabel15() {
        return label15;
    }

    public void setLabel15(Label l) {
        this.label15 = l;
    }
    private Label label16 = new Label();

    public Label getLabel16() {
        return label16;
    }

    public void setLabel16(Label l) {
        this.label16 = l;
    }
    private Label label17 = new Label();

    public Label getLabel17() {
        return label17;
    }

    public void setLabel17(Label l) {
        this.label17 = l;
    }
    private Label label18 = new Label();

    public Label getLabel18() {
        return label18;
    }

    public void setLabel18(Label l) {
        this.label18 = l;
    }
    private Label label19 = new Label();

    public Label getLabel19() {
        return label19;
    }

    public void setLabel19(Label l) {
        this.label19 = l;
    }
    private Label label20 = new Label();

    public Label getLabel20() {
        return label20;
    }

    public void setLabel20(Label l) {
        this.label20 = l;
    }
    private Label label21 = new Label();

    public Label getLabel21() {
        return label21;
    }

    public void setLabel21(Label l) {
        this.label21 = l;
    }
    private Label label22 = new Label();

    public Label getLabel22() {
        return label22;
    }

    public void setLabel22(Label l) {
        this.label22 = l;
    }
    private Label label24 = new Label();

    public Label getLabel24() {
        return label24;
    }

    public void setLabel24(Label l) {
        this.label24 = l;
    }
    private Label label25 = new Label();

    public Label getLabel25() {
        return label25;
    }

    public void setLabel25(Label l) {
        this.label25 = l;
    }
    private TextField endereco = new TextField();

    public TextField getEndereco() {
        return endereco;
    }

    public void setEndereco(TextField tf) {
        this.endereco = tf;
    }
    private TextField bairro = new TextField();

    public TextField getBairro() {
        return bairro;
    }

    public void setBairro(TextField tf) {
        this.bairro = tf;
    }
    private TextField telFixo1 = new TextField();

    public TextField getTelFixo1() {
        return telFixo1;
    }

    public void setTelFixo1(TextField tf) {
        this.telFixo1 = tf;
    }
    private TextField pais = new TextField();

    public TextField getPais() {
        return pais;
    }

    public void setPais(TextField tf) {
        this.pais = tf;
    }
    private TextField cep = new TextField();

    public TextField getCep() {
        return cep;
    }

    public void setCep(TextField tf) {
        this.cep = tf;
    }
    private TextField celular = new TextField();

    public TextField getCelular() {
        return celular;
    }

    public void setCelular(TextField tf) {
        this.celular = tf;
    }
    private TextField cidade = new TextField();

    public TextField getCidade() {
        return cidade;
    }

    public void setCidade(TextField tf) {
        this.cidade = tf;
    }
    private Label label26 = new Label();

    public Label getLabel26() {
        return label26;
    }

    public void setLabel26(Label l) {
        this.label26 = l;
    }
    private TextField numEndereco = new TextField();

    public TextField getNumEndereco() {
        return numEndereco;
    }

    public void setNumEndereco(TextField tf) {
        this.numEndereco = tf;
    }
    private TextField ramalTelFixo1 = new TextField();

    public TextField getRamalTelFixo1() {
        return ramalTelFixo1;
    }

    public void setRamalTelFixo1(TextField tf) {
        this.ramalTelFixo1 = tf;
    }
    private TextField dddTelFixo1 = new TextField();

    public TextField getDddTelFixo1() {
        return dddTelFixo1;
    }

    public void setDddTelFixo1(TextField tf) {
        this.dddTelFixo1 = tf;
    }
    private TextField dddCelular = new TextField();

    public TextField getDddCelular() {
        return dddCelular;
    }

    public void setDddCelular(TextField tf) {
        this.dddCelular = tf;
    }
    private TextField estado = new TextField();

    public TextField getEstado() {
        return estado;
    }

    public void setEstado(TextField tf) {
        this.estado = tf;
    }
    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }
    private Label label23 = new Label();

    public Label getLabel23() {
        return label23;
    }

    public void setLabel23(Label l) {
        this.label23 = l;
    }
    private Label label27 = new Label();

    public Label getLabel27() {
        return label27;
    }

    public void setLabel27(Label l) {
        this.label27 = l;
    }
    private Label label28 = new Label();

    public Label getLabel28() {
        return label28;
    }

    public void setLabel28(Label l) {
        this.label28 = l;
    }
    private Label label29 = new Label();

    public Label getLabel29() {
        return label29;
    }

    public void setLabel29(Label l) {
        this.label29 = l;
    }
    private TextField telFixo2 = new TextField();

    public TextField getTelFixo2() {
        return telFixo2;
    }

    public void setTelFixo2(TextField tf) {
        this.telFixo2 = tf;
    }
    private TextField dddTelFixo2 = new TextField();

    public TextField getDddTelFixo2() {
        return dddTelFixo2;
    }

    public void setDddTelFixo2(TextField tf) {
        this.dddTelFixo2 = tf;
    }
    private TextField ramalTelFixo2 = new TextField();

    public TextField getRamalTelFixo2() {
        return ramalTelFixo2;
    }

    public void setRamalTelFixo2(TextField tf) {
        this.ramalTelFixo2 = tf;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public cadastroCliente() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("cadastroCliente Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    public void dddCelular_processValueChange(ValueChangeEvent event) {
    }

    public String button1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }
    
}

