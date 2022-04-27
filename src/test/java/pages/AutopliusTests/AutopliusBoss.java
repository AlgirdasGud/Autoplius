package pages.AutopliusTests;

import Utils.Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.Common;

public class AutopliusBoss {
    @BeforeTest
    public void init() {

        // Sukuriame WebDriver objektą
        Driver.initialize();

        // Atidarome puslapį
        Common.openLink("https:Autoplius.lt");
        Driver.driver.manage().window().maximize();
        Common.waitTime15();


        //Uždaryti reklamą
        Common.waitForAddPopupToBeVisible();
        Common.closeAdd();

    }

//    @AfterTest
//    public void close() {

//        System.out.println("-----------------   Testas baigtas--------------------------");
//        Driver.quit();
    }
    // Įvedame reikšmę, @AfterTest
    //    public void quit() {
    //        Driver.quit();
    //    } paspaudžiame mygtuką, nuskaitome tekstą, palyginame
    // Duomenys
//        AutopliusClassifiedAds.clickAdvanceSearchButton();  //Paspaudziame isplplestines paieskos mygtuka
    // Veiksmai
//        SingleFormDemo.enterMessageToInputField(actualInput);
//        SingleFormDemo.clickShowMessageButton();

//        actualOutput = SingleFormDemo.getResultText();
//
//        // Palyginame įvestą ir nuskaitytą tekstus
//        Assert.assertEquals(actualInput, actualOutput);


//    @Test
//    public void testMultipleInputFields() {

    // Įvedame reikšmes, paspaudžiame mygtuką, nuskaitome tekstą, palyginame
    // Duomenys
//        String expectedOutput = "7";
//        String actualOutput = null;

    // Veiksmai
//        SingleFormDemo.enterValueToInputFieldA("2");
//        SingleFormDemo.enterValueToInputFieldB("5");
//        SingleFormDemo.clickGetTotalButton();
//        actualOutput = SingleFormDemo.getTotalValue();

    // Palyginimas
//        Assert.assertEquals(actualOutput, expectedOutput);
//}





























