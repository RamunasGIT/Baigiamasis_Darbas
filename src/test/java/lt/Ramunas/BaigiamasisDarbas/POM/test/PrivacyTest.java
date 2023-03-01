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

        PrivacyPage.clickOnEditCookieSettings();
        PrivacyPage.clickOnCookieRadioButton();
        actualResult = PrivacyPage.checkCookieRadioButton();
        PrivacyPage.clickOnAgreeButton();
        PrivacyPage.clickOnHomeLogo();

        Assert.assertEquals(expectedResult, actualResult);
    }
}
