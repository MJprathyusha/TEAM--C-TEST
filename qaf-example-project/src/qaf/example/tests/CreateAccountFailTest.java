package qaf.example.tests;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import org.apache.log4j.Logger;

import java.util.Map;
import org.testng.annotations.Test;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;

public class CreateAccountFailTest extends WebDriverTestBase {
	
	@QAFDataProvider(dataFile = "TestData/UserData.xls", sheetName="UserDetails")
    @Test(description="CreateAccount Test Scenario", groups={"SMOKE"})
      public void createAccountFailTest(Map<String, String> userData) throws InterruptedException {
		Logger log=Logger.getLogger(CreateAccountFailTest.class);

          get("https://demo.opencart.com/");
          getDriver().manage().window().maximize();

          click("button.myaccount");
          click("button.register");
          sendKeys(userData.get("firstName"), "input.firstname");
          sendKeys(userData.get("lastName"), "input.lastname");
          sendKeys(userData.get("email"), "input.email");
          sendKeys((userData.get("telephone"))+"", "input.telephone");
         // sendKeys("8919022031", "input.telephone");
          sendKeys(userData.get("password"), "input.password");
          sendKeys(userData.get("passwordConfirm"), "input.passwordconfirm");
          click("button.agree");
          click("button.submit");
          
          //System.out.println("Error message" + getText("get.errormsg"));
          log.info("LoginTest" + "---"+ "Register Account Successful with invalid details");
        

       }

}
