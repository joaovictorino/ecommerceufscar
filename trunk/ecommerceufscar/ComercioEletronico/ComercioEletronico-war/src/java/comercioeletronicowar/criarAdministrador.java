package comercioeletronicowar;

import br.com.ecommerce.bean.PessoaRemote;
import br.com.ecommerce.entity.*;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.*;
import com.sun.webui.jsf.model.Option;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;
//            RequestBean1, ApplicationBean1, SessionBean1

public class criarAdministrador extends AbstractPageBean
{
    
    @EJB
    private PessoaRemote pessoaBean;
    
    private void _init()
        throws Exception
    {
        Option List[] = new Option[4];
        List[0] = new Option("", "Selecione");
        List[1] = new Option("Rua", "Rua");
        List[2] = new Option("Avenida", "Avenida");
        List[3]
                = new Option("Alameda", "Alameda");
        ddlTipoEndDefaultOptions.setOptions(List);
    }

    public Page getPage1()
    {
        return page1;
    }

    public void setPage1(Page p)
    {
        page1 = p;
    }

    public Html getHtml1()
    {
        return html1;
    }

    public void setHtml1(Html h)
    {
        html1 = h;
    }

    public Head getHead1()
    {
        return head1;
    }

    public void setHead1(Head h)
    {
        head1 = h;
    }

    public Link getLink1()
    {
        return link1;
    }

    public void setLink1(Link l)
    {
        link1 = l;
    }

    public Body getBody1()
    {
        return body1;
    }

    public void setBody1(Body b)
    {
        body1 = b;
    }

    public Form getForm1()
    {
        return form1;
    }

    public void setForm1(Form f)
    {
        form1 = f;
    }

    public TextField getTxtLogin()
    {
        return txtLogin;
    }

    public void setTxtLogin(TextField tf)
    {
        txtLogin = tf;
    }

    public Label getLblSenha()
    {
        return lblSenha;
    }

    public void setLblSenha(Label l)
    {
        lblSenha = l;
    }

    public PasswordField getTxtSenha()
    {
        return txtSenha;
    }

    public void setTxtSenha(PasswordField pf)
    {
        txtSenha = pf;
    }

    public TextField getTxtNome()
    {
        return txtNome;
    }

    public void setTxtNome(TextField tf)
    {
        txtNome = tf;
    }

    public TextField getTxtCPF()
    {
        return txtCPF;
    }

    public void setTxtCPF(TextField tf)
    {
        txtCPF = tf;
    }

    public TextField getTxtRG()
    {
        return txtRG;
    }

    public void setTxtRG(TextField tf)
    {
        txtRG = tf;
    }

    public TextField getTxtOrgaoExp()
    {
        return txtOrgaoExp;
    }

    public void setTxtOrgaoExp(TextField tf)
    {
        txtOrgaoExp = tf;
    }

    public TextField getTxtFrase()
    {
        return txtFrase;
    }

    public void setTxtFrase(TextField tf)
    {
        txtFrase = tf;
    }

    public TextField getTxtTitulo()
    {
        return txtTitulo;
    }

    public void setTxtTitulo(TextField tf)
    {
        txtTitulo = tf;
    }

    public Label getLblCPF()
    {
        return lblCPF;
    }

    public void setLblCPF(Label l)
    {
        lblCPF = l;
    }

    public Label getLblNome()
    {
        return lblNome;
    }

    public void setLblNome(Label l)
    {
        lblNome = l;
    }

    public Label getLblRG()
    {
        return lblRG;
    }

    public void setLblRG(Label l)
    {
        lblRG = l;
    }

    public Label getLblLogin()
    {
        return lblLogin;
    }

    public void setLblLogin(Label l)
    {
        lblLogin = l;
    }

    public Label getLblOrgaoExp()
    {
        return lblOrgaoExp;
    }

    public void setLblOrgaoExp(Label l)
    {
        lblOrgaoExp = l;
    }

    public Calendar getTxtDataExp()
    {
        return txtDataExp;
    }

    public void setTxtDataExp(Calendar c)
    {
        txtDataExp = c;
    }

    public Label getLblDataExp()
    {
        return lblDataExp;
    }

    public void setLblDataExp(Label l)
    {
        lblDataExp = l;
    }

