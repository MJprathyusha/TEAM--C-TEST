package com.qmetry.qaf.example.steps;

import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import java.util.concurrent.TimeUnit;

import static com.qmetry.qaf.automation.step.CommonStep.assertText;
import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.ui.webdriver.ElementFactory.$;

import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import static com.qmetry.qaf.automation.step.CommonStep.clear;
import static com.qmetry.qaf.automation.step.CommonStep.mouseOver;
import com.qmetry.qaf.automation.data.ElementInteractor.SelectBox;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Reporter;
import com.qmetry.qaf.automation.util.Validator;

public class StepsLibrary {
	/**
	 * @param searchTerm
	 *            : search term to be searched
	 * @throws InterruptedException 
	 */
	
	               //Register method
	@QAFTestStep(description = "Tc1_register")
	public static void sign(String emailid,String frstname,String lstname,String password) throws InterruptedException {
		click("signin");
		sendKeys(emailid,"email");
		click("create");
		System.out.println("Create clicked successfully");
		sendKeys(frstname,"Firstname");
		sendKeys(lstname,"Lastname");
		//sendKeys(emailid1,"EmailToLogin");
		sendKeys(password,"Password");
		Thread.sleep(5000);
		click("register");
		assertText("assertof_register","Your account has been created.");
		Thread.sleep(5000);

		Reporter.logWithScreenShot("pass");
		click("arrow");
		Thread.sleep(5000);

		click("Logout");
		Thread.sleep(5000);
		System.out.println("logout successfully");		
	}
	
	
	         //Login Method
	@QAFTestStep(description = "TC2_login")

	public static void login(String email,String pass,String Address,String city,String reff) throws InterruptedException
	{
		click("signin");
		clear("EmailToLogin");
		sendKeys(email,"EmailToLogin");
		clear("Pass");
		sendKeys(pass,"Pass");
		click("Signin");
		Thread.sleep(50000);
		Reporter.logWithScreenShot("pass");
		click("Addaddress");
		sendKeys(Address,"address1");
		sendKeys(city,"City");
    	new SelectBox("state").sendKeys("Hawaii");
		Thread.sleep(5000);

    	sendKeys("63601","postal");
    	sendKeys("8667236349","home");
    	sendKeys("8667236349","mobile");
    	clear("ref");
    	sendKeys(reff,"ref");
    	click("save");
		Thread.sleep(5000);
	    assertText("assertof_address","Your addresses are listed below.");

		Reporter.logWithScreenShot("pass");
		System.out.println("saved successfully");
		
	}
        //Remove cart method
    @QAFTestStep(description = "TC_OPENCART_007, Remove From Cart")
    public static void RemoveFromCart(String enter_hotel_loc) throws InterruptedException
    {
    	
        //clear("hotel_loc");
        sendKeys(enter_hotel_loc, "hotel_loc");
        click("hotel_cat_name");
        click("hotel_cat_name1");
        click("qlo_checkintime");
        click("qlo_checkintime1");
        click("qlo_checkouttime");
        click("qlo_checkouttime1");
        click("search_room_submit");
        Thread.sleep(5000);

        click("book");
        Thread.sleep(5000);

        click("proceed");
        Thread.sleep(5000);
        click("Remove");      
        Thread.sleep(5000);
        assertText("assert_removecart","Till now you did not added any room in your cart.");

        Reporter.logWithScreenShot("pass");


        
    }
      
            //Order Method
    @QAFTestStep(description = "TC_4 Order History")
    public static void Order(String email,String pass) throws InterruptedException
    {
    	
    	click("signin");
		clear("EmailToLogin");
		sendKeys(email,"EmailToLogin");
		clear("Pass");
		sendKeys(pass,"Pass");
		click("Signin");		
        Thread.sleep(1000);
        click("OrderDetails");
        click("Details");
        Reporter.logWithScreenShot("pass");
        click("Cancelreq");
      Thread.sleep(1000);
        click("CheckBoxH");
      //  Thread.sleep(1000);
        click("C_Submit");
        sendKeys("THANK YOU", "Comments");
        click("SubmitCancel");
        Thread.sleep(1000);
        assertText("assertof_cancel","You have booking cancelation requests from this order. To see the cancelation request status Click Here");

        Reporter.logWithScreenShot("pass");
        
    }
    
          //Personal information method
    @QAFTestStep(description = "TC_5 Personal")
    public static void Personal(String email,String pass) throws InterruptedException
    {
    	
    	click("signin");
		clear("EmailToLogin");
		sendKeys(email,"EmailToLogin");
		clear("Pass");
		sendKeys(pass,"Pass");
		click("Signin");	
         click("personal");
         clear("updatefirstname");
         sendKeys("logesh", "updatefirstname");
         clear("updatelastname");
         sendKeys("soniya", "updatelastname");
         new SelectBox("days").sendKeys("4  ");
         new SelectBox("months").sendKeys("June  ");
         new SelectBox("years").sendKeys("2016    ");
         sendKeys( pass,"oldpassword");
        /* sendKeys("Test@2021", "newpassword");
         sendKeys("Test@2021", "confirmpassword");*/
         click("savebutton");
         Thread.sleep(5000);
  		assertText("assertof_update","Your personal information has been successfully updated.");

         Reporter.logWithScreenShot("pass");

         click("arrow");
 		Thread.sleep(5000);
 		click("Logout");
 		Thread.sleep(5000);
 		Reporter.logWithScreenShot("pass");
 		System.out.println("logout successfully");	
       

   }
    
         //Contact Us Method
    @QAFTestStep(description = "TC_6 contact")
    public static void Contact(String email) throws InterruptedException
    {
    	
        click("threedot");
        click("contact");
        click("Subject");
        click("Customerservice");
        sendKeys(email, "contactemail");
        sendKeys(" Customer service query", "message");
        click("sendmessage");
        Thread.sleep(5000);  
        String message = $("assertof_contactus").getText();
        Validator.verifyThat(message,Matchers.equalTo("Your message has been successfully sent to our team."));
       // assertText("assertof_contactus","Your message has been successfully sent to our team.");
        Reporter.logWithScreenShot("pass");

    }
    
         //Booking hotelroom Method
       /* @QAFTestStep(description = "TC-3 Booking hotelroom")
        public static void guest(String email,String psword,String firstname,String lastname)
                
        {
        	
            click("Menu");
            click("ROOMS");            
            click("Book_Now");
            click("checkintime");
            click("checkintime1");
            click("checkouttime");
            click("checkouttime1");
            click("book");
            click("Proceed_To_Checkout");
            click("Proceed");
            sendKeys(firstname,"customer_firstname");
            sendKeys(lastname,"customer_lastname");
            sendKeys(email,"EMAIL_ID");
            sendKeys(psword,"PASSWORD1");
            sendKeys("9994309603","phone_mobile");
            click("submitAccount");
            click("final_Proceed");
            click("Payment_Information");
            click("Pay_by_BankWire");
            click("I_Confirm_My_Order");
            Reporter.logWithScreenShot("pass");
            click("Logeshwari");
            click("Logout");
            
        }*/
    }
    
 

