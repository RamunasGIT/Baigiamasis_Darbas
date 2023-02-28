package lt.Ramunas.BaigiamasisDarbas.POM.pages;

public class PrivacyPage {

    public static void open() {
        Common.openUrl("https://ltglink.lt/privatumo-pranesimas");
    }

    public static void sleep(int miliSeconds) {
        Common.sleep(miliSeconds);
    }

    public static void clickOnCookieSettings() {
        Common.waitForElementToBeVisible(Locators.PrivacyPageLocators.cookieSettingsLocator);
        Common.clickElement(Locators.PrivacyPageLocators.cookieSettingsLocator);
    }

    public static void clickOnEditCookieSetings() {
        Common.clickElement(Locators.PrivacyPageLocators.editCookieSettingsLocator);
    }

    public static void clickOnCookieRadioButton() {
        Common.clickElement(Locators.PrivacyPageLocators.cookiesRadioButtonLocator);
    }

    public static void clickOnAgreeButton() {
        Common.clickElement(Locators.PrivacyPageLocators.agreeButtonLocator);
    }

    public static boolean checkCookieRadioButton() {
        return Common.getAttributText(Locators.PrivacyPageLocators.cookiesRadioButtonCheckedLocator);
    }

    public static void clickOnHomeLogo() {
        Common.clickElement(Locators.PrivacyPageLocators.homeLogoLocator);
    }
}
