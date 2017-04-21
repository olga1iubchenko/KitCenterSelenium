//package com.ThomasCook.pages;
//
//import com.liubchenko.pages.AbstractPage;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindAll;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//import java.util.List;
//
///**
// * Created by user on 30.03.17.
// */
//public class ThomasCookSearchResultPage extends AbstractPage {
//
//   @FindBy(how = How.ID, using = "SearchbarReadonly-origin")
//   WebElement flyingFromRO;
//
//   @FindBy(how = How.ID, using = "SearchbarReadonly-goingTo")
//   WebElement flyingToRO;
//
//   @FindBy(how = How.XPATH, using = ".//*[@id='searchPanel']/div[2]/div/dl[1]/dd")
//   WebElement dateAndDuration;
//
//   @FindBy(how = How.CSS, using = "#facet-depAirport .facetMultiDropDown-optionTitle")
//   WebElement flyingFrom;
//
//    @FindBy(how = How.CSS, using = "#facet-commercialDestination .facetMultiDropDown-optionTitle")
//    WebElement flyingTo;
//
//   @FindBy(how = How.XPATH, using = ".//*[@id='facet-durationFacet']/div/div/div[2]/select")
//   WebElement durationComboBox;
//
//   @FindBy(how = How.XPATH, using = ".//*[@id='facet-commercialDestination']/facet-multi-drop-down/div/div[2]/select")
//   WebElement destionationsComboBox;
//
//   @FindBy(how = How.XPATH, using = ".//*[@id='facet-depAirport']/facet-multi-drop-down/div/div[2]/select")
//   WebElement depaturesComboBox;
//
//    @FindAll({
//            @FindBy(how = How.CSS, using = ".t-tertiary.item-duration")
//    })
//    List<WebElement> propositionDuration;
//
//    public ThomasCookSearchResultPage(WebDriver driver){
//        super(driver);
//        PageFactory.initElements(driver, this);
//    }
//
//    public WebElement flightFromRO(){
//        return flyingFromRO;
//    }
//    public WebElement flightToRO(){
//        return flyingToRO;
//    }
//
//    public WebElement dateAndDuration(){
//      return dateAndDuration;
//    }
//
//    public WebElement flyingFrom() { return flyingFrom; }
//
//    public WebElement flyingTo() { return flyingTo; }
//
//    public WebElement duration(){
//      return durationComboBox;
//    }
//
//    public WebElement destinations(){
//        return destionationsComboBox;
//    }
//
//    public WebElement depatureAirport(){
//       return depaturesComboBox;
//    }
//
//    public WebElement findPropostionDuration() {
//        return propositionDuration.get(0);
//    }
//
//}
