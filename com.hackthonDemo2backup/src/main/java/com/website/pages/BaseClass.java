package com.website.pages;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.website.utility.BrowserFactory;     

 

public class BaseClass {
    
     public WebDriver driver;     

 

        @BeforeClass
        public void setup()
        {
            driver=BrowserFactory.start(driver, "chrome", "https://www.ylighting.com//"); 

 

        }
        @AfterClass
        public void quit()
        {
            BrowserFactory.quitbrowser(driver);
        }
    }