/*
 * consultarAdministradores.java
 *
 * Created on Jun 14, 2008, 1:30:09 PM
 */
 
package comercioeletronicowar;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Button;
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
import com.sun.webui.jsf.component.TextField;
import com.sun.webui.jsf.model.DefaultTableDataProvider;
import javax.faces.FacesException;
import comercioeletronicowar.SessionBean1;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author sronly
 */
public class consultarAdministradores extends AbstractPageBean {
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
    private DefaultTableDataProvider defaultTableDataProvider = new DefaultTableDataProvider();

    public DefaultTableDataProvider getDefaultTableDataProvider() {
        return defaultTableDataProvider;
    }

    public void setDefaultTableDataProvider(DefaultTableDataProvider dtdp) {
        this.defaultTableDataProvider = dtdp;
    }
    private TableColumn tableColumn1 = new TableColumn();

    public TableColumn getTableColumn1() {
        return tableColumn1;
    }

    public void setTableColumn1(TableColumn tc) {
        this.tableColumn1 = tc;
    }
    private StaticText staticText1 = new StaticText();

    public StaticText getStaticText1() {
        return staticText1;
    }

    public void setStaticText1(StaticText st) {
        this.staticText1 = st;
    }
    private TableColumn tableColumn2 = new TableColumn();

    public TableColumn getTableColumn2() {
        return tableColumn2;
    }

    public void setTableColumn2(TableColumn tc) {
        this.tableColumn2 = tc;
    }
    private StaticText staticText2 = new StaticText();

    public StaticText getStaticText2() {
        return staticText2;
    }

    public void setStaticText2(StaticText st) {
        this.staticText2 = st;
    }
    private TableColumn tableColumn3 = new TableColumn();

    public TableColumn getTableColumn3() {
        return tableColumn3;
    }

    public void setTableColumn3(TableColumn tc) {
        this.tableColumn3 = tc;
    }
    private StaticText staticText3 = new StaticText();

    public StaticText getStaticText3() {
        return staticText3;
    }

    public void setStaticText3(StaticText st) {
        this.staticText3 = st;
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
    private TextField textField1 = new TextField();

    public TextField getTextField1() {
        return textField1;
    }

    public void setTextField1(TextField tf) {
        this.textField1 = tf;
    }
    private Label label3 = new Label();

    public Label getLabel3() {
        return label3;
    }

    public void setLabel3(Label l) {
        this.label3 = l;
    }
    private TextField textField2 = new TextField();

    public TextField getTextField2() {
        return textField2;
    }

    public void setTextField2(TextField tf) {
        this.textField2 = tf;
    }
    private TextField textField3 = new TextField();

    public TextField getTextField3() {
        return textField3;
    }

    public void setTextField3(TextField tf) {
        this.textField3 = tf;
    }
    private Label label4 = new Label();

    public Label getLabel4() {
        return label4;
    }

    public void setLabel4(Label l) {
        this.label4 = l;
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
    public consultarAdministradores() {
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
            log("consultarAdministradores Initialization Failure", e);
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

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected carrinhoDeProdutos getcarrinhoDeProdutos() {
        return (carrinhoDeProdutos) getBean("carrinhoDeProdutos");
    }
    
}

