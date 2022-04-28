package pages.AutopliusTests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Autoplius.AutopliusTitle;


import static pages.Autoplius.AutopliusTitle.getResultTextEN;
import static pages.Autoplius.AutopliusTitle.getResultTextLV;

public class TestAutopliusTitle extends AutopliusBoss {

    @Test
    public static void testEN() {

        AutopliusTitle.clickEN();
        Assert.assertEquals(getResultTextEN(), "Classified ads");
        System.out.println("************** " + getResultTextEN());
    }

    @Test
    public static void testLV() {
        AutopliusTitle.clickLV();
        Assert.assertEquals(getResultTextLV(), "Sludinājumi");
        System.out.println("************** " + getResultTextLV());

    }

    @Test
    public static void testFreeValuation() {
        AutopliusTitle.clickReg();
        AutopliusTitle.getResultTextEN();
        Assert.assertEquals("", "");

    }

    @Test
    public static void testNewCar() {
        AutopliusTitle.clickNewCar();
        AutopliusTitle.getResultText4();
        Assert.assertEquals("", "");

    }

    @Test
    public static void testFreeValuation1() {
        AutopliusTitle.clickReg();
        AutopliusTitle.getResultText5();
        Assert.assertEquals("", "");

    }

}































