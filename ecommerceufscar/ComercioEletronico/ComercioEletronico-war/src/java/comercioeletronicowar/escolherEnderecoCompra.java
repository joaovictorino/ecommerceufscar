/*
 * escolherEnderecoCompra.java
 *
 * Created on 22/06/2008, 16:52:25
 */
 
package comercioeletronicowar;

import br.com.ecommerce.entity.Endereco;
import br.com.ecommerce.entity.Pessoa;
import br.com.ecommerce.entity.Produtos;
import br.com.ecommerce.remote.CompraRemote;
import br.com.ecommerce.remote.PessoaRemote;
import br.com.ecommerce.remote.ProdutoRemote;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.Link;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.RadioButton;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.Table;
import com.sun.webui.jsf.component.TableColumn;
import com.sun.webui.jsf.component.TableRowGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
public class escolherEnderecoCompra extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    @EJB
    private ProdutoRemote produtoBean;
    
    @EJB
    private PessoaRemote pessoaBean;
    
    @EJB
    private CompraRemote compraBean;
    
    private carrinhoDeProdutos carrinhoProdutos = new carrinhoDeProdutos();
    
    private Page page1 = new Page();
    
    private Produtos[] produtos;
    private Endereco[] enderecos;
    private double total = 0;
    private RealConverter realConverter1 = new RealConverter();

    public RealConverter getRealConverter1() {
        return realConverter1;
    }

    public void setRealConverter1(RealConverter cc) {
        this.realConverter1 = cc;
    }
    
    public Produtos[] getProdutos() {
        return produtos;
    }
    
    public void setProdutos(Produtos[] p) {
        this.produtos = p;
    }  
    
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
    private TableColumn tableColumn7 = new TableColumn();

    public TableColumn getTableColumn7() {
        return tableColumn7;
    }

    public void setTableColumn7(TableColumn tc) {
        this.tableColumn7 = tc;
    }
    private StaticText staticText7 = new StaticText();

    public StaticText getStaticText7() {
        return staticText7;
    }

    public void setStaticText7(StaticText st) {
        this.staticText7 = st;
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

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }
    private StaticText staticText8 = new StaticText();

    public StaticText getStaticText8() {
        return staticText8;
    }

    public void setStaticText8(StaticText st) {
        this.staticText8 = st;
    }
    
    public String btnComprar_action() {
        //int total = 0;
        // Go through the list of selected rows
//        Integer calories;
//        Integer nbrServings;
//        FoodListDataProvider foodListDP = getSessionBean1().getFoodListDataProvider();
//        RowKey[] selectedRowKeys = getTableRowGroup2().getSelectedRowKeys();
//        for (int i = 0; i < selectedRowKeys.length; i++) {
//            String rowId = selectedRowKeys[i].getRowId();
//            RowKey rowKey = foodListDP.getRowKey(rowId);
//            // get serving size
//            String size = (String) getSessionBean1().getServingSizeMap().get(rowId);
//            // get calories for serving size
//            calories = (Integer) foodListDP.getValue(size, rowKey);
//            // get number of servings
//            nbrServings = (Integer) getSessionBean1().getNbrServingsMap().get(rowId);
//            // add to total
//            total += calories.intValue() * nbrServings.intValue();
//        }
        
        Integer idCompra = compraBean.efetuarCompra(this.getSessionBean1().getLoginCliente(), this.getSessionBean1().getCarrinhoCompras());
        this.getSessionBean1().setCarrinhoCompras(null);
        this.getSessionBean1().setNumCompra(idCompra);
        
        return "CompraEfetuada";
    }
    private Button btnComprar1 = new Button();

    public Button getBtnComprar1() {
        return btnComprar1;
    }

    public void setBtnComprar1(Button b) {
        this.btnComprar1 = b;
    }
    private RadioButton radioButton1 = new RadioButton();

    public RadioButton getRadioButton1() {
        return radioButton1;
    }

    public void setRadioButton1(RadioButton rb) {
        this.radioButton1 = rb;
    }
    private Table table3 = new Table();

    public Table getTable3() {
        return table3;
    }

    public void setTable3(Table t) {
        this.table3 = t;
    }
    private TableRowGroup tableRowGroup3 = new TableRowGroup();

    public TableRowGroup getTableRowGroup3() {
        return tableRowGroup3;
    }

    public void setTableRowGroup3(TableRowGroup trg) {
        this.tableRowGroup3 = trg;
    }
    private TableColumn tableColumn4 = new TableColumn();

    public TableColumn getTableColumn4() {
        return tableColumn4;
    }

    public void setTableColumn4(TableColumn tc) {
        this.tableColumn4 = tc;
    }
    private StaticText staticText18 = new StaticText();

    public StaticText getStaticText18() {
        return staticText18;
    }

    public void setStaticText18(StaticText st) {
        this.staticText18 = st;
    }
    private TableColumn tableColumn17 = new TableColumn();

    public TableColumn getTableColumn17() {
        return tableColumn17;
    }

    public void setTableColumn17(TableColumn tc) {
        this.tableColumn17 = tc;
    }
    private StaticText staticText19 = new StaticText();

    public StaticText getStaticText19() {
        return staticText19;
    }

    public void setStaticText19(StaticText st) {
        this.staticText19 = st;
    }
    private TableColumn tableColumn18 = new TableColumn();

    public TableColumn getTableColumn18() {
        return tableColumn18;
    }

    public void setTableColumn18(TableColumn tc) {
        this.tableColumn18 = tc;
    }
    private StaticText staticText20 = new StaticText();

    public StaticText getStaticText20() {
        return staticText20;
    }

    public void setStaticText20(StaticText st) {
        this.staticText20 = st;
    }
    private TableColumn tableColumn19 = new TableColumn();

    public TableColumn getTableColumn19() {
        return tableColumn19;
    }

    public void setTableColumn19(TableColumn tc) {
        this.tableColumn19 = tc;
    }
    private StaticText staticText21 = new StaticText();

    public StaticText getStaticText21() {
        return staticText21;
    }

    public void setStaticText21(StaticText st) {
        this.staticText21 = st;
    }
    private TableColumn tableColumn20 = new TableColumn();

    public TableColumn getTableColumn20() {
        return tableColumn20;
    }

    public void setTableColumn20(TableColumn tc) {
        this.tableColumn20 = tc;
    }
    private StaticText staticText22 = new StaticText();

    public StaticText getStaticText22() {
        return staticText22;
    }

    public void setStaticText22(StaticText st) {
        this.staticText22 = st;
    }
    private TableColumn tableColumn21 = new TableColumn();

    public TableColumn getTableColumn21() {
        return tableColumn21;
    }

    public void setTableColumn21(TableColumn tc) {
        this.tableColumn21 = tc;
    }
    private StaticText staticText23 = new StaticText();

    public StaticText getStaticText23() {
        return staticText23;
    }

    public void setStaticText23(StaticText st) {
        this.staticText23 = st;
    }
    private TableColumn tableColumn22 = new TableColumn();

    public TableColumn getTableColumn22() {
        return tableColumn22;
    }

    public void setTableColumn22(TableColumn tc) {
        this.tableColumn22 = tc;
    }
    private StaticText staticText24 = new StaticText();

    public StaticText getStaticText24() {
        return staticText24;
    }

    public void setStaticText24(StaticText st) {
        this.staticText24 = st;
    }
    private TableColumn tableColumn23 = new TableColumn();

    public TableColumn getTableColumn23() {
        return tableColumn23;
    }

    public void setTableColumn23(TableColumn tc) {
        this.tableColumn23 = tc;
    }
    private StaticText staticText25 = new StaticText();

    public StaticText getStaticText25() {
        return staticText25;
    }

    public void setStaticText25(StaticText st) {
        this.staticText25 = st;
    }
    private TableColumn tableColumn24 = new TableColumn();

    public TableColumn getTableColumn24() {
        return tableColumn24;
    }

    public void setTableColumn24(TableColumn tc) {
        this.tableColumn24 = tc;
    }
    private StaticText staticText26 = new StaticText();

    public StaticText getStaticText26() {
        return staticText26;
    }

    public void setStaticText26(StaticText st) {
        this.staticText26 = st;
    }
    private RadioButton radioButton3 = new RadioButton();

    public RadioButton getRadioButton3() {
        return radioButton3;
    }

    public void setRadioButton3(RadioButton rb) {
        this.radioButton3 = rb;
    }
    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public escolherEnderecoCompra() {
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
            log("escolherEnderecoCompra Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        this.carregarProdutos();
        this.carregarEnderecos();
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
    
    
    public void carregarProdutos(){
//        carrinhoDeProdutos carrinho = new carrinhoDeProdutos();
//        carrinho.carregarListaProdutosCarrinho();
        total = 0;
        Map<Integer, Integer> carrinho = this.getSessionBean1().getCarrinhoCompras();
        List<Integer> ids = new ArrayList<Integer>();
        List<Integer> prodTirarCarrinho = new ArrayList<Integer>();
        for (Map.Entry<Integer, Integer> item : carrinho.entrySet()){
            if (item.getValue()>0){
                ids.add(item.getKey());
            }else{
                prodTirarCarrinho.add(item.getKey());
            }
        }
        if (prodTirarCarrinho.size() > 0){
            for( int i = 0; i < prodTirarCarrinho.size() ; i++){
                this.getSessionBean1().getCarrinhoCompras().remove(prodTirarCarrinho.get(i));
            }
        }
        List<Produtos> produtosList = produtoBean.listaProdutosPorId(ids);
        this.produtos = new Produtos[produtosList.size()];
        for (int i = 0; i < produtosList.size(); i++){
            this.produtos[i] = new Produtos();
            this.produtos[i].setCodProduto(produtosList.get(i).getCodProduto());
            this.produtos[i].setNomeProduto(produtosList.get(i).getNomeProduto()); 
            this.produtos[i].setQtdeCompras(carrinho.get(produtosList.get(i).getCodProduto())); 
            this.produtos[i].setPreco(produtosList.get(i).getPreco() * carrinho.get(produtosList.get(i).getCodProduto()));
            total += (produtosList.get(i).getPreco() * carrinho.get(produtosList.get(i).getCodProduto()));
        }
    }
    
    public void carregarEnderecos()
    {
        String idCliente = this.getSessionBean1().getLoginCliente();
        Pessoa cliente = new Pessoa();
        cliente.setLoginPes(idCliente);
        cliente = pessoaBean.getPessoaByLogin(cliente);
        
        List<Endereco> enderecosList = (List)cliente.getEnderecoCollection();
        this.enderecos = new Endereco[enderecosList.size()];
        for (int i = 0; i < enderecosList.size(); i++){
            this.enderecos[i] = new Endereco();
            this.enderecos[i].setEndereco(enderecosList.get(i).getEndereco());
            this.enderecos[i].setCep(enderecosList.get(i).getCep());
            this.enderecos[i].setNumero(enderecosList.get(i).getNumero());
            this.enderecos[i].setCidade(enderecosList.get(i).getCidade());
            this.enderecos[i].setBairro(enderecosList.get(i).getBairro());
            this.enderecos[i].setTipoEndereco(enderecosList.get(i).getTipoEndereco());
            this.enderecos[i].setEstado(enderecosList.get(i).getEstado());
            this.enderecos[i].setCodEndereco(enderecosList.get(i).getCodEndereco());
            this.enderecos[i].setPais(enderecosList.get(i).getPais());
        }
    }
    
    public String getcalculoTotal(){
        return this.realConverter1.getAsString(null, null, total);
    }

    public Endereco[] getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco[] enderecos) {
        this.enderecos = enderecos;
    }

    public void radioButton2_processValueChange(ValueChangeEvent event) {
    }

    public carrinhoDeProdutos getCarrinhoProdutos() {
        return carrinhoProdutos;
    }

    public void setCarrinhoProdutos(carrinhoDeProdutos carrinhoProdutos) {
        this.carrinhoProdutos = carrinhoProdutos;
    }
}

