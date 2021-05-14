package com.hackathon.selenium.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.hackathon.selenium.base.ExtentManager;

public class ListenerTest extends ExtentManager implements ITestListener {

	
	// When Test case get Started, this method is called.
		@Override
		public void onTestStart(ITestResult result) {
			test = extent.createTest(result.getName());
		}
		
	// When Test case get passed, this method is called.
		@Override
		public void onTestSuccess(ITestResult result) {
			if(result.getStatus()== ITestResult.SUCCESS) {
				test.log(Status.PASS, "Pass test case is : "+result.getName());
			}
		}	
		
	// When Test case get failed, this method is called.
		@Override
		public void onTestFailure(ITestResult result) {
			if(result.getStatus()== ITestResult.FAILURE) {
				test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"  - Failed test case", ExtentColor.RED));
				test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() +  "-  Failed test case", ExtentColor.RED));		
						
			}
		}
		
	// When Test case get Skipped, this method is called.
		@Override
		public void onTestSkipped(ITestResult result) {
			if(result.getStatus()== ITestResult.SKIP) {
				test.log(Status.SKIP, "Skipped test case is : "+result.getName());
			}
		}	


}
