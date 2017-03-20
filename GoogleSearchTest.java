package edu.SeleniumIntro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

/**
 * Created by user on 20.03.17.
 */


public class GoogleSearchTest {
    WebDriver driver;

    //Preconditions
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "/home/user/IdeaProjects/SeleniumKit/src/test/resources/geckodriverUnix");
        //Initializes a browser
        driver = new FirefoxDriver();
        //Maximazes a window size
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Opens an url
        driver.get("https://google.com.ua");
    }

        @Test
        public void searchTest() {

            //Finds element by name
            WebElement searchField = driver.findElement((By.name("q")));

            //Sends "Selenium" text into an input field
            searchField.sendKeys("Selenium");
            searchField.submit();

            //Finds first link  with specified result
            WebElement seleniumLink = driver.findElement(By.xpath(".//*[@id='rso']/div/li[1]/div/h3/a"));
            //Verifies a result
            assertEquals(seleniumLink.getText().contains("Selenium"), true);
        }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}




