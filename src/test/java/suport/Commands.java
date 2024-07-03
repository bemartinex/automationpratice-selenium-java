package suport;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

public class Commands extends RunCucumberTest {

    public static void waitElementVisible(By element, int tempo){
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void waitElementClickable(By element, int tempo){
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void clickElement(By element){
        System.out.println("---------------------------------------");

        try{
            System.out.println("Vai tentar clicar no elemento: " + element);
            waitElementClickable(element, 4000);
            getDriver().findElement(element).click();
            System.out.println("Clicou no elemento");
        }catch(Exception error){
            System.out.println("Aconteceu um erro ao tentar clicar no elemento: " + element);
            new Exception(error);
        }
        System.out.println("-----------------------------------------------------------");


    }

    public static void fillField(By element, String senha){
        System.out.println("---------------------------------------");
        try{
            System.out.println("Vai tentar preencher o elemento: " + element);
            waitElementVisible(element, 5000);
            getDriver().findElement(element).sendKeys(senha);
            System.out.println("Preencheu o campo!");
        }catch(Exception error){
            System.out.println("Aconteceu um erro ao tentar preencher o elemento: " + element);
            new Exception(error);
        }
        System.out.println("-----------------------------------------------------------");

    }

    public static void verifyMessage(By element, String message){
        Commands.waitElementVisible(element,3);
        WebElement mensagemEmail = getDriver().findElement(element);
        String textoMensagem = mensagemEmail.getText();
        Assert.assertEquals(textoMensagem,message);
    }

}
