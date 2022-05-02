package pages.Autoplius;

import org.openqa.selenium.By;
import pages.AutopliusTests.AutopliusBoss;
import pages.Common;


public class AutopliusTitle extends AutopliusBoss {


    public static String getResultTextLV() {
        By locator = By.xpath("//a[contains(text(),'Sludinājumi')]");
        return Common.getText(locator);
    }

    public static String getResultTextEN() {
        By locator = By.xpath("//a[contains(text(),'Classified ads')]");
        return Common.getText(locator);
    }

    public static void clickEN() {
        By locator = By.xpath("//a[contains(text(),'EN')]");
        Common.clickElement(locator);
    }

    public static void clickLV() {
        By locator = By.xpath("//a[contains(text(),'LV')]");
        Common.clickElement(locator);
    }

    public static void clickLogin() {
        By locator = By.xpath("//*[@class='js-login-btn']");
        Common.clickElement(locator);
    }

    public static void clickSearchButton() {
        By locator = By.xpath("//form[@id='gettotal']/button");
        Common.clickElement(locator);
    }

    public static void clickReg() {
        By locator = By.xpath("//*[@data-name='register']");
        Common.clickElement(locator);
    }

    public static void clickLoginButton() {
        By locator = By.xpath("/html/body/div[4]/div/div/div[2]/div/div/form[2]/div[5]/button");
        //.By locator = By.xpath("//*[@class='js-form-login-lookup']/*/button[text()='Continue']");
        Common.clickElement(locator);
    }

    public static void writePassword() {
        String password = "Kaunas-Vilnius";
        By locator = By.xpath("//*[@id='password']");
        Common.sendKeys(locator, password);
    }

    public static void clickLoginContinue() {
        By locator = By.xpath("//*[@class='js-form-login-lookup']/*/button[text()='Continue']");
        Common.clickElement(locator);
    }

    public static void writeEMail() {
        String prisijungimoVardas = "kursai.c@gmail.com";
        By locator = By.xpath("//*[@id='username-lookup']");
        Common.sendKeys(locator, prisijungimoVardas);
    }

    public static void clickNewCar() {
        By locator = By.cssSelector("body > div.wrapper > div.page-header > nav > div > ul.navigation-items > li:nth-child(2) > a");
        Common.clickElement(locator);
    }

    public static String getResultText4() {
        By locator = By.cssSelector("body > div.body-wrapper > div.page-wrapper > div.content-container > h1");
        return Common.getText(locator);
    }

    public static void clickHome() {
        By locator = By.xpath("//*[@data-event='Cars']");
        Common.clickElement(locator);
    }

    public static String getButtonTextNewCars() {
        By locator = By.xpath("//*[@id='submit-button']");
        return Common.getText(locator);
    }

    public static String getSearchButtonText() {
        By locator = By.xpath("//*[@class='button js-search-button']");
        return Common.getText(locator);
    }
}













