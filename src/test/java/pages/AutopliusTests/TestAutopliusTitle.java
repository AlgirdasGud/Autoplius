package pages.AutopliusTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Autoplius.AutopliusTitle;
import pages.Common;

import static pages.Autoplius.AutopliusTitle.getResultTextEN;
import static pages.Autoplius.AutopliusTitle.getResultTextLV;

public class TestAutopliusTitle extends AutopliusBoss{

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
    public void registracija() {
//  1. Open the page
// 2. click on EN
        AutopliusTitle.clickEN();
        AutopliusTitle.clickLogin();
      //  Common.waitreg();
// 3. open registracion popup Click Register
        AutopliusTitle.clickRegistration();
//    reikia surasti teisingus xpath'us AutopliusTitle.clickModalOff();
//  Enter any password
        AutopliusTitle.writeEMail();
// 8. Click Registruotis->
        AutopliusTitle.clickRegistration1();
// 9. Download popup text
        AutopliusTitle.getloginImputValue();
// 10. we compare
        Assert.assertEquals("", "");
// 11. If the file we are doing a screenshot
        Common.takeScreenshot();
    }
    @Test
    public void signout() {
//  1. Open the page

        AutopliusTitle.clickLogin();
// 3. open registracion popup Click Register
        AutopliusTitle.clickLoginAcc();
//    reikia surasti teisingus xpath'us AutopliusTitle.clickModalOff();
//  Enter any password
 //       AutopliusTitle.writePassword();
// 8. Click Registruotis->
        AutopliusTitle.clickRegistration1();
// 9. Download popup text
        AutopliusTitle.getloginImputValue();
// 10. we compare
        Assert.assertEquals("", "");
// 11. If the file we are doing a screenshot
        Common.takeScreenshot();
    }
}































