package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.Base.TestBase;

public class MyAccountTest extends TestBase {

	YourStorePage yourStoreObj;
	AccountLoginPage accLoginObj;
	MyAccountPage myAccObj;

	@BeforeMethod
	public void startBrowserSession() {
		intialization();
		yourStoreObj = new YourStorePage();
		accLoginObj = new AccountLoginPage();
		yourStoreObj.clickMyAccountBtn();
		yourStoreObj.clickloginBtn();
		myAccObj = accLoginObj.accountLogin("g4545@gmail.com", "Password@123");
	}

	@Test
	public void cameraCategoryClickTest() {

		myAccObj.selectCategory();

	}

	@AfterMethod
	public void closeBrowserSession() {
		quitBrowser();
	}

}
