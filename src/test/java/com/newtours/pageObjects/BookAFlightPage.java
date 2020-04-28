package com.newtours.pageObjects;

import com.newtours.basicUtils.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BookAFlightPage extends BaseClass {

    @FindBy(how = How.XPATH, using = "//*[contains(@name,'passFirst')]")
    private List<WebElement> firstNames;
    @FindBy(how = How.XPATH, using = "//*[contains(@name,'passLast')]")
    private List<WebElement> lastNames;
    @FindBy(how = How.NAME, using = "creditnumber")
    private WebElement creditCardNumber;
    @FindBy(how = How.NAME, using = "billAddress1")
    private WebElement billAddress1;
    @FindBy(how = How.NAME, using = "billCity")
    private WebElement billCity;
    @FindBy(how = How.NAME, using = "billState")
    private WebElement billState;
    @FindBy(how = How.NAME, using = "billZip")
    private WebElement billZip;
    @FindBy(how = How.NAME, using = "billCountry")
    private WebElement billCountry;
    @FindBy(how = How.NAME, using = "delAddress1")
    private WebElement delAddress1;
    @FindBy(how = How.NAME, using = "delCity")
    private WebElement delCity;
    @FindBy(how = How.NAME, using = "delState")
    private WebElement delState;
    @FindBy(how = How.NAME, using = "delZip")
    private WebElement delZip;
    @FindBy(how = How.NAME, using = "delCountry")
    private WebElement delCountry;
    @FindBy(how = How.NAME, using = "buyFlights")
    private WebElement buyFlights;

    public void fillBookingDetails(){
        firstNames.get(0).sendKeys("Chris");
        lastNames.get(0).sendKeys("Adamas");
        firstNames.get(1).sendKeys("John");
        lastNames.get(1).sendKeys("Meyers");
        creditCardNumber.sendKeys("4123567289654321");
        billAddress1.sendKeys("#21st Street, Down Town");
        billCity.sendKeys("New York City");
        billState.sendKeys("New York");
        billZip.sendKeys("10001");
        new Select(billCountry).selectByVisibleText("UNITED STATES");
        delAddress1.sendKeys("#21st Street, Down Town");
        delCity.sendKeys("New York City");
        delState.sendKeys("New York");
        delZip.sendKeys("10001");
        new Select(delCountry).selectByVisibleText("UNITED STATES");
        buyFlights.click();
    }
}
