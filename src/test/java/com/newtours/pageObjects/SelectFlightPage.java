package com.newtours.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SelectFlightPage {
    @FindBy(how = How.NAME, using = "outFlight")
    private List<WebElement> departFlights;
    @FindBy(how = How.NAME, using = "inFlight")
    private List<WebElement> returnFlights;
    @FindBy(how = How.NAME, using = "reserveFlights")
    private WebElement reserveFlights;
    public void selectDepartAndReturnFlight(){
        departFlights.get(1).click();
        returnFlights.get(3).click();
        reserveFlights.click();
    }
}
