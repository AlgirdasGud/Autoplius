package pages.AutopliusTests;

import Utils.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.Autoplius.AccountSetings;
import pages.Autoplius.AutopliusTitle;
import pages.Autoplius.RegistrationAndLogin;
import pages.Common;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import static pages.Autoplius.RegistrationAndLogin.*;

public class TestRegistrationAndLogin extends AutopliusBoss {

    @BeforeTest

    public void pretest() {

        AutopliusTitle.clickEN();
        AutopliusTitle.clickLogin();
        Common.waitTime10();
    }

    @AfterTest
    public void close() {
        System.out.println("*** Testas baigtas");
        Driver.quit();

    }


    @Test
    public static void testFRegistration() {

        Common.waitTime10();
        RegistrationAndLogin.clickRegister();
        RegistrationAndLogin.sendNewAccountName();
        RegistrationAndLogin.clickSignup();
        String textR = getReg();
        System.out.println("super duper " + textR);
        Assert.assertEquals(RegistrationAndLogin.getReg(), "Sign up");
    }

    @Test
    public static void testELogWithAccount() {

        sendAccountName();
        clickContinue();
        RegistrationAndLogin.getLoginText();
        String textAc = getLoginText();
        System.out.println("super duper " + textAc);
        Assert.assertEquals(textAc, "Enter your password");


    }

    @Test
    public static void testALoginWithGoogle() {


        clickGoogle();
        System.out.println("---------   wait Google ---------");
        Common.waitTime15();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        String MainWindow = Driver.getDriver().getWindowHandle();

        // To handle all new opened window.
        Set<String> s1 = Driver.getDriver().getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String google = "xxx";
        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                Driver.getDriver().switchTo().window(ChildWindow);
                google = getGoogleText();

                // Closing the Child Window.
                Driver.getDriver().close();
            }
        }
        // Switching to Parent window i.e Main Window.
        Driver.getDriver().switchTo().window(MainWindow);
        AccountSetings.closeModal();
        System.out.println("Prisijungimo su google tekstas - '" + google+"'");
        Assert.assertEquals(google, "Prisijungimas naudojant „Google“");
        //Assert.assertEquals("","Prisijungimas naudojant „Google“");

    }

    @Test
    public static void testBLoginWithApple() {

        RegistrationAndLogin.clickApple();
           Common.waitTime15();
         WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        String MainWindow = Driver.getDriver().getWindowHandle();

        // To handle all new opened window.
        Set<String> s1 = Driver.getDriver().getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String apple = "xxx";
        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window

                Driver.getDriver().switchTo().window(ChildWindow);
                apple = RegistrationAndLogin.getApple();

                // Closing the Child Window.

                Driver.getDriver().close();
            }
        }
        // Switching to Parent window
        System.out.println(" Prisijungimo su Apple tekstas -  '" + apple + "'");
        Assert.assertEquals(apple, "Apple ID");
        Driver.getDriver().switchTo().window(MainWindow);

    }

    @Test
    public static void testCLoginWithFacebook() {
        clickFacebook();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        String MainWindow = Driver.getDriver().getWindowHandle();

        // To handle all new opened window.

        Set<String> s1 = Driver.getDriver().getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String facebook = "xxx";
        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                // Switching to Child window
                Driver.getDriver().switchTo().window(ChildWindow);
                facebook = RegistrationAndLogin.getFacebook();
                // Closing the Child Window.
                Driver.getDriver().close();
            }
        }
        // Switching to Parent window i.e Main Window.

        Driver.getDriver().switchTo().window(MainWindow);
        System.out.println("Prisijungimo su Facebook tekstas - '" + facebook + "'");
        Assert.assertEquals(facebook, "Facebook");

    }

    @Test
    public static void testDLoginAnyName() {


        RegistrationAndLogin.sendAnyName();
        RegistrationAndLogin.clickContinue();
        RegistrationAndLogin.getLoginErrorText();
        String text = RegistrationAndLogin.getLoginErrorText();
        System.out.println("Gaunamas tekstas - ' " + text+"'");
        Assert.assertEquals(text,
                "You've entered a wrong phone number or email. Please check and try again.");


    }
}
