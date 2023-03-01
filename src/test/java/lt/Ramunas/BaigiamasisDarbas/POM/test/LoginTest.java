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
        String loginName = "Ramūnas";
        String loginPassword = "!123456789";
        String expectedResult = "Neteisingi prisijungimo duomenys";
        String actualResult;

        LoginPage.inputUserName(loginName);
        LoginPage.inputPassword(loginPassword);
        LoginPage.clickToLogin();
        LoginPage.sleep(1000);
        actualResult = LoginPage.checkLoginMessage();
        Assert.assertTrue(actualResult.contains(expectedResult));
        LoginPage.sleep(1000);
    }
}
