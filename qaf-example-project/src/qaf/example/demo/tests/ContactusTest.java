package qaf.example.demo.tests;

import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.step.CommonStep.click;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

/******************************************************
 * Test Case: ContactUs Test Scenario
 * Created Date: 9th June 2021
 * @author Uma Maheswari
 *
 ******************************************************/

public class ContactusTest extends WebDriverTestCase{
	
	@QAFDataProvider(dataFile = "TestData/Registration_Details.xls", sheetName="UserDetails")
    @Test(description="ContactUs Test Scenario QLO", groups={"SMOKE"})

       public void ContactUsTest(Map<String, String> userData) throws InterruptedException {

          get("https://demo.qloapps.com/en/");
          getDriver().manage().window().maximize();
          click("qlo_threedot");
          click("qlo_contact");
          click("qlo_subject");
          click("qlo_customerservice");
          getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
          sendKeys(userData.get("email"), "qlo_contactemail");
          sendKeys(" Customer service query", "qlo_message");
          click("qlo_sendmessage");
          
          
	}

}
