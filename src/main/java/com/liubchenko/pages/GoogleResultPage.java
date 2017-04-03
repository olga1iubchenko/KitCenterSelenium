package com.liubchenko.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

/**
 * Created by user on 27.03.17.
 */
public class GoogleResultPage extends AbstractPage {

    @FindAll({
            @FindBy(how = How.CLASS_NAME, using = "rc")
    })
    List<WebElement> seleniumLinks;

    public GoogleResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public WebElement findLink() {
        webDriverUtils.waitForExpectedCondition(
                ExpectedConditions.visibilityOfAllElements(seleniumLinks));
        return seleniumLinks.get(0);
    }
}
