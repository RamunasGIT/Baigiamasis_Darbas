package lt.Ramunas.BaigiamasisDarbas.POM.pages;

public class HomePage {

    public static void open() {
        Common.openUrl("https://ltglink.lt");
    }

    public static void clickPromotionButton() {
        Common.clickElement(Locators.HomePage.buttonFieldLocator);
    }

    public static void inputPromotionCode(String promotionCode) {
        Common.sendKeysToElement(Locators.HomePage.promoInputFieldLocator,
                promotionCode);
    }

    public static void clickToActivatePromotionCodeButton() {
        Common.clickElement(Locators.HomePage.buttonActivatePromotionLocator);
    }

    public static String readPromotionCodeMessage() {
        return Common.getElementText(Locators.HomePage.promoOutputMessageLocator);
    }

    public static void sleep(int milliSeconds) {
        Common.sleep(milliSeconds);
    }

    public static void clickOnLanguageBar() {
        Common.clickElement(Locators.HomePage.buttonOpenLanguageMenuLocator);
    }

    public static void clickOnEnLanguage() {
        Common.clickElement(Locators.HomePage.buttonEnglishLanguageLocator);
    }

    public static String checkLanguageName() {
        return Common.getElementText(Locators.HomePage.languageStatusLocator);
    }

    public static void clickOnLtLanguage() {
        Common.clickElement(Locators.HomePage.buttonLithuanianLanguageLocator);
    }
}
