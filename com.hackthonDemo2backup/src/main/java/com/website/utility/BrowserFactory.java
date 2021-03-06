
package com.website.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	
	public static WebDriver start(WebDriver driver,String browserName,String appURL)
	{
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();

		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/chromedriver.exe");
			driver=new FirefoxDriver();

		}
		else {
			System.out.println("do not support this browser");
		}
/*		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
*/        driver.manage().window().maximize();
        driver.get(appURL);
/*		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
*/
		return driver;
	
	}
	public static void quitbrowser(WebDriver driver)
	{
		driver.quit();
		
	}
}

