package framework.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.classfile.instruction.SwitchCase;

public class DriverManager {

    private static WebDriver driver;

    private static WebDriver getManagerDrive(TypeBrowser type) {

        switch (type) {

            case CHROME:
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                options.addArguments("--incognito");
                driver = new ChromeDriver(options);
                break;

            case EDGE:
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--start-maximized");
                edgeOptions.addArguments("--incognito");
                driver = new EdgeDriver(edgeOptions);
                break;

            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case HEADLESS:
                WebDriverManager.chromedriver().setup();
                ChromeOptions headlessoptions = new ChromeOptions();
                headlessoptions.addArguments("--headless");
                headlessoptions.addArguments("--window-size(1366,768)");
                driver = new ChromeDriver(headlessoptions);
                break;

        }
        return driver;
    }

    public static WebDriver getDriver(TypeBrowser type){
        if (driver == null) {
            driver = getManagerDrive(type);
        }
        return driver;
    }

    public static void fecharDriver(){
        if(driver !=null) {

            driver.quit();
            driver = null;
        }
    }
}
