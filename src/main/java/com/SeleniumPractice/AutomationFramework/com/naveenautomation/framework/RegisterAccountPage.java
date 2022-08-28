package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Utils.Utils;

public class RegisterAccountPage extends TestBase {

	RegisterAccountPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "#account>div:nth-of-type(2)>div>input")
	private WebElement inputFirstName;

	@FindBy(css = "#account>div:nth-of-type(3)>div>input")
	private WebElement inputLastName;

	@FindBy(css = "#account>div:nth-of-type(4) input")
	private WebElement emailInput;

	@FindBy(css = "#input-telephone")
	private WebElement telephoneInput;

	@FindBy(css = "#input-password")
	private WebElement passwordInput;

	@FindBy(css = "#input-confirm")
	private WebElement confirmPasswordInput;

	@FindBy(css = "form.form-horizontal fieldset:last-of-type>div>div>label:first-of-type>input")
	private WebElement subscribeButton;

	@FindBy(css = "div.buttons>div input:first-of-type")
	private WebElement privacyCheckBox;

	@FindBy(css = "div.buttons>div input:last-of-type")
	private WebElement continueButton;

	public void firstNameSendKeys(String firstName) {
		Utils.sendKeys(inputFirstName, firstName);
	}

	public void lastNameSendKeys(String lastName) {
		Utils.sendKeys(inputLastName, lastName);
	}

	public void emailSendKeys(String email) {
		Utils.sendKeys(emailInput, email);
	}

	public void telephoneSendKeys(String telephone) {
		Utils.sendKeys(telephoneInput, telephone);
	}

	public void passwordSendKeys(String password) {
		Utils.sendKeys(passwordInput, password);
	}

	public void confirmPasswordSendKeys(String password) {
		Utils.sendKeys(confirmPasswordInput, password);
	}

	public void subscribeBtn() {
		Utils.click(subscribeButton);
	}

	public void privacyCheckBox() {
		Utils.click(privacyCheckBox);
	}

	public YourAccountHasBeenCreatedPage continueBtnClick() {
		Utils.click(continueButton);
		return new YourAccountHasBeenCreatedPage();
	}

	public YourAccountHasBeenCreatedPage registerNewAccount(String firstName, String lastName, String email,
			String telephone, String password) {
		firstNameSendKeys(firstName);
		lastNameSendKeys(lastName);
		emailSendKeys(email);
		telephoneSendKeys(telephone);
		passwordSendKeys(password);
		confirmPasswordSendKeys(password);
		subscribeBtn();
		privacyCheckBox();
		return continueBtnClick();
	}
}
