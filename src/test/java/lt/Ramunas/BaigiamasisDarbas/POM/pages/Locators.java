package lt.Ramunas.BaigiamasisDarbas.POM.pages;

import org.openqa.selenium.By;

public class Locators {


    public class LoginFields {
        public static By usernameLocator = By.xpath("//input[@name='username']");
        public static By passwordLocator = By.xpath("//input[@type='password']");
        public static By submitLocator = By.xpath("//button[@type='submit']");
        public static By loginMessage = By.xpath("//div[@aria-hidden='false']//div[@class='_content']");
    }


    public class TicketsSearchField {
        public static By FromField = //put from value
                By.xpath("//input[@aria-labelledby='stop-search-select-label-ticket-origin']");
        public static By ToField = //put to destination value
                By.xpath("//input[@aria-labelledby='stop-search-select-label-ticket-destination']");
        public static By travelDateField =
                By.xpath("//div[4]/div/button");
        public static By travelDateMonth = By.xpath("//button[@aria-label='next month']");
        public static By travelDateDay = By.xpath("//div[@class='DayPicker-Day' and @aria-label='Tre 2023 m. kovo 8 d.']");
        public static By travelSearch = By.xpath("//button[@class='sc-gb70f5-0 hEoOvn sc-2p7noq-0 hoOFwQ no-hc base']");
    }

    public class PromotionField {
        public static By buttonField = //promotion button field
                By.xpath("//div[@class='sc-1x9p1xi-1 busGTG']/button[@class='sc-gb70f5-0 sc-lfu3w-0 ldiCwA fzfVgd']");
        public static By promoInputField = By.xpath("//input[@name='promo-code']");//promo code input field
        public static By buttonActivatePromotion =
                By.xpath("//button[@class='sc-gb70f5-0 sc-gb70f5-2 ldiCwA dNZMnJ sc-atzxhw-0 kuBndY primary']");
        public static By promoOutputMessage = // promo output message field
                By.xpath("//div[@aria-hidden='false']//div[contains(text(), 'Įvestas akcijos kodas neteisingas')]");
    }

    public class LanguageBar {
        public static By buttonOpenLanguageMenu = By.xpath("//button[@aria-label='locale switcher']");
        public static By buttonEnglishLanguage = By.xpath("//*[@aria-labelledby='label_locale_en']");
        public static By languageStatus =
                By.xpath("//button[@aria-label='locale switcher']//span[@class='_label']");
        public static By buttonLithunianLanguage = By.xpath("//*[@aria-labelledby='label_locale_lt']");
    }
}
