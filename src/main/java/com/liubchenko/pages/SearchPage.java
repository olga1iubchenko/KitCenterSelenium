package com.liubchenko.pages;

import com.liubchenko.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by user on 23.03.17.
 */
public class SearchPage extends WebDriverTestBase {


    @Test
    public void searchTest() {
        driver.get("https://google.com.ua/");

        //Finds element by name
        WebElement searchField = driver.findElement(By.name("q"));

        //Sends "Selenium" text into an input field
        searchField.sendKeys("Selenium");
        searchField.submit();

        //Finds first link  with specified result
        WebElement seleniumLink = driver.findElement(By.xpath(".//*[@id='rso']/div/li[1]/div/h3/a"));
        //Verifies a result
        assertEquals(seleniumLink.getText().contains("Selenium"), true);
    }

}


