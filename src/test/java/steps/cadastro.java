package steps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import pages.RegisterPage;
import runner.RunBase;
import runner.RunCucumberTest;

public class cadastro extends RunCucumberTest {

    @Dado("^que estou na tela de cadastro do site automation pratice$")
    public void acessar_tela_cadastro(){
        getDriver(RunBase.Browser.CHROME);
        RegisterPage.acessarTelaCadastro();
    }

    @Quando("^preencho nome \"([^\"]*)\", email \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void preenche_cadastro(String nome, String email, String senha){
        RegisterPage.preencheNome(nome);
        RegisterPage.preencheEmail(email);
        RegisterPage.preencheSenha(senha);
    }

    @Quando("^clico no botao Cadastrar$")
    public void click_cadastrar(){
        RegisterPage.clicaCadastro();
    }

    @Quando("^exibe uma mensagem de sucesso$")
    public void mensagem_sucesso_cadastro(){
        RegisterPage.mensagemCadastroSucesso();
    }

    @Quando("^exibe a mensagem \"([^\"]*)\" de campo nao preenchido$")
    public void mensagem_erro_preencher_campo(String mensagem){
        RegisterPage.mensagemErroPreencherCampo(mensagem);
    }



}
