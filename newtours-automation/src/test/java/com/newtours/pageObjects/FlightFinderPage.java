package com.newtours.pageObjects;

import com.newtours.basicUtils.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class FlightFinderPage extends BaseClass {
    @FindBy(how = How.XPATH, using = "//*[@value=\"roundtrip\"]")
    private WebElement roundTrip;
    @FindBy(how = How.XPATH, using = "//*[@value=\"oneway\"]")
    private WebElement oneway;
    @FindBy(how = How.NAME, using = "passCount")
    private WebElement passengerCount;
    @FindBy(how = How.NAME, using = "fromPort")
    private WebElement departingFrom;
    @FindBy(how = How.NAME, using = "toPort")
    private WebElement arrivingTo;
    @FindBy(how = How.XPATH,using = "//*[@value=\"Business\"]")
    private WebElement businessClass;
    @FindBy(how = How.NAME, using = "airline")
    private WebElement preferredAirline;
    @FindBy(how = How.NAME, using = "findFlights")
    private WebElement continueSearch;

    public void fillFlightDetails() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(roundTrip));
        roundTrip.click();
        new Select(passengerCount).selectByIndex(1);
        new Select(departingFrom).selectByIndex(3);
        new Select(arrivingTo).selectByIndex(4);
    }
    public void fillPreferencesDetails() throws InterruptedException{
        businessClass.click();
        new Select(preferredAirline).selectByIndex(1);
        continueSearch.click();
    }

}
