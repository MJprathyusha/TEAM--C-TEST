package qaf.example.tests;

import static com.qmetry.qaf.automation.step.CommonStep.*;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.data.ElementInteractor.SelectBox;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class UploadFileTest extends WebDriverTestCase {
	
	
    @Test(description="Upload file Test Scenario", groups={"SMOKE"})

       public void uploadFileTest() throws InterruptedException {

          get("https://demo.opencart.com/");
          getDriver().manage().window().maximize();
          mouseOver("components");
          click("monitor");
          click("applecinema30");
          click("checkbox3");
          clear("text");
          sendKeys("automation", "text");
          new SelectBox("dropdown").sendKeys("Blue\r\n"
          		+ "(+$3.00)");
          sendKeys("automation testing", "textarea");
          sendKeys("2021-06-07", "date");
          sendKeys("13:38", "time");
          sendKeys("2021-06-07 13:38", "date&time");
          click("addtocart");
          
          
          
    }

}
