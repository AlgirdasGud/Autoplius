package pages.AutopliusTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Autoplius.RegistrationAndLogin;

public class TestRegAndLog {


    @Test
    public static void testRegistration() {
        StepsBeforeTestLogin.steps();
        RegistrationAndLogin.clickRegister();
        RegistrationAndLogin.getApple();
       Assert.assertEquals("","");
    }

    @Test
    public static void testLogWithAccount() {
        StepsBeforeTestLogin.steps();
        RegistrationAndLogin.clickLogin();
        RegistrationAndLogin.getApple();
        Assert.assertEquals("","");
    }

    @Test
    public static void testLoginWithFacebook() {
        StepsBeforeTestLogin.steps();
        RegistrationAndLogin.clickFacebook();
        RegistrationAndLogin.getApple();
        Assert.assertEquals("","");
    }

    @Test
    public static void testLoginWithGoogle() {
        StepsBeforeTestLogin.steps();
        RegistrationAndLogin.getGoogle();
        RegistrationAndLogin.getApple();
        Assert.assertEquals("","");
    }

    @Test
    public static void testLoginWithApple() {
        StepsBeforeTestLogin.steps();
        RegistrationAndLogin.getApple();
        RegistrationAndLogin.getApple();
        Assert.assertEquals("","");
    }


}

