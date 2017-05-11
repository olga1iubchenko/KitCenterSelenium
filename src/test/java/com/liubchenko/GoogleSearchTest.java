package com.liubchenko;

import com.liubchenko.core.WebDriverTestBase;
import com.liubchenko.pages.GoogleResultPage;
import com.liubchenko.pages.GoogleSearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Title;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.invoke.MethodHandles;
import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by user on 27.03.17.
 */


@Title("Google search result test")
@Description("Test performed with set of input provided with TestNG DataProvider")

//@Listeners({com.liubchenko.core.TestListener.class})
public class GoogleSearchTest extends WebDriverTestBase{

    private WebDriver driver;
    private static final Logger LOG = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    //@Parameters({ "platform","browser"})
//    @BeforeTest(alwaysRun=true)
//    public void setup(String platform, String browser) throws MalformedURLException
//    {
//        DesiredCapabilities caps = new DesiredCapabilities();
//        if(platform.equalsIgnoreCase("Linux")) {
//            caps.setBrowserName(browser);
//        }
//        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
//    }
//    @Test(description="Test Google")
//    public void testBmiCalculator() throws InterruptedException {
//        driver.get("https://www.google.com.ua");
//    }


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
