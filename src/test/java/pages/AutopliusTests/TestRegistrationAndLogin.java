package pages.AutopliusTests;

import Utils.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Autoplius.AutopliusTitle;
import pages.Autoplius.RegistrationAndLogin;
import pages.Common;

public class TestRegistrationAndLogin extends AutopliusBoss {


    @Test
    public static void testRegistration() {
//      //  StepsBeforeTestLogin.steps();
        AutopliusTitle.clickEN();
        AutopliusTitle.clickLogin();

        Common.waitTime10();

        RegistrationAndLogin.clickRegister();
        RegistrationAndLogin.sendNewAccountName();
        RegistrationAndLogin.clickSignup();
        RegistrationAndLogin.getReg();
        Assert.assertEquals(RegistrationAndLogin.getReg(), "Sign up");
    }

    // @AfterTest
    public void close() {

        System.out.println("-----------------   Testas baigtas--------------------------");
        Driver.quit();
    }

    @Test
    public static void testLogWithAccount() {
        //StepsBeforeTestLogin.steps();
        AutopliusTitle.clickEN();
        AutopliusTitle.clickLogin();
        Common.waitTime15();
        RegistrationAndLogin.sendAccountName();
        RegistrationAndLogin.clickContinue();
        RegistrationAndLogin.getLoginText();
        System.out.println("super duper " + RegistrationAndLogin.getLoginText());
        Assert.assertEquals(RegistrationAndLogin.getLoginText(), "Enter your password");

    }


    @Test
    public static void testLoginWithGoogle() {


        AutopliusTitle.clickEN();
        AutopliusTitle.clickLogin();

        RegistrationAndLogin.clickGoogle();

        System.out.println("---------   waitReg();----------");
        Common.waitTime15();
        System.out.println("---------   getGoogle X X;---------");
        // RegistrationAndLogin.clickKitas();
        System.out.println("---------  pralridom  klikinom kitas;---------");
        RegistrationAndLogin.getGoogle();
        System.out.println("Prisijungimo su google tekstas" + RegistrationAndLogin.getGoogle());
        Assert.assertEquals(RegistrationAndLogin.getGoogle(), "Prisijungimas naudojant 'Google'");
    }

    @Test
    public static void testLoginWithApple() {
        System.out.println("---------   Prisijungiam su Apple ----------");
        // StepsBeforeTestLogin.steps();
        AutopliusTitle.clickEN();
        AutopliusTitle.clickLogin();
        Common.waitTime15();
        RegistrationAndLogin.clickApple();
        System.out.println(" ***********   " + RegistrationAndLogin.getApple() + "    ************************");
        Assert.assertEquals("", "");
    }

    @Test
    public static void testLoginWithFacebook() {
        System.out.println("---------   Prisijungiam su Facebook ----------");
        //StepsBeforeTestLogin.steps();
        AutopliusTitle.clickEN();
        AutopliusTitle.clickLogin();
        Common.waitTime15();
        RegistrationAndLogin.clickFacebook();
        //Common.waitForFacebookAddPopupToBeVisible();
        Common.waitTime15();
        RegistrationAndLogin.clickAception();
        Assert.assertEquals(RegistrationAndLogin.getFacebook(), "Autoplius.lt");
    }

}

