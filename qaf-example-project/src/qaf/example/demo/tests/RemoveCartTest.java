package qaf.example.demo.tests;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.ui.webdriver.ElementFactory.$;
import static com.qmetry.qaf.automation.step.CommonStep.*;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

/******************************************************
 * Test Case: Remove Cart Test Scenario
 * Created Date: 9th June 2021
 * @author Uma Maheswari
 *
 ******************************************************/

public class RemoveCartTest extends WebDriverTestCase{
	
	@QAFDataProvider(dataFile = "TestData/Registration_Details.xls", sheetName="UserDetails")
    @Test(description="Remove Cart Test Scenario QLO", groups={"SMOKE"})

       public void Removecart(Map<String, String> userData) throws InterruptedException {

          get("https://demo.qloapps.com/en/");
          getDriver().manage().window().maximize();
          click("qlo_threedot");
          click("qlo_rooms");
          sendKeys("United States","qlo_location");
          click("qlo_hotel");
          click("qlo_hotel1");
          click("qlo_checkintime");
          click("qlo_checkintime1");
          click("qlo_checkouttime");
          click("qlo_checkouttime1");
          click("qlo_roomsubmit");
          getDriver().manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
          click("qlo_booknow_rooms");
          getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
          click("qlo_proceedout_rooms");
          getDriver().manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
          mouseOver("qlo_itemcart");
          click("qlo_removeitem");
          String message = $("qlo_removemessage").getText();
          System.out.println(message);
          Validator.verifyThat(message,Matchers.equalTo("Till now you did not added any room in your cart."));
          Reporter.logWithScreenShot("pass");
	}

}