    public Label getLblPassaporte()
    {
        return lblPassaporte;
    }

    public void setLblPassaporte(Label l)
    {
        lblPassaporte = l;
    }

    public Label getLblTitulo()
    {
        return lblTitulo;
    }

    public void setLblTitulo(Label l)
    {
        lblTitulo = l;
    }

    public Label getLblFrase()
    {
        return lblFrase;
    }

    public void setLblFrase(Label l)
    {
        lblFrase = l;
    }

    public TextField getTxtDDDCelular()
    {
        return txtDDDCelular;
    }

    public void setTxtDDDCelular(TextField tf)
    {
        txtDDDCelular = tf;
    }

    public Label getLblCelular()
    {
        return lblCelular;
    }

    public void setLblCelular(Label l)
    {
        lblCelular = l;
    }

    public TextField getTxtRamal()
    {
        return txtRamal;
    }

    public void setTxtRamal(TextField tf)
    {
        txtRamal = tf;
    }

    public TextField getTxtTelefone()
    {
        return txtTelefone;
    }

    public void setTxtTelefone(TextField tf)
    {
        txtTelefone = tf;
    }

    public TextField getTxtDDDTelefone()
    {
        return txtDDDTelefone;
    }

    public void setTxtDDDTelefone(TextField tf)
    {
        txtDDDTelefone = tf;
    }

    public TextField getTxtCelular()
    {
        return txtCelular;
    }

    public void setTxtCelular(TextField tf)
    {
        txtCelular = tf;
    }

    public Label getLblTelefone()
    {
        return lblTelefone;
    }

    public void setLblTelefone(Label l)
    {
        lblTelefone = l;
    }

    public Label getLblRamal()
    {
        return lblRamal;
    }

    public void setLblRamal(Label l)
    {
        lblRamal = l;
    }

    public Calendar getTxtDataNasc()
    {
        return txtDataNasc;
    }

    public void setTxtDataNasc(Calendar c)
    {
        txtDataNasc = c;
    }

    public Label getLblDataNasc()
    {
        return lblDataNasc;
    }

    public void setLblDataNasc(Label l)
    {
        lblDataNasc = l;
    }

    public Label getLblTipoEnd()
    {
        return lblTipoEnd;
    }

    public void setLblTipoEnd(Label l)
    {
        lblTipoEnd = l;
    }

    public Label getLblEndereco()
    {
        return lblEndereco;
    }

    public void setLblEndereco(Label l)
    {
        lblEndereco = l;
    }

    public Label getLblBairro()
    {
        return lblBairro;
    }

    public void setLblBairro(Label l)
    {
        lblBairro = l;
    }

    public Label getLblCidade()
    {
        return lblCidade;
    }

    public void setLblCidade(Label l)
    {
        lblCidade = l;
    }

    public Label getLblEstado()
    {
        return lblEstado;
    }

    public void setLblEstado(Label l)
    {
        lblEstado = l;
    }

    public Label getLblNumero()
    {
        return lblNumero;
    }

    public void setLblNumero(Label l)
    {
        lblNumero = l;
    }

    public Label getLblCEP()
    {
        return lblCEP;
    }

    public void setLblCEP(Label l)
    {
        lblCEP = l;
    }

    public Label getLblPais()
    {
        return lblPais;
    }

    public void setLblPais(Label l)
    {
        lblPais = l;
    }

    public DropDown getDdlTipoEnd()
    {
        return ddlTipoEnd;
    }

    public void setDdlTipoEnd(DropDown dd)
    {
        ddlTipoEnd = dd;
    }

    public SingleSelectOptionsList getDdlTipoEndDefaultOptions()
    {
        return ddlTipoEndDefaultOptions;
    }

    public void setDdlTipoEndDefaultOptions(SingleSelectOptionsList ssol)
    {
        ddlTipoEndDefaultOptions = ssol;
    }

    public TextField getTxtEndereco()
    {
        return txtEndereco;
    }

    public void setTxtEndereco(TextField tf)
    {
        txtEndereco = tf;
    }

    public TextField getTxtNumero()
    {
        return txtNumero;
    }

    public void setTxtNumero(TextField tf)
    {
        txtNumero = tf;
    }

    public TextField getTxtPais()
    {
        return txtPais;
    }

