package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.assertText;

import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.core.ConfigurationManager.getBundle;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

public class TC3_Booking extends WebDriverTestCase {
	@QAFDataProvider(dataFile = "TestData/logeshwari.xls", sheetName = "UserDetail")
	@Test
	public void Booking(Map<String, String> userData) throws InterruptedException  {
		get("/");
		getDriver().manage().window().maximize();
				
		click("clickMenu");
		click("clickRooms");
		Thread.sleep(3000);
		click("clickExecutiveBookNow");
		Thread.sleep(3000);
		String parentHandle = getDriver().getWindowHandle();
		for (String winHandle : getDriver().getWindowHandles()) {
		getDriver().switchTo().window(winHandle);
		}
		Thread.sleep(8000);
		click("clickBookNow");
		Thread.sleep(6000);
		click("clickCheckout");
		click("clickProceed");
		Thread.sleep(2000);
		click("clickloginnow");
		sendKeys(userData.get("emailid"), "Inputemailid");
		sendKeys(userData.get("password"), "Inputpassword");
		Thread.sleep(2000);
		click("Submittobook");
		click("clickProceedbtn2");
		click("clickAgreebtn");
		click("clickBankwire");
		click("clickConfirmMyOrder");
		Thread.sleep(4000);
		assertText("assertof_booking","Your order on Qlo Reservation System is complete.");
	                Reporter.logWithScreenShot("pass");
	               
	}

}
