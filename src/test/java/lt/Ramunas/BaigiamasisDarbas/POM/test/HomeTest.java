package lt.Ramunas.BaigiamasisDarbas.POM.test;

import lt.Ramunas.BaigiamasisDarbas.POM.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setup() {
        HomePage.open();
    }

    @Test
    public void TestAreaPromotionCode() {
        String promotionCode = "Nuolaida";
        String expectedResult = "Įvestas akcijos kodas neteisingas";
        String actualResult;

        HomePage.clickPromotionButton(); //Click on "Naudoti akcijos koda"
        HomePage.inputPromotionCode(promotionCode); //input promo code
        HomePage.clickToActivatePromotionCodeButton(); //click promo code button
        HomePage.sleep(1000);
        actualResult = HomePage.readPromotionCodeMessage(); //read promo code message
        Assert.assertTrue(actualResult.contains(expectedResult)); //compare if actualResult contains expectedResult
    }

    @Test
    public void ChangeLanguageTesting() {
        String expectedResultEN = "EN";
        String expectedResultLT = "LT";
        String actualResult;

        HomePage.clickOnLanguageBar();
        HomePage.clickOnEnLanguage();
        HomePage.sleep(1000);
        actualResult = HomePage.checkLanguageName();
        Assert.assertTrue(actualResult.contains(expectedResultEN));
        HomePage.clickOnLanguageBar();
        HomePage.clickOnLtLanguage();
        HomePage.sleep(1000);
        actualResult = HomePage.checkLanguageName();
        Assert.assertTrue(actualResult.contains(expectedResultLT));
    }

}
