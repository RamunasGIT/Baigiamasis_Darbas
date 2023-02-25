package lt.Ramunas.BaigiamasisDarbas.POM.pages;

public class FirstTestPage {

    public static void open() {
        Common.openUrl("https://ltglink.lt");
    }

    public static void close() {
        Common.closeDriver();
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
}
