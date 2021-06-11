package com.qmetry.qaf.example.test;

import java.util.Map;
import org.testng.annotations.Test;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.step.CommonStep.assertText;

public class TC03_Book_Room extends WebDriverTestCase 
{
  @QAFDataProvider(dataFile = "TestData/demo.xls", sheetName="Sheet1")
  @Test(description = "Login", groups = { "SMOKE" })
  public void Tc3_booking_room(Map<String, String> data)throws InterruptedException
  {
	  
	//launching qloapps application
    get("/");
    getDriver().manage().window().maximize();
    
    //selecting executive rooms
    click("click_menu");
    click("click_rooms");
    Thread.sleep(2000);
    click("click_exe");
    
    //switch focus of WebDriver to the next found window handle
    getDriver().getWindowHandle();
    for (String winHandle : getDriver().getWindowHandles()) {
    getDriver().switchTo().window(winHandle); }
    
    //selecting dates for exe rooms
    Thread.sleep(2000);
    click("checkintime");
    click("checkintime1");
    Thread.sleep(2000);
    
    //checking room price
    assertText("assert1",String.valueOf("$2,000.00"));
    
    //booknow
    click("click_BookNow");
    Thread.sleep(2000);
    click("HProceedBtn");
    click("Proceed");
    Thread.sleep(2000);
    
    //submit after giving guest info
    click("Loginnow");
    sendKeys(data.get("email"), "Email");
    sendKeys(data.get("password"), "DPassword");
    click("Submittobook");
    Thread.sleep(2000);
    click("Proceed2");
    
    //confirm order after privacy policy and payment 
    click("CheckBox");
    click("bankwire");
    click("confirmmyorder");
    Thread.sleep(4000);
    
    //capturing &validation of success message
    assertText("assertof_booking","Your order on Qlo Reservation System is complete.");
    Reporter.logWithScreenShot("pass");
  }
}