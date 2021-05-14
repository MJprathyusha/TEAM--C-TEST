package com.hackathon.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.hackathon.selenium.pages.MonitorPage;
import com.hackathon.selenium.utilities.CaptureScreenshot;


public class MonitorPageTest extends MonitorPage{
	Logger log = Logger.getLogger("MonitorPageTest");
	//Verify the User is able to upload a file and add the item to the cart, if the user is not able to upload a file then it should show an error message and the user is unable to add the item to the cart.
	@Test(priority=5)
	public void uploadFile() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		MonitorPage.mouseHoverComponents();
		Thread.sleep(3000);
		MonitorPage.clickOnMonitor();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MonitorPage.clickOnAppleCinema30();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MonitorPage.enterCheckBox();
		MonitorPage.enterText();
		MonitorPage.selectDropdown();
		MonitorPage.enterTextArea();
		//super.fileUpload();
		MonitorPage.enterDate();
		MonitorPage.clickOnAddToCart();
		Thread.sleep(5000);
		
		CaptureScreenshot.captureScreenshotnSave(driver, "File_Upload_Required");
		
		log.info("LoginTest" + "---"+ "Upload file is not successfull");

	}

	
	

}
