/*
 * editarAdministrador.java
 *
 * Created on Jun 14, 2008, 3:11:10 PM
 */
 
package comercioeletronicowar;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Calendar;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.Link;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.PasswordField;
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import javax.faces.FacesException;
import comercioeletronicowar.SessionBean1;
import javax.faces.event.ValueChangeEvent;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author sronly
 */
public class editarAdministrador extends AbstractPageBean {
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
    private Label lblEstado1 = new Label();

    public Label getLblEstado1() {
        return lblEstado1;
    }

    public void setLblEstado1(Label l) {
        this.lblEstado1 = l;
    }
    private Label lblCEP1 = new Label();

    public Label getLblCEP1() {
        return lblCEP1;
    }

    public void setLblCEP1(Label l) {
        this.lblCEP1 = l;
    }
    private TextField txtDDDCelular1 = new TextField();

    public TextField getTxtDDDCelular1() {
        return txtDDDCelular1;
    }

    public void setTxtDDDCelular1(TextField tf) {
        this.txtDDDCelular1 = tf;
    }
    private Label lblFrase1 = new Label();

    public Label getLblFrase1() {
        return lblFrase1;
    }

    public void setLblFrase1(Label l) {
        this.lblFrase1 = l;
    }
    private TextField txtCep1 = new TextField();

    public TextField getTxtCep1() {
        return txtCep1;
    }

    public void setTxtCep1(TextField tf) {
        this.txtCep1 = tf;
    }
    private Calendar txtDataExp1 = new Calendar();

    public Calendar getTxtDataExp1() {
        return txtDataExp1;
    }

    public void setTxtDataExp1(Calendar c) {
        this.txtDataExp1 = c;
    }
    private PasswordField txtSenha1 = new PasswordField();

    public PasswordField getTxtSenha1() {
        return txtSenha1;
    }

    public void setTxtSenha1(PasswordField pf) {
        this.txtSenha1 = pf;
    }
    private TextField txtOrgaoExp1 = new TextField();

    public TextField getTxtOrgaoExp1() {
        return txtOrgaoExp1;
    }

    public void setTxtOrgaoExp1(TextField tf) {
        this.txtOrgaoExp1 = tf;
    }
    private Label lblPais1 = new Label();

    public Label getLblPais1() {
        return lblPais1;
    }

    public void setLblPais1(Label l) {
        this.lblPais1 = l;
    }
    private Label lblSenha1 = new Label();

    public Label getLblSenha1() {
        return lblSenha1;
    }

    public void setLblSenha1(Label l) {
        this.lblSenha1 = l;
    }
    private Label lblRG1 = new Label();

    public Label getLblRG1() {
        return lblRG1;
    }

    public void setLblRG1(Label l) {
        this.lblRG1 = l;
    }
    private TextField txtTitulo1 = new TextField();

    public TextField getTxtTitulo1() {
        return txtTitulo1;
    }

    public void setTxtTitulo1(TextField tf) {
        this.txtTitulo1 = tf;
    }
    private Label lblTelefone1 = new Label();

    public Label getLblTelefone1() {
        return lblTelefone1;
    }

    public void setLblTelefone1(Label l) {
        this.lblTelefone1 = l;
    }
    private TextField txtLogin1 = new TextField();

    public TextField getTxtLogin1() {
        return txtLogin1;
    }

    public void setTxtLogin1(TextField tf) {
        this.txtLogin1 = tf;
    }
    private Label lblTitulo1 = new Label();

    public Label getLblTitulo1() {
        return lblTitulo1;
    }

    public void setLblTitulo1(Label l) {
        this.lblTitulo1 = l;
    }
    private TextField txtPais1 = new TextField();

    public TextField getTxtPais1() {
        return txtPais1;
    }

    public void setTxtPais1(TextField tf) {
        this.txtPais1 = tf;
    }
    private Label lblEndereco1 = new Label();

    public Label getLblEndereco1() {
        return lblEndereco1;
    }

