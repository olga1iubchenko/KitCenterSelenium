package com.liubchenko.pages;

import com.liubchenko.core.WebDriverTestBase;
import com.liubchenko.util.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by user on 27.03.17.
 */
public class AbstractPage{
   protected WebDriver driver;
   protected WebDriverUtils webDriverUtils;

    @FindBy(how = How.NAME, using = "q")
    WebElement searchField;


    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        webDriverUtils = new WebDriverUtils(this.driver);
    }

    public void openURL(String url) {
        driver.get(url);
    }

    public void click(String id) {
        WebElement button = driver.findElement(By.id(id));
    }

    public void sendInputToSearchField(String input) {
        searchField.sendKeys(input);
        searchField.submit();
        webDriverUtils = new WebDriverUtils(this.driver);
    }


 }



