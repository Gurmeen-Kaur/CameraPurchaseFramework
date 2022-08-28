package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Utils.Utils;

public class ChangePasswordPage extends TestBase {

	public ChangePasswordPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "#input-password")
	private WebElement passwordInputField;
	@FindBy(css = "#input-confirm")
	private WebElement passwordConfirmInputField;
	@FindBy(css = "div.buttons.clearfix input")
	private WebElement continueBtn;

	public void passwordInputSendKeys(String newPassword) {
		Utils.sendKeys(passwordInputField, newPassword);
	}

	public void passwordConfirmSendKeys(String newPassword) {
		Utils.sendKeys(passwordConfirmInputField, newPassword);
	}

	public MyAccountPage continueBtnClick() {
		Utils.click(continueBtn);
		return new MyAccountPage();
	}

	public MyAccountPage passwordChange(String newPassword) {
		passwordInputSendKeys(newPassword);
		passwordConfirmSendKeys(newPassword);
		return continueBtnClick();
	}

}
