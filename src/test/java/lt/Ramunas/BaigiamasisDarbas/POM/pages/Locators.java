package lt.Ramunas.BaigiamasisDarbas.POM.pages;

import org.openqa.selenium.By;

public class Locators {

    public static class LoginPage {
        public static By inputUsernameLocator = By.xpath("//input[@name='username']");
        public static By passwordLocator = By.xpath("//input[@type='password']");
        public static By submitLocator = By.xpath("//button[@type='submit']");
        public static By loginMessageLocator = By.xpath("//div[@aria-hidden='false']//div[@class='_content']");
    }

    public static class TicketsPage {
        public static By fromFieldLocator =
                By.xpath("//input[@aria-labelledby='stop-search-select-label-ticket-origin']");
        public static By toFieldLocator =
                By.xpath("//input[@aria-labelledby='stop-search-select-label-ticket-destination']");
        public static By travelDateFieldLocator =
                By.xpath("//div[4]/div/button");
        public static By travelDateDayLocator = By.xpath("//div[@aria-label='Pen 2023 m. kovo 31 d.']");
        public static By travelSearchLocator = By.xpath("//button[@class='sc-gb70f5-0 hEoOvn sc-2p7noq-0 hoOFwQ no-hc base']");
        public static By sortingLocator = By.xpath("//div[@class='btn sort-btn _has-right-icon']");
        public static By selectSortByFastestLocator = By.xpath("(//*[@id='label_search_sort_by-undefined'])[2]");
        public static By selectedSortingLocator = By.xpath("//*[@class='_label _selected']");
    }

    public static class HomePage {
        public static By buttonFieldLocator =
                By.xpath("//div[@class='sc-1x9p1xi-1 busGTG']/button[@class='sc-gb70f5-0 sc-lfu3w-0 ldiCwA fzfVgd']");
        public static By promoInputFieldLocator = By.xpath("//input[@name='promo-code']");
        public static By buttonActivatePromotionLocator =
                By.xpath("//button[@class='sc-gb70f5-0 sc-gb70f5-2 ldiCwA dNZMnJ sc-atzxhw-0 kuBndY primary']");
        public static By promoOutputMessageLocator = // promo output message field
                By.xpath("//div[@aria-hidden='false']//div[contains(text(), 'Įvestas akcijos kodas neteisingas')]");
        public static By buttonOpenLanguageMenuLocator = By.xpath("//button[@aria-label='locale switcher']");
        public static By buttonEnglishLanguageLocator = By.xpath("//*[@aria-labelledby='label_locale_en']");
        public static By languageStatusLocator =
                By.xpath("//button[@aria-label='locale switcher']//span[@class='_label']");
        public static By buttonLithuanianLanguageLocator = By.xpath("//*[@aria-labelledby='label_locale_lt']");
    }

    public static class PrivacyPage {
        public static By editCookieSettingsLocator =
                By.xpath("//button[@class='button inverted secondary'][2]");
        public static By cookiesRadioButtonLocator = By.xpath("//span[contains(text(), 'Analitikos slapukai')]");
        public static By agreeButtonLocator = By.xpath("//button[contains(text(), 'Sutinku')]");
        public static By cookiesRadioButtonCheckedLocator = By.xpath("//label[@class='checkbox checked']");
        public static By homeLogoLocator = By.xpath("//a[@class='_logo']");
    }
}