    public void setLblEndereco1(Label l) {
        this.lblEndereco1 = l;
    }
    private TextField txtCidade1 = new TextField();

    public TextField getTxtCidade1() {
        return txtCidade1;
    }

    public void setTxtCidade1(TextField tf) {
        this.txtCidade1 = tf;
    }
    private TextField txtPassaporte1 = new TextField();

    public TextField getTxtPassaporte1() {
        return txtPassaporte1;
    }

    public void setTxtPassaporte1(TextField tf) {
        this.txtPassaporte1 = tf;
    }
    private TextField txtEstado1 = new TextField();

    public TextField getTxtEstado1() {
        return txtEstado1;
    }

    public void setTxtEstado1(TextField tf) {
        this.txtEstado1 = tf;
    }
    private TextField txtFrase1 = new TextField();

    public TextField getTxtFrase1() {
        return txtFrase1;
    }

    public void setTxtFrase1(TextField tf) {
        this.txtFrase1 = tf;
    }
    private TextField txtEmail1 = new TextField();

    public TextField getTxtEmail1() {
        return txtEmail1;
    }

    public void setTxtEmail1(TextField tf) {
        this.txtEmail1 = tf;
    }
    private TextField txtEndereco1 = new TextField();

    public TextField getTxtEndereco1() {
        return txtEndereco1;
    }

    public void setTxtEndereco1(TextField tf) {
        this.txtEndereco1 = tf;
    }
    private Label lblCPF1 = new Label();

    public Label getLblCPF1() {
        return lblCPF1;
    }

    public void setLblCPF1(Label l) {
        this.lblCPF1 = l;
    }
    private Label lblNome1 = new Label();

    public Label getLblNome1() {
        return lblNome1;
    }

    public void setLblNome1(Label l) {
        this.lblNome1 = l;
    }
    private TextField txtNumero1 = new TextField();

    public TextField getTxtNumero1() {
        return txtNumero1;
    }

    public void setTxtNumero1(TextField tf) {
        this.txtNumero1 = tf;
    }
    private TextField txtCPF1 = new TextField();

    public TextField getTxtCPF1() {
        return txtCPF1;
    }

    public void setTxtCPF1(TextField tf) {
        this.txtCPF1 = tf;
    }
    private Label lblRamal1 = new Label();

    public Label getLblRamal1() {
        return lblRamal1;
    }

    public void setLblRamal1(Label l) {
        this.lblRamal1 = l;
    }
    private TextField txtCelular1 = new TextField();

    public TextField getTxtCelular1() {
        return txtCelular1;
    }

    public void setTxtCelular1(TextField tf) {
        this.txtCelular1 = tf;
    }
    private TextField txtNome1 = new TextField();

    public TextField getTxtNome1() {
        return txtNome1;
    }

    public void setTxtNome1(TextField tf) {
        this.txtNome1 = tf;
    }
    private Label lblCelular1 = new Label();

    public Label getLblCelular1() {
        return lblCelular1;
    }

    public void setLblCelular1(Label l) {
        this.lblCelular1 = l;
    }
    private Label lblResultado1 = new Label();

    public Label getLblResultado1() {
        return lblResultado1;
    }

    public void setLblResultado1(Label l) {
        this.lblResultado1 = l;
    }
    private Label lblDataExp1 = new Label();

    public Label getLblDataExp1() {
        return lblDataExp1;
    }

    public void setLblDataExp1(Label l) {
        this.lblDataExp1 = l;
    }
    private TextField txtDDDTelefone1 = new TextField();

    public TextField getTxtDDDTelefone1() {
        return txtDDDTelefone1;
    }

    public void setTxtDDDTelefone1(TextField tf) {
        this.txtDDDTelefone1 = tf;
    }
    private TextField txtRamal1 = new TextField();

    public TextField getTxtRamal1() {
        return txtRamal1;
    }

    public void setTxtRamal1(TextField tf) {
        this.txtRamal1 = tf;
    }
    private Label lblPassaporte1 = new Label();

    public Label getLblPassaporte1() {
        return lblPassaporte1;
    }

