package com.hackathon.selenium.pageelements;

import org.openqa.selenium.By;

public class RegisterAccountPageElements {
	
	public static By FIRST_NAME = By.xpath("//*[@id=\"input-firstname\"]");
	
	public static By LAST_NAME  = By.xpath("//*[@id=\"input-lastname\"]");
	
	public static By EMAIL      = By.xpath("//*[@id=\"input-email\"]");
	
	public static By TELEPHONE  = By.xpath("//*[@id=\"input-telephone\"]");
	
	public static By PASSWORD   = By.xpath("//*[@id=\"input-password\"]");
	
	public static By PASSWORD_CONFIRM = By.xpath("//*[@id=\"input-confirm\"]");
	
	public static By SUBSCRIBE_YES = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]");
	
	public static By SUBSCRIBE_NO = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]");
	
	public static By PRIVACY_CHECK = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	
	public static By CONTINUE  = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
}