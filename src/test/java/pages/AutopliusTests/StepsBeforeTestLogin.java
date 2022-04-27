package pages.AutopliusTests;

import pages.Autoplius.AutopliusTitle;
import pages.Common;

public class StepsBeforeTestLogin {
    public static void steps() {
        System.out.println("-------------- Steps before test login-----------------");
        AutopliusTitle.clickEN();
        AutopliusTitle.clickLogin();
        Common.waitTime15();
        AutopliusTitle.writeEMail();
        AutopliusTitle.clickLoginContinue();
        Common.waitTime15();
        AutopliusTitle.writePassword();
        Common.waitTime15();
        AutopliusTitle.clickLoginButton();

    }

}
