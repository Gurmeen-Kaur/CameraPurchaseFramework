package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class YourStorePage extends TestBase {

	public YourStorePage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "#top-links ul li:nth-of-type(2) span:first-of-type")
	private WebElement clickMyAccount;

	@FindBy(css = "#top-links ul.dropdown-menu li:last-of-type")
	private WebElement loginBtn;

	public void clickMyAccountBtn() {
		clickMyAccount.click();
	}

	public AccountLoginPage clickloginBtn() {
		loginBtn.click();
		return new AccountLoginPage();
	}

}
