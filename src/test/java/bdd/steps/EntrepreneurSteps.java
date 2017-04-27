package bdd.steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

public class EntrepreneurSteps {
    protected WebDriver driver;
    private WebElement fieldFio;
    private WebElement fieldCity;
    private WebElement fieldPhoneNumber;
    private WebElement fieldEmail;
    private WebElement fieldPassword;
    private WebElement checkBox;
    private WebElement nextStepButton;
    private WebElement projectNameLabel;
    private By fieldFioLocator = By.xpath(".//*[@id='fio']");
    private By fieldCityLocator = By.xpath(".//*[@id='city']");
    private By fieldPhoneLocator = By.id("tel");
    private By fieldEmailLocator = By.id("mail");
    private By fieldPasswordLocator = By.id("pass");
    private By checkBoxShowPassLocator = By.xpath(".//*[@id='entrepreneur-register-form']/div[1]/div/div[2]/form/div[5]/div[3]/div/label");
    private By nextStepLocator = By.xpath(".//*[@id='entrepreneur-register-form']/div[1]/div/div[2]/form/div[6]/button");
    private By projectNameLabelLocator = By.xpath(".//*[@id='entrepreneur-register-form']/div[1]/div/div[2]/form/div[1]/label");

    public void fillFieldWithData(By locator, String inputData){
         WebElement webElement = driver.findElement(locator);
         webElement.clear();
         webElement.sendKeys(inputData);
         Assert.assertEquals(webElement.getAttribute("value"), inputData);
    }

    @Given("^I am on new project registration page \"([^\"]*)\"$")
    public void setup(String url) {
//        System.setProperty("webdriver.gecko.driver", "C:\\KIT\\AboutTheCodeAutomationE2E\\e2e_automation\\src\\test\\resources\\geckodriver\\geckodriver.exe")
        System.setProperty("webdriver.chrome.driver", "/home/user/IdeaProjects/SeleniumKit/src/test/resources/browser_drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }


    @When("^I fill my First Name \"([^\"]*)\" and Last Name \"([^\"]*)\" into Full Name field$")
    public void iFillMyFirstNameAndLastNameIntoFullNameField(String firstName, String lastName) throws Throwable {
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        String fullName = firstName + " " + lastName;
        fillFieldWithData(fieldFioLocator, fullName);
    }
    @And("^I fill my City \"([^\"]*)\" into City field$")
    public void IfillmyCityintoCityfield (String city) throws Throwable {
        String cityE = city;
        fillFieldWithData(fieldCityLocator, cityE);
    }

    @And ("^I fill my phone number \"([^\"]*)\" into Phone field$")
    public void iFillMyPhoneNumber (String phoneNumber) throws Throwable {
        String phone = phoneNumber;
        fillFieldWithData(fieldPhoneLocator, phone);
    }

    @And ("^I fill my email address \"([^\"]*)\" into Email field$")
    public void iFillMyEmail (String inputEmail) throws Throwable {
        String email = inputEmail;
        fillFieldWithData(fieldEmailLocator, email);
    }

    @And ("^I fill my desired password \"([^\"]*)\" into Password field$")
    public void iFillMyPassword(String passwordInput) throws Throwable {
        String password = passwordInput;
        fillFieldWithData(fieldPasswordLocator, password);
    }

    @And ("^I set checkbox to show my password$")
    public void iSetMyCheckBox() throws Throwable {
        checkBox = driver.findElement(checkBoxShowPassLocator);
        checkBox.click();
    }

    @And ("^I go next to second project registration page$")
    public void iGoToNextProject() throws Throwable {
        nextStepButton = driver.findElement(nextStepLocator);
        nextStepButton.click();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    }

//
//    @Then("^I should see form field with \"([^\"]*)\" title$")
//    public void iOnNextProject(String title) throws Throwable {
//        String titleName = title;
//        projectNameLabel = driver.findElement(projectNameLabelLocator);
//        Assert.assertEquals(projectNameLabel.getText(), titleName);
//    }

    public void tearDown() {
        driver.quit();
    }

}
