package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.example.steps.StepsLibrary.sign;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class TC1_RegisterAccount extends WebDriverTestCase {
	@QAFDataProvider(dataFile = "TestData/logeshwari.xls", sheetName = "UserDetail")
	@Test
	public void Registertoaccount(Map<String, String> userData) throws InterruptedException  {
		get("/");
		getDriver().manage().window().maximize();
		sign(userData.get("emailid"),userData.get("firstname"),userData.get("lastname"),userData.get("password"));
		System.out.println("Register account successfully");

}
}
