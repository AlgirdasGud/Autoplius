package pages.Autoplius;

import org.openqa.selenium.By;
import pages.Common;

public class RegistrationAndLogin {


    public static void clickRegister() {
        By locator = By.xpath("//*[@class='ac-localnav-title']");
        Common.clickElement(locator);
    }


    public static void clickLogin() {
        By locator = By.xpath("//*[@class='ac-localnav-title']");
        Common.clickElement(locator);
    }

    public static void clickContinue() {
        By locator = By.xpath("//*[@class='ac-localnav-title']");
        Common.clickElement(locator);
    }

    public static void clickFacebook() {
        By locator = By.xpath("//*[@id='facebook']");
        Common.clickElement(locator);
    }

    public static void clickGoogle() {
        By locator = By.xpath("//*[@class='kHn9Lb']");
        Common.clickElement(locator);
    }

    public static void clickApple() {
        By locator = By.xpath("//*[@class='ac-localnav-title']");
        Common.clickElement(locator);
    }

    public static String getFacebook() {
        By locator = By.xpath("//*[@id='facebook']");

        return Common.getText(locator);
    }

    public static String getGoogle() {

        By locator = By.xpath("//*[@class='kHn9Lb']");
        return Common.getText(locator);
    }

    public static String getApple() {

        By locator = By.xpath("//*[@class='ac-localnav-title']");
        return Common.getText(locator);
    }


}
