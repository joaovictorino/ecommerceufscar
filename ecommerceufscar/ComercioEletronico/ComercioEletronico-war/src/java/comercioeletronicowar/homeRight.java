/*
 * homeRight.java
 *
 * Created on 10/02/2008, 18:35:14
 */
 
package comercioeletronicowar;

import br.com.ecommerce.remote.PessoaRemote;
import br.com.ecommerce.entity.Pessoa;
import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Hyperlink;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.PasswordField;
import com.sun.webui.jsf.component.TextField;
import javax.ejb.EJB;
import javax.faces.FacesException;

/**
 * <p>Fragment bean that corresponds to a similarly named JSP page
 * fragment.  This class contains component definitions (and initialization
 * code) for all components that you have defined on this fragment, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author Cliente
 */
public class homeRight extends AbstractFragmentBean {
    
    @EJB
    private PessoaRemote pessoaBean;
    
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private Hyperlink hyperlink1 = new Hyperlink();

    public Hyperlink getHyperlink1() {
        return hyperlink1;
    }

    public void setHyperlink1(Hyperlink h) {
        this.hyperlink1 = h;
    }
    private Label lblSenha1 = new Label();

    public Label getLblSenha1() {
        return lblSenha1;
    }

    public void setLblSenha1(Label l) {
        this.lblSenha1 = l;
    }
    private Label lblLogin1 = new Label();

    public Label getLblLogin1() {
        return lblLogin1;
    }

    public void setLblLogin1(Label l) {
        this.lblLogin1 = l;
    }
    private TextField txtLogin1 = new TextField();

    public TextField getTxtLogin1() {
        return txtLogin1;
    }

    public void setTxtLogin1(TextField tf) {
        this.txtLogin1 = tf;
    }
    private Button btnLogin1 = new Button();

    public Button getBtnLogin1() {
        return btnLogin1;
    }

    public void setBtnLogin1(Button b) {
        this.btnLogin1 = b;
    }
    private PasswordField txtSenha1 = new PasswordField();

    public PasswordField getTxtSenha1() {
        return txtSenha1;
    }

    public void setTxtSenha1(PasswordField pf) {
        this.txtSenha1 = pf;
    }
    
    public boolean getControlVisibility(){
        if (this.getSessionBean1().getLoginCliente() != null && !this.getSessionBean1().getLoginCliente().toString().equals("")){
            return false;
        }else{
            return true;
        }
    }
    private Label lblError = new Label();

    public Label getLblError() {
        return lblError;
    }

    public void setLblError(Label l) {
        this.lblError = l;
    }

    private boolean showError = false;
    
    public void setShowError(boolean showError){
        this.showError = showError;
    }
    
    public boolean getShowError(){
        return this.showError;
    }
    
    // </editor-fold>

    public homeRight() {
    }

    /**
     * <p>Callback method that is called whenever a page containing
     * this page fragment is navigated to, either directly via a URL,
     * or indirectly via page navigation.  Override this method to acquire
     * resources that will be needed for event handlers and lifecycle methods.</p>
     * 
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void init() {
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        
        // <editor-fold defaultstate="collapsed" desc="Visual-Web-managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Page1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here      
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called.  Override this
     * method to release resources acquired in the <code>init()</code>
     * resources that will be needed for event handlers and lifecycle methods.</p>
     * 
     * <p>The default implementation does nothing.</p>
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

    public String btnLogin_action() {
        Pessoa pessoa = new Pessoa();
        pessoa.setLoginPes(this.getTxtLogin1().getText().toString());
        pessoa.setSenha(this.getTxtSenha1().getText().toString());
        
        if (!this.getTxtLogin1().getText().toString().equals("") && !this.getTxtSenha1().getText().toString().equals("") && this.pessoaBean.loginCliente(pessoa)){
            this.getSessionBean1().setLoginCliente(pessoa.getLoginPes());
            this.setShowError(false);
        }else{
            this.setShowError(true);
        }
        
        return null;
    }

}
