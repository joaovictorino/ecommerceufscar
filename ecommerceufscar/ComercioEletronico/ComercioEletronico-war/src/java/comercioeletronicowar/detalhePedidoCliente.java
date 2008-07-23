/*
 * detalhePedidoCliente.java
 *
 * Created on 18/07/2008, 20:12:28
 */
 
package comercioeletronicowar;

import br.com.ecommerce.entity.Compras;
import br.com.ecommerce.entity.ItensCompras;
import br.com.ecommerce.entity.Pessoa;
import br.com.ecommerce.dto.ProdutoDTO;
import br.com.ecommerce.remote.CompraRemote;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.Link;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.Table;
import com.sun.webui.jsf.component.TableColumn;
import com.sun.webui.jsf.component.TableRowGroup;
import java.util.Collection;
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
public class detalhePedidoCliente extends AbstractPageBean {
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
    private Label label22 = new Label();

    public Label getLabel22() {
        return label22;
    }

    public void setLabel22(Label l) {
        this.label22 = l;
    }
    private Label label23 = new Label();

    public Label getLabel23() {
        return label23;
    }

    public void setLabel23(Label l) {
        this.label23 = l;
    }
    private Label label24 = new Label();

    public Label getLabel24() {
        return label24;
    }

    public void setLabel24(Label l) {
        this.label24 = l;
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

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public detalhePedidoCliente() {
    }
    
    @EJB
    private CompraRemote compraBean;
    private Compras[] compras;
    private Compras pedido;
    private ProdutoDTO[] produtosDTOs;
    private String stgEndereco;

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
        super.init();        
        
        try {
            _init();
        } catch (Exception e) {
            log("detalhePedidoCliente Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        String idCliente = this.getSessionBean1().getLoginCliente();
        Pessoa cliente = new Pessoa();
        cliente.setLoginPes(idCliente);
        Collection <Compras> colecaoCompras = compraBean.pesquisarComprasPeloLogin(cliente);
        
        if (colecaoCompras != null && colecaoCompras.size() > 0){
            this.carregarCompras(colecaoCompras);
            this.setPedido(getCompras()[0]);
            if(this.getPedido().getItensComprasCollection() != null && this.getPedido().getItensComprasCollection().size() > 0){
                carregarProdutoDTO(this.getPedido().getItensComprasCollection());
            }
        }
        if (this.getPedido().getCodEndereco() != null){
            String auxEndereco = "";
            auxEndereco = this.getPedido().getCodEndereco().getTipoEndereco();
            auxEndereco += " "+this.getPedido().getCodEndereco().getEndereco();
            auxEndereco += ", "+this.getPedido().getCodEndereco().getNumero();
            auxEndereco += " - "+this.getPedido().getCodEndereco().getBairro();
            auxEndereco += ", Cep "+this.getPedido().getCodEndereco().getCep();
            auxEndereco += " - "+this.getPedido().getCodEndereco().getCidade();
            auxEndereco += ", "+this.getPedido().getCodEndereco().getEstado();
            auxEndereco += " - "+this.getPedido().getCodEndereco().getPais();

            setStgEndereco(auxEndereco);
        }
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
    
    public void carregarCompras(Collection colecaoCompras){
        List<Compras> comprasList = (List)colecaoCompras;
        this.setCompras(new Compras[comprasList.size()]);
        for (int i = 0; i < comprasList.size(); i++){
            this.getCompras()[i] = new Compras();
            this.getCompras()[i].setStatusCompra(comprasList.get(i).getStatusCompra());
            this.getCompras()[i].setNumCompra(comprasList.get(i).getNumCompra());
            this.getCompras()[i].setFormaPagamento(comprasList.get(i).getFormaPagamento());
            this.getCompras()[i].setDataPedido(comprasList.get(i).getDataPedido());
            this.getCompras()[i].setValorTotal(comprasList.get(i).getValorTotal());
        }
    }
    
    public void carregarProdutoDTO(Collection colecaoPedidos){
        List<ItensCompras> pedidosList = (List)colecaoPedidos;
        this.setProdutosDTOs(new ProdutoDTO[pedidosList.size()]);
        for (int i = 0; i < pedidosList.size(); i++){
            this.getProdutosDTOs()[i] = new ProdutoDTO();
            this.getProdutosDTOs()[i].setPrecoProduto(pedidosList.get(i).getPrecoProduto());
            this.getProdutosDTOs()[i].setQuantidade(pedidosList.get(i).getQuantidade());
            this.getProdutosDTOs()[i].setPreco(pedidosList.get(i).getQuantidade() * pedidosList.get(i).getProdutos().getPreco());
            this.getProdutosDTOs()[i].setNomeProduto(pedidosList.get(i).getProdutos().getNomeProduto());
            this.getProdutosDTOs()[i].setImagem(pedidosList.get(i).getProdutos().getImagem());
        }
    }

    public Compras[] getCompras() {
        return compras;
    }

    public void setCompras(Compras[] compras) {
        this.compras = compras;
    }

    public Compras getPedido() {
        return pedido;
    }

    public void setPedido(Compras pedido) {
        this.pedido = pedido;
    }

    public ProdutoDTO[] getProdutosDTOs() {
        return produtosDTOs;
    }

    public void setProdutosDTOs(ProdutoDTO[] produtosDTOs) {
        this.produtosDTOs = produtosDTOs;
    }

    public String getStgEndereco() {
        return stgEndereco;
    }

    public void setStgEndereco(String stgEndereco) {
        this.stgEndereco = stgEndereco;
    }
}

