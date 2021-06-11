package qaf.example.demo.tests;

import static com.qmetry.qaf.automation.step.CommonStep.clear;
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
 * Test Case: Personal Details Test Scenario
 * Created Date: 9th June 2021
 * @author Uma Maheswari
 *
 ******************************************************/

public class PersonaldetailsupdateTest extends WebDriverTestCase{
	
	@QAFDataProvider(dataFile = "TestData/Registration_Details.xls", sheetName="UserDetails")
    @Test(description="Personal Details Test Scenario QLO", groups={"SMOKE"})

       public void personaldetails(Map<String, String> userData) throws InterruptedException {

          get("https://demo.qloapps.com/en/");
          getDriver().manage().window().maximize();
          click("qlo_sign_in");
          clear("qlo_loginemail");
          sendKeys(userData.get("email")+""+15, "qlo_loginemail");
          clear("qlo_loginpassword");
          sendKeys(userData.get("password"), "qlo_loginpassword");
          click("qlo_submitsignin");
          click("qlo_personal");
          clear("qlo_updatefirstname");
          sendKeys("Umaa", "qlo_updatefirstname");
          clear("qlo_updatelastname");
          sendKeys("Maheswarii", "qlo_updatelastname");
          new SelectBox("qlo_days").sendKeys("4  ");
          new SelectBox("qlo_months").sendKeys("April  ");
          new SelectBox("qlo_years").sendKeys("2015    ");
          sendKeys(userData.get("password"), "qlo_oldpassword"); 
          sendKeys("Test@2021", "qlo_newpassword");
          sendKeys("Test@2021", "qlo_confirmpassword");
          click("qlo_savebutton");
          String message = $("qlo_verifyupdate").getText();
          Validator.verifyThat(message,Matchers.equalTo("Your personal information has been successfully updated."));
          click("qlo_options");
          click("qlo_logout");
          Reporter.logWithScreenShot("pass");
	}

}
