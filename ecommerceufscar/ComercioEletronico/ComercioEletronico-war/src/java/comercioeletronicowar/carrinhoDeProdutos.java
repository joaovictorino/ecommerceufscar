/*
 * carrinhoDeProdutos.java
 *
 * Created on 10/05/2008, 08:59:01
 */
 
package comercioeletronicowar;

import br.com.ecommerce.remote.CompraRemote;
import br.com.ecommerce.remote.ProdutoRemote;
import br.com.ecommerce.entity.Produtos;
import com.sun.data.provider.RowKey;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.ImageHyperlink;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.Link;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.Table;
import com.sun.webui.jsf.component.TableColumn;
import com.sun.webui.jsf.component.TableRowGroup;
import com.sun.webui.jsf.component.TextField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.faces.FacesException;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author João Henrique
 */
public class carrinhoDeProdutos extends AbstractPageBean {
    @EJB
    private CompraRemote compraBean;
    
    @EJB
    private ProdutoRemote produtoBean;

    private boolean mostraMensagem = false;
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
    private TableColumn tableColumn1 = new TableColumn();

    public TableColumn getTableColumn1() {
        return tableColumn1;
    }

    public void setTableColumn1(TableColumn tc) {
        this.tableColumn1 = tc;
    }
    
    private TableColumn tableColumn2 = new TableColumn();

    public TableColumn getTableColumn2() {
        return tableColumn2;
    }

    public void setTableColumn2(TableColumn tc) {
        this.tableColumn2 = tc;
    }
    private StaticText staticText1 = new StaticText();

