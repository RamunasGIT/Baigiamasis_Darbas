package lt.Ramunas.BaigiamasisDarbas.POM.pages;

public class LoginTestPage {

    public static void open() {
        Common.openUrl("https://bilietas.ltglink.lt/account/login");
    }


    public static void inputUserName(String text) {
        Common.sendKeysToElement(Locators.LoginFields.usernameLocator, text);
    }

    public static void inputPassword(String text) {
        Common.sendKeysToElement(Locators.LoginFields.passwordLocator, text);
    }

    public static void clickToLogin() {
        Common.clickElement(Locators.LoginFields.submitLocator);
    }

    public static void sleep(int miliSeconds) {
        Common.sleep(miliSeconds);
    }

    public static String checkLoginMessage() {
        return Common.getElementText(Locators.LoginFields.loginMessage);
    }
}
