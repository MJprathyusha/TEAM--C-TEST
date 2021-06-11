package com.qmetry.qaf.example.test;

import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.example.steps.StepsLibrary.login;
import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class TC2_AddingAddress extends WebDriverTestCase {
	@QAFDataProvider(dataFile = "TestData/logeshwari.xls", sheetName = "UserDetail")
	@Test
	public void Address(Map<String, String> userData) throws InterruptedException  {
		get("/");
		getDriver().manage().window().maximize();
		login(userData.get("emailid"),userData.get("password"),userData.get("address"),userData.get("city"),userData.get("future"));
			
		System.out.println("sigin Successfully");


}
}
