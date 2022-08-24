package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.Base.TestBase;

public class CamerasTest extends TestBase {

	YourStorePage yourStoreObj;
	AccountLoginPage accLoginObj;
	MyAccountPage myAccObj;
	CamerasPage cameraPageObj;

	@BeforeMethod
	public void startBrowserSession() {
		intialization();

		yourStoreObj = new YourStorePage();
//		accLoginObj = new AccountLoginPage();
//		myAccObj = new MyAccountPage();
		yourStoreObj.clickMyAccountBtn();
		accLoginObj = yourStoreObj.clickloginBtn();
		myAccObj = accLoginObj.accountLogin("g4545@gmail.com", "Password@123");
		cameraPageObj = myAccObj.selectCategory();
	}

	@Test
	public void addToCartTest() {
		cameraPageObj.goToCheckOutPage();
	}

	@AfterMethod
	public void closeBrowserSession() {
		quitBrowser();
	}
}
