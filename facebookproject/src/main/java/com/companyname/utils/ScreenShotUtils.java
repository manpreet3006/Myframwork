package com.companyname.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.companyname.pageobject.BaseTest;


public class ScreenShotUtils implements ITestListener{
	
	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println(" This is on Finish");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println(" This is on Start");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(" This is on TestFailedButWithinSuccessPercentage ");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		  String methodname = result.getMethod().getMethodName();
		  String classname = result.getMethod().getTestClass().getName();
		// TODO Auto-generated method stub
		System.out.println(" This is on onTestFailure ");
		File screenshot=((TakesScreenshot)BaseTest.d).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\companyname\\screenshot\\"+classname+"--"+methodname+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println(" This is on TestSkipped");
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println(" This is onTestStart");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println(" This is onTestSuccess");
		
	}

}
