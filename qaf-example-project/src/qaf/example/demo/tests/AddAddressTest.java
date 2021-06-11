package qaf.example.demo.tests;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.ui.webdriver.ElementFactory.$;
import static com.qmetry.qaf.automation.step.CommonStep.*;

import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.data.ElementInteractor.SelectBox;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;


/******************************************************
 * Test Case: Address Test Scenario
 * Created Date: 9th June 2021
 * @author Uma Maheswari
 *
 ******************************************************/
public class AddAddressTest extends WebDriverTestCase {
	
	@QAFDataProvider(dataFile = "TestData/Registration_Details.xls", sheetName="UserDetails")
    @Test(description="Address Test Scenario", groups={"SMOKE"})

       public void AddressTest(Map<String, String> userData) throws InterruptedException {

          get("https://demo.qloapps.com/en/");
          getDriver().manage().window().maximize();
          click("qlo_sign_in");
          clear("qlo_loginemail");
          sendKeys(userData.get("email")+""+114, "qlo_loginemail");
          clear("qlo_loginpassword");
          sendKeys("Test@2021", "qlo_loginpassword");
          click("qlo_submitsignin");
          click("qlo_address");
          sendKeys(userData.get("company"), "qlo_company");
          sendKeys(userData.get("address1"), "qlo_address1");
          sendKeys(userData.get("address2"), "qlo_address2");
          sendKeys(userData.get("city"), "qlo_city");
          new SelectBox("qlo_state").sendKeys("California  ");
          sendKeys("12345", "qlo_postal");
          new SelectBox("qlo_country").sendKeys("United States  ");
          sendKeys(String.valueOf(userData.get("homephone")), "qlo_homephone");
          sendKeys(String.valueOf(userData.get("mobile")), "qlo_mobile");
          sendKeys(userData.get("additional"), "qlo_additional");
          clear("qlo_future");
          sendKeys(userData.get("future"), "qlo_future");
          click("qlo_save");
          String message = $("qlo_verifyaddress").getText();
          Validator.verifyThat(message,Matchers.equalTo("Your addresses are listed below."));
          click("qlo_options");
          click("qlo_logout");
          Reporter.logWithScreenShot("pass");
	}
}
