package lt.Ramunas.BaigiamasisDarbas.POM.pages;

public class FirstTestPage {

    public static void open() {
        Common.openUrl("https://ltglink.lt");
    }

    public static void clickPromotionButton() {
        Common.clickElement(Locators.PromotionField.buttonField);
    }

    public static void inputPromotionCode(String promotionCode) {
        Common.sendKeysToElement(Locators.PromotionField.promoInputField,
                promotionCode);
    }

    public static void clickToActivatePromotionCodeButton() {
        Common.clickElement(Locators.PromotionField.buttonActivatePromotion);
    }

    public static String readPromotionCodeMessage() {
        return Common.getElementText(Locators.PromotionField.promoOutputMessage);
    }

    public static void sleep(int miliSeconds) {
        Common.sleep(miliSeconds);
    }

    public static void clickOnLanguageBar() {
        Common.clickElement(Locators.LanguageBar.buttonOpenLanguageMenu);
    }

    public static void clickOnEnLanguage() {
        Common.clickElement(Locators.LanguageBar.buttonEnglishLanguage);
    }

    public static String checkLanguageName() {
        return Common.getElementText(Locators.LanguageBar.languageStatus);
    }

    public static void clickOnLtLanguage() {
        Common.clickElement(Locators.LanguageBar.buttonLithunianLanguage);
    }
}
