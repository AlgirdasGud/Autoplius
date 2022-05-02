package pages.AutopliusTests;

import Utils.Driver;
import Utils.TestListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
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
}




























