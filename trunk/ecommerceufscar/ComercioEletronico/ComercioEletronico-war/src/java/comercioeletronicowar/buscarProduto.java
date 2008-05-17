/*
 * buscarProduto.java
 *
 * Created on 26/01/2008, 14:30:13
 */
 
package comercioeletronicowar;

import br.com.ecommerce.bean.ProdutoRemote;
import br.com.ecommerce.entity.Categorias;
import br.com.ecommerce.entity.Produtos;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.HiddenField;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.ImageComponent;
import com.sun.webui.jsf.component.ImageHyperlink;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.Link;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.Table;
import com.sun.webui.jsf.component.TableColumn;
import com.sun.webui.jsf.component.TableRowGroup;
import com.sun.webui.jsf.component.TextField;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.FacesException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author Cliente
 */
public class buscarProduto extends AbstractPageBean {
    
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
    private Button buttonProcurarProduto = new Button();

    public Button getButtonProcurarProduto() {
        return buttonProcurarProduto;
    }

    public void setButtonProcurarProduto(Button b) {
        this.buttonProcurarProduto = b;
    }
    private TextField nomeProdutoProcurar = new TextField();

    public TextField getNomeProdutoProcurar() {
        return nomeProdutoProcurar;
    }

    public void setNomeProdutoProcurar(TextField tf) {
        this.nomeProdutoProcurar = tf;
    }
    private TextField precoMinProcurar = new TextField();

    public TextField getPrecoMinProcurar() {
        return precoMinProcurar;
    }

    public void setPrecoMinProcurar(TextField tf) {
        this.precoMinProcurar = tf;
    }
    private TextField precoMaxProcurar = new TextField();

    public TextField getPrecoMaxProcurar() {
        return precoMaxProcurar;
    }

    public void setPrecoMaxProcurar(TextField tf) {
        this.precoMaxProcurar = tf;
    }
    private Label labelNomeProdutoProcurar = new Label();

    public Label getLabelNomeProdutoProcurar() {
        return labelNomeProdutoProcurar;
    }

    public void setLabelNomeProdutoProcurar(Label l) {
        this.labelNomeProdutoProcurar = l;
    }
    private Label labelPrecoMinProcurar = new Label();

    public Label getLabelPrecoMinProcurar() {
        return labelPrecoMinProcurar;
    }

    public void setLabelPrecoMinProcurar(Label l) {
        this.labelPrecoMinProcurar = l;
    }
    private Label labelpPrecoMaxProcurar = new Label();

    public Label getLabelpPrecoMaxProcurar() {
        return labelpPrecoMaxProcurar;
    }

    public void setLabelpPrecoMaxProcurar(Label l) {
        this.labelpPrecoMaxProcurar = l;
    }
    private ImageComponent image1 = new ImageComponent();

    public ImageComponent getImage1() {
        return image1;
    }

    public void setImage1(ImageComponent ic) {
        this.image1 = ic;
    }
    private ImageHyperlink imageHyperlink1 = new ImageHyperlink();

    public ImageHyperlink getImageHyperlink1() {
        return imageHyperlink1;
    }

    public void setImageHyperlink1(ImageHyperlink ih) {
        this.imageHyperlink1 = ih;
    }
    private Table table1 = new Table();

    public Table getTable1() {
        return table1;
    }

    public void setTable1(Table t) {
        this.table1 = t;
    }
    private TableRowGroup tableRowGroup1 = new TableRowGroup();

    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    private TableColumn tableColumn4 = new TableColumn();

    public TableColumn getTableColumn4() {
        return tableColumn4;
    }

    public void setTableColumn4(TableColumn tc) {
        this.tableColumn4 = tc;
    }
    private StaticText staticText4 = new StaticText();

    public StaticText getStaticText4() {
        return staticText4;
    }

    public void setStaticText4(StaticText st) {
        this.staticText4 = st;
    }
    private TableColumn tableColumn5 = new TableColumn();

    public TableColumn getTableColumn5() {
        return tableColumn5;
    }

    public void setTableColumn5(TableColumn tc) {
        this.tableColumn5 = tc;
    }
    private StaticText staticText5 = new StaticText();

    public StaticText getStaticText5() {
        return staticText5;
    }

    public void setStaticText5(StaticText st) {
        this.staticText5 = st;
    }
    private TableColumn tableColumn6 = new TableColumn();

    public TableColumn getTableColumn6() {
        return tableColumn6;
    }

