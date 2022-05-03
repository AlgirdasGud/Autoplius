package pages.AutopliusTests;

import Utils.Driver;
import Utils.TestListener;
import org.testng.annotations.*;
import pages.Autoplius.AccountSetings;
import pages.Common;


@Listeners(TestListener.class)
public class AutopliusBoss {

    @BeforeTest
    public void init() {

        Driver.initialize();
        Common.openLink("https:Autoplius.lt");
        Driver.driver.manage().window().maximize();
        Common.waitTime15();
        Common.waitForAddPopupToBeVisible();
        Common.closeAdd();

    }

    @AfterTest

    public void close() {

        System.out.println("-----------------   Testas baigtas--------------------------");
        Driver.quit();
    }
    @BeforeClass
    public void initC() {
        Driver.initialize();
        Common.openLink("https:Autoplius.lt");
        Driver.driver.manage().window().maximize();
        Common.waitForAddPopupToBeVisible();
        Common.closeAdd();
        StepsBeforeTestLogin.steps();
        Common.waitTime15();
        AccountSetings.openSettings();

    }

    @AfterClass

   public static void closeC(){
       Driver.quit();
    }
}




























