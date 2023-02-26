package lt.Ramunas.BaigiamasisDarbas.POM.pages;

import lt.Ramunas.BaigiamasisDarbas.POM.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static lt.Ramunas.BaigiamasisDarbas.POM.utils.Driver.getDriver;
import static lt.Ramunas.BaigiamasisDarbas.POM.utils.Driver.setDriver;


public class Common {


    public static void openUrl(String link) {
        setDriver();
        getDriver().get(link);
    }

    public static void closeDriver() {
        Driver.closeDriver();
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    private static WebElement getElement(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        return getDriver().findElement(locator);
    }

    public static void sendKeysToElement(By locator, String promotionCode) {
        getElement(locator).sendKeys(promotionCode);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void sleep(int miliSeconds) {

        try {
            Thread.sleep(miliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
