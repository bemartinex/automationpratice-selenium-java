package suport;

import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static runner.RunBase.getDriver;

public class ScreenshotUtils {

    public static void addScreenshotOnScenario(Scenario scenario){
        byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png");
    }

}
