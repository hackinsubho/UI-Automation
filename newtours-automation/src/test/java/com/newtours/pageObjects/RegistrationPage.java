package com.newtours.pageObjects;

import com.newtours.basicUtils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class RegistrationPage extends BaseClass {

    @FindAll({
        @FindBy(how = How.NAME, using = "firstName"),
        @FindBy(how = How.NAME, using = "lastName"),
        @FindBy(how = How.NAME, using = "phone"),
        @FindBy(how = How.NAME, using = "userName"),
        @FindBy(how = How.NAME, using = "address1"),
        @FindBy(how = How.NAME, using = "city"),
        @FindBy(how = How.NAME, using = "state"),
        @FindBy(how = How.NAME, using = "postalCode"),
        @FindBy(how = How.NAME, using = "country"),
        @FindBy(how = How.NAME, using = "email"),
        @FindBy(how = How.NAME, using = "password"),
        @FindBy(how = How.NAME, using = "confirmPassword"),
        @FindBy(how = How.NAME, using = "register")
            })
    private List<WebElement> registrationFields;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),\"Your user name is testautomationxoxo@mailinator.com\")]")
    private WebElement confirmationText;


    public void fillRegistrationInfo(){
        registrationFields.get(0).sendKeys("test");
        registrationFields.get(1).sendKeys("automation");
        registrationFields.get(2).sendKeys("9876543211");
        registrationFields.get(3).sendKeys("testautomation@mailinator.com");
        registrationFields.get(4).sendKeys("#21st Street, Down Town");
        registrationFields.get(5).sendKeys("New York City");
        registrationFields.get(6).sendKeys("New York");
        registrationFields.get(7).sendKeys("10001");
        Select select = new Select(registrationFields.get(8));
        select.selectByVisibleText("UNITED STATES");
        registrationFields.get(9).sendKeys("testautomationxoxo@mailinator.com");
        registrationFields.get(10).sendKeys("Password9876");
        registrationFields.get(11).sendKeys("Password9876");
        registrationFields.get(12).click();
    }
    public boolean isOnSuccessPage() throws InterruptedException {
        if(!wait.until(ExpectedConditions.visibilityOf(confirmationText)).isDisplayed()) {
            System.out.println("Not in Success Page");
            return false;
        }
        else return true;
    }
}
