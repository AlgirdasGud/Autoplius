package pages.Autoplius;

import org.openqa.selenium.By;
import org.testng.Assert;
import pages.AutopliusTests.AutopliusBoss;
import pages.Common;



public class RegistrationAndLogin extends AutopliusBoss {


    public static void clickRegister() {
        By locator = By.xpath("//div[@data-name='register']");
        Common.clickElement(locator);
    }


    public static void clickSignup() {
        By locator = By.xpath("//*[@class='js-form-registration-lookup']/*/button[text()='Sign up']");
        Common.clickElement(locator);
    }

    public static void clickContinue() {
        By locator = By.xpath("//*[@class='js-form-login-lookup']//*[@class='login-button']");
        Common.clickElement(locator);
    }

    public static void clickFacebook() {
        By locator = By.xpath("//*[@class='facebook-login-button js-facebook-login']");
        Common.clickElement(locator);
    }

    public static void clickGoogle() {
        By locator = By.xpath("//*[@class='google-login-button js-google-login']");
        Common.clickElement(locator);
    }

    public static void clickApple() {
        By locator = By.xpath("//*[@class='apple-login-button js-apple-login']");
        Common.clickElement(locator);
    }

    public static String getFacebook() {
        By locator = By.xpath("//*[@class='_50f7']");

        return Common.getText(locator);
    }

    public static String getGoogle() {

        By locator = By.xpath("//div[@class='kHn9Lb']");

        return Common.getText(locator);
    }

    public static String getApple() {
        //By locator = By.xpath("//*[class='ac-localnav-title']");
        // By locator = By.xpath("//*[@id='ac-localnav']//*[@class='ac-localnav-title']");
        //By locator = By.xpath("//div[@id='content'] // div[@class='ac-localnav-title' and span]");
        By locator = By.cssSelector("html//#signin > app-title > h1");
        Common.waitTime15();
        return Common.getText(locator);
    }

    public static String getLoginText() {

        By locator = By.xpath("//*[@class='login-message js-message']");

        return Common.getText(locator);
    }

    public static String getReg() {

        By locator = By.xpath("//form[@class='js-form-registration-email']//*[@type='submit']");

        return Common.getText(locator);
    }

    public static void sendAccountName() {
        By locator = By.xpath("//*[@id='username-lookup']");
        Common.sendKeys(locator, "Kursai.c@gmail.com");
    }

    public static void sendNewAccountName() {
        By locator = By.xpath("//*[@id='registration-username']");
        Common.sendKeys(locator, "cekiske@gmail.com");
    }

    public static void clickAception() {
        By locator = By.xpath("//*[@id='u_0_a_CU']");
        Common.clickElement(locator);
    }

    public static void clickKitas() {
        By locator = By.xpath("////*[@id='identifierNext']/div/button/span ");
        Common.clickElement(locator);
    }

    public static void sendPassword() {
        By locator = By.xpath("//*[@id='registration-username']");
        Common.sendKeys(locator, "Kaunas-Vilnius");
    }

    public static void clickGo() {
        System.out.println("loginame i Accounta");
        By locator = By.cssSelector("body > div.ap-modal.ap-popup > div > div > div.ap-modal-content > div > div > form.js-form-login > div.login-button > button");
        Common.clickElement(locator);
    }

    public static String getGoogleText() {
        By locator = By.xpath("//*[@id='initialView']//div[starts-with(text(),'Prisijungimas naudojant')]");
        //By locator = By.cssSelector("#initialView > div.xkfVF > div > div.Lth2jb > div > div.kHn9Lb");
        Common.getText(locator);

        return getGoogleText();
    }
}








