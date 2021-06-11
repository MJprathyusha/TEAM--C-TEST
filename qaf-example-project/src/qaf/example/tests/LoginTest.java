package qaf.example.tests;

import static com.qmetry.qaf.automation.step.CommonStep.*;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import java.util.Map;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

public class LoginTest extends WebDriverTestCase{
	
	@QAFDataProvider(dataFile = "TestData/UserData.xls", sheetName="UserDetails")
    @Test(description="CreateAccount Test Scenario", groups={"SMOKE"})

       public void LoginFunctionalityTest(Map<String, String> userData) throws InterruptedException {

          get("https://demo.opencart.com/");
          getDriver().manage().window().maximize();
          click("button.myaccount");
          click("button.login");
          sendKeys(userData.get("email"), "input.email");
          sendKeys(userData.get("password"), "input.password");
          click("button.loginsubmit");
          click("homepage");
          verifyText("homepage", "Your Store");
          verifyLinkWithTextPresent("Your Store");
          assertText("homepage", "Your Store");
          Reporter.logWithScreenShot("pass");
          
	}

}

