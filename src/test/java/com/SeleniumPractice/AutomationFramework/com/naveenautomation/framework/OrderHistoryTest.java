package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.Base.TestBase;

public class OrderHistoryTest extends TestBase {

	YourStorePage yourStoreObj;
	AccountLoginPage accLoginObj;
	MyAccountPage myAccPageobj;
	OrderHistoryPage orderHistoryPage;

	@BeforeMethod
	public void startBrowserSession() {
		intialization();
		yourStoreObj = new YourStorePage();
		accLoginObj = new AccountLoginPage();
		yourStoreObj.clickMyAccountBtn();
		yourStoreObj.clickloginBtn();
		myAccPageobj = accLoginObj.accountLogin("g4545@gmail.com", "Password@123");
		orderHistoryPage = myAccPageobj.viewOrderHistoryBtnClick();
	}

	@Test
	public void verifyTotalAndOrderDate() {

		String orderTotal = orderHistoryPage.getTotalFromTable("#1426");
		Assert.assertEquals(orderTotal, "$302.00");

		String orderDate = orderHistoryPage.getDateFromTable("#1426");
		Assert.assertEquals(orderDate, "25/08/2022");

	}

	@AfterMethod
	public void CloseBrowserSession() {
		quitBrowser();
	}

}
