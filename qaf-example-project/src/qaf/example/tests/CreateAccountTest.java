package qaf.example.tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

import static com.qmetry.qaf.automation.step.CommonStep.*;

import java.util.Map;


public class CreateAccountTest extends WebDriverTestCase {
	
	@QAFDataProvider(dataFile = "TestData/UserData.xls", sheetName="UserDetails")
    @Test(description="CreateAccount Test Scenario", groups={"SMOKE"})

       public void createAccountTest(Map<String, String> userData) throws InterruptedException {

		Logger log=Logger.getLogger(CreateAccountTest.class);
          get("https://demo.opencart.com/");
          getDriver().manage().window().maximize();
          click("button.myaccount");
          click("button.register");
          sendKeys(userData.get("firstName"), "input.firstname");
          sendKeys(userData.get("lastName"), "input.lastname");
          sendKeys(userData.get("email"), "input.email");
          sendKeys(String.valueOf(userData.get("telephone")), "input.telephone");
          sendKeys(userData.get("password"), "input.password");
          sendKeys(userData.get("passwordConfirm"), "input.passwordconfirm");
          click("button.agree");
          click("button.submit");
          JavascriptExecutor js = (JavascriptExecutor)getDriver();
          js.executeScript("window.scrollBy(0,500)","");
          Reporter.logWithScreenShot("pass");
          log.info("LoginTest" + "---"+ "Register Account Successful with valid details");

        

       }

}
