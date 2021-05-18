package com.selenium.hackathon2.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.selenium.hackathon2.pages.SigninAccountPage;

public class SigninAccountTest extends SigninAccountPage {
	Logger log = Logger.getLogger("SigninAccountTest");

	@Test
	public void signInTest() throws InterruptedException {

		SigninAccountUtil.signInFunctionality();
		log.info("signinAccountTest" + "---"+ "Your Login to account is Successful");
	}

}
