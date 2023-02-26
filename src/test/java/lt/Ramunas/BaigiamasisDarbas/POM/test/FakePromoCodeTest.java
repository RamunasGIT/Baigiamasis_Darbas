package lt.Ramunas.BaigiamasisDarbas.POM.test;

import lt.Ramunas.BaigiamasisDarbas.POM.pages.FirstTestPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FakePromoCodeTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setup() {
        FirstTestPage.open();
    }

    @Test
    public void TestAreaPromotionCode() {
        String promotionCode = "Nuolaida";
        String expectedResult = "Įvestas akcijos kodas neteisingas";
        String actualResult;

        FirstTestPage.clickPromotionButton(); //Click on "Naudoti akcijos koda"
        FirstTestPage.inputPromotionCode(promotionCode); //input promo code
        FirstTestPage.clickToActivatePromotionCodeButton(); //click promo code button
        FirstTestPage.sleep(1000);
        actualResult = FirstTestPage.readPromotionCodeMessage(); //read promo code message
        Assert.assertTrue(actualResult.contains(expectedResult)); //compare if actualResult contains expectedResult

    }


}
