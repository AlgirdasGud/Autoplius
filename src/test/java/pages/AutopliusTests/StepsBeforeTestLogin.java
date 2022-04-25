package pages.AutopliusTests;

import pages.Autoplius.AutopliusTitle;
import pages.Common;

public class StepsBeforeTestLogin {
    public static void steps() {
        System.out.println( "-------------- Steps before test login-----------------");
        AutopliusTitle.clickEN();
        AutopliusTitle.clickLogin();
        Common.waitReg();


    }

}
