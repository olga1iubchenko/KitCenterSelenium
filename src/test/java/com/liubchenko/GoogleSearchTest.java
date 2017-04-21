package com.liubchenko;

import com.liubchenko.core.WebDriverTestBase;
import com.liubchenko.pages.GoogleResultPage;
import com.liubchenko.pages.GoogleSearchPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by user on 27.03.17.
 */

@Title("Google search result test")
@Description("Test performed with set of input provided with TestNG DataProvider")

@Listeners({com.liubchenko.core.TestListener.class})
public class GoogleSearchTest extends WebDriverTestBase{
    @DataProvider(name = "input")
    public static Object[][] inputFields() {
        return new Object[][] {{"Selenium"}, {"TestNG"}};
    }

    private String url ="https://google.com.ua/";

    @Title("Google Search Test")
    @Description("Test of google search performed with set of input provided with TestNG DataProvider")
    @Test(dataProvider = "input")
   public void testGoogleSearch(String input) {
       GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);

       googleSearchPage.openURL(url);

       googleSearchPage.sendInputToSearchField(input);

       GoogleResultPage googleResultPage = new GoogleResultPage(driver);

       googleResultPage.findLink();

       googleResultPage.jsClick(googleResultPage.findLink());

       //Verifies a result
       assertEquals(googleResultPage.findLink().getText().contains(input), true);
   }

}
