//package com.ThomasCook.pages;
//
///**
// * Created by user on 10.04.17.
// */
//import com.liubchenko.core.WebDriverTestBase;
//import org.testng.annotations.Test;
//
//import static org.testng.AssertJUnit.assertEquals;
//
//public class ThomasCookDefaultSearchTest extends WebDriverTestBase {
//
//    private String urlThomasCook = "https://www.thomascook.com/";
//    private String defaultDepatureAirport = "Any Airport";
//
//
//    //Search with default parameters
//    @Test
//    public void defaultSearchTest(){
//        ThomasCookSearchPage thomasCookSearchPage = new ThomasCookSearchPage(driver);
//
//        thomasCookSearchPage.openURL(urlThomasCook);
//        thomasCookSearchPage.searchButton().click();
//
//        ThomasCookSearchResultPage thomasCookSearchResultPage = new ThomasCookSearchResultPage(driver);
//
//        assertEquals(thomasCookSearchResultPage.flightFromRO().getText().equals(defaultDepatureAirport), true);
//
//    }
//}
