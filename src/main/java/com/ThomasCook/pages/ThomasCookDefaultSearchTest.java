package com.ThomasCook.pages;

import com.liubchenko.core.WebDriverTestBase;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by user on 30.03.17.
 */
public class ThomasCookDefaultSearchTest extends WebDriverTestBase {

    private String urlThomasCook = "https://www.thomascook.com/";
    private String defaultDepatureAirport = "Any Airport";
    private String depatureAirport = "Any London";
    private String destination = "Italy";

    //Search with default parameters
    @Test
    public void defaultSearchTest(){
        ThomasCookSearchPage thomasCookSearchPage = new ThomasCookSearchPage(driver);

        thomasCookSearchPage.openURL(urlThomasCook);
        thomasCookSearchPage.searchButton().click();

        ThomasCookSearchResultPage thomasCookSearchResultPage = new ThomasCookSearchResultPage(driver);

        assertEquals(thomasCookSearchResultPage.flightFromRO().getText().equals(defaultDepatureAirport), true);

    }

    //Search with defined parameters
//    @Test
//
//
//    }

}
