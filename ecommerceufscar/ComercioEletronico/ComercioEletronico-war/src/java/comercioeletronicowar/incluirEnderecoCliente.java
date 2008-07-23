/*
 * incluirEnderecoCliente.java
 *
 * Created on 18/07/2008, 16:43:57
 */
 
package comercioeletronicowar;

import br.com.ecommerce.entity.Endereco;
import br.com.ecommerce.entity.Pessoa;
import br.com.ecommerce.remote.PessoaRemote;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.Hyperlink;
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
public class incluirEnderecoCliente extends AbstractPageBean {
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
    private TextField cidade1 = new TextField();

    public TextField getCidade1() {
        return cidade1;
    }

    public void setCidade1(TextField tf) {
        this.cidade1 = tf;
    }
    private TextField numEndereco1 = new TextField();

    public TextField getNumEndereco1() {
        return numEndereco1;
    }

    public void setNumEndereco1(TextField tf) {
        this.numEndereco1 = tf;
    }
    private Table tabEnderecos1 = new Table();

    public Table getTabEnderecos1() {
        return tabEnderecos1;
    }

    public void setTabEnderecos1(Table t) {
        this.tabEnderecos1 = t;
    }
    private TableRowGroup tableRowGroup1 = new TableRowGroup();

    public TableRowGroup getTableRowGroup1() {
        return tableRowGroup1;
    }

    public void setTableRowGroup1(TableRowGroup trg) {
        this.tableRowGroup1 = trg;
    }
    private TextField cep1 = new TextField();

    public TextField getCep1() {
        return cep1;
    }

    public void setCep1(TextField tf) {
        this.cep1 = tf;
    }
    private Label login1 = new Label();

    public Label getLogin1() {
        return login1;
    }

    public void setLogin1(Label l) {
        this.login1 = l;
    }
    private TextField bairro1 = new TextField();

    public TextField getBairro1() {
        return bairro1;
    }

    public void setBairro1(TextField tf) {
        this.bairro1 = tf;
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
    private TextField cep2 = new TextField();

    public TextField getCep2() {
        return cep2;
    }

    public void setCep2(TextField tf) {
        this.cep2 = tf;
    }
    private Button button1 = new Button();

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button b) {
        this.button1 = b;
    }
    private Label label6 = new Label();

    public Label getLabel6() {
        return label6;
    }

    public void setLabel6(Label l) {
        this.label6 = l;
    }
    private Hyperlink hyperlink1 = new Hyperlink();

    public Hyperlink getHyperlink1() {
        return hyperlink1;
    }

    public void setHyperlink1(Hyperlink h) {
        this.hyperlink1 = h;
    }
    private TextField tipoEndereco1 = new TextField();

    public TextField getTipoEndereco1() {
        return tipoEndereco1;
    }

    public void setTipoEndereco1(TextField tf) {
        this.tipoEndereco1 = tf;
    }
    private TextField endereco1 = new TextField();

    public TextField getEndereco1() {
        return endereco1;
    }

