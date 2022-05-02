package pages.AutopliusTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Autoplius.AutopliusTitle;
import pages.Common;

import static pages.Autoplius.AutopliusTitle.*;


public class TestAutopliusTitle extends AutopliusBoss {

    @Test
    public static void testEN() {
        clickEN();
        Assert.assertEquals(getResultTextEN(), "Classified ads");
        System.out.println("************** " + getResultTextEN());
    }

    @Test
    public static void testLV() {
        clickLV();
        Assert.assertEquals(getResultTextLV(), "Sludinājumi");
        System.out.println("************** " + getResultTextLV());

    }

    @Test
    public static void testFreeValuation() {
        AutopliusTitle.clickHome();
        Common.waitTime10();
        String text = AutopliusTitle.getSearchButtonText();
        Assert.assertEquals(text, "Search");

    }

    @Test
    public static void testNewCar() {
        AutopliusTitle.clickEN();
        AutopliusTitle.clickNewCar();
        Common.waitTime10();
        String text = AutopliusTitle.getResultText4();
        Assert.assertEquals(text, "Choose a new car");
    }

    @Test
    public static void testFreeValuation1() {
        AutopliusTitle.clickEN();
        AutopliusTitle.clickNewCar();
        Common.waitTime10();
        String text = AutopliusTitle.getButtonTextNewCars();
        Assert.assertEquals(text, "See offers");

    }
}




























