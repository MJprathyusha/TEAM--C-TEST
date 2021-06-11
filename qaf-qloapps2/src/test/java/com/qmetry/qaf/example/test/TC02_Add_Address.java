package com.qmetry.qaf.example.test;

import org.testng.annotations.Test;
import java.util.Map;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;

import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.example.steps.StepsLibrary.loginFor;
import static com.qmetry.qaf.automation.step.CommonStep.assertText;
import static com.qmetry.qaf.example.steps.StepsLibrary.addAddress;

public class TC02_Add_Address extends WebDriverTestCase
{
  @QAFDataProvider(dataFile ="TestData/demo.xls", sheetName="Sheet1")
  @Test(description = "CreateAccount Test Scenario", groups = { "SMOKE" },enabled=true)
  public  void tc2_add_Address(Map <String ,String> data) throws InterruptedException 
  {
    //launching qloapps application
	get("https://demo.qloapps.com/en/");
	getDriver().manage().window().maximize();
	   
	//login to qloapps
	loginFor(data.get("email"),data.get("password"));
	
	//adding my first address
   	addAddress(data.get("company"),data.get("address"),data.get("city"),data.get("other"));
   			
   	//capturing &validation of success message
   	assertText("assertof_address","Your addresses are listed below.");
   	Reporter.logWithScreenShot("pass");
  }
}