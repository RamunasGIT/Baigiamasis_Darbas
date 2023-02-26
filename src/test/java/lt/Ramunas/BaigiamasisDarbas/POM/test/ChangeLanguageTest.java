package lt.Ramunas.BaigiamasisDarbas.POM.test;

import lt.Ramunas.BaigiamasisDarbas.POM.pages.FirstTestPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChangeLanguageTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setup() {
        FirstTestPage.open();
    }

    @Test
    public void ChangeLanguageTesting() {
        // test switches between LT and EN languages
        String expectedResultEN = "EN";
        String expectedResultLT = "LT";
        String actualResult;

        FirstTestPage.clickOnLanguageBar(); //Click on language bar
        FirstTestPage.clickOnEnLanguage(); //click on english language radio button
        FirstTestPage.sleep(1000);
        actualResult = FirstTestPage.checkLanguageName(); //put language name to actualResult
        Assert.assertTrue(actualResult.contains(expectedResultEN)); //compare if actualResult contains expectedResultEN
        FirstTestPage.clickOnLanguageBar();
        FirstTestPage.clickOnLtLanguage();
        FirstTestPage.sleep(1000);
        actualResult = FirstTestPage.checkLanguageName();
        Assert.assertTrue(actualResult.contains(expectedResultLT)); //compare if actualResult contains expectedResultLT
        FirstTestPage.sleep(1000);
    }
}