    public void setTableColumn6(TableColumn tc) {
        this.tableColumn6 = tc;
    }
    private StaticText staticText6 = new StaticText();

    public StaticText getStaticText6() {
        return staticText6;
    }

    public void setStaticText6(StaticText st) {
        this.staticText6 = st;
    }
    private Table table2 = new Table();

    public Table getTable2() {
        return table2;
    }

    public void setTable2(Table t) {
        this.table2 = t;
    }
    private TableRowGroup tableRowGroup2 = new TableRowGroup();

    public TableRowGroup getTableRowGroup2() {
        return tableRowGroup2;
    }

    public void setTableRowGroup2(TableRowGroup trg) {
        this.tableRowGroup2 = trg;
    }
    private TableColumn tableColumn7 = new TableColumn();

    public TableColumn getTableColumn7() {
        return tableColumn7;
    }

    public void setTableColumn7(TableColumn tc) {
        this.tableColumn7 = tc;
    }
    private TableColumn tableColumn8 = new TableColumn();

    public TableColumn getTableColumn8() {
        return tableColumn8;
    }

    public void setTableColumn8(TableColumn tc) {
        this.tableColumn8 = tc;
    }
    private StaticText staticText8 = new StaticText();

    public StaticText getStaticText8() {
        return staticText8;
    }

    public void setStaticText8(StaticText st) {
        this.staticText8 = st;
    }
    private TableColumn tableColumn9 = new TableColumn();

    public TableColumn getTableColumn9() {
        return tableColumn9;
    }

    public void setTableColumn9(TableColumn tc) {
        this.tableColumn9 = tc;
    }
    private StaticText staticText9 = new StaticText();

    public StaticText getStaticText9() {
        return staticText9;
    }

    public void setStaticText9(StaticText st) {
        this.staticText9 = st;
    }
    private ImageHyperlink imageHyperlink2 = new ImageHyperlink();

    public ImageHyperlink getImageHyperlink2() {
        return imageHyperlink2;
    }

    public void setImageHyperlink2(ImageHyperlink ih) {
        this.imageHyperlink2 = ih;
    }
    private HiddenField hiddenField1 = new HiddenField();

    public HiddenField getHiddenField1() {
        return hiddenField1;
    }

    public void setHiddenField1(HiddenField hf) {
        this.hiddenField1 = hf;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public buscarProduto() {
    }
    
    private Produtos produtos[];

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
            log("buscarProduto Initialization Failure", e);
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

    public Produtos[] getListaTabelaProdutosEncontrados (){
        return this.produtos;
    }
        
    public void setListaTabelaProdutosEncontrados (Produtos[] produtos){
        this.produtos = produtos;
    }
    
    
    public void buttonProcurarProduto_action() {
       Produtos meuProduto = new Produtos();
       Categorias categoria = new Categorias();
       categoria.setCategoria("categoria");
       if(nomeProdutoProcurar.getText() != null){
            meuProduto.setNomeProduto(nomeProdutoProcurar.getText().toString());
       }else {
            meuProduto.setNomeProduto("");
       }
       
       if(precoMinProcurar.getText() != null){
            meuProduto.setPreco(Double.parseDouble(precoMinProcurar.getText().toString()));
       }else {
            meuProduto.setPreco(0);
       }
       
       if(precoMaxProcurar.getText() != null){
            meuProduto.setDadosTecnicos(precoMaxProcurar.getText().toString());
       }else {
            meuProduto.setDadosTecnicos(""+999999999);
       }
       
       meuProduto.setCategoria(categoria);
       List <Produtos> minhaLista = produtoBean.listarProdutosParaUsuarios(meuProduto);
       
       if (minhaLista != null){
           Produtos meusProdutos[] = new Produtos[minhaLista.size()];
           for (int i = 0; i < minhaLista.size(); i++){
              meusProdutos[i] = new Produtos();
              meusProdutos[i].setNomeProduto(minhaLista.get(i).getNomeProduto());        
              meusProdutos[i].setPreco(minhaLista.get(i).getPreco());
              meusProdutos[i].setImagem(minhaLista.get(i).getImagem());
              meusProdutos[i].setCodProduto(minhaLista.get(i).getCodProduto());
           }
           setListaTabelaProdutosEncontrados(meusProdutos);
        
       } else {
           setListaTabelaProdutosEncontrados(null);
       }
    }
}

