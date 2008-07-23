/*
 * configCliente.java
 *
 * Created on 14/07/2008, 15:29:29
 */
 
package comercioeletronicowar;

import br.com.ecommerce.entity.Endereco;
import br.com.ecommerce.entity.Pessoa;
import br.com.ecommerce.remote.PessoaRemote;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Checkbox;
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
import com.sun.webui.jsf.model.DefaultTableDataProvider;
import java.util.List;
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
public class configCliente extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    private Pessoa cliente = new Pessoa();
    
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
    private Label label1 = new Label();

    public Label getLabel1() {
        return label1;
    }

    public void setLabel1(Label l) {
        this.label1 = l;
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
    private Label label19 = new Label();

    public Label getLabel19() {
        return label19;
    }

    public void setLabel19(Label l) {
        this.label19 = l;
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
    private Label label25 = new Label();

    public Label getLabel25() {
        return label25;
    }

    public void setLabel25(Label l) {
        this.label25 = l;
    }
    private Label label26 = new Label();

    public Label getLabel26() {
        return label26;
    }

    public void setLabel26(Label l) {
        this.label26 = l;
    }
    private Checkbox checkbox1 = new Checkbox();

    public Checkbox getCheckbox1() {
        return checkbox1;
    }

    public void setCheckbox1(Checkbox c) {
        this.checkbox1 = c;
    }
    private Label label28 = new Label();

    public Label getLabel28() {
        return label28;
    }

    public void setLabel28(Label l) {
        this.label28 = l;
    }
    private Label dataNascimento = new Label();

    public Label getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Label l) {
        this.dataNascimento = l;
    }
    private Label login = new Label();

    public Label getLogin() {
        return login;
    }

    public void setLogin(Label l) {
        this.login = l;
    }
    private Label emailPrincipal = new Label();

    public Label getEmailPrincipal() {
        return emailPrincipal;
    }

    public void setEmailPrincipal(Label l) {
        this.emailPrincipal = l;
    }
    private Label nomeCompleto = new Label();

    public Label getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(Label l) {
        this.nomeCompleto = l;
    }
    private Label emailSecundario = new Label();

    public Label getEmailSecundario() {
        return emailSecundario;
    }

    public void setEmailSecundario(Label l) {
        this.emailSecundario = l;
    }
    private Label cpf = new Label();

    public Label getCpf() {
        return cpf;
    }

    public void setCpf(Label l) {
        this.cpf = l;
    }
    private Label telFixo1 = new Label();

    public Label getTelFixo1() {
        return telFixo1;
    }

    public void setTelFixo1(Label l) {
        this.telFixo1 = l;
    }
    private Label dddFixo1 = new Label();

    public Label getDddFixo1() {
        return dddFixo1;
    }

    public void setDddFixo1(Label l) {
        this.dddFixo1 = l;
    }
    private Label ramalFixo1 = new Label();

    public Label getRamalFixo1() {
        return ramalFixo1;
    }

    public void setRamalFixo1(Label l) {
        this.ramalFixo1 = l;
    }
    private Label ramalFixo2 = new Label();

    public Label getRamalFixo2() {
        return ramalFixo2;
    }

    public void setRamalFixo2(Label l) {
        this.ramalFixo2 = l;
    }
    private Label dddFixo2 = new Label();

    public Label getDddFixo2() {
        return dddFixo2;
    }

    public void setDddFixo2(Label l) {
        this.dddFixo2 = l;
    }
    private Label telFixo2 = new Label();

    public Label getTelFixo2() {
        return telFixo2;
    }

    public void setTelFixo2(Label l) {
        this.telFixo2 = l;
    }
    private Label celular = new Label();

    public Label getCelular() {
        return celular;
    }

    public void setCelular(Label l) {
        this.celular = l;
    }
    private Label dddCelular = new Label();

    public Label getDddCelular() {
        return dddCelular;
    }

    public void setDddCelular(Label l) {
        this.dddCelular = l;
    }
    private Label label2 = new Label();

    public Label getLabel2() {
        return label2;
    }

    public void setLabel2(Label l) {
        this.label2 = l;
    }
    private Table tabEnderecos = new Table();

    public Table getTabEnderecos() {
        return tabEnderecos;
    }

    public void setTabEnderecos(Table t) {
        this.tabEnderecos = t;
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
    private Hyperlink hyperlink3 = new Hyperlink();

    public Hyperlink getHyperlink3() {
        return hyperlink3;
    }

    public void setHyperlink3(Hyperlink h) {
        this.hyperlink3 = h;
    }

    // </editor-fold>

    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public configCliente() {
    }
    
    @EJB
    PessoaRemote pessoaBean;
    private Endereco[] enderecos;

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
//        getLogin().setText(recuperarCliente.getLoginPes());
//        getLogin().setValue(recuperarCliente.getLoginPes());
//        getEmailPrincipal().setText(recuperarCliente.getEmail());
//        getEmailSecundario().setText(recuperarCliente.getEmail());
//        getDataNascimento().setText(recuperarCliente.getDataNasc());
//        getNomeCompleto().setText(recuperarCliente.getNome());
//        getCpf().setText(recuperarCliente.getCpf());
//        getTelFixo1().setText(recuperarCliente.getTelefone());
//        getDddFixo1().setText(recuperarCliente.getDddtelefone());
//        getRamalFixo1().setText(recuperarCliente.getRamal());
//        getTelFixo2().setText(recuperarCliente.getTelefone());
//        getDddFixo2().setText(recuperarCliente.getDddtelefone());
//        getRamalFixo2().setText(recuperarCliente.getRamal());
//        getCelular().setText(recuperarCliente.getCelular());
//        getDddCelular().setText(recuperarCliente.getDddcelular());
                
        this.carregarEnderecos();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("configCliente Initialization Failure", e);
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

    public void senha1_processValueChange(ValueChangeEvent event) {
    }

    public void login1_processValueChange(ValueChangeEvent event) {
    }
    
    public void carregarEnderecos()
    {
        Pessoa recuperarCliente = recuperaCliente();
               
        List<Endereco> enderecosList = (List)recuperarCliente.getEnderecoCollection();
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
    
}

