package com.liubchenko.pages;

import com.liubchenko.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by user on 23.03.17.
 */
public class GoogleSearchPage extends AbstractPage {

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    }
//public WebElement searchField = driver.findElement(By.name("q"));
//public void searchTest() {
//driver.get("https://google.com.ua/");



