package com.newtours.pageObjects;

import com.newtours.basicUtils.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BaseClass {
    @FindBy(how = How.XPATH, using = "//td/a[contains(text(),\"REGISTER\")]")
    private WebElement registerLink;
    @FindBy(how = How.XPATH, using = "//td/a[contains(text(),\"SIGN-ON\")]")
    private WebElement signOnLink;
    @FindBy(xpath = "//a[contains(text(),\"Home\")]")
    private WebElement homeLink;
    @FindBy(how = How.NAME, using = "userName")
    private WebElement userName;
    @FindBy(how = How.NAME, using = "password")
    private WebElement password;
    @FindBy(how = How.NAME, using = "login")
    private WebElement login;


    public void clickOnRegisterLink(){
        registerLink.click();
    }
    public void clickOnSignOnLink(){
        signOnLink.click();
    }
    public void clickOnHomeLink(){
        homeLink.click();
    }
    public void loginAsUser(){
        userName.sendKeys("testautomationxoxo@mailinator.com");
        password.sendKeys("Password9876");
        login.click();
    }
}
