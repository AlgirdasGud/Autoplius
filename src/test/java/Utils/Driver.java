package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Driver {
    public static WebDriver driver;

    public static void initialize() {
        WebDriverManager.chromedriver().driverVersion("100.0.4896.60").setup();
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {

        return driver;
    }

    public static void quit() {

        driver.quit();
    }
}


