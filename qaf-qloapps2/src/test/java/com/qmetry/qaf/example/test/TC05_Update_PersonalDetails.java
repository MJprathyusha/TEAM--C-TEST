package com.qmetry.qaf.example.test;

import org.testng.annotations.Test;
import java.util.Map;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.data.ElementInteractor.SelectBox;

import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.clear;
import static com.qmetry.qaf.automation.step.CommonStep.assertText;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import static com.qmetry.qaf.example.steps.StepsLibrary.loginFor;

public class TC05_Update_PersonalDetails extends WebDriverTestCase
{
  @QAFDataProvider(dataFile ="TestData/demo.xls", sheetName="Sheet1")
  @Test(description = "CreateAccount Test Scenario", groups = { "SMOKE" },enabled=true)
  public  void tc5_updatePersonalInfo(Map <String ,String> data) throws InterruptedException 
  {
	//launching qloapps
	get("https://demo.qloapps.com/en/");
	getDriver().manage().window().maximize();
	
	//login to qloapps
	loginFor(data.get("email"),data.get("password"));
	
	//update personal details 
	click("click_personal_details");
	
	//changing name
	clear("change_firstname");
    sendKeys(data.get("cfname"),"change_firstname");
	clear("change_lastname");
    sendKeys(data.get("clname"),"change_lastname");
	Thread.sleep(1000);
	
	//changing D.O.B
	new SelectBox("change_days").sendKeys("9");
	new SelectBox("change_months").sendKeys(data.get("month"));
    new SelectBox("change_years").sendKeys("1998");
	Thread.sleep(1000);
	sendKeys(data.get("password"),"old_passwd");
	click("submitIdentity");
	Thread.sleep(4000);
	
	//capturing &validation of success message
	assertText("assertof_update","Your personal information has been successfully updated.");
	Reporter.logWithScreenShot("pass");
  }
}
   
