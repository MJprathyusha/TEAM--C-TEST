package qaf.example.demo.tests;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.ui.webdriver.ElementFactory.$;
import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.data.ElementInteractor.SelectBox;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

/******************************************************
 * Test Case: CreateAccount Test Scenario
 * Created Date: 9th June 2021
 * @author Uma Maheswari
 *
 ******************************************************/

public class RegisterAccountTest extends WebDriverTestCase  {
	
	@QAFDataProvider(dataFile = "TestData/Registration_Details.xls", sheetName="UserDetails")
    @Test(description="CreateAccount Test Scenario QLO", groups={"SMOKE"})

       public void createRegisterAccountTest(Map<String, String> userData) throws InterruptedException {

          get("https://demo.qloapps.com/en/");
          getDriver().manage().window().maximize();
          click("qlo_sign_in");
          sendKeys(userData.get("email")+""+114, "qlo_inputemail");
          click("qlo_createaccount");
          click("qlo_input_radio");
          sendKeys(userData.get("firstName"), "qlo_firstname");
          sendKeys(userData.get("lastName"), "qlo_lastname");
          sendKeys(userData.get("password"), "qlo_password");
          new SelectBox("qlo_days").sendKeys("1  ");
          new SelectBox("qlo_months").sendKeys("January ");
          new SelectBox("qlo_years").sendKeys("2021  ");
          click("qlo_click_register");
          String message = $("qlo_verifyText").getText();
          Validator.verifyThat(message,Matchers.equalTo("Your account has been created."));
          click("qlo_options");
          click("qlo_logout");
          Reporter.logWithScreenShot("pass");
         

       }
	
	
	

}
