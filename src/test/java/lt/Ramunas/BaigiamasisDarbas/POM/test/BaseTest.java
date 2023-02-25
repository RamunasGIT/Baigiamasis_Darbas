package lt.Ramunas.BaigiamasisDarbas.POM.test;

import lt.Ramunas.BaigiamasisDarbas.POM.pages.Common;
import lt.Ramunas.BaigiamasisDarbas.POM.utils.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)

public abstract class BaseTest {

    @BeforeMethod
    public abstract void setup();

    @AfterMethod
    public void teardown() {
        Common.closeDriver();

    }


}
