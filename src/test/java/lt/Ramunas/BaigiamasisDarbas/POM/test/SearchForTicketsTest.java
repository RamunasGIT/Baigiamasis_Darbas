package lt.Ramunas.BaigiamasisDarbas.POM.test;

import lt.Ramunas.BaigiamasisDarbas.POM.pages.FirstTestPage;
import lt.Ramunas.BaigiamasisDarbas.POM.pages.SearchForTicketsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchForTicketsTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setup() {
        SearchForTicketsPage.open();
    }

    @Test
    public void SearchForTickets() {
        String fromOrigin = "Vilnius";
        String toDestination = "Kaunas";
        String expectedResult = "2023-03-08";
        String actualResult;


        SearchForTicketsPage.inputTravelFrom(fromOrigin); //put fromOrigin to travel search origin field
        SearchForTicketsPage.inputTravelTo(toDestination);//put toDestination to travel search destination field
        SearchForTicketsPage.clickOnTravelDate();//clink on date field then click on month change button and then choose date
        SearchForTicketsPage.clickSearchButton(); // click on search button
        FirstTestPage.sleep(2000);//delay to show search result
        actualResult = SearchForTicketsPage.checkSearchResult(); //put current url to actualResult

        Assert.assertTrue(actualResult.contains(expectedResult)); //compare if actualResult url contains expectedResult date then ok

    }
}
