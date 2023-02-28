package lt.Ramunas.BaigiamasisDarbas.POM.test;

import lt.Ramunas.BaigiamasisDarbas.POM.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @BeforeMethod
    @Override
    public void setup() {
        LoginPage.open();
    }

    @Test
    public void FakeLoginTesting() {
        // test try to login with fake data
        String loginName = "Ramūnas";
        String loginPasword = "!123456789";
        String expectedResult = "Neteisingi prisijungimo duomenys";
        String actualResult;

        LoginPage.inputUserName(loginName); // Put Username
        LoginPage.inputPassword(loginPasword); // Put password
        LoginPage.clickToLogin(); // click on login button
        LoginPage.sleep(1000); // wait for message
        actualResult = LoginPage.checkLoginMessage(); //put webpage login message text to actualResult
        Assert.assertTrue(actualResult.contains(expectedResult)); //compare if actualResult contains expectedResult
        LoginPage.sleep(1000);
    }
}
