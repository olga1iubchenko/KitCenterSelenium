package com.ThomasCook.pages;

import com.liubchenko.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by user on 29.03.17.
 */
public class ThomasCookSearchPage extends AbstractPage {

    @FindBy(how = How.XPATH, using = ".//*[@id='SearchbarForm-originContainer']/div/div/div/tc-typeahead/div/div[contains(concat(' ',@class,' '), 'SearchbarForm-summary ')]")
    WebElement flyingFromField;

    @FindBy(how = How.XPATH, using = ".//*[@id='SearchbarForm-destinationContainer']/div/div/div/i")
    WebElement flyingToLocationIcon;

    @FindBy(how = How.XPATH, using = ".//*[@id='PopularTooltip--destinations']/div[2]/div/div[3]/div[4]/label")
     WebElement destionationCountry;

    @FindBy(how = How.ID, using = "SearchbarForm-duration")
    WebElement durationDDlLocator;

    @FindBy(how = How.ID, using = "SearchbarRooms-adults0")
    WebElement adultCountLocator;

    @FindBy(how = How.ID, using = "SearchbarRooms-children0")
    WebElement childrenCountLocator;

    @FindBy(how = How.XPATH, using = ".//*[@id='searchPanel']/form/div/div[2]/div[3]/div/label")
    WebElement imFlexibleCheckBox;

    @FindBy(how = How.ID, using = "SearchbarForm-submitBtn")
    WebElement search;


    public ThomasCookSearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void setFlyingFrom(String airport){
        flyingFromField.sendKeys(airport);
        flyingFromField.submit();
    }

    public void setFlyingTo(String airport){
        flyingToLocationIcon.click();
        destionationCountry.click();
    }

    public void setStartDate(){

    }

    public void setDuration(String duration){
          Select durationDDL = new Select(durationDDlLocator);
          durationDDL.deselectAll();
          durationDDL.selectByVisibleText(duration);
    }
//    public void setDuration(){
//        Select durationDDL = new Select(driver.findElement(By.id("SearchbarForm-duration")));
//        durationDDL.deselectAll();
//        durationDDL.getFirstSelectedOption();
//    }

    public void setAdultsCount(String adultsCount){
        Select adults = new Select(adultCountLocator);
        adults.deselectAll();
        adults.selectByVisibleText(adultsCount);
    }

    public void setUnder17sCount(String under17sCount){
        Select children = new Select(childrenCountLocator);
        children.deselectAll();
        children.selectByVisibleText(under17sCount);
    }

    public void uncheckImFlexibleCheckBox(){
        imFlexibleCheckBox.click();
    }

    public WebElement searchButton(){
        return search;
    }
}
