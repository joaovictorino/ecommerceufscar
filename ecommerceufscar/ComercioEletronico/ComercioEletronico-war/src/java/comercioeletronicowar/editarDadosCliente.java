/*
 * editarDadosCliente.java
 *
 * Created on 14/07/2008, 17:54:45
 */
 
package comercioeletronicowar;

import br.com.ecommerce.entity.Pessoa;
import br.com.ecommerce.remote.PessoaRemote;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.Checkbox;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.Hyperlink;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.Link;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.PasswordField;
import com.sun.webui.jsf.component.TextField;
import javax.ejb.EJB;
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
public class editarDadosCliente extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
        checkbox3.setLabel("Checkbox");
        checkbox4.setLabel("Checkbox");
        checkbox5.setLabel("Checkbox");
        checkbox6.setLabel("Checkbox");
        checkbox7.setLabel("Checkbox");
        checkbox8.setLabel("Checkbox");
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
    private TextField telFixo1 = new TextField();

    public TextField getTelFixo1() {
        return telFixo1;
    }

    public void setTelFixo1(TextField tf) {
        this.telFixo1 = tf;
    }
    private TextField emailSecundario1 = new TextField();

    public TextField getEmailSecundario1() {
        return emailSecundario1;
    }

    public void setEmailSecundario1(TextField tf) {
        this.emailSecundario1 = tf;
    }
    private TextField nomeCompleto1 = new TextField();

    public TextField getNomeCompleto1() {
        return nomeCompleto1;
    }

    public void setNomeCompleto1(TextField tf) {
        this.nomeCompleto1 = tf;
    }
    private TextField dddCelular1 = new TextField();

    public TextField getDddCelular1() {
        return dddCelular1;
    }

    public void setDddCelular1(TextField tf) {
        this.dddCelular1 = tf;
    }
    private Label label1 = new Label();

    public Label getLabel1() {
        return label1;
    }

    public void setLabel1(Label l) {
        this.label1 = l;
    }
    private TextField emailPrincipal1 = new TextField();

    public TextField getEmailPrincipal1() {
        return emailPrincipal1;
    }

    public void setEmailPrincipal1(TextField tf) {
        this.emailPrincipal1 = tf;
    }
    private Checkbox checkbox1 = new Checkbox();

    public Checkbox getCheckbox1() {
        return checkbox1;
    }

    public void setCheckbox1(Checkbox c) {
        this.checkbox1 = c;
    }
    private Label label3 = new Label();

    public Label getLabel3() {
        return label3;
    }

    public void setLabel3(Label l) {
        this.label3 = l;
    }
    private Label label5 = new Label();

    public Label getLabel5() {
        return label5;
    }

    public void setLabel5(Label l) {
        this.label5 = l;
    }
    private TextField celular1 = new TextField();

    public TextField getCelular1() {
        return celular1;
    }

    public void setCelular1(TextField tf) {
        this.celular1 = tf;
    }
    private Label label6 = new Label();

    public Label getLabel6() {
        return label6;
    }

    public void setLabel6(Label l) {
        this.label6 = l;
    }
    private TextField cpf1 = new TextField();

    public TextField getCpf1() {
        return cpf1;
    }

    public void setCpf1(TextField tf) {
        this.cpf1 = tf;
    }
    private Label label7 = new Label();

    public Label getLabel7() {
        return label7;
    }

    public void setLabel7(Label l) {
        this.label7 = l;
    }
    private Label label9 = new Label();

    public Label getLabel9() {
        return label9;
    }

    public void setLabel9(Label l) {
        this.label9 = l;
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
    private Label label21 = new Label();

    public Label getLabel21() {
        return label21;
    }

    public void setLabel21(Label l) {
        this.label21 = l;
    }
    private TextField ramalTelFixo1 = new TextField();

    public TextField getRamalTelFixo1() {
        return ramalTelFixo1;
    }

    public void setRamalTelFixo1(TextField tf) {
        this.ramalTelFixo1 = tf;
    }
    private Calendar dataNascimento1 = new Calendar();

    public Calendar getDataNascimento1() {
        return dataNascimento1;
    }

    public void setDataNascimento1(Calendar c) {
        this.dataNascimento1 = c;
    }
    private TextField telFixo2 = new TextField();

    public TextField getTelFixo2() {
        return telFixo2;
    }

    public void setTelFixo2(TextField tf) {
        this.telFixo2 = tf;
    }
    private TextField dddTelFixo1 = new TextField();

    public TextField getDddTelFixo1() {
        return dddTelFixo1;
    }

    public void setDddTelFixo1(TextField tf) {
        this.dddTelFixo1 = tf;
    }
    private TextField dddTelFixo2 = new TextField();

    public TextField getDddTelFixo2() {
        return dddTelFixo2;
    }

    public void setDddTelFixo2(TextField tf) {
        this.dddTelFixo2 = tf;
    }
    private Label label25 = new Label();

    public Label getLabel25() {
        return label25;
    }

    public void setLabel25(Label l) {
        this.label25 = l;
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
    private TextField ramalTelFixo2 = new TextField();

    public TextField getRamalTelFixo2() {
        return ramalTelFixo2;
    }

    public void setRamalTelFixo2(TextField tf) {
        this.ramalTelFixo2 = tf;
    }
    private Hyperlink hyperlink1 = new Hyperlink();

    public Hyperlink getHyperlink1() {
        return hyperlink1;
    }

    public void setHyperlink1(Hyperlink h) {
        this.hyperlink1 = h;
    }
    private Hyperlink hyperlink2 = new Hyperlink();

    public Hyperlink getHyperlink2() {
        return hyperlink2;
    }

    public void setHyperlink2(Hyperlink h) {
        this.hyperlink2 = h;
    }
    private Label login2 = new Label();

    public Label getLogin2() {
        return login2;
    }

    public void setLogin2(Label l) {
        this.login2 = l;
    }
    private Label login3 = new Label();

    public Label getLogin3() {
        return login3;
    }

    public void setLogin3(Label l) {
        this.login3 = l;
    }
    private Checkbox checkbox2 = new Checkbox();

    public Checkbox getCheckbox2() {
        return checkbox2;
    }

    public void setCheckbox2(Checkbox c) {
        this.checkbox2 = c;
    }
    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }
    private Button button2 = new Button();

    public Button getButton2() {
        return button2;
    }

    public void setButton2(Button b) {
        this.button2 = b;
    }
    private Label login1 = new Label();

    public Label getLogin1() {
        return login1;
    }

    public void setLogin1(Label l) {
        this.login1 = l;
    }
    private Checkbox checkbox3 = new Checkbox();

    public Checkbox getCheckbox3() {
        return checkbox3;
    }

    public void setCheckbox3(Checkbox c) {
        this.checkbox3 = c;
    }
    private Checkbox checkbox4 = new Checkbox();

    public Checkbox getCheckbox4() {
        return checkbox4;
    }

    public void setCheckbox4(Checkbox c) {
        this.checkbox4 = c;
    }
    private Checkbox checkbox5 = new Checkbox();

    public Checkbox getCheckbox5() {
        return checkbox5;
    }

    public void setCheckbox5(Checkbox c) {
        this.checkbox5 = c;
    }
    private Checkbox checkbox6 = new Checkbox();

    public Checkbox getCheckbox6() {
        return checkbox6;
    }

    public void setCheckbox6(Checkbox c) {
        this.checkbox6 = c;
    }
    private Checkbox checkbox7 = new Checkbox();

    public Checkbox getCheckbox7() {
        return checkbox7;
    }

    public void setCheckbox7(Checkbox c) {
        this.checkbox7 = c;
    }
    private Label msgEditarDadosCliente = new Label();

    public Label getMsgEditarDadosCliente() {
        return msgEditarDadosCliente;
    }

    public void setMsgEditarDadosCliente(Label l) {
        this.msgEditarDadosCliente = l;
    }
    private Checkbox checkbox8 = new Checkbox();

    public Checkbox getCheckbox8() {
        return checkbox8;
    }

    public void setCheckbox8(Checkbox c) {
        this.checkbox8 = c;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public editarDadosCliente() {
    }
    
    @EJB
    PessoaRemote pessoaBean;
    private Pessoa cliente = new Pessoa();
    private boolean mostraMensagem = false;

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
        
        Pessoa recuperarCliente = recuperaCliente();
        this.setCliente(recuperarCliente);
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("editarDadosCliente Initialization Failure", e);
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
    
    private Pessoa recuperaCliente(){
        String idCliente = this.getSessionBean1().getLoginCliente();
        Pessoa recuperarCliente = new Pessoa();
        recuperarCliente.setLoginPes(idCliente);
        recuperarCliente = pessoaBean.getPessoaByLogin(recuperarCliente);
        return recuperarCliente;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public String button1_action() {
        Pessoa alterarCliente = recuperaCliente();
        // E-mail principal
        if (this.getEmailPrincipal1().getText() != null && !this.getEmailPrincipal1().getText().toString().equalsIgnoreCase(""))
            alterarCliente.setEmail(this.getEmailPrincipal1().getText().toString());
        // Data de nascimento
        if (this.getDataNascimento1().getSelectedDate() != null && !this.getDataNascimento1().getSelectedDate().toString().equalsIgnoreCase(""))
            alterarCliente.setDataNasc(this.getDataNascimento1().getSelectedDate());
        // Nome completo
        if (this.getNomeCompleto1().getText() != null && !this.getNomeCompleto1().getText().toString().equalsIgnoreCase(""))
            alterarCliente.setNome(this.getNomeCompleto1().getText().toString());
        // CPF
        if (this.getCpf1().getText() != null && !this.getCpf1().getText().toString().equalsIgnoreCase(""))
            alterarCliente.setCpf(this.getCpf1().getText().toString());
        // Telefone fixo 1
        if (this.getTelFixo1().getText() != null && !this.getTelFixo1().getText().toString().equalsIgnoreCase(""))
            alterarCliente.setTelefone(this.getTelFixo1().getText().toString());
        // ddd fixo 1
        if (this.getDddTelFixo1().getText() != null && !this.getDddTelFixo1().getText().toString().equalsIgnoreCase(""))
            alterarCliente.setDddtelefone(this.getDddTelFixo1().getText().toString());
        // ramal fixo 1
        if (this.getRamalTelFixo1().getText() != null && !this.getRamalTelFixo1().getText().toString().equalsIgnoreCase(""))
            alterarCliente.setRamal(this.getRamalTelFixo1().getText().toString());
        // Celular
        if (this.getCelular1().getText() != null && !this.getCelular1().getText().toString().equalsIgnoreCase(""))
            alterarCliente.setCelular(this.getCelular1().getText().toString());
        // DDD celular
        if (this.getDddCelular1().getText() != null && !this.getDddCelular1().getText().toString().equalsIgnoreCase(""))
            alterarCliente.setDddcelular(this.getDddCelular1().getText().toString());
        
        alterarCliente.getEnderecoCollection().size();
        
        if (pessoaBean.salvar(alterarCliente))
            setMostraMensagemAviso("Seu cadastro foi atualizado com sucesso!");
        else{
            setMostraMensagemErro("Infelizmente seu cadastro não foi atualizado devido a uma instabilidade momentanea do sistema.");
            setCliente(recuperaCliente());
            return null;
        }
        
        setCliente(alterarCliente);
        return null;
    }
    
    public boolean isMostraMensagem() {
        return mostraMensagem;
    }

    public void setMostraMensagemAviso(String msg) {
        getMsgEditarDadosCliente().setText(msg);
        getMsgEditarDadosCliente().setStyle("color: rgb(0, 0, 153); left: 192px; top: 96px; position: absolute");
        this.mostraMensagem = true;
    }
    
    public void setMostraMensagemErro(String msg) {
        getMsgEditarDadosCliente().setText(msg);
        getMsgEditarDadosCliente().setStyle("color: rgb(255, 51, 51); left: 192px; top: 96px; position: absolute");
        this.mostraMensagem = true;
    }
    
    public void setNaoMostraMensagemAviso() {
        this.mostraMensagem = false;
    }
    
}

