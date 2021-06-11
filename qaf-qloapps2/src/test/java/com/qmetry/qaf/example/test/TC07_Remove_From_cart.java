package com.qmetry.qaf.example.test;

import java.util.Map;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;

import com.qmetry.qaf.automation.data.ElementInteractor.SelectBox;

import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.getText;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.assertText;

public class TC07_Remove_From_cart extends WebDriverTestCase
{
  @QAFDataProvider(dataFile ="TestData/demo.xls", sheetName="Sheet1")
  @Test(description = "CreateAccount Test Scenario", groups = { "SMOKE" },enabled=true)
  public  void tc7_removeFromCart(Map <String ,String> data) throws InterruptedException 
  {
	//launching qloapps
	get("https://demo.qloapps.com/en/");
	getDriver().manage().window().maximize();
	
	//room location and type
	click("click_menu");
	click("home");
	Thread.sleep(1000);
	new SelectBox("location").sendKeys(data.get("location"));
	click("hotel_cat_name");
	click("hotel_cat_name1");
	
	//dates
	click("qlo_checkintime");
    click("qlo_checkintime1");
    click("qlo_checkouttime");
    click("qlo_checkouttime1");
    Thread.sleep(1000);
	click("search_room_submit");
	Thread.sleep(1000);
	
	//booking executive rooms
	click("book");
	Thread.sleep(2000);
	click("proceed");
    click("removefrommycart");
    Thread.sleep(4000);
    
    Validator.verifyThat(getText("assertof_remove"),
    		              Matchers.equalTo("Till now you did not added any room in your cart."));
    
	//capturing &validation of success message
    /*assertText("assertof_remove","Till now you did not added any room in your cart.");
    Reporter.logWithScreenShot("pass");*/
    
    
  }
}