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
    private PanelLayout layoutPanelAlterar = new PanelLayout();

    public PanelLayout getLayoutPanelAlterar() {
        return layoutPanelAlterar;
    }

    public void setLayoutPanelAlterar(PanelLayout pl) {
        this.layoutPanelAlterar = pl;
    }
    private Tab tabAlterar = new Tab();

    public Tab getTabAlterar() {
        return tabAlterar;
    }

    public void setTabAlterar(Tab t) {
        this.tabAlterar = t;
    }
    private Label lblCodProdAlt = new Label();

    public Label getLblCodProdAlt() {
        return lblCodProdAlt;
    }

    public void setLblCodProdAlt(Label l) {
        this.lblCodProdAlt = l;
    }
    private TextField txtFldCodProdAlt = new TextField();

    public TextField getTxtFldCodProdAlt() {
        return txtFldCodProdAlt;
    }

    public void setTxtFldCodProdAlt(TextField tf) {
        this.txtFldCodProdAlt = tf;
    }
    private Label lblNomeProdAlt = new Label();

    public Label getLblNomeProdAlt() {
        return lblNomeProdAlt;
    }

    public void setLblNomeProdAlt(Label l) {
        this.lblNomeProdAlt = l;
    }
    private TextField txtFldNomeProdAlt = new TextField();

    public TextField getTxtFldNomeProdAlt() {
        return txtFldNomeProdAlt;
    }

    public void setTxtFldNomeProdAlt(TextField tf) {
        this.txtFldNomeProdAlt = tf;
    }
    private Label lblDescDetAlt = new Label();

    public Label getLblDescDetAlt() {
        return lblDescDetAlt;
    }

    public void setLblDescDetAlt(Label l) {
        this.lblDescDetAlt = l;
    }
    private TextArea txtFldDescrDetalhadaAlt = new TextArea();

    public TextArea getTxtFldDescrDetalhadaAlt() {
        return txtFldDescrDetalhadaAlt;
    }

    public void setTxtFldDescrDetalhadaAlt(TextArea ta) {
        this.txtFldDescrDetalhadaAlt = ta;
    }
    private Label lblDadosTecnicosAlt = new Label();

    public Label getLblDadosTecnicosAlt() {
        return lblDadosTecnicosAlt;
    }

    public void setLblDadosTecnicosAlt(Label l) {
        this.lblDadosTecnicosAlt = l;
    }
    private TextArea txtFldDadosTecnicosAlt = new TextArea();

    public TextArea getTxtFldDadosTecnicosAlt() {
        return txtFldDadosTecnicosAlt;
    }

    public void setTxtFldDadosTecnicosAlt(TextArea ta) {
        this.txtFldDadosTecnicosAlt = ta;
    }
    private Label lblCategoriaAlt = new Label();

    public Label getLblCategoriaAlt() {
        return lblCategoriaAlt;
    }

    public void setLblCategoriaAlt(Label l) {
        this.lblCategoriaAlt = l;
    }
    private TextField txtFldCategoriaAlt = new TextField();

    public TextField getTxtFldCategoriaAlt() {
        return txtFldCategoriaAlt;
    }

    public void setTxtFldCategoriaAlt(TextField tf) {
        this.txtFldCategoriaAlt = tf;
    }
    private Label lblQtdEstoqueAlt = new Label();

    public Label getLblQtdEstoqueAlt() {
        return lblQtdEstoqueAlt;
    }

    public void setLblQtdEstoqueAlt(Label l) {
        this.lblQtdEstoqueAlt = l;
    }
    private TextField txtFldQtdeEstoqueAlt = new TextField();

    public TextField getTxtFldQtdeEstoqueAlt() {
        return txtFldQtdeEstoqueAlt;
    }

    public void setTxtFldQtdeEstoqueAlt(TextField tf) {
        this.txtFldQtdeEstoqueAlt = tf;
    }
    private Label lblQtdCompradaAlt = new Label();

    public Label getLblQtdCompradaAlt() {
        return lblQtdCompradaAlt;
    }

    public void setLblQtdCompradaAlt(Label l) {
        this.lblQtdCompradaAlt = l;
    }
    private TextField txtFldQtdeCompradaAlt = new TextField();

    public TextField getTxtFldQtdeCompradaAlt() {
        return txtFldQtdeCompradaAlt;
    }

    public void setTxtFldQtdeCompradaAlt(TextField tf) {
        this.txtFldQtdeCompradaAlt = tf;
    }
    private Label lblPrecoUnitAlt = new Label();

    public Label getLblPrecoUnitAlt() {
        return lblPrecoUnitAlt;
    }

    public void setLblPrecoUnitAlt(Label l) {
        this.lblPrecoUnitAlt = l;
    }
    private TextField txtFldPrecoUnitAlt = new TextField();

    public TextField getTxtFldPrecoUnitAlt() {
        return txtFldPrecoUnitAlt;
    }

    public void setTxtFldPrecoUnitAlt(TextField tf) {
        this.txtFldPrecoUnitAlt = tf;
    }
    private Label lblQtdVisualizAlt = new Label();

    public Label getLblQtdVisualizAlt() {
        return lblQtdVisualizAlt;
    }

    public void setLblQtdVisualizAlt(Label l) {
        this.lblQtdVisualizAlt = l;
    }
    private TextField txtFldQtdVisualizAlt = new TextField();

    public TextField getTxtFldQtdVisualizAlt() {
        return txtFldQtdVisualizAlt;
    }

    public void setTxtFldQtdVisualizAlt(TextField tf) {
        this.txtFldQtdVisualizAlt = tf;
    }
    private Label lblImagemAlt = new Label();

    public Label getLblImagemAlt() {
        return lblImagemAlt;
    }

    public void setLblImagemAlt(Label l) {
        this.lblImagemAlt = l;
    }
    private TextField txtFldImagemAlt = new TextField();

    public TextField getTxtFldImagemAlt() {
        return txtFldImagemAlt;
    }

    public void setTxtFldImagemAlt(TextField tf) {
        this.txtFldImagemAlt = tf;
    }
    private Label lblMensagemAlter = new Label();

    public Label getLblMensagemAlter() {
        return lblMensagemAlter;
    }

    public void setLblMensagemAlter(Label l) {
        this.lblMensagemAlter = l;
    }
    private Button buttonAlterar = new Button();

    public Button getButtonAlterar() {
        return buttonAlterar;
    }

    public void setButtonAlterar(Button b) {
        this.buttonAlterar = b;
    }
    private Button btnCancelarAlter = new Button();

    public Button getBtnCancelarAlter() {
        return btnCancelarAlter;
    }

    public void setBtnCancelarAlter(Button b) {
        this.btnCancelarAlter = b;
    }
    private Tab tabExcluir = new Tab();

    public Tab getTabExcluir() {
        return tabExcluir;
    }

    public void setTabExcluir(Tab t) {
        this.tabExcluir = t;
    }
    private PanelLayout layoutPanelExcluir = new PanelLayout();

    public PanelLayout getLayoutPanelExcluir() {
        return layoutPanelExcluir;
    }

    public void setLayoutPanelExcluir(PanelLayout pl) {
        this.layoutPanelExcluir = pl;
    }
    private Label lblCodProdExcl = new Label();

    public Label getLblCodProdExcl() {
        return lblCodProdExcl;
    }

    public void setLblCodProdExcl(Label l) {
        this.lblCodProdExcl = l;
    }
    private TextField txtFldCodProdExcl = new TextField();

    public TextField getTxtFldCodProdExcl() {
        return txtFldCodProdExcl;
    }

    public void setTxtFldCodProdExcl(TextField tf) {
        this.txtFldCodProdExcl = tf;
    }
    private Label lblNomeProdExcl = new Label();

    public Label getLblNomeProdExcl() {
        return lblNomeProdExcl;
    }

    public void setLblNomeProdExcl(Label l) {
        this.lblNomeProdExcl = l;
    }
    private TextField txtFldNomeProdutoExcl = new TextField();

    public TextField getTxtFldNomeProdutoExcl() {
        return txtFldNomeProdutoExcl;
    }

    public void setTxtFldNomeProdutoExcl(TextField tf) {
        this.txtFldNomeProdutoExcl = tf;
    }
    private Label lblDescDetalhadExcl = new Label();

    public Label getLblDescDetalhadExcl() {
        return lblDescDetalhadExcl;
    }

    public void setLblDescDetalhadExcl(Label l) {
        this.lblDescDetalhadExcl = l;
    }
    private TextArea txtFldDescrDetalhadaExcl = new TextArea();

    public TextArea getTxtFldDescrDetalhadaExcl() {
        return txtFldDescrDetalhadaExcl;
    }

    public void setTxtFldDescrDetalhadaExcl(TextArea ta) {
        this.txtFldDescrDetalhadaExcl = ta;
    }
    private Label lblDadosTecnicosExcl = new Label();

    public Label getLblDadosTecnicosExcl() {
        return lblDadosTecnicosExcl;
    }

    public void setLblDadosTecnicosExcl(Label l) {
        this.lblDadosTecnicosExcl = l;
    }
    private TextArea txtFldDadosTecnicosExcl = new TextArea();

    public TextArea getTxtFldDadosTecnicosExcl() {
        return txtFldDadosTecnicosExcl;
    }

    public void setTxtFldDadosTecnicosExcl(TextArea ta) {
        this.txtFldDadosTecnicosExcl = ta;
    }
    private Label lblCategoriaExcl = new Label();

    public Label getLblCategoriaExcl() {
        return lblCategoriaExcl;
    }

    public void setLblCategoriaExcl(Label l) {
        this.lblCategoriaExcl = l;
    }
    private TextField txtFldCategoriaExcl = new TextField();

    public TextField getTxtFldCategoriaExcl() {
        return txtFldCategoriaExcl;
    }

    public void setTxtFldCategoriaExcl(TextField tf) {
        this.txtFldCategoriaExcl = tf;
    }
    private Label lblQtdEstoqueExcl = new Label();

    public Label getLblQtdEstoqueExcl() {
        return lblQtdEstoqueExcl;
    }

    public void setLblQtdEstoqueExcl(Label l) {
        this.lblQtdEstoqueExcl = l;
    }
    private TextField txtFldQtdeEstoqueExcl = new TextField();

    public TextField getTxtFldQtdeEstoqueExcl() {
        return txtFldQtdeEstoqueExcl;
    }

    public void setTxtFldQtdeEstoqueExcl(TextField tf) {
        this.txtFldQtdeEstoqueExcl = tf;
    }
    private Label lblQtdeCompradaExcl = new Label();

    public Label getLblQtdeCompradaExcl() {
        return lblQtdeCompradaExcl;
    }

    public void setLblQtdeCompradaExcl(Label l) {
        this.lblQtdeCompradaExcl = l;
    }
    private TextField txtFldQtdeCompradaExcl = new TextField();

    public TextField getTxtFldQtdeCompradaExcl() {
        return txtFldQtdeCompradaExcl;
    }

    public void setTxtFldQtdeCompradaExcl(TextField tf) {
        this.txtFldQtdeCompradaExcl = tf;
    }
    private Label lblPrecoUnitExcl = new Label();

    public Label getLblPrecoUnitExcl() {
        return lblPrecoUnitExcl;
    }

    public void setLblPrecoUnitExcl(Label l) {
        this.lblPrecoUnitExcl = l;
    }
    private TextField txtFldPrecoUnitExcl = new TextField();

    public TextField getTxtFldPrecoUnitExcl() {
        return txtFldPrecoUnitExcl;
    }

    public void setTxtFldPrecoUnitExcl(TextField tf) {
        this.txtFldPrecoUnitExcl = tf;
    }
    private Label lblQtdeVisualizExcl = new Label();

    public Label getLblQtdeVisualizExcl() {
        return lblQtdeVisualizExcl;
    }

    public void setLblQtdeVisualizExcl(Label l) {
        this.lblQtdeVisualizExcl = l;
    }
    private TextField txtFldQtdeVisualizExcl = new TextField();

    public TextField getTxtFldQtdeVisualizExcl() {
        return txtFldQtdeVisualizExcl;
    }

    public void setTxtFldQtdeVisualizExcl(TextField tf) {
        this.txtFldQtdeVisualizExcl = tf;
    }
    private Label lblImagemExcl = new Label();

    public Label getLblImagemExcl() {
        return lblImagemExcl;
    }

    public void setLblImagemExcl(Label l) {
        this.lblImagemExcl = l;
    }
    private ImageComponent imageExcl = new ImageComponent();

    public ImageComponent getImageExcl() {
        return imageExcl;
    }

    public void setImageExcl(ImageComponent ic) {
        this.imageExcl = ic;
    }
    private Label lblMensagemExcl = new Label();

    public Label getLblMensagemExcl() {
        return lblMensagemExcl;
    }

    public void setLblMensagemExcl(Label l) {
        this.lblMensagemExcl = l;
    }
    private Button buttonExcluir = new Button();

    public Button getButtonExcluir() {
        return buttonExcluir;
    }

    public void setButtonExcluir(Button b) {
        this.buttonExcluir = b;
    }
    private Button btnCancelarExcl = new Button();

    public Button getBtnCancelarExcl() {
        return btnCancelarExcl;
    }

    public void setBtnCancelarExcl(Button b) {
        this.btnCancelarExcl = b;
    }
    private Label lblCodProdCons = new Label();

    public Label getLblCodProdCons() {
        return lblCodProdCons;
    }

    public void setLblCodProdCons(Label l) {
        this.lblCodProdCons = l;
    }
    private TextField txtFldCodProdCons = new TextField();

    public TextField getTxtFldCodProdCons() {
        return txtFldCodProdCons;
    }

    public void setTxtFldCodProdCons(TextField tf) {
        this.txtFldCodProdCons = tf;
    }
    private Label lblNomeProdCons = new Label();

    public Label getLblNomeProdCons() {
        return lblNomeProdCons;
    }

    public void setLblNomeProdCons(Label l) {
        this.lblNomeProdCons = l;
    }
    private TextField txtFldNomeProdutoCons = new TextField();

    public TextField getTxtFldNomeProdutoCons() {
        return txtFldNomeProdutoCons;
    }

    public void setTxtFldNomeProdutoCons(TextField tf) {
        this.txtFldNomeProdutoCons = tf;
    }
    private Label lblDescDetalhadCons = new Label();

    public Label getLblDescDetalhadCons() {
        return lblDescDetalhadCons;
    }

    public void setLblDescDetalhadCons(Label l) {
        this.lblDescDetalhadCons = l;
    }
    private TextArea txtFldDescrDetalhadaCons = new TextArea();

    public TextArea getTxtFldDescrDetalhadaCons() {
        return txtFldDescrDetalhadaCons;
    }

    public void setTxtFldDescrDetalhadaCons(TextArea ta) {
        this.txtFldDescrDetalhadaCons = ta;
    }
    private Label lblDadosTecnicosCons = new Label();

    public Label getLblDadosTecnicosCons() {
        return lblDadosTecnicosCons;
    }

    public void setLblDadosTecnicosCons(Label l) {
        this.lblDadosTecnicosCons = l;
    }
    private TextArea txtFldDadosTecnicosCons = new TextArea();

    public TextArea getTxtFldDadosTecnicosCons() {
        return txtFldDadosTecnicosCons;
    }

    public void setTxtFldDadosTecnicosCons(TextArea ta) {
        this.txtFldDadosTecnicosCons = ta;
    }
    private Label lblCategoriaCons = new Label();

    public Label getLblCategoriaCons() {
        return lblCategoriaCons;
    }

    public void setLblCategoriaCons(Label l) {
        this.lblCategoriaCons = l;
    }
    private TextField txtFldCategoriaCons = new TextField();

    public TextField getTxtFldCategoriaCons() {
        return txtFldCategoriaCons;
    }

    public void setTxtFldCategoriaCons(TextField tf) {
        this.txtFldCategoriaCons = tf;
    }
    private Label lblQtdEstoqueCons = new Label();

    public Label getLblQtdEstoqueCons() {
        return lblQtdEstoqueCons;
    }

    public void setLblQtdEstoqueCons(Label l) {
        this.lblQtdEstoqueCons = l;
    }
    private TextField txtFldQtdeEstoqueCons = new TextField();

    public TextField getTxtFldQtdeEstoqueCons() {
        return txtFldQtdeEstoqueCons;
    }

    public void setTxtFldQtdeEstoqueCons(TextField tf) {
        this.txtFldQtdeEstoqueCons = tf;
    }
    private Label lblQtdeCompradaCons = new Label();

    public Label getLblQtdeCompradaCons() {
        return lblQtdeCompradaCons;
    }

    public void setLblQtdeCompradaCons(Label l) {
        this.lblQtdeCompradaCons = l;
    }
    private TextField txtFldQtdeCompradaCons = new TextField();

    public TextField getTxtFldQtdeCompradaCons() {
        return txtFldQtdeCompradaCons;
    }

    public void setTxtFldQtdeCompradaCons(TextField tf) {
        this.txtFldQtdeCompradaCons = tf;
    }
    private Label lblPrecoUnitCons = new Label();

    public Label getLblPrecoUnitCons() {
        return lblPrecoUnitCons;
    }

    public void setLblPrecoUnitCons(Label l) {
        this.lblPrecoUnitCons = l;
    }
    private TextField txtFldPrecoUnitCons = new TextField();

    public TextField getTxtFldPrecoUnitCons() {
        return txtFldPrecoUnitCons;
    }

    public void setTxtFldPrecoUnitCons(TextField tf) {
        this.txtFldPrecoUnitCons = tf;
    }
    private Label lblQtdeVisualizCons = new Label();

    public Label getLblQtdeVisualizCons() {
        return lblQtdeVisualizCons;
    }

    public void setLblQtdeVisualizCons(Label l) {
        this.lblQtdeVisualizCons = l;
    }
    private TextField txtFldQtdeVisualizCons = new TextField();

    public TextField getTxtFldQtdeVisualizCons() {
        return txtFldQtdeVisualizCons;
    }

    public void setTxtFldQtdeVisualizCons(TextField tf) {
        this.txtFldQtdeVisualizCons = tf;
    }
    private Label lblImagemCons = new Label();

    public Label getLblImagemCons() {
        return lblImagemCons;
    }

    public void setLblImagemCons(Label l) {
        this.lblImagemCons = l;
    }
    private ImageComponent imageConsulta = new ImageComponent();

    public ImageComponent getImageConsulta() {
        return imageConsulta;
    }

    public void setImageConsulta(ImageComponent ic) {
        this.imageConsulta = ic;
    }
    private Button buttonOK = new Button();

    public Button getButtonOK() {
        return buttonOK;
    }

    public void setButtonOK(Button b) {
        this.buttonOK = b;
    }
    private Tab tabConsultar = new Tab();

    public Tab getTabConsultar() {
        return tabConsultar;
    }

    public void setTabConsultar(Tab t) {
        this.tabConsultar = t;
    }
    private PanelLayout layoutPanelConsulta = new PanelLayout();

    public PanelLayout getLayoutPanelConsulta() {
        return layoutPanelConsulta;
    }

    public void setLayoutPanelConsulta(PanelLayout pl) {
        this.layoutPanelConsulta = pl;
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

    public String buttonIncluir_action()  {

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

