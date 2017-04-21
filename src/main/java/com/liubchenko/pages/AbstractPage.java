package com.liubchenko.pages;

import com.liubchenko.core.WebDriverTestBase;
import com.liubchenko.util.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import ru.yandex.qatools.allure.annotations.Step;

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

    @Step("Open URL")
    public void openURL(String url) {
        driver.get(url);
    }


    @Step("Click on webelement")
    public void click(String id) {
        WebElement button = driver.findElement(By.id(id));
    }

    @Step("Send input to depined search field")
    public void sendInputToSearchField(String input) {
        searchField.sendKeys(input);
        searchField.submit();
        webDriverUtils = new WebDriverUtils(this.driver);
    }

    @Step("JS Click")
    public void jsClick(WebElement element) {
        JavascriptExecutor executor;
        executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }


 }



