package com.qsp.vtiger.genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ListenerImplementationClass implements ITestListener {
  ExtentReports report;
  ExtentTest test;
		
	public void onTestStart(ITestResult result) {
		test=report.createTest(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,result.getMethod().getMethodName());
		test.log(Status.PASS,result.getThrowable());
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL,result.getMethod().getMethodName());
		test.log(Status.FAIL,result.getThrowable());
		
		try {
			String screenShotName=WebDriverUtility.takeScreenShot(BaseClass.sDriver,result.getMethod().getMethodName());
		     test.addScreenCaptureFromPath(screenShotName);
		     
		} catch(Throwable e) {
			
			e.printStackTrace();
		}
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		ExtentSparkReporter spark =new ExtentSparkReporter("./ExtentReports/vtigerReport.html");
		
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("Vtiger Extent Report");
		spark.config().setDocumentTitle("Vtiger Report");
		
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("Created By", "Akash");
		report.setSystemInfo("ReviwedBy","Deepak");
		report.setSystemInfo("Platform","ApacheTomcat");
		
	}

	public void onFinish(ITestContext context) {
	
		report.flush();
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP,result.getMethod().getMethodName());
		test.log(Status.SKIP,result.getThrowable());

	}
	}

	
	
	
	