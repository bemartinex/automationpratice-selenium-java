package steps;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import pages.RegisterPage;
import runner.RunBase;
import runner.RunCucumberTest;
import suport.ScreenshotUtils;

public class cadastro extends RunCucumberTest {

    @Dado("^que estou na tela de cadastro do site automation pratice$")
    public void acessar_tela_cadastro(){
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


    @After
    public static void afterScenario(Scenario scenario) {
        System.out.println("=========================");
        System.out.println("Teste executado:" + scenario.getName());
        System.out.println("Status: " + scenario.getStatus());
        System.out.println("Tag: " + scenario.getSourceTagNames());
        System.out.println("=========================");

        if(scenario.isFailed()){
            ScreenshotUtils.addScreenshotOnScenario(scenario);
        }


    }



}
