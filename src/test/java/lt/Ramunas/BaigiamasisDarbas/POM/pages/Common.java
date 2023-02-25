package lt.Ramunas.BaigiamasisDarbas.POM.pages;

import lt.Ramunas.BaigiamasisDarbas.POM.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Common {


    public static void openUrl(String link) {
        Driver.setDriver();
        Driver.getDriver().get(link);
    }

    public static void closeDriver() {
        Driver.closeDriver();
    }

    public static void clickElement(By locator) {
        getElement(locator).click();
    }

    private static WebElement getElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public static void sendKeysToElement(By locator, String promotionCode) {
        getElement(locator).sendKeys(promotionCode);//ivedam nuolaida
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
