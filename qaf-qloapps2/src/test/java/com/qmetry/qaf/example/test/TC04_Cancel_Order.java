package com.qmetry.qaf.example.test;

import org.testng.annotations.Test;
import java.util.Map;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;

import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.assertText;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import static com.qmetry.qaf.example.steps.StepsLibrary.loginFor;

public class TC04_Cancel_Order extends WebDriverTestCase
{
  @QAFDataProvider(dataFile ="TestData/demo.xls", sheetName="Sheet1")
  @Test(description = "CreateAccount Test Scenario", groups = { "SMOKE" },enabled=true)
  public  void tc4_cancelOrder(Map <String ,String> data) throws InterruptedException 
  {
	//launching qloapps
	get("https://demo.qloapps.com/");
    getDriver().manage().window().maximize();
    
    //login to qloapps
    loginFor(data.get("email"),data.get("password"));
    
    //orderHistory& Details
    click("OrderDetails");
    click("Details");
    
    //validation of message
    assertText("assertof_cancel","You have booking cancelation requests from this order. To see the cancelation request status Click Here");
    Reporter.logWithScreenShot("pass");
    
    click("Cancelreq");
    Thread.sleep(1000);
    click("CheckBoxH");
    Thread.sleep(1000);
    click("C_Submit");
    sendKeys("Ordered By Mistake", "Comments");
    click("SubmitCancel");
    Thread.sleep(4000);
    
    
  }
}