    public void setLblPassaporte1(Label l) {
        this.lblPassaporte1 = l;
    }
    private Label lblDataNasc1 = new Label();

    public Label getLblDataNasc1() {
        return lblDataNasc1;
    }

    public void setLblDataNasc1(Label l) {
        this.lblDataNasc1 = l;
    }
    private Label lblLogin1 = new Label();

    public Label getLblLogin1() {
        return lblLogin1;
    }

    public void setLblLogin1(Label l) {
        this.lblLogin1 = l;
    }
    private TextField txtBairro1 = new TextField();

    public TextField getTxtBairro1() {
        return txtBairro1;
    }

    public void setTxtBairro1(TextField tf) {
        this.txtBairro1 = tf;
    }
    private Label lblBairro1 = new Label();

    public Label getLblBairro1() {
        return lblBairro1;
    }

    public void setLblBairro1(Label l) {
        this.lblBairro1 = l;
    }
    private Label lblTipoEnd1 = new Label();

    public Label getLblTipoEnd1() {
        return lblTipoEnd1;
    }

    public void setLblTipoEnd1(Label l) {
        this.lblTipoEnd1 = l;
    }
    private Label lblOrgaoExp1 = new Label();

    public Label getLblOrgaoExp1() {
        return lblOrgaoExp1;
    }

    public void setLblOrgaoExp1(Label l) {
        this.lblOrgaoExp1 = l;
    }
    private TextField txtRG1 = new TextField();

    public TextField getTxtRG1() {
        return txtRG1;
    }

    public void setTxtRG1(TextField tf) {
        this.txtRG1 = tf;
    }
    private TextField txtTelefone1 = new TextField();

    public TextField getTxtTelefone1() {
        return txtTelefone1;
    }

    public void setTxtTelefone1(TextField tf) {
        this.txtTelefone1 = tf;
    }
    private DropDown ddlTipoEnd1 = new DropDown();

    public DropDown getDdlTipoEnd1() {
        return ddlTipoEnd1;
    }

    public void setDdlTipoEnd1(DropDown dd) {
        this.ddlTipoEnd1 = dd;
    }
    private Label lblNumero1 = new Label();

    public Label getLblNumero1() {
        return lblNumero1;
    }

    public void setLblNumero1(Label l) {
        this.lblNumero1 = l;
    }
    private Label lblCidade1 = new Label();

    public Label getLblCidade1() {
        return lblCidade1;
    }

    public void setLblCidade1(Label l) {
        this.lblCidade1 = l;
    }
    private Calendar txtDataNasc1 = new Calendar();

    public Calendar getTxtDataNasc1() {
        return txtDataNasc1;
    }

    public void setTxtDataNasc1(Calendar c) {
        this.txtDataNasc1 = c;
    }
    private Label lblEmail1 = new Label();

    public Label getLblEmail1() {
        return lblEmail1;
    }

    public void setLblEmail1(Label l) {
        this.lblEmail1 = l;
    }
    private TextField txtCep2 = new TextField();

    public TextField getTxtCep2() {
        return txtCep2;
    }

    public void setTxtCep2(TextField tf) {
        this.txtCep2 = tf;
    }
    private SingleSelectOptionsList ddlTipoEnd1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDdlTipoEnd1DefaultOptions() {
        return ddlTipoEnd1DefaultOptions;
    }

    public void setDdlTipoEnd1DefaultOptions(SingleSelectOptionsList ssol) {
        this.ddlTipoEnd1DefaultOptions = ssol;
    }
    private Label label2 = new Label();

    public Label getLabel2() {
        return label2;
    }

    public void setLabel2(Label l) {
        this.label2 = l;
    }
    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public editarAdministrador() {
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
            log("editarAdministrador Initialization Failure", e);
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

    public void txtFrase_processValueChange(ValueChangeEvent event) {
    }

    public String button1_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected carrinhoDeProdutos getcarrinhoDeProdutos() {
        return (carrinhoDeProdutos) getBean("carrinhoDeProdutos");
    }
    
}

