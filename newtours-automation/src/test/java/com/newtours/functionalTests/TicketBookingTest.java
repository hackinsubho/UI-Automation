package com.newtours.functionalTests;

import com.newtours.basicUtils.BaseClass;
import com.newtours.pageObjects.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TicketBookingTest extends BaseClass {
    @Test(testName = "Book Flight Tickets")
    public void bookFlightTickets() throws Exception{
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        FlightFinderPage flightFinderPage = PageFactory.initElements(driver, FlightFinderPage.class);
        SelectFlightPage selectFlightPage = PageFactory.initElements(driver,SelectFlightPage.class);
        BookAFlightPage bookAFlightPage = PageFactory.initElements(driver, BookAFlightPage.class);
        FlightConfirmationPage flightConfirmationPage = PageFactory.initElements(driver,FlightConfirmationPage.class);
        homePage.loginAsUser();
        flightFinderPage.fillFlightDetails();
        flightFinderPage.fillPreferencesDetails();
        selectFlightPage.selectDepartAndReturnFlight();
        bookAFlightPage.fillBookingDetails();
        flightConfirmationPage.printBookingPage();
    }
}
