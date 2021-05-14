package com.hackathon.selenium.pageelements;

import org.openqa.selenium.By;

public class LoginPageElements {

	public static By REGISTER_NEW = By.xpath("//*[@id=\"content\"]/div/div[1]/div/a");
	
	public static By LOGIN_EMAIL  = By.xpath("//*[@id=\"input-email\"]");
	
	public static By LOGIN_PASSWORD = By.xpath("//*[@id=\"input-password\"]");
	
	public static By  LOGIN_SUBMIT = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	
	public static By HOME_BUTTON = By.xpath("//*[@id=\"account-account\"]/ul/li[1]/a/i");
	
	public static By EDIT_ACCOUNT = By.xpath("//*[@id=\"column-right\"]/div/a[2]");
	
	public static By UPDATE_LASTNAME = By.xpath("//*[@id=\"input-lastname\"]");
	
	public static By EDIT_CONTINUE = By.xpath("//*[@id=\"content\"]/form/div/div[2]/input");
	
	public static By LOGOUT   =  By.xpath("//*[@id=\"column-right\"]/div/a[13]");
	
	public static By LOGOUT_CONTINUE = By.xpath("//*[@id=\"content\"]/div/div/a");

}
