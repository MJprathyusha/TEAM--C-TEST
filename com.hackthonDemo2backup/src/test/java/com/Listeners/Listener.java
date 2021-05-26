package com.Listeners;

import java.io.File;
import java.io.IOException;

 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ExtentReports.Extentreports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.website.pages.BaseClass;

/*import Datafactory.Base;
import ExtentReports.Extentreports;
*/
 
public class Listener extends BaseClass implements ITestListener {
    WebDriver driver=null;
    ExtentTest test;
    ExtentReports extent=Extentreports.getReportObject();
    ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
        test= extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);
        
    }

 

    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
        extentTest.get().log(Status.PASS, "Test Passed");
    }

 

    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
        //Screenshot
        
        extentTest.get().fail(result.getThrowable());
        
    }

 

 

    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
        
    }

 

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
        
    }

 

    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
        
    }

 

    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
        extent.flush();
    }
}

