package qaf.example.demo.tests;

import static com.qmetry.qaf.automation.step.CommonStep.*;
import static com.qmetry.qaf.automation.ui.webdriver.ElementFactory.$;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

/******************************************************
 * Test Case: Order Cancel Test Scenario
 * Created Date: 9th June 2021
 * @author Uma Maheswari
 *
 ******************************************************/

public class OrderCancellationTest extends WebDriverTestCase{
	
	@QAFDataProvider(dataFile = "TestData/Registration_Details.xls", sheetName="UserDetails")
    @Test(description="Order Cancel Test Scenario", groups={"SMOKE"})

       public void ordercancel(Map<String, String> userData) throws InterruptedException {

          get("https://demo.qloapps.com/en/");
          getDriver().manage().window().maximize();
          
          click("qlo_sign_in");
          clear("qlo_loginemail");
          sendKeys("demo@demo.com", "qlo_loginemail");
          clear("qlo_loginpassword");
          sendKeys("demodemo", "qlo_loginpassword");
          click("qlo_submitsignin");
          click("qlo_orderDetails");
          click("qlo_details");
          Reporter.logWithScreenShot("pass");
          click("qlo_cancelreq");
          click("qlo_checkBoxH");
          click("qlo_C_Submit");
          sendKeys("THANK YOU", "qlo_comments");
          click("qlo_submitCancel");
          Thread.sleep(50000);
		  String message = $("qlo_verifyorder").getText();
		  System.out.println(message); 
    	  Validator.verifyThat(message,Matchers.equalTo("You have booking cancelation requests from this order. To see the cancelation request status Click Here"));
          getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
          Reporter.logWithScreenShot("pass");
          
          
          
	}
	

}
