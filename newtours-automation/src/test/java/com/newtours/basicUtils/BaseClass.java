package com.newtours.basicUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeTest(alwaysRun = true)
    public void testSetup(){
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/win/"+"chromedriver.exe");
        driver = new ChromeDriver();
        wait=new WebDriverWait(driver, 60);
        driver.navigate().to("http://newtours.demoaut.com/");
        driver.manage().window().maximize();
    }
    @AfterTest(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}
