package com.qmetry.qaf.example.test;

import java.util.Map;
import org.testng.annotations.Test;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.assertText;

import static com.qmetry.qaf.example.steps.StepsLibrary.Register;

public class TC01_Register extends WebDriverTestCase 
{
  @QAFDataProvider(dataFile ="TestData/demo.xls", sheetName="Sheet1")
  @Test
  public void tc1_registerTo_qloapps(Map <String ,String> data) throws InterruptedException
  {
	//launching qloapps application
	get("https://demo.qloapps.com/en/");
	getDriver().manage().window().maximize();
	
	//register to qloapps
	Register(data.get("fname"),data.get("lname"),data.get("email"),data.get("password"));
	
	//capturing &validation of success message
	assertText("assertof_register","Your account has been created.");
   	Reporter.logWithScreenShot("pass");
  }
}