    public void setEndereco1(TextField tf) {
        this.endereco1 = tf;
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
    private Hyperlink hyperlink2 = new Hyperlink();

    public Hyperlink getHyperlink2() {
        return hyperlink2;
    }

    public void setHyperlink2(Hyperlink h) {
        this.hyperlink2 = h;
    }
    private TextField pais1 = new TextField();

    public TextField getPais1() {
        return pais1;
    }

    public void setPais1(TextField tf) {
        this.pais1 = tf;
    }
    private TextField estado1 = new TextField();

    public TextField getEstado1() {
        return estado1;
    }

    public void setEstado1(TextField tf) {
        this.estado1 = tf;
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
    private Label msgIncluirEnderecoCliente = new Label();

    public Label getMsgIncluirEnderecoCliente() {
        return msgIncluirEnderecoCliente;
    }

    public void setMsgIncluirEnderecoCliente(Label l) {
        this.msgIncluirEnderecoCliente = l;
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
    private TableColumn tableColumn10 = new TableColumn();

    public TableColumn getTableColumn10() {
        return tableColumn10;
    }

    public void setTableColumn10(TableColumn tc) {
        this.tableColumn10 = tc;
    }
    private StaticText staticText10 = new StaticText();

    public StaticText getStaticText10() {
        return staticText10;
    }

    public void setStaticText10(StaticText st) {
        this.staticText10 = st;
    }
    private TableColumn tableColumn11 = new TableColumn();

    public TableColumn getTableColumn11() {
        return tableColumn11;
    }

    public void setTableColumn11(TableColumn tc) {
        this.tableColumn11 = tc;
    }
    private StaticText staticText11 = new StaticText();

    public StaticText getStaticText11() {
        return staticText11;
    }

    public void setStaticText11(StaticText st) {
        this.staticText11 = st;
    }
    private TableColumn tableColumn12 = new TableColumn();

    public TableColumn getTableColumn12() {
        return tableColumn12;
    }

    public void setTableColumn12(TableColumn tc) {
        this.tableColumn12 = tc;
    }
    private StaticText staticText12 = new StaticText();

    public StaticText getStaticText12() {
        return staticText12;
    }

    public void setStaticText12(StaticText st) {
        this.staticText12 = st;
    }
    private TableColumn tableColumn13 = new TableColumn();

    public TableColumn getTableColumn13() {
        return tableColumn13;
    }

    public void setTableColumn13(TableColumn tc) {
        this.tableColumn13 = tc;
    }
    private StaticText staticText13 = new StaticText();

    public StaticText getStaticText13() {
        return staticText13;
    }

    public void setStaticText13(StaticText st) {
        this.staticText13 = st;
    }
    private TableColumn tableColumn14 = new TableColumn();

    public TableColumn getTableColumn14() {
        return tableColumn14;
    }

    public void setTableColumn14(TableColumn tc) {
        this.tableColumn14 = tc;
    }
    private StaticText staticText14 = new StaticText();

    public StaticText getStaticText14() {
        return staticText14;
    }

    public void setStaticText14(StaticText st) {
        this.staticText14 = st;
    }
    private TableColumn tableColumn15 = new TableColumn();

    public TableColumn getTableColumn15() {
        return tableColumn15;
    }

    public void setTableColumn15(TableColumn tc) {
        this.tableColumn15 = tc;
    }
    private StaticText staticText15 = new StaticText();

    public StaticText getStaticText15() {
        return staticText15;
    }

    public void setStaticText15(StaticText st) {
        this.staticText15 = st;
    }
    private TableColumn tableColumn16 = new TableColumn();

    public TableColumn getTableColumn16() {
        return tableColumn16;
    }

    public void setTableColumn16(TableColumn tc) {
        this.tableColumn16 = tc;
    }
    private StaticText staticText16 = new StaticText();

    public StaticText getStaticText16() {
        return staticText16;
    }

    public void setStaticText16(StaticText st) {
        this.staticText16 = st;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public incluirEnderecoCliente() {
    }
    
    @EJB
    private PessoaRemote pessoaBean;
    private Endereco[] enderecos;
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
        super.init();

        try {
            _init();
        } catch (Exception e) {
            log("incluirEnderecoCliente Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
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

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }
    
    public void carregarEnderecos()
    {
        String idCliente = this.getSessionBean1().getLoginCliente();
        Pessoa cliente = new Pessoa();
        cliente.setLoginPes(idCliente);
        cliente = pessoaBean.getPessoaByLogin(cliente);
        
        List<Endereco> enderecosList = (List)cliente.getEnderecoCollection();
        this.setEnderecos(new Endereco[enderecosList.size()]);
        for (int i = 0; i < enderecosList.size(); i++){
            this.getEnderecos()[i] = new Endereco();
            this.getEnderecos()[i].setEndereco(enderecosList.get(i).getEndereco());
            this.getEnderecos()[i].setCep(enderecosList.get(i).getCep());
            this.getEnderecos()[i].setNumero(enderecosList.get(i).getNumero());
            this.getEnderecos()[i].setCidade(enderecosList.get(i).getCidade());
            this.getEnderecos()[i].setBairro(enderecosList.get(i).getBairro());
            this.getEnderecos()[i].setTipoEndereco(enderecosList.get(i).getTipoEndereco());
            this.getEnderecos()[i].setEstado(enderecosList.get(i).getEstado());
            this.getEnderecos()[i].setCodEndereco(enderecosList.get(i).getCodEndereco());
            this.getEnderecos()[i].setPais(enderecosList.get(i).getPais());
        }
    }

    public Endereco[] getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(Endereco[] enderecos) {
        this.enderecos = enderecos;
    }

    public String button1_action() {
        String idCliente = this.getSessionBean1().getLoginCliente();
        Pessoa cliente = new Pessoa();
        cliente.setLoginPes(idCliente);
        cliente = pessoaBean.getPessoaByLogin(cliente);
        
        Endereco end = new Endereco();
        if(this.tipoEndereco1.getText() != null && "".equalsIgnoreCase(this.tipoEndereco1.getText().toString()))
        end.setTipoEndereco(this.tipoEndereco1.getText().toString());
        if(this.endereco1.getText() != null && "".equalsIgnoreCase(this.endereco1.getText().toString()))
        end.setEndereco(this.endereco1.getText().toString());
        if(this.numEndereco1.getText() != null && "".equalsIgnoreCase(this.numEndereco1.getText().toString()))
        end.setNumero(Integer.parseInt(this.numEndereco1.getText().toString()));
        if(this.cep1.getText() != null && "".equalsIgnoreCase(this.cep1.getText().toString()) &&
           this.cep2.getText() != null && "".equalsIgnoreCase(this.cep2.getText().toString()))
        end.setCep((new StringBuilder()).append(this.cep1.getText().toString()).append(this.cep2.getText().toString()).toString());
        if(this.estado1.getText() != null && "".equalsIgnoreCase(this.estado1.getText().toString()))
        end.setEstado(this.estado1.getText().toString());
        if(this.pais1.getText() != null && "".equalsIgnoreCase(this.pais1.getText().toString()))
        end.setPais(this.pais1.getText().toString());
        if(this.cidade1.getText() != null && "".equalsIgnoreCase(this.cidade1.getText().toString()))
        end.setCidade(this.cidade1.getText().toString());
        if(this.bairro1.getText() != null && "".equalsIgnoreCase(this.bairro1.getText().toString()))
        end.setBairro(this.bairro1.getText().toString());
        end.setLoginEnd(cliente);
        cliente.getEnderecoCollection().add(end);
                
        if (pessoaBean.salvar(cliente))
            setMostraMensagemAviso("O endereço foi incluido com sucesso!");
        else{
            setMostraMensagemErro("Infelizmente seu endereço não foi incluido devido a uma instabilidade momentanea do sistema.");
            return null;
        }
        
        return null;
    }
    
    public boolean isMostraMensagem() {
        return mostraMensagem;
    }

    public void setMostraMensagemAviso(String msg) {
        getMsgIncluirEnderecoCliente().setText(msg);
        getMsgIncluirEnderecoCliente().setStyle("color: rgb(0, 0, 153); left: 192px; top: 96px; position: absolute");
        this.mostraMensagem = true;    
    }
//    
    public void setMostraMensagemErro(String msg) {
        getMsgIncluirEnderecoCliente().setText(msg);
        getMsgIncluirEnderecoCliente().setStyle("color: rgb(255, 51, 51); left: 192px; top: 96px; position: absolute");
        this.mostraMensagem = true;
    }
    
    public void setNaoMostraMensagemAviso() {
        this.mostraMensagem = false;
    }
    
}