    public StaticText getStaticText1() {
        return staticText1;
    }

    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }
    private TableColumn tableColumn3 = new TableColumn();

    public TableColumn getTableColumn3() {
        return tableColumn3;
    }

    public void setTableColumn3(TableColumn tc) {
        this.tableColumn3 = tc;
    }
    private TextField textField1 = new TextField();

    public TextField getTextField1() {
        return textField1;
    }

    public void setTextField1(TextField tf) {
        this.textField1 = tf;
    }
    private TableColumn tableColumn4 = new TableColumn();

    public TableColumn getTableColumn4() {
        return tableColumn4;
    }

    public void setTableColumn4(TableColumn tc) {
        this.tableColumn4 = tc;
    }
    private StaticText staticText2 = new StaticText();

    public StaticText getStaticText2() {
        return staticText2;
    }

    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
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
    private Button btnAtualizar1 = new Button();

    public Button getBtnAtualizar1() {
        return btnAtualizar1;
    }

    public void setBtnAtualizar1(Button b) {
        this.btnAtualizar1 = b;
    }
    private Button btnComprar1 = new Button();

    public Button getBtnComprar1() {
        return btnComprar1;
    }

    public void setBtnComprar1(Button b) {
        this.btnComprar1 = b;
    }
    
    private Produtos[] produtos;
    
    public Produtos[] getProdutos() {
        return produtos;
    }
    
    public void setProdutos(Produtos[] p) {
        this.produtos = p;
    }  
    
    private double total = 0;
    private TableColumn tableColumn5 = new TableColumn();

    public TableColumn getTableColumn5() {
        return tableColumn5;
    }

    public void setTableColumn5(TableColumn tc) {
        this.tableColumn5 = tc;
    }
    private TextField textField2 = new TextField();

    public TextField getTextField2() {
        return textField2;
    }

    public void setTextField2(TextField tf) {
        this.textField2 = tf;
    }
    private TableColumn tableColumn6 = new TableColumn();

    public TableColumn getTableColumn6() {
        return tableColumn6;
    }

    public void setTableColumn6(TableColumn tc) {
        this.tableColumn6 = tc;
    }
    private ImageHyperlink hplRemover = new ImageHyperlink();

    public ImageHyperlink getHplRemover() {
        return hplRemover;
    }

    public void setHplRemover(ImageHyperlink ih) {
        this.hplRemover = ih;
    }
    
    private RealConverter realConverter1 = new RealConverter();

    public RealConverter getRealConverter1() {
        return realConverter1;
    }

    public void setRealConverter1(RealConverter cc) {
        this.realConverter1 = cc;
    }
    
    private Label msgCarrinhoDeProdutos = new Label();
    
    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public carrinhoDeProdutos() {
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
            log("carrinhoDeProdutos Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        this.carregarListaProdutosCarrinho();
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

    public String btnAtualizar_action() {
        Produtos[] produtosTableRow = (Produtos[])this.getTableRowGroup1().getSourceData();
        if (produtosTableRow.length <= 0){
            this.setMostraMensagemAviso("Não há produtos em seu carrinho.");
            return null;
        }
        for(Produtos produtoRow : produtosTableRow){
            this.getSessionBean1().getCarrinhoCompras().remove(produtoRow.getCodProduto());
            this.getSessionBean1().getCarrinhoCompras().put(produtoRow.getCodProduto(), produtoRow.getQtdeCompras());
        }
         this.carregarListaProdutosCarrinho();
         this.setMostraMensagemAviso("Item alterado no carrinho de compras com sucesso.");
        return null;
    }

    public String btnComprar_action() {
        //Verifica se existem produtos no carrinho de compras
        Map listaCarrinhoProdutos = this.getSessionBean1().getCarrinhoCompras();
        if (listaCarrinhoProdutos == null || listaCarrinhoProdutos.size()<= 0){
            this.setMostraMensagemErro("O carrinho deve conter ao menos um produto para finalizar a compra.");
            return "carrinhoDeProdutos";
        }
        
        //Verifica se o cliente está logado
        String loginCliente = this.getSessionBean1().getLoginCliente();
        if (loginCliente == null || loginCliente.equalsIgnoreCase("")){
            this.setMostraMensagemErro("Não é possível finalizar a compra sem efeturar o login.");
            return "carrinhoDeProdutos";
        }
        
        //Atualiza a lista de produtos
        this.btnAtualizar_action();
        
        //Encaminha para a página de escolher endereço para a entrega da compra
        return "CarregarEscolherEndereco";
    }
    
    public void carregarListaProdutosCarrinho()
    {
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
        carrinho = this.getSessionBean1().getCarrinhoCompras();
        for(Map.Entry<Integer, Integer> item : carrinho.entrySet()){
            System.out.println("Id: "+item.getKey()+" - Qt: "+item.getValue());
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
    
    public String getcalculoTotal(){
        return this.realConverter1.getAsString(null, null, total);
    }

    public String hplRemover_action() {
        RowKey row = (RowKey)this.getValue("#{currentRow.tableRow}");
        Produtos deletedProduto = this.getProdutos()[Integer.parseInt(row.getRowId())];
        this.getSessionBean1().getCarrinhoCompras().remove(deletedProduto.getCodProduto());
        this.carregarListaProdutosCarrinho();
        this.setMostraMensagemAviso("Produto removido com sucesso! :)");
        return null;
    }

    public boolean isMostraMensagem() {
        return mostraMensagem;
    }

    public void setMostraMensagemAviso(String msg) {
        getMsgCarrinhoDeProdutos().setText(msg);
        getMsgCarrinhoDeProdutos().setStyle("color: rgb(0, 0, 153); left: 216px; top: 96px; position: absolute");
        this.mostraMensagem = true;
    }
    
    public void setMostraMensagemErro(String msg) {
        getMsgCarrinhoDeProdutos().setText(msg);
        getMsgCarrinhoDeProdutos().setStyle("color: rgb(255, 51, 51); left: 216px; top: 96px; position: absolute");
        this.mostraMensagem = true;
    }
    
    public void setNaoMostraMensagem() {
        this.mostraMensagem = false;
    }

    public Label getMsgCarrinhoDeProdutos() {
        return msgCarrinhoDeProdutos;
    }

    public void setMsgCarrinhoDeProdutos(Label msgCarrinhoDeProdutos) {
        this.msgCarrinhoDeProdutos = msgCarrinhoDeProdutos;
    }
    
}

