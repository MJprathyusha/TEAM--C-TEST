package com.qmetry.qaf.example.test;

import java.util.Map;
import org.testng.annotations.Test;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;

import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.assertText;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

public class TC06_Contact_Us extends WebDriverTestCase
{
  @QAFDataProvider(dataFile ="TestData/demo.xls", sheetName="Sheet1")
  @Test(description = "CreateAccount Test Scenario", groups = { "SMOKE" },enabled=true)
  public  void tc6_contact_us(Map <String ,String> data) throws InterruptedException 
  {
	//launching qloapps
    get("https://demo.qloapps.com/en/");
	getDriver().manage().window().maximize();
	   	   
	//clicking contact us
	click("qlo_threedot");
	click("qlo_contact");
	Thread.sleep(2000);
	
	//providing info of query
	click("selectsubject");
	click("selectcustomerservice");
	sendKeys(data.get("email"), "qlo_contactemail");
	Thread.sleep(1000);
	sendKeys(data.get("message"), "qlo_message");
	Thread.sleep(1000);
	click("qlo_sendmessage");
	Thread.sleep(4000);
	
	//capturing &validation of success message
	assertText("assertof_contactus","Your message has been successfully sent to our team.");
    Reporter.logWithScreenShot("pass");
  }
}