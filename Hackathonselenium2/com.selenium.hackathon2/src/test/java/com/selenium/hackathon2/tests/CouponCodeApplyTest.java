package com.selenium.hackathon2.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.selenium.hackathon2.pages.HomePage;
import com.selenium.hackathon2.utilities.CaptureScreenshot;
import com.selenium.hackathon2.utilities.ReadPropertyExcel;

public class CouponCodeApplyTest extends HomePage {
	Logger log = Logger.getLogger("CouponCodeApplyTest");
	ReadPropertyExcel rpExcel = new ReadPropertyExcel();

	@Test
	public void VerifyApplyCouponCode() throws InterruptedException {

		SigninAccountUtil.signInFunctionality();
		Thread.sleep(5000);	
		HomePage.clickOnViewCart();		
		HomePage.enterCouponCode();
		HomePage.clickOnApply();
		CaptureScreenshot.captureScreenshotnSave(driver, "Apply_Coupon_Code_Details");
		
		log.info("CouponCodeApplyTest" + "---"+ "Coupoun apply validation is Successful");
	}

}