    public void setTxtPais(TextField tf)
    {
        txtPais = tf;
    }

    public TextField getTxtCep1()
    {
        return txtCep1;
    }

    public void setTxtCep1(TextField tf)
    {
        txtCep1 = tf;
    }

    public TextField getTxtEstado()
    {
        return txtEstado;
    }

    public void setTxtEstado(TextField tf)
    {
        txtEstado = tf;
    }

    public TextField getTxtCidade()
    {
        return txtCidade;
    }

    public void setTxtCidade(TextField tf)
    {
        txtCidade = tf;
    }

    public TextField getTxtBairro()
    {
        return txtBairro;
    }

    public void setTxtBairro(TextField tf)
    {
        txtBairro = tf;
    }

    public TextField getTxtEmail()
    {
        return txtEmail;
    }

    public void setTxtEmail(TextField tf)
    {
        txtEmail = tf;
    }

    public Label getLblEmail()
    {
        return lblEmail;
    }

    public void setLblEmail(Label l)
    {
        lblEmail = l;
    }

    public Button getBtnSalvar()
    {
        return btnSalvar;
    }

    public void setBtnSalvar(Button b)
    {
        btnSalvar = b;
    }

    public Label getLabel5()
    {
        return label5;
    }

    public void setLabel5(Label l)
    {
        label5 = l;
    }

    public TextField getTxtCep2()
    {
        return txtCep2;
    }

    public void setTxtCep2(TextField tf)
    {
        txtCep2 = tf;
    }

    public TextField getTxtPassaporte()
    {
        return txtPassaporte;
    }

    public void setTxtPassaporte(TextField tf)
    {
        txtPassaporte = tf;
    }

    public Label getLblResultado()
    {
        return lblResultado;
    }

    public void setLblResultado(Label l)
    {
        lblResultado = l;
    }

    public criarAdministrador()
    {
        page1 = new Page();
        html1 = new Html();
        head1 = new Head();
        link1 = new Link();
        body1 = new Body();
        form1 = new Form();
        txtLogin = new TextField();
        lblSenha = new Label();
        txtSenha = new PasswordField();
        txtNome = new TextField();
        txtCPF = new TextField();
        txtRG = new TextField();
        txtOrgaoExp = new TextField();
        txtFrase = new TextField();
        txtTitulo = new TextField();
        lblCPF = new Label();
        lblNome = new Label();
        lblRG = new Label();
        lblLogin = new Label();
        lblOrgaoExp = new Label();
        txtDataExp = new Calendar();
        lblDataExp = new Label();
        lblPassaporte = new Label();
        lblTitulo = new Label();
        lblFrase = new Label();
        txtDDDCelular = new TextField();
        lblCelular = new Label();
        txtRamal = new TextField();
        txtTelefone = new TextField();
        txtDDDTelefone = new TextField();
        txtCelular = new TextField();
        lblTelefone = new Label();
        lblRamal = new Label();
        txtDataNasc = new Calendar();
        lblDataNasc = new Label();
        lblTipoEnd = new Label();
        lblEndereco = new Label();
        lblBairro = new Label();
        lblCidade = new Label();
        lblEstado = new Label();
        lblNumero = new Label();
        lblCEP = new Label();
        lblPais = new Label();
        ddlTipoEnd = new DropDown();
        ddlTipoEndDefaultOptions = new SingleSelectOptionsList();
        txtEndereco = new TextField();
        txtNumero = new TextField();
        txtPais = new TextField();
        txtCep1 = new TextField();
        txtEstado = new TextField();
        txtCidade = new TextField();
        txtBairro = new TextField();
        txtEmail = new TextField();
        lblEmail = new Label();
        btnSalvar = new Button();
        label5 = new Label();
        txtCep2 = new TextField();
        txtPassaporte = new TextField();
        lblResultado = new Label();
    }

    public void init()
    {
        super.init();
        try
        {
            _init();
        }
        catch(Exception e)
        {
            log("criarAdministrador Initialization Failure", e);
            throw (e instanceof FacesException) ? (FacesException)e : new FacesException(e);
        }
        getSessionBean1().verificarLogin();
    }

    public void preprocess()
    {
    }

    public void prerender()
    {
    }

    public void destroy()
    {
    }

