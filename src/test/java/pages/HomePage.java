package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunCucumberTest;

public class HomePage extends RunCucumberTest {



    public void acessarHomePage(){
        getDriver().get("https://automationpratice.com.br/");
        Assert.assertEquals("Não acessou a aplicação",true,getDriver().findElement(By.id("footer_one")).isDisplayed());
    }

}
