//package com.ThomasCook.pages;
//
//import com.liubchenko.core.WebDriverTestBase;
//import org.testng.annotations.Test;
//
//import static org.testng.AssertJUnit.assertEquals;
//
///**
// * Created by user on 30.03.17.
// */
//public class ThomasCookSearchWithParamsTest extends WebDriverTestBase {
//
//    private String urlThomasCook = "https://www.thomascook.com/";
//    private String depatureAirport = "Any London";
//    private String targetDestination = "Antigua, Any";
//    private String customDuration = "7 Nights";
//    private String startDate = "02 May 2017";
//
//    //Verification of departure airport search
//    @Test
//    public void departureAirportSearchTest(){
//
//        ThomasCookSearchPage thomasCookSearchPage = new ThomasCookSearchPage(driver);
//
//        thomasCookSearchPage.openURL(urlThomasCook);
//        thomasCookSearchPage.setFlyingFrom(depatureAirport);
//        thomasCookSearchPage.searchButton().click();
//
//        ThomasCookSearchResultPage thomasCookSearchResultPage = new ThomasCookSearchResultPage(driver);
//
//        assertEquals(thomasCookSearchResultPage.flyingFrom().getText().equals(depatureAirport), true);
//    }
//
//    //Verification of destination search
//    @Test
//    public void destinationSearchTest(){
//
//        ThomasCookSearchPage thomasCookSearchPage = new ThomasCookSearchPage(driver);
//
//        thomasCookSearchPage.openURL(urlThomasCook);
//        thomasCookSearchPage.setFlyingTo(targetDestination);
//        thomasCookSearchPage.searchButton().click();
//
//        ThomasCookSearchResultPage thomasCookSearchResultPage = new ThomasCookSearchResultPage(driver);
//
//        assertEquals(thomasCookSearchResultPage.flightToRO().getText().equals(targetDestination), true);
//    }
//
//     //DRAFT Test
////    @Test
////    public void dateFromSearchTest(){
////
////        ThomasCookSearchPage thomasCookSearchPage = new ThomasCookSearchPage(driver);
////
////        thomasCookSearchPage.openURL(urlThomasCook);
////        thomasCookSearchPage.setStartDate("May", "2017");
////        thomasCookSearchPage.searchButton().click();
////
////        ThomasCookSearchResultPage thomasCookSearchResultPage = new ThomasCookSearchResultPage(driver);
////
////        assertEquals(thomasCookSearchResultPage.dateAndDuration().getText().contains(startDate), true);
////    }
//
//    //Verification of duration
//    @Test
//    public void durationTest() {
//        ThomasCookSearchPage thomasCookSearchPage = new ThomasCookSearchPage(driver);
//
//        thomasCookSearchPage.openURL(urlThomasCook);
//        thomasCookSearchPage.setDuration(customDuration);
//        thomasCookSearchPage.searchButton().click();
//
//        ThomasCookSearchResultPage thomasCookSearchResultPage = new ThomasCookSearchResultPage(driver);
//
//        assertEquals(thomasCookSearchResultPage.findPropostionDuration().getText().contains(customDuration), true);
//    }
//
//}
