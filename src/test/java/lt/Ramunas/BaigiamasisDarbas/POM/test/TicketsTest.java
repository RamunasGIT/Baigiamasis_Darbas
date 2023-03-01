package lt.Ramunas.BaigiamasisDarbas.POM.test;

import lt.Ramunas.BaigiamasisDarbas.POM.pages.TicketsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TicketsTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setup() {
        TicketsPage.open();
    }

    @Test
    public void SearchForTickets() {
        String fromOrigin = "Vilnius";
        String toDestination = "Kaunas";
        String expectedResult = "Pirmiausia greičiausi";
        String actualResult;

        TicketsPage.inputTravelFrom(fromOrigin);
        TicketsPage.inputTravelTo(toDestination);
        TicketsPage.clickOnTravelDate();
        TicketsPage.clickSearchButton();
        TicketsPage.sortByFastest();
        actualResult = TicketsPage.checkSortingByFastestResult();

        Assert.assertTrue(actualResult.contains(expectedResult));

    }
}
