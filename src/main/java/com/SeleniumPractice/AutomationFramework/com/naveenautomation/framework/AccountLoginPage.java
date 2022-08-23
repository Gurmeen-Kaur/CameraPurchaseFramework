package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class AccountLoginPage extends TestBase {

	public AccountLoginPage() {

		PageFactory.initElements(webDriver, this);
	}

	@FindBy(id = "input-email")
	private WebElement emailAddressInput;

	@FindBy(id = "input-password")
	private WebElement passwordInput;

	@FindBy(css = "input[type='submit']")
	private WebElement submitBtnClick;

	public void emailAddressInput(String emailEntered) {
		emailAddressInput.sendKeys(emailEntered);
	}

	public void passwordInput(String passwordEntered) {
		passwordInput.sendKeys(passwordEntered);
	}

	public MyAccountPage submitBtnClick() {
		submitBtnClick.click();
		return new MyAccountPage();
	}

	public MyAccountPage accountLogin(String emailEntered, String passwordEntered) {
		emailAddressInput(emailEntered);
		passwordInput(passwordEntered);
		return submitBtnClick();
	}
}
