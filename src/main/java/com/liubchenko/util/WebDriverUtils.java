package com.liubchenko.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by user on 30.03.17.
 */
public class WebDriverUtils{
    WebDriverWait wait;

    public WebDriverUtils(WebDriver driver){
        wait = new WebDriverWait(driver, 40);
    }

    public void waitForExpectedCondition(ExpectedCondition expectedCondition) {
        wait.until(expectedCondition);
    }
}
