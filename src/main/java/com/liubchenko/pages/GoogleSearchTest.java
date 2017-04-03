package com.liubchenko.pages;

import com.liubchenko.core.WebDriverTestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by user on 27.03.17.
 */
public class GoogleSearchTest extends WebDriverTestBase{
    @DataProvider(name = "input")
    public static Object[][] inputFields() {
        return new Object[][] {{"Selenium"}, {"TestNG"}};
    }

    private String url ="https://google.com.ua/";

    @Test(dataProvider = "input")
   public void testGoogleSearch(String input) {
       GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);

       googleSearchPage.openURL(url);

       googleSearchPage.sendInputToSearchField(input);

       GoogleResultPage googleResultPage = new GoogleResultPage(driver);

       googleResultPage.findLink();

       //Verifies a result
       assertEquals(googleResultPage.findLink().getText().contains(input), true);
   }
}
