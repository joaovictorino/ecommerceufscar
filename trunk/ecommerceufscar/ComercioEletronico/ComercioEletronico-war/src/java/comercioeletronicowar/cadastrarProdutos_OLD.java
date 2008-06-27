/*
 * cadastrarProdutos.java
 *
 * Created on 09/06/2008, 17:13:38
 */
 
package comercioeletronicowar;

import br.com.ecommerce.entity.Categorias;
import br.com.ecommerce.entity.Produtos;
import br.com.ecommerce.remote.ProdutoRemote;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.*;
import javax.ejb.EJB;
import javax.faces.FacesException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author HAPPY
 */
public class cadastrarProdutos extends AbstractPageBean {
    
    @EJB
    private ProdutoRemote produtoBean;

    
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    
    /*  -----
     * Ligação entre o JSP e o JAVA - Formularios e elementos base
     */ 
    private Page pageCaProd = new Page();
    private Html htmlCaProd = new Html();
    private Head headCaProd = new Head();
    private Link linkCaProd = new Link();
    private Body bodyCaProd = new Body();
    private Form formCaProd = new Form();
    private TabSet tabSetCadProd = new TabSet();
    private Tab tabIncluir = new Tab();
    private PanelLayout layoutPanelIncluir = new PanelLayout();
    
    public Page getPageCaProd() {
        return pageCaProd;
    }

    public void setPageCaProd(Page pageCaProd) {
        this.pageCaProd = pageCaProd;
    }

    public Html getHtmlCaProd() {
        return htmlCaProd;
    }

    public void setHtmlCaProd(Html htmlCaProd) {
        this.htmlCaProd = htmlCaProd;
    }

    public Head getHeadCaProd() {
        return headCaProd;
    }

    public void setHeadCaProd(Head headCaProd) {
        this.headCaProd = headCaProd;
    }

    public Link getLinkCaProd() {
        return linkCaProd;
    }

    public void setLinkCaProd(Link linkCaProd) {
        this.linkCaProd = linkCaProd;
    }
    
    public Body getBodyCaProd() {
        return bodyCaProd;
    }

    public void setBodyCaProd(Body bodyCaProd) {
        this.bodyCaProd = bodyCaProd;
    }

    public Form getFormCaProd() {
        return formCaProd;
    }

    public void setFormCaProd(Form formCaProd) {
        this.formCaProd = formCaProd;
    }

    public TabSet getTabSetCadProd() {
        return tabSetCadProd;
    }

    public void setTabSetCadProd(TabSet ts) {
        this.tabSetCadProd = ts;
    }

    public Tab getTabIncluir() {
        return tabIncluir;
    }

    public void setTabIncluir(Tab t) {
        this.tabIncluir = t;
    }

    public PanelLayout getLayoutPanelIncluir() {
        return layoutPanelIncluir;
    }

    public void setLayoutPanelIncluir(PanelLayout pl) {
        this.layoutPanelIncluir = pl;
    }
     /*
     * termino ligação JSP - JAVA Formulário e elementos basicos
     */
    
    private Label lblNomeProd_incl = new Label();
    private TextField txtFldNomeProduto_incl = new TextField();
    private Label lblDescDetalhad_incl = new Label();
    private Object txtFldDescrDetalhada_incl;    
    private Label lblDadosTecnicos_incl = new Label();  
    private Object txtFldDadosTecnicos_incl;
    private Label lblCategoria_incl = new Label();
    // categoria
    private Label lblQtdEstoque_incl = new Label();
    private TextField txtFldQtdeEstoque_incl = new TextField();
    private Label lblPrecoUnit_incl = new Label();
    private TextField txtFldPrecoUnit_incl = new TextField();
    private Label lblImagem_incl = new Label();
    private TextField txtFldImagem_incl = new TextField();
    private Label lblMensagem_incl = new Label();
    private Button buttonIncluir = new Button();
    private Button btnCancelar_incl = new Button();

    public Label getLblNomeProd_incl() {
        return lblNomeProd_incl;
    }

    public void setLblNomeProd_incl(Label l) {
        this.lblNomeProd_incl = l;
    }

    public TextField getTxtFldNomeProduto_incl() {
        return txtFldNomeProduto_incl;
    }

    public void setTxtFldNomeProduto_incl(TextField tf) {
        this.txtFldNomeProduto_incl = tf;
    }

    public Label getLblDescDetalhad_incl() {
        return lblDescDetalhad_incl;
    }

