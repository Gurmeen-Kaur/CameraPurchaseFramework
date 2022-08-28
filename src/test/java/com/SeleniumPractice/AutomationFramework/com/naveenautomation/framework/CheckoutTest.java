package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.Base.TestBase;

public class CheckoutTest extends TestBase {

	YourStorePage yourStoreObj;
	AccountLoginPage accLoginObj;
	MyAccountPage myAccObj;
	CamerasPage cameraPageObj;
	CheckoutPage checkoutPageObj;

	@BeforeMethod
	public void startBrowserSession() {
		intialization();
		yourStoreObj = new YourStorePage();
	}

	@Test
	public void checkoutConfirmTest() {
		yourStoreObj.clickMyAccountBtn();
		accLoginObj = yourStoreObj.clickloginBtn();
		myAccObj = accLoginObj.accountLogin("g4545@gmail.com", "Password@123");
		cameraPageObj = myAccObj.selectCategory();
		checkoutPageObj = cameraPageObj.goToCheckOutPage();
		checkoutPageObj.checkoutTest("Gurmeen", "Kaur", "ABS", "123", "Main Street", "Waterloo", "LPI2N6", "Canada",
				"Ontario");
	}

	@AfterMethod
	public void closeBrowserSession() {
		quitBrowser();
	}
}
