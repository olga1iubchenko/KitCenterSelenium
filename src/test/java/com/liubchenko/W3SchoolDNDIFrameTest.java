package com.liubchenko;

import com.liubchenko.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by user on 20.04.17.
 */
public class W3SchoolDNDIFrameTest extends WebDriverTestBase {

    @Test
    public void DNDTest() throws InterruptedException {

        driver.get("http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml");
        WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));

        WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));

        Actions builder = new Actions(driver);

        Action dragAndDrop = builder.clickAndHold(From)

                .moveToElement(To)

                .release(To)

                .build();

        dragAndDrop.perform();

        }


}


