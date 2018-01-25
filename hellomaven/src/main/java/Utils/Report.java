package Utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.Utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.view.ScreenshotHtml;

import Test.BaseTest;

public class Report implements ITestListener  {
	
	ExtentReports extent;
	ExtentTest test;
    String date;
	private ITestResult tr;
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		extent.flush();
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		DateFormat df=new SimpleDateFormat("dd-MMM-YYYY_hh_mm_ssaa");
		 date=df.format(new Date());
		 System.out.println("date");
		 extent = new ExtentReports(System.getProperty("user.dir")+"\\src\\main\\java\\Report\\"+date+".html");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		File sh=((TakesScreenshot)BaseTest.d).getScreenshotAs(OutputType.FILE);
		try{
			FileUtils.copyFile(sh, new File(System.getProperty("user.dir")+"\\src\\main\\java\\Report\\"+date+tr.getMethod().getMethodName()+".png"));
		}
		catch  (IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Throwable t=tr.getThrowable();
		String error=Utils.stackTrace(t,true)[0];
		test.log(LogStatus.FAIL," Fail details");
		test.log(LogStatus.INFO, ScreenshotHtml.getSource(System.getProperty("user.dir")+"\\src\\main\\java\\Report\\"+date+tr.getMethod().getMethodName()+".png"));
        test.log(LogStatus.ERROR, error);	
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		test.log(LogStatus.SKIP,"Skip details");
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		test=extent.startTest(tr.getTestClass().getName()+"---"+tr.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		test.log(LogStatus.PASS, " Pass details");
		
	}
	

}
