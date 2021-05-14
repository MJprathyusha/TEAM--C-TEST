package com.hackathon.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class BasePage {

	public static WebDriver driver;
	
	
	@BeforeSuite
	public static void startTest() {
		ExtentManager.setExtent();
	}

	@BeforeTest
	public void openDriver() {
		System.out.println("in basepage");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vishwanth Reddy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		String baseUrl = "https://demo.opencart.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();

	}

	@AfterTest
	public void closeDriver() {
		driver.close();
	}
    
	@AfterSuite
	public static void endTest() {
		ExtentManager.endReport();
	}

}
