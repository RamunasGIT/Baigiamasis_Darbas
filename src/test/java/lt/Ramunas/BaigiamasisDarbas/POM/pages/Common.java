package lt.Ramunas.BaigiamasisDarbas.POM.pages;

import lt.Ramunas.BaigiamasisDarbas.POM.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    public static void letsWait(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    private static WebElement getElement(By locator) {
        return getDriver().findElement(locator);
    }

    public static void clickElement(By locator) {
        letsWait(locator);
        getElement(locator).click();
    }

    public static void sendKeysToElement(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public static String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public static void sleep(int milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    public static boolean getAttributeText(By locator) {
        return Boolean.parseBoolean(getElement(locator).getAttribute("aria-checked"));
    }

    public static void clickElementAction(By locator) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(getElement(locator));
        actions.click();
        actions.perform();
    }
}