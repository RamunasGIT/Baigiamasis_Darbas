package lt.Ramunas.BaigiamasisDarbas.POM.test;

import lt.Ramunas.BaigiamasisDarbas.POM.pages.PrivacyPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrivacyTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setup() {
        PrivacyPage.open();
    }

    @Test
    public void ChangeCookieSettingsTest() {
        boolean expectedResult = true;
        boolean actualResult;

        PrivacyPage.clickOnEditCookieSetings();
        PrivacyPage.clickOnCookieRadioButton();
        actualResult = PrivacyPage.checkCookieRadioButton();
        PrivacyPage.clickOnAgreeButton();
        PrivacyPage.clickOnHomeLogo();
        PrivacyPage.sleep(1000);
        //PrivacyTestPage.clickOnCookieSettings();
        Assert.assertTrue(actualResult == expectedResult);
    }
}
