package com.newtours.basicUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeTest(alwaysRun = true)
    public void testSetup(){
        if(System.getProperty("os.name").contains("Windows")) {
            System.setProperty("webdriver.chrome.driver", "drivers" + File.separator + "chrome" + File.separator + "win" + File.separator + "chromedriver.exe");
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 60);
            driver.navigate().to("http://newtours.demoaut.com/");
            driver.manage().window().maximize();
        }
        else{
            System.setProperty("webdriver.gecko.driver", "drivers" + File.separator + "gecko" + File.separator + "ubuntu" + File.separator + "geckodriver");
            driver = new FirefoxDriver();
            wait = new WebDriverWait(driver, 60);
            driver.navigate().to("http://newtours.demoaut.com/");
            driver.manage().window().maximize();
        }
    }
    @AfterTest(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}
