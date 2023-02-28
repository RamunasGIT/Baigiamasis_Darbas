package lt.Ramunas.BaigiamasisDarbas.POM.pages;

public class TicketsPage {

    public static void open() {
        Common.openUrl("https://bilietas.ltglink.lt/");
    }

    public static void inputTravelFrom(String place) {
        Common.sendKeysToElement(Locators.TicketsPage.fromFieldLocator, place);
    }

    public static void inputTravelTo(String place) {
        Common.sendKeysToElement(Locators.TicketsPage.toFieldLocator, place);
    }

    public static void clickOnTravelDate() {
        Common.clickElement(Locators.TicketsPage.travelDateFieldLocator);
        Common.clickElement(Locators.TicketsPage.travelDateMonthLocator);
        Common.clickElement(Locators.TicketsPage.travelDateDayLocator);
    }

    public static void clickSearchButton() {
        Common.clickElement(Locators.TicketsPage.travelSearchLocator);
    }

    public static String checkSearchResult() {
        return Common.getURL();
    }
}
