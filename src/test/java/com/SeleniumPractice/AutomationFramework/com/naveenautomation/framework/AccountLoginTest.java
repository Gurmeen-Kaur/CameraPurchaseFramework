package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.Base.TestBase;
import com.sun.javafx.collections.MappingChange.Map;

public class AccountLoginTest extends TestBase {

	YourStorePage yourStoreObj;
	AccountLoginPage accLoginObj;

	@BeforeMethod
	public void startBrowser() {
		intialization();
		yourStoreObj = new YourStorePage();
	}

	@Test
	public void accountLoginTest() {

		yourStoreObj.clickMyAccountBtn();
		accLoginObj = yourStoreObj.clickloginBtn();
		MyAccountPage mAPage = accLoginObj.accountLogin("g4545@gmail.com", "Password@123");
		Assert.assertEquals(mAPage.getTextFromMyAccount(), "My Account");
	}

	@AfterMethod
	public void closeBrowserSession() {
		quitBrowser();
	}

}
