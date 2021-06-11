package qaf.example.tests;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import org.testng.annotations.Test;

import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;

public class WindowHandlingTest extends WebDriverTestCase{
	
	@Test(description="Windowhandling Test Scenario", groups={"SMOKE"})

    public void WindowHandlingFunctionality() throws InterruptedException {

       get("https://www.lumens.com/");
       getDriver().manage().window().maximize();
       //Thread.sleep(40000);
       click("advertisepopup");
      //Thread.sleep(40000);
       click("myaccount");
       click("signin");
       sendKeys("j.umamaheswari9@gmail.com", "email");
       sendKeys("Blueberry@123", "password");
       click("submit");
       Reporter.logWithScreenShot("pass");
       
	}

}