    protected SessionBean1 getSessionBean1()
    {
        return (SessionBean1)getBean("SessionBean1");
    }

    public String btnSalvar_action()
    {
        try
        {
            Pessoa pess = new Pessoa();
            Administrador adm = new Administrador();
            Endereco end = new Endereco();
            ArrayList ends = new ArrayList();
            adm.setLoginAdm(txtLogin.getText().toString());
            adm.setFraseSeguranca(txtFrase.getText().toString());
            adm.setRg(txtRG.getText().toString());
            adm.setPassaporte(txtPassaporte.getText().toString());
            adm.setOrgaoExpedicao(txtOrgaoExp.getText().toString());
            adm.setTituloEleitor(txtTitulo.getText().toString());
            adm.setDataExpedicao(txtDataExp.getSelectedDate());
            pess.setDataNasc(txtDataNasc.getSelectedDate());
            pess.setLoginPes(txtLogin.getText().toString());
            pess.setSenha(txtSenha.getText().toString());
            pess.setEmail(txtEmail.getText().toString());
            pess.setNome(txtNome.getText().toString());
            pess.setCpf(txtCPF.getText().toString());
            pess.setCelular(txtCelular.getText().toString());
            pess.setDddtelefone(txtDDDTelefone.getText().toString());
            pess.setDddcelular(txtDDDCelular.getText().toString());
            pess.setTelefone(txtTelefone.getText().toString());
            pess.setRamal(txtRamal.getText().toString());
            end.setTipoEndereco(ddlTipoEnd.getSelected().toString());
            end.setEndereco(txtEndereco.getText().toString());
            end.setNumero(Integer.parseInt(txtNumero.getText().toString()));
            end.setCep((new StringBuilder()).append(txtCep1.getText().toString()).append(txtCep2.getText().toString()).toString());
            end.setEstado(txtEstado.getText().toString());
            end.setPais(txtPais.getText().toString());
            end.setCidade(txtCidade.getText().toString());
            end.setBairro(txtBairro.getText().toString());
            end.setLoginEnd(pess);
            ends.add(end);
            pess.setAdministrador(adm);
            pess.setEnderecoCollection(ends);
            
            if (pessoaBean.salvar(pess))
                lblResultado.setText("sucesso");
            else
                lblResultado.setText("erro");
            
        }
        catch(Exception e)
        {
            lblResultado.setText(e.getMessage());
        }
        return null;
    }

    public void txtFrase_processValueChange(ValueChangeEvent valuechangeevent)
    {
    }

    private Page page1;
    private Html html1;
    private Head head1;
    private Link link1;
    private Body body1;
    private Form form1;
    private TextField txtLogin;
    private Label lblSenha;
    private PasswordField txtSenha;
    private TextField txtNome;
    private TextField txtCPF;
    private TextField txtRG;
    private TextField txtOrgaoExp;
    private TextField txtFrase;
    private TextField txtTitulo;
    private Label lblCPF;
    private Label lblNome;
    private Label lblRG;
    private Label lblLogin;
    private Label lblOrgaoExp;
    private Calendar txtDataExp;
    private Label lblDataExp;
    private Label lblPassaporte;
    private Label lblTitulo;
    private Label lblFrase;
    private TextField txtDDDCelular;
    private Label lblCelular;
    private TextField txtRamal;
    private TextField txtTelefone;
    private TextField txtDDDTelefone;
    private TextField txtCelular;
    private Label lblTelefone;
    private Label lblRamal;
    private Calendar txtDataNasc;
    private Label lblDataNasc;
    private Label lblTipoEnd;
    private Label lblEndereco;
    private Label lblBairro;
    private Label lblCidade;
    private Label lblEstado;
    private Label lblNumero;
    private Label lblCEP;
    private Label lblPais;
    private DropDown ddlTipoEnd;
    private SingleSelectOptionsList ddlTipoEndDefaultOptions;
    private TextField txtEndereco;
    private TextField txtNumero;
    private TextField txtPais;
    private TextField txtCep1;
    private TextField txtEstado;
    private TextField txtCidade;
    private TextField txtBairro;
    private TextField txtEmail;
    private Label lblEmail;
    private Button btnSalvar;
    private Label label5;
    private TextField txtCep2;
    private TextField txtPassaporte;
    private Label lblResultado;
}