package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Utils.Utils;

public class YourStorePage extends TestBase {

	public YourStorePage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "#top-links ul li:nth-of-type(2) span:first-of-type")
	private WebElement clickMyAccount;

	@FindBy(css = "#top-links ul.dropdown-menu li:last-of-type")
	private WebElement loginBtn;

	@FindBy(css = "li.dropdown.open>ul>li:first-of-type a")
	private WebElement clickRegister;

	public void clickMyAccountBtn() {
		Utils.click(clickMyAccount);
	}

	public RegisterAccountPage clickRegister() {
		Utils.click(clickRegister);
		return new RegisterAccountPage();
	}

	public AccountLoginPage clickloginBtn() {
		Utils.click(loginBtn);
		return new AccountLoginPage();
	}

}
