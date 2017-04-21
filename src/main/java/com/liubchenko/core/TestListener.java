package com.liubchenko.core;

/**
 * Created by user on 20.04.17.
 */

import com.liubchenko.util.PropertiesCache;
import com.liubchenko.util.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class TestListener implements ITestListener {
    private static final String SCREENSHOTS_FOR_SUCCESS_PATH = "screenshots.path.success";
    private static final String SCREENSHOTS_FOR_FAILED_PATH = "screenshots.path.failed";
    private WebDriverUtils webDriverUtils;
    private WebDriver driver;
    @Override
    public void onTestStart(ITestResult result) {
        driver = ((WebDriverTestBase) result.getInstance()).driver;
        webDriverUtils = new WebDriverUtils(driver);
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        makeScreenShot(result, PropertiesCache.getInstance().getProperty(SCREENSHOTS_FOR_SUCCESS_PATH));
        System.out.println("on test method success, make a screenshot for ");
    }
    @Override
    public void onTestFailure(ITestResult result) {
        makeScreenShot(result, PropertiesCache.getInstance().getProperty(SCREENSHOTS_FOR_FAILED_PATH));
        System.out.println("on test method failure");
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("test method skipped");
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("test failed but within success % ");
    }
    @Override
    public void onStart(ITestContext context) {
        System.out.println("on start of test " + context.getName());
    }
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("on finish of test " + context.getName());
    }
    private void makeScreenShot(ITestResult result, String screenShotPath) {
        webDriverUtils.saveScreenshot(driver, screenShotPath, result.getMethod().getMethodName());
    }
}
