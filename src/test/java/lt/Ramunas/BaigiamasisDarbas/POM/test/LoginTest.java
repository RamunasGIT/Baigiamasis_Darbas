package lt.Ramunas.BaigiamasisDarbas.POM.test;

import lt.Ramunas.BaigiamasisDarbas.POM.pages.FirstTestPage;
import lt.Ramunas.BaigiamasisDarbas.POM.pages.LoginTestPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @BeforeMethod
    @Override
    public void setup() {
        LoginTestPage.open();
    }

    @Test
    public void FakeLoginTesting() {
        // test try to login with fake data
        String loginName = "Ramūnas";
        String loginPasword = "!123456789";
        String expectedResult = "Neteisingi prisijungimo duomenys";
        String actualResult;

        LoginTestPage.inputUserName(loginName); // Put Username
        LoginTestPage.inputPassword(loginPasword); // Put password
        LoginTestPage.clickToLogin(); // click on login button
        LoginTestPage.sleep(1000); // wait for message
        actualResult = LoginTestPage.checkLoginMessage(); //put webpage login message text to actualResult
        Assert.assertTrue(actualResult.contains(expectedResult)); //compare if actualResult contains expectedResult
        LoginTestPage.sleep(1000);
    }
}
