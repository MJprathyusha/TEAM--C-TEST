package com.selenium.hackathon2.pageelements;

import org.openqa.selenium.By;

public class SigninAccountPageElements {
	
	public static By SIGN_IN = By.xpath("//a[@class=\"userlogin\"]");
	
	public static By EMAIL = By.xpath("//*[@id=\"dwfrm_login_username\"]");
	
	public static By PASSWORD = By.xpath("//input[@type=\"password\"]");
	
	public static By SIGN_IN_SUBMIT = By.xpath("//*[@value=\"Log In\"]");
	
	public static By ADVERTISE_WINDOW = By.xpath("//*[@id=\"ltkpopup-close-button\"]");
	

}
