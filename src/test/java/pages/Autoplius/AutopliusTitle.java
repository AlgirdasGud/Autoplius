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

    public static void clickModalOff() {
        By locator = By.xpath("//*[@class='ap-modal-close-btn']");
        Common.clickElement(locator);
    }

    public static void enterTextForSearch(String message) {
        By locator = By.xpath("//input[@id='user-message']");
        Common.sendKeys(locator, message);
    }

    public static void clickShowMessageButton() {
        By locator = By.xpath("//form[@id='get-input']/button");
        Common.clickElement(locator);
    }

    public static void enterValueToInputFieldA(String value) {
        By locator = By.xpath("//*[@id='sum1']");
        Common.sendKeys(locator, value);
    }

    public static void enterValueToInputFieldB(String value) {
        By locator = By.xpath("//*[@id='sum2']");
        Common.sendKeys(locator, value);
    }

    public static void clickSearchButton() {
        By locator = By.xpath("//form[@id='gettotal']/button");
        Common.clickElement(locator);
    }

    public static void clickReg() {
        By locator = By.xpath("//*[@data-name='register']");
        Common.clickElement(locator);
    }

    public static void clickRegistration() {
        By locator = By.xpath("//*[@class='tab active']");
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
}










































