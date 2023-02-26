package lt.Ramunas.BaigiamasisDarbas.POM.pages;

public class SearchForTicketsPage {

    public static void open() {
        Common.openUrl("https://bilietas.ltglink.lt/");
    }

    public static void inputTravelFrom(String place) {
        Common.sendKeysToElement(Locators.TicketsSearchField.FromField, place);
    }

    public static void inputTravelTo(String place) {
        Common.sendKeysToElement(Locators.TicketsSearchField.ToField, place);
    }

    public static void clickOnTravelDate() {
        Common.clickElement(Locators.TicketsSearchField.travelDateField);
        Common.clickElement(Locators.TicketsSearchField.travelDateMonth);
        Common.clickElement(Locators.TicketsSearchField.travelDateDay);
    }

    public static void clickSearchButton() {
        Common.clickElement(Locators.TicketsSearchField.travelSearch);
    }

    public static String checkSearchResult() {
        return Common.getURL();
    }
}
