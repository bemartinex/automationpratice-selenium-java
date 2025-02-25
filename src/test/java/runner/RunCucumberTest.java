package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/"},
        features = "src/test/resources/features",
        tags = {"~@ignore"},
        glue = {"steps"}

)
    public class RunCucumberTest extends RunBase {

    @AfterClass
    public static void stop(){
        driver.quit();
    }

}

