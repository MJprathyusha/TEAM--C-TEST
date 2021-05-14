package com.hackathon.selenium.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static  ExtentTest test;
    
    public static void setExtent() {
    	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Open_Cart_Reports/" + "ExtentReportResults.html");
    	htmlReporter.config().setDocumentTitle("Automation Test Report");
    	htmlReporter.config().setReportName("OpenCart Automation Report");
    	htmlReporter.config().setTheme(Theme.DARK);
    	
    	extent  = new ExtentReports();
    	extent.attachReporter(htmlReporter);
    }
    
    public static void endReport() {
    	extent.flush();
    }
} 
