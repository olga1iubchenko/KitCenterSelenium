//package com.ThomasCook.pages;
//
//import com.liubchenko.pages.AbstractPage;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
//
///**
// * Created by user on 29.03.17.
// */
//public class ThomasCookSearchPage extends AbstractPage {
//
//    @FindBy(how = How.XPATH, using = ".//*[@id='SearchbarForm-originContainer']//i[@class='FormField-icon FormField-icon--right FormField-icon--link icon airplaneNE']")
//    WebElement depatuteAirportIcon;
//
//    @FindBy(how = How.XPATH, using = ".//*[@id='PopularTooltip--airports']//label[@class='FormField-labelCheckbox FormField-labelCheckbox--w ng-binding']")
//    WebElement flyingFromAirport;
//
//    @FindBy(how = How.ID, using = "iconClose-airports")
//    WebElement closeDepatureAirportIcon;
//
//    @FindBy(how = How.XPATH, using = ".//*[@id='SearchbarForm-destinationContainer']/div/div/div/i")
//    WebElement flyingToLocationIcon;
//
//    @FindBy(how = How.XPATH, using = ".//*[@id='PopularTooltip--destinations']//label[@class='FormField-labelCheckbox FormField-labelCheckbox--w ng-binding']")
//     WebElement destionationCountry;
//
//    @FindBy(how=How.ID, using = "iconClose-destinations")
//    WebElement closeDestinationIcon;
//
//    @FindBy(how = How.ID, using ="when")
//    WebElement datePickerIcon;
//
//    @FindBy(how = How.CLASS_NAME, using = "ui-datepicker-month")
//    WebElement datePickerDDLMonth;
//
//    @FindBy(how = How.CLASS_NAME, using = "ui-datepicker-year")
//    WebElement datePickerDDLYear;
//
//    @FindBy(how = How.CLASS_NAME, using = "ui-datepicker-current-day")
//    WebElement currentDay;
//
////    @FindBy(how = How.XPATH, using = ".//*[@id='ui-datepicker-div']/table/tbody//a[.='1']")
////    WebElement customDateInCalendar;
//
//    @FindBy(how = How.ID, using = "SearchbarForm-duration")
//    WebElement durationDDlLocator;
//
//    @FindBy(how = How.ID, using = "SearchbarRooms-adults0")
//    WebElement adultCountLocator;
//
//    @FindBy(how = How.ID, using = "SearchbarRooms-children0")
//    WebElement childrenCountLocator;
//
//    @FindBy(how = How.XPATH, using = ".//*[@id='searchPanel']/form/div/div[2]/div[3]/div/label")
//    WebElement imFlexibleCheckBox;
//
//    @FindBy(how = How.ID, using = "SearchbarForm-submitBtn")
//    WebElement search;
//
//
//    public ThomasCookSearchPage(WebDriver driver) {
//        super(driver);
//        PageFactory.initElements(driver, this);
//    }
//
//    public void setFlyingFrom(String airport){
//        depatuteAirportIcon.click();
//        flyingFromAirport.click();
//        closeDepatureAirportIcon.click();
//
//        //flyingFromAirport.getAttribute("title");
//    }
//
//    public void setFlyingTo(String airport){
//        flyingToLocationIcon.click();
//        destionationCountry.click();
//        closeDestinationIcon.click();
//    }
//
//    public void setStartDate(String month, String year, String day){
//        datePickerIcon.click();
//
//        Select datePickerDDLMonthSelector = new Select(datePickerDDLMonth);
//        datePickerDDLMonthSelector.selectByVisibleText(month);
//
//        Select datePickerDDLYearSelector = new Select(datePickerDDLYear);
//        datePickerDDLYearSelector.selectByVisibleText(year);
//
//        driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody//a[.=" + day + "']"));
//
//        currentDay.click();
//    }
//
//    public void setDuration(String duration){
//          Select durationDDL = new Select(durationDDlLocator);
//          durationDDL.selectByVisibleText(duration);
//    }
////    public void setDuration(){
////        Select durationDDL = new Select(driver.findElement(By.id("SearchbarForm-duration")));
////        durationDDL.deselectAll();
////        durationDDL.getFirstSelectedOption();
////    }
//
//    public void setAdultsCount(String adultsCount){
//        Select adults = new Select(adultCountLocator);
//        adults.deselectAll();
//        adults.selectByVisibleText(adultsCount);
//    }
//
//    public void setUnder17sCount(String under17sCount){
//        Select children = new Select(childrenCountLocator);
//        children.deselectAll();
//        children.selectByVisibleText(under17sCount);
//    }
//
//    public void uncheckImFlexibleCheckBox(){
//        imFlexibleCheckBox.click();
//    }
//
//    public WebElement searchButton(){
//        return search;
//    }
//}
