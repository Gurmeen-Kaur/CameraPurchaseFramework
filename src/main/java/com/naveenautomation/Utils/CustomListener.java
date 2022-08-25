package com.naveenautomation.Utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.naveenautomation.Base.TestBase;

public class CustomListener extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test execution has started....." + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test has passed successfully....." + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test has failed and is taking screenshot....." + result.getMethod().getMethodName());
		Utils.takeFailedTestsScreenshots(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test has been skipped....." + result.getMethod().getMethodName());
	}

}
