package pages.Autoplius;

import org.openqa.selenium.By;
import pages.Common;

public class AccountSetings {

    public static void openSettings() {

        Common.waitTime10();
        By locator2 = By.cssSelector("body > div.wrapper > div.page-header > div > div > ul > li.js-global-user-menu > div > a > span.header-label > strong");
        Common.clickElement(locator2);
        By locator3 = By.cssSelector("#autoplius > div.container > ul > li:nth-child(3) > a");
        Common.clickElement(locator3);
    }

    public static void changeFirstName(String name) {
        By locator = By.xpath("//*[@class='setting js-first-name-settings']/button[@class='setting-edit-btn js-edit-button']");
        Common.clickElement(locator);
        Common.waitTime10();
        By locator2 = By.xpath("//*[@id='new-first-name-input']");
        Common.sendKeys(locator2, name);
        By locator3 = By.xpath("//*[@id='new-first-name-input']/../../button[@type='submit']");
        Common.clickElement(locator3);

    }

    public static String getFirstName() {
        By locator = By.xpath("//*[@class='setting js-first-name-settings']/*[@class='setting-value js-setting-value']");
        return Common.getText(locator);
    }

    public static void changeSecondName(String name) {
        By locator = By.xpath("//*[@class='setting js-last-name-settings']/button[@class='setting-edit-btn js-edit-button']");
        Common.clickElement(locator);
        Common.waitTime10();

        By locator2 = By.xpath("//*[@id='new-last-name-input']");
        Common.sendKeys(locator2, name);

        By locator3 = By.xpath("//*[@id='new-last-name-input']/../../button[@type='submit']");
        Common.clickElement(locator3);

    }

    public static String getSecondName() {
        By locator = By.cssSelector("body > div.body-wrapper > div.page-wrapper > div.content-container > div > div > div.col.left > div:nth-child(2) > div > div > div.setting.js-last-name-settings > div.setting-value.js-setting-value");
        // By locator = By.xpath("//*[@class='setting js-last-name-settings']/*[@class='setting-value js-setting-value']");
        return Common.getText(locator);
    }


    public static void changeStreet(String name) {
        By locator = By.xpath("//*[@class='setting js-contact-street-settings']/button[@class='setting-edit-btn js-edit-button']");
        Common.clickElement(locator);
        Common.waitTime10();
        By locator2 = By.xpath("//*[@id='new-contact-street-input']");
        Common.sendKeys(locator2, name);
        By locator3 = By.xpath("//*[@id='new-contact-street-input']/../../button[@type='submit']");
        Common.clickElement(locator3);

    }

    public static String getStreet() {
        By locator = By.xpath("//*[@class='setting js-contact-street-settings']/*[@class='setting-value js-setting-value']");
        return Common.getText(locator);
    }

    public static void changePhone(String name) {
        By locator = By.xpath("//*[@class='setting js-contact-phone-settings']/button[@class='setting-edit-btn js-edit-button']");
        Common.clickElement(locator);
        Common.waitTime10();
        By locator2 = By.xpath("//*[@id='new-contact-phone-input']");
        Common.sendKeys(locator2, name);
        Common.waitTime10();

        By locator3 = By.xpath("//*[@id='new-contact-phone-input']/../../button[@type='submit']");
        Common.clickElement(locator3);

    }

    public static void changePhoneText(String name) {
        By locator2 = By.xpath("//*[@id='new-contact-phone-input']");
        Common.findElement(locator2).clear();
        Common.sendKeys(locator2, name);

        By locator3 = By.xpath("//*[@id='new-contact-phone-input']/../../button[@type='submit']");
        Common.clickElement(locator3);

    }

    public static String getPhone() {
        By locator = By.xpath("//*[@class='setting js-contact-phone-settings']/*[@class='setting-value js-setting-value']");
        return Common.getText(locator);
    }

    public static String getPhoneError() {
        By locator = By.xpath("//*[@id='new-contact-phone-input']/../../*[@class='error-message']");
        return Common.getText(locator);
    }

    public static void closeModal() {
        By locator = By.xpath("//*[@class='ap-modal-close-btn']");
        Common.clickElement(locator);
    }


    }


