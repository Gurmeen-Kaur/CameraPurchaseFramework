package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.Base.TestBase;

public class YourStoreTest extends TestBase {

	YourStorePage yourStorePageObj;

	@BeforeMethod
	public void startBrowserSession() {
		intialization();
		yourStorePageObj = new YourStorePage();
	}

	@Test
	public void clickMyAccountTest() {
		yourStorePageObj.clickMyAccountBtn();
	}

	@AfterMethod
	public void closeBrowserSession() {
		quitBrowser();
	}

}
