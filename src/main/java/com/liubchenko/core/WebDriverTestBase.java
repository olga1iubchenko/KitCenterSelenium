package com.liubchenko.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by user on 23.03.17.
 */
public abstract class WebDriverTestBase {
        protected WebDriver driver;

        @BeforeClass
        public void setUp(){
                System.setProperty("webdriver.gecko.driver", "/home/user/IdeaProjects/SeleniumKit/src/test/resources/geckodriverUnix");

                //Initializes a browser
                driver = new FirefoxDriver();

                //Maximazes a window size
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            }

        @AfterClass
        public void tearDown() { driver.quit();}
}

