package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Utils.ExcelUtils;

public class RegisterAccountTest extends TestBase {

	YourStorePage yourStorePage;
	RegisterAccountPage regAccountPage;

	@BeforeMethod
	public void startBrowserSession() {
		intialization();
		yourStorePage = new YourStorePage();

	}

	@Test(dataProvider = "Signup Data")
	public void registerAccountTest(String userName, String password) {
		yourStorePage.clickMyAccountBtn();
		regAccountPage = yourStorePage.clickRegister();
		regAccountPage.registerNewAccount("test", "test", userName, "0000", password);

//		Assert.assertEquals(userName, password);

	}

	@DataProvider(name = "Signup Data")
	String[][] dataProviderToLogin() throws Exception {
		String filePath = "C:\\data\\Book3.xlsx";
		int row = ExcelUtils.getRowsCount(filePath, "Sheet1");
		int col = ExcelUtils.getColumnCount(filePath, "Sheet1", row);

		String[][] logindata = new String[row][col];
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < col; j++) {
				logindata[i - 1][j] = ExcelUtils.getCellData(filePath, "Sheet1", i, j);
			}
		}

		return logindata;
	}

	public void closeBrowserSession() {
		quitBrowser();
	}
}
