package lt.Ramunas.BaigiamasisDarbas.POM.pages;

import org.openqa.selenium.By;

public class Locators {


    public class PromotionField {

        public static By buttonField = //promotion button field
                By.xpath("//div[@class='sc-1x9p1xi-1 busGTG']/button[@class='sc-gb70f5-0 sc-lfu3w-0 ldiCwA fzfVgd']");
        public static By promoInputField = By.xpath("//input[@name='promo-code']");//promo code input field
        public static By buttonActivatePromotion =
                By.xpath("//button[@class='sc-gb70f5-0 sc-gb70f5-2 ldiCwA dNZMnJ sc-atzxhw-0 kuBndY primary']");
        public static By promoOutputMessage = // promo output message field
                By.xpath("//div[@aria-hidden='false']//div[contains(text(), 'Įvestas akcijos kodas neteisingas')]");
    }
}
