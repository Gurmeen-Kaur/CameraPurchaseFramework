package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.Base.TestBase;

public class ChangePasswordTest extends TestBase {

	YourStorePage yourStoreObj;
	AccountLoginPage accLoginObj;
	MyAccountPage myAccPageobj;
	ChangePasswordPage changePasswordPage;

	@BeforeMethod
	public void startBrowserSession() {
		intialization();
		yourStoreObj = new YourStorePage();
	}

	@Test
	public void verifyPasswordChangeTest() {
		yourStoreObj.clickMyAccountBtn();
		accLoginObj = yourStoreObj.clickloginBtn();
		myAccPageobj = accLoginObj.accountLogin("g4545@gmail.com", "Password@123");
		changePasswordPage = myAccPageobj.clickChangeYourPassword();
		changePasswordPage.passwordChange("Password@123");
	}

	@AfterMethod
	public void closeBrowserSession() {
		quitBrowser();
	}
}
