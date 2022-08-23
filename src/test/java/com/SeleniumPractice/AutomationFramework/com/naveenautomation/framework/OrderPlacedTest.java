package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.Base.TestBase;

public class OrderPlacedTest extends TestBase {

	YourStorePage yourStoreObj;
	AccountLoginPage accLoginObj;
	MyAccountPage myAccObj;
	CamerasPage cameraPageObj;
	CheckoutPage checkoutPageObj;
	OrderPlacedPage orderPlacedObj;

	@BeforeMethod
	public void startBrowserSession() {
		intialization();
		yourStoreObj = new YourStorePage();
		accLoginObj = new AccountLoginPage();
		myAccObj = new MyAccountPage();
		cameraPageObj = new CamerasPage();
		checkoutPageObj = new CheckoutPage();
		yourStoreObj.clickMyAccountBtn();
		yourStoreObj.clickloginBtn();
		accLoginObj.accountLogin("g4545@gmail.com", "Password@123");
		myAccObj.selectCategory();
		cameraPageObj.goToCheckOutPage();
		orderPlacedObj = checkoutPageObj.checkoutTest("Gurmeen", "Kaur", "ABS", "123", "Main Street", "Waterloo",
				"LPI2N6", "Canada", "Ontario");
	}

	@Test
	public void isSuccessMessageDisplayed() {
		String message = orderPlacedObj.getMessageDisplayed();
		Assert.assertEquals(message, "Your order has been placed!");
	}
}
