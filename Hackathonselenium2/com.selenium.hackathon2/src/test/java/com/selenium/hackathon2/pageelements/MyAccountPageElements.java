package com.selenium.hackathon2.pageelements;

import org.openqa.selenium.By;

public class MyAccountPageElements {
	
       public static By ACCOUNT = By.xpath("//*[@class=\"btn account-btn\"]");
       
       public static By MY_ACCOUNT_REGISTER = By.xpath("//a[@class=\"dropdown-item\" and @id=\"my_account_hdr_link\"]");
       
       public static By FIRST_NAME = By.xpath("//*[@id=\"dwfrm_profile_customer_firstname\"]");
    		   
       public static By LAST_NAME = By.xpath("//*[@id=\"dwfrm_profile_customer_lastname\"]");
    
       public static By EMAIL_ADDRESS = By.xpath("//*[@id=\"dwfrm_profile_customer_email\"]");
      
       public static By CONFIRM_EMAIL_ADDRESS = By.xpath("//*[@id=\"dwfrm_profile_customer_emailconfirm\"]");
      
       public static By PASSWORD = By.xpath("//*[@id=\"dwfrm_profile_login_password\"]");
       
       public static By CONFIRM_PASSWORD = By.xpath("//*[@id=\"dwfrm_profile_login_passwordconfirm\"]");
       
       public static By CONFIRM_ACCOUNT = By.xpath("//*[@name=\"dwfrm_profile_confirm\"]");

}
