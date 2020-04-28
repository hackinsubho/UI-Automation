package com.newtours.functionalTests;

import com.newtours.basicUtils.BaseClass;
import com.newtours.pageObjects.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UserRegistrationTest extends BaseClass {
    @Test(testName = "User Registration", priority = 1)
    public void userRegistrationTest() throws Exception{
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        RegistrationPage registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        FlightFinderPage flightFinderPage = PageFactory.initElements(driver, FlightFinderPage.class);
        SelectFlightPage selectFlightPage = PageFactory.initElements(driver,SelectFlightPage.class);
        BookAFlightPage bookAFlightPage = PageFactory.initElements(driver, BookAFlightPage.class);
        FlightConfirmationPage flightConfirmationPage = PageFactory.initElements(driver,FlightConfirmationPage.class);
        homePage.clickOnRegisterLink();
        registrationPage.fillRegistrationInfo();
        softAssert.assertTrue(registrationPage.isOnSuccessPage());
        homePage.clickOnHomeLink();
        homePage.loginAsUser();
        flightFinderPage.fillFlightDetails();
        flightFinderPage.fillPreferencesDetails();
        selectFlightPage.selectDepartAndReturnFlight();
        bookAFlightPage.fillBookingDetails();
        flightConfirmationPage.printBookingPage();
        softAssert.assertAll();
    }
}
