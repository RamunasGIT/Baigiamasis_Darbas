package lt.Ramunas.BaigiamasisDarbas.POM.pages;

public class PrivacyPage {

    public static void open() {
        Common.openUrl("https://ltglink.lt/privatumo-pranesimas");
    }

    public static void sleep(int miliSeconds) {
        Common.sleep(miliSeconds);
    }

    public static void clickOnEditCookieSettings() {
        Common.clickElementAction(Locators.PrivacyPage.editCookieSettingsLocator);
    }

    public static void clickOnCookieRadioButton() {
        Common.clickElement(Locators.PrivacyPage.cookiesRadioButtonLocator);
    }

    public static void clickOnAgreeButton() {
        Common.clickElement(Locators.PrivacyPage.agreeButtonLocator);
    }

    public static boolean checkCookieRadioButton() {
        return Common.getAttributeText(Locators.PrivacyPage.cookiesRadioButtonCheckedLocator);
    }

    public static void clickOnHomeLogo() {
        Common.clickElement(Locators.PrivacyPage.homeLogoLocator);
    }
}