    public void setLblDescDetalhad_incl(Label l) {
        this.lblDescDetalhad_incl = l;
    }

    public Object getTxtFldDescrDetalhada_incl() {
        return txtFldDescrDetalhada_incl;
    }

    public void setTxtFldDescrDetalhada_incl(Object txtFldDescrDetalhada) {
        this.txtFldDescrDetalhada_incl = txtFldDescrDetalhada;
    }
    
    public Label getLblDadosTecnicos_incl() {
        return lblDadosTecnicos_incl;
    }

    public void setLblDadosTecnicos_incl(Label l) {
        this.lblDadosTecnicos_incl = l;
    }

    public Object getTxtFldDadosTecnicos_incl() {
        return txtFldDadosTecnicos_incl;
    }

    public void setTxtFldDadosTecnicos_incl(Object txtFldDadosTecnicos) {
        this.txtFldDadosTecnicos_incl = txtFldDadosTecnicos;
    }

    public Label getLblCategoria_incl() {
        return lblCategoria_incl;
    }

    public void setLblCategoria_incl(Label l) {
        this.lblCategoria_incl = l;
    }
// categoria
    
    public Label getLblQtdEstoque_incl() {
        return lblQtdEstoque_incl;
    }

    public void setLblQtdEstoque_incl(Label l) {
        this.lblQtdEstoque_incl = l;
    }

    public TextField getTxtFldQtdeEstoque_incl() {
        return txtFldQtdeEstoque_incl;
    }

    public void setTxtFldQtdeEstoque_incl(TextField tf) {
        this.txtFldQtdeEstoque_incl = tf;
    }

    public Label getLblPrecoUnit_incl() {
        return lblPrecoUnit_incl;
    }

    public void setLblPrecoUnit_incl(Label l) {
        this.lblPrecoUnit_incl = l;
    }

    public TextField getTxtFldPrecoUnit_incl() {
        return txtFldPrecoUnit_incl;
    }

    public void setTxtFldPrecoUnit_incl(TextField tf) {
        this.txtFldPrecoUnit_incl = tf;
    }

    public Label getLblImagem_incl() {
        return lblImagem_incl;
    }

    public void setLblImagem_incl(Label l) {
        this.lblImagem_incl = l;
    }
    
    public TextField getTxtFldImagem_incl() {
        return txtFldImagem_incl;
    }

    public void setTxtFldImagem_incl(TextField tf) {
        this.txtFldImagem_incl = tf;
    }

    public Label getLblMensagem_incl() {
        return lblMensagem_incl;
    }

    public void setLblMensagem_incl(Label l) {
        this.lblMensagem_incl = l;
    }

    public Button getButtonIncluir() {
        return buttonIncluir;
    }

    public void setButtonIncluir(Button b) {
        this.buttonIncluir = b;
    }

    public Button getBtnCancelar_incl() {
        return btnCancelar_incl;
    }

    public void setBtnCancelar_incl(Button b) {
        this.btnCancelar_incl = b;
    }
    


    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public cadastrarProdutos() {
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
            log("cadastarProdutos Initialization Failure", e);
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

    public String buttonIncluir_action() {

        Produtos prod = new Produtos();
        prod.setNomeProduto(txtFldNomeProduto_incl.getText().toString());
        prod.setDescricaoDetalhada(getTxtFldDescrDetalhada_incl().toString());
        prod.setDadosTecnicos(getTxtFldDadosTecnicos_incl().toString());
        prod.setQtdeEstoque(Integer.valueOf(txtFldQtdeEstoque_incl.getText().toString()));
        prod.setPreco(Float.valueOf(txtFldPrecoUnit_incl.getText().toString()));
        prod.setImagem(txtFldImagem_incl.getText().toString());
        
        prod.setNumeroVisualizacao(0);
        prod.setQtdeCompras(0);
        
        Categorias categoria = new Categorias();
        categoria.setCategoria("categoria");
        prod.setCategoria(categoria);
        
        if (produtoBean.salvaprod(prod)) {
            //Atribuir a mensagem de sucesso para o label
            lblMensagem_incl.setText("Inclusão bem sucedida"); 
        } else {
            //Atribuir a mensagem de erro para o label
                lblMensagem_incl.setText("Não foi possível a Inclusão"); 
        }    
        //Regra de navegaÃ§Ã£o adequada no faces-config
        return null;
    }

    
}

