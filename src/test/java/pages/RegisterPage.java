package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import suport.Commands;


public class RegisterPage extends Commands {

    private static By campoNome = By.id("user");
    private static By campoEmail = By.id("email");
    private static By campoSenha = By.id("password");
    private static By botaoCadastrar = By.id("btnRegister");
    private static By mensagemSucesso = By.id("swal2-title");
    private static By mensagemErroPreencherCampo = By.id("errorMessageFirstName");

    public static void acessarTelaCadastro(){
        getDriver("chrome").get("https://automationpratice.com.br/");
        Assert.assertEquals("Não acessou a aplicação",true,getDriver().findElement(By.id("footer_one")).isDisplayed());
        getDriver().findElement(By.xpath("//a[@href='/register']")).click();
    }

    public static void preencheNome(String name){
        fillField(campoNome, name);
    }
    public static void preencheEmail(String email){
        fillField(campoEmail, email);
    }
    public static void preencheSenha(String senha){
        fillField(campoSenha, senha);
    }

    public static void clicaCadastro(){
        clickElement(botaoCadastrar);
    }

    public static void mensagemCadastroSucesso(){
        Assert.assertTrue(getDriver().findElement(mensagemSucesso).isDisplayed());
    }

    public static void mensagemErroPreencherCampo(String mensagemEsperada) {
        verifyMessage(mensagemErroPreencherCampo, mensagemEsperada);
    }

}
