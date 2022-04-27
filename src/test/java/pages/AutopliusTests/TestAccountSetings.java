package pages.AutopliusTests;

import Utils.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Autoplius.AccountSetings;
import pages.Common;

public class TestAccountSetings extends AccountSetings {

    @BeforeTest
    public void init() {
        Driver.initialize();
        Common.openLink("https:Autoplius.lt");
        Driver.driver.manage().window().maximize();
        Common.waitForAddPopupToBeVisible();
        Common.closeAdd();
        StepsBeforeTestLogin.steps();
        Common.waitTime15();
        AccountSetings.openSettings();
        Common.waitTime15();
    }

    @Test
    public static void testFirstNameUpdate() {
        System.out.println("*****************pradedame testa");
        String name = "NameA";
        AccountSetings.changeFirstName(name);
        String result = AccountSetings.getFirstName();
        Assert.assertEquals(result, name);
    }

    @Test
    public static void testSecondNameUpdate() {
        String name = "NameB";
        AccountSetings.changeSecondName(name);
        String result = AccountSetings.getSecondName();
        Common.waitTime10();
        Assert.assertEquals(result, name);
    }

    @Test
    public static void testStreetUpdate() {
        String name = "StreetA";
        AccountSetings.changeStreet(name);
        String result = AccountSetings.getStreet();
        Assert.assertEquals(result, name);
    }

    @Test
    public static void testPhoneUpdateError() {
        String value = "+37061610";
        AccountSetings.changePhone(value);
        Common.waitTime10();
        String result = AccountSetings.getPhoneError();
        Assert.assertEquals(result, "Phone number entered incorrectly");
        Common.waitTime15();

        String value2 = "+37061610020";
        AccountSetings.changePhoneText(value2);
        Common.waitTime15();
        String result2 = AccountSetings.getPhone();
        Assert.assertEquals(result2, value2);
        AccountSetings.closeModal();
    }

}














