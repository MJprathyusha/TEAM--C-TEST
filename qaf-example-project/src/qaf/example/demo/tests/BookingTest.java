package qaf.example.demo.tests;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.step.CommonStep.verifyLinkWithTextPresent;
import static com.qmetry.qaf.automation.step.CommonStep.verifyText;
import static com.qmetry.qaf.automation.ui.webdriver.ElementFactory.$;
import static com.qmetry.qaf.automation.step.CommonStep.assertText;
import static com.qmetry.qaf.automation.step.CommonStep.clear;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

/******************************************************
 * Test Case: Booking Test Scenario
 * Created Date: 9th June 2021
 * @author Uma Maheswari
 *
 ******************************************************/
public class BookingTest  extends WebDriverTestCase{
	
	@QAFDataProvider(dataFile = "TestData/Registration_Details.xls", sheetName="UserDetails")
    @Test(description="Booking Test Scenario ", groups={"SMOKE"})

       public void BookingTestfunctionality(Map<String, String> userData) throws InterruptedException {

          get("https://demo.qloapps.com/en/");
          getDriver().manage().window().maximize();
          click("qlo_threedot");
          click("qlo_rooms");
          click("qlo_booknow");
          Thread.sleep(6000);
          @SuppressWarnings("unused")
		String parentHandle = getDriver().getWindowHandle();      
          for (String winHandle : getDriver().getWindowHandles()) {
              getDriver().switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle
          }
			
			click("qlo_checkin");
			click("qlo_checkin1");
			click("qlo_checkout");
			click("qlo_checkout1");
			Thread.sleep(3000);
			verifyText("qlo_pricecheck", "$2,000.00");
			assertText("qlo_pricecheck", "$2,000.00");
			click("qlo_booknowroom");
			getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
			click("qlo_proceedtocheckout");
			click("qlo_proceed");
			click("qlo_loginnow");
			sendKeys("demo@demo.com", "qlo_guestlogin");
			
			sendKeys("demodemo", "qlo_guestpassword");
			click("qlo_guestsubmit");
			click("qlo_guestproceed");
			click("qlo_checkbox");
			click("qlo_selectpay");
			click("qlo_confirmorder");
			String message = $("qlo_bookmessage").getText();
	        Validator.verifyThat(message,Matchers.equalTo("Your order on Qlo Reservation System is complete."));
			getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
			Reporter.logWithScreenShot("pass");

	}
}
