package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.UUID;


public class Driver {
    public static WebDriver driver;

    public static void initialize() {
        WebDriverManager.chromedriver().driverVersion("101.0.4951.41").setup();
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver() {

        return driver;
    }

    public static void quit() {

        driver.quit();
    }

    public static void takeScreenshot() {
        try {
            TakesScreenshot takesScreenshot = ((TakesScreenshot) driver);
            File dataFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
            File finalFile = new File("./screenshot/screenshot-" + UUID.randomUUID() + ".png");
            FileUtils.copyFile(dataFile, finalFile);

        } catch (Exception exception){
            System.out.println("Exception while taking a screenshot :" + exception.getMessage());
        }

    }
//
}


