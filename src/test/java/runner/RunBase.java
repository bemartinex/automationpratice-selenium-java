package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunBase {

    static WebDriver driver;

    public enum Browser {CHROME}

    public static WebDriver getDriver() {
        if(driver == null) {
            return getDriver(Browser.CHROME);
        }else{
            return driver;
        }
    }
    public static WebDriver getDriver(Browser browser) {

        if(driver != null) {
            driver.quit();
        }

        switch (browser) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser: " + browser);
        }
        return driver;
    }

}
