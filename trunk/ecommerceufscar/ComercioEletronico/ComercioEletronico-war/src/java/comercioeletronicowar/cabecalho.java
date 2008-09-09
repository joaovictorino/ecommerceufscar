/*
 * cabecalho.java
 *
 * Created on 03/02/2008, 14:34:49
 */
 
package comercioeletronicowar;

import br.com.ecommerce.entity.Pessoa;
import br.com.ecommerce.remote.PessoaRemote;
import com.sun.rave.web.ui.appbase.AbstractFragmentBean;
import com.sun.webui.jsf.component.Hyperlink;
import com.sun.webui.jsf.component.ImageComponent;
import com.sun.webui.jsf.component.ImageHyperlink;
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
public class cabecalho extends AbstractFragmentBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization. <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
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
    private Label lblUsuario = new Label();

    public Label getLblUsuario() {
        return lblUsuario;
    }

    public void setLblUsuario(Label l) {
        this.lblUsuario = l;
    }
    
    public String getLoginCliente(){
        if (this.getSessionBean1().getLoginCliente() != null && !this.getSessionBean1().getLoginCliente().toString().equals("")){
            return this.getSessionBean1().getLoginCliente();
        }else{
            return "";
        }
    }
    
    public boolean isMostrarBemVindo(){
        if (this.getSessionBean1().getLoginCliente() != null && !this.getSessionBean1().getLoginCliente().toString().equals("")){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean isMostrarCamposLogin(){
        if (this.getSessionBean1().getLoginCliente() != null && !this.getSessionBean1().getLoginCliente().toString().equals("")){
            return false;
        }else{
            return true;
        }
    }
    private ImageComponent image1 = new ImageComponent();

    public ImageComponent getImage1() {
        return image1;
    }

    public void setImage1(ImageComponent ic) {
        this.image1 = ic;
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
    private PasswordField txtSenha1 = new PasswordField();

    public PasswordField getTxtSenha1() {
        return txtSenha1;
    }

    public void setTxtSenha1(PasswordField pf) {
        this.txtSenha1 = pf;
    }
    private Label lblError1 = new Label();

    public Label getLblError1() {
        return lblError1;
    }

    public void setLblError1(Label l) {
        this.lblError1 = l;
    }
    private ImageHyperlink imageHyperlink1 = new ImageHyperlink();

    public ImageHyperlink getImageHyperlink1() {
        return imageHyperlink1;
    }

    public void setImageHyperlink1(ImageHyperlink ih) {
        this.imageHyperlink1 = ih;
    }
    private ImageHyperlink imageHyperlink2 = new ImageHyperlink();

    public ImageHyperlink getImageHyperlink2() {
        return imageHyperlink2;
    }

    public void setImageHyperlink2(ImageHyperlink ih) {
        this.imageHyperlink2 = ih;
    }
    
    private Hyperlink hyperlink2 = new Hyperlink();

    public Hyperlink getHyperlink2() {
        return hyperlink2;
    }

    public void setHyperlink2(Hyperlink h) {
        this.hyperlink2 = h;
    }
    private Hyperlink hyperlink3 = new Hyperlink();

    public Hyperlink getHyperlink3() {
        return hyperlink3;
    }

    public void setHyperlink3(Hyperlink h) {
        this.hyperlink3 = h;
    }
    private Hyperlink hyperlink4 = new Hyperlink();

    public Hyperlink getHyperlink4() {
        return hyperlink4;
    }

    public void setHyperlink4(Hyperlink h) {
        this.hyperlink4 = h;
    }
    
    // </editor-fold>

    public cabecalho() {
    }
    
    @EJB
    private PessoaRemote pessoaBean;
    
    private boolean showError = false;
    
    public void setShowError(boolean showError){
        this.showError = showError;
    }
    
    public boolean getShowError(){
        return this.showError;
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

    public String lnkLogout_action() {
        this.getSessionBean1().setLoginCliente(null);
        return null;
    }

    public String btnLogin_action() {
        if (this.getTxtLogin1().getText() == null || this.getTxtSenha1().getText() == null ||
            this.getTxtLogin1().getText().toString().equals("") || this.getTxtSenha1().getText().toString().equals("")){
            this.setShowError(true);
            return null;
        }
        Pessoa pessoa = new Pessoa();
        pessoa.setLoginPes(this.getTxtLogin1().getText().toString());
        pessoa.setSenha(this.getTxtSenha1().getText().toString());
        
        if (this.pessoaBean.loginCliente(pessoa)){
            this.getSessionBean1().setLoginCliente(pessoa.getLoginPes());
            this.setShowError(false);
        }else{
            this.setShowError(true);
        }
        return null;
    }

}
