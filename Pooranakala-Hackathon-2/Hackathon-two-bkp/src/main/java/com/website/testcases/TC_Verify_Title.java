package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.Verify_Title;

public class TC_Verify_Title extends BaseClass{
	
	
	    @Test
	    public void verify_Title()
	    {
	    	Verify_Title vt = PageFactory.initElements(driver, Verify_Title.class);
	    vt.WebElements("spooranakala@gmail.com","Poorana@123");
	    System.out.println("verify title of the page correctly");
	    driver.navigate().back();
	    String expected = "YLighting | Best in Modern Lighting and Contemporary Design";
	    String actual = driver.getTitle();

	 

	    if (actual.equalsIgnoreCase(expected)) {
	        System.out.println("Pass: Your title is verified");
	    } 
	    driver.close();
	}
	    }
	
	/*@Test
	public void verify()
	
	{
		String expected="YLighting | Best in Modern Lighting and Contemporary Design";
		String actual=driver.getTitle();
		
		if(actual.equalsIgnoreCase(expected))
		{
			System.out.println("Pass: Your title is verified");
		}
		else
		{
			System.out.println("fail");
		}
		
	}*/


