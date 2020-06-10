package com.newtours.basicUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;

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
            FirefoxBinary firefoxBinary = new FirefoxBinary();
            firefoxBinary.addCommandLineOptions("--headless");
            firefoxBinary.addCommandLineOptions("--no-sandbox");
            System.setProperty("webdriver.gecko.driver", "drivers" + File.separator + "gecko" + File.separator + "ubuntu" + File.separator + "geckodriver");
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setBinary(firefoxBinary);
            driver = new FirefoxDriver(firefoxOptions);
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
