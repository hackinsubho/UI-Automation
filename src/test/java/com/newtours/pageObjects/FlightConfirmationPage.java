package com.newtours.pageObjects;

import com.newtours.basicUtils.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class FlightConfirmationPage extends BaseClass {
    @FindBy(how = How.XPATH,using = "//*[contains(text(),\"Billed To\")]")
    private WebElement billedToText;

    public void printBookingPage() throws IOException, InterruptedException {
       wait.until(ExpectedConditions.visibilityOf(billedToText));
       try {
           TakesScreenshot screenshot = ((TakesScreenshot) driver);
           FileHandler.copy(screenshot.getScreenshotAs(OutputType.FILE), new File("screenshot/ticket.png"));
       }catch (Exception e){
           Actions act = new Actions(driver);
           act.sendKeys(Keys.CONTROL);
           act.sendKeys(Keys.ENTER);
           act.build().perform();
           act.sendKeys(Keys.ENTER).build().perform();
       }
    }
}
