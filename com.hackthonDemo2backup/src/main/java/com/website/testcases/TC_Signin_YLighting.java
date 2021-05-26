package com.website.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.website.pages.BaseClass;
import com.website.pages.LoginPage_YLighting;

public class TC_Signin_YLighting extends BaseClass
{
    @Test
    public void SigninTest()
    {
    LoginPage_YLighting LoginPage_YLighting = PageFactory.initElements(driver, LoginPage_YLighting.class);
    LoginPage_YLighting.WebElements( "logeshwari@gmail.com", "Test@123");

    System.out.println("Sigin successfully");
    }
}
