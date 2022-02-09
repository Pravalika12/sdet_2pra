package com.VTiger.genericutil;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener
{
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test; 
	public void onTestStart(ITestResult result)
{
	test=reports.createTest(result.getMethod().getMethodName());
}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+""+"test passed");
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL,result.getMethod().getMethodName()+""+"test failed");
		test.log(Status.FAIL,result.getThrowable());
		try {
			
			String path=ExtentReportfortc.takescreenshot(result.getMethod().getMethodName());
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
	test.log(Status.SKIP,result.getMethod().getMethodName()+""+"test skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		reporter=new ExtentHtmlReporter("./ExtentReporters/SDET3.html");
		reporter.config().setDocumentTitle("VTiger");
		reporter.config().setTheme(Theme.STANDARD);
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("name of app", "VTiger");
		reports.setSystemInfo("name of test eng", "Pravalika");
		reports.setSystemInfo("name of Buildno", "4.1.2");
	}

	public void onFinish(ITestContext context) {
		reports.flush();
	}

}
