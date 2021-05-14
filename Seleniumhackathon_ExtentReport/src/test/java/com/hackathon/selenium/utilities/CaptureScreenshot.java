package com.hackathon.selenium.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
	
public static void captureScreenshotnSave(WebDriver webdriver, String screenshotName) {
		
		String dateString = new SimpleDateFormat("yyyyMMddhhhmmss").format(new Date());
		
		String destPath = System.getProperty("user.dir")+ "/Open_Cart_Screenshots/" + screenshotName + dateString + ".png";

		//System.out.println(destPath);
		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File DestFile = new File(destPath);

		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
