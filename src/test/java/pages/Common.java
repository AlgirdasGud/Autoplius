package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Utils.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utils.Driver.driver;

public class Common {


    public static void openLink(String url) {

        driver.get(url);
    }

    public static WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public static void clickElement(By locator) {
        findElement(locator).click();
    }

    public static void sendKeys(By locator, String keys) {
        findElement(locator).sendKeys(keys);
    }

    public static String getText(By locator) {
        return findElement(locator).getText();
    }

    public static void waitForAddPopupToBeVisible() {
        WebElement popup = Common.findElement(By.xpath("//*[@id='onetrust-consent-sdk']/div[1]"));

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(popup));
    }

    public static void closeAdd() {
        System.out.println("------------- u z d a r o m e r  r e k l a m a --------");
        By locator = By.xpath("//*[@id='onetrust-accept-btn-handler']");
        Common.clickElement(locator);

    }


    public static void waitForFacebookAddPopupToBeVisible() {
        WebElement popup = Common.findElement(By.xpath("//*[@id='facebook']/body/div[2]/div[1]"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(popup));

    }

    public static void waitTime15() {
        System.out.println("--------- wait 15  seconds --------------");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    public static void waitTime10() {
        System.out.println("--------- wait 10seconds --------------");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
}



