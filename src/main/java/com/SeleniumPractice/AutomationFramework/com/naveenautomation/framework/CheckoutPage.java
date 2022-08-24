package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naveenautomation.Base.TestBase;

public class CheckoutPage extends TestBase {

	public CheckoutPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "form.form-horizontal>div:nth-of-type(3) input")
	private WebElement useNewAddress;

	@FindBy(css = "#input-payment-firstname")
	private WebElement firstNameInputField;

	@FindBy(css = "#input-payment-lastname")
	private WebElement lastNameInputField;

	@FindBy(css = "#input-payment-company")
	private WebElement companyNameInputField;

	@FindBy(css = "#input-payment-address-1")
	private WebElement addressLine1InputField;

	@FindBy(css = "#input-payment-address-2")
	private WebElement addressLine2InputField;

	@FindBy(css = "#input-payment-city")
	private WebElement cityNameInputField;

	@FindBy(css = "#input-payment-postcode")
	private WebElement postCodeInputField;

	@FindBy(css = "#input-payment-country")
	private WebElement countryNameInputField;

	@FindBy(css = "#input-payment-zone")
	private WebElement regionNameInputField;

	@FindBy(id = "button-payment-address")
	private WebElement clickContinueBtn;

	@FindBy(css = "#button-shipping-address")
	private WebElement deliveryDetailsContinueBtn;

	@FindBy(id = "button-shipping-method")
	private WebElement deliveryMethodContinueBtn;

	@FindBy(css = "#collapse-payment-method>div>div.buttons input:first-of-type")
	private WebElement checkBoxAgree;

	@FindBy(id = "button-payment-method")
	private WebElement paymentMethodContinue;

	@FindBy(id = "button-confirm")
	private WebElement confirmBtn;

	public void useNewAddressClick() {

//		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		getExplicitWaitObj().until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("form.form-horizontal>div:nth-of-type(3) input")));

		useNewAddress.click();
	}

	public void firstNameSendKeys(String firstName) {
		firstNameInputField.sendKeys(firstName);
	}

	public void lastNameSendKeys(String lastName) {
		lastNameInputField.sendKeys(lastName);
	}

	public void companyNameSendKeys(String companyName) {
		companyNameInputField.sendKeys(companyName);
	}

	public void addressLine1SendKeys(String addressLine1) {
		addressLine1InputField.sendKeys(addressLine1);
	}

	public void addressLine2InputField(String addressLine2) {
		addressLine2InputField.sendKeys(addressLine2);
	}

	public void cityNameSendKeys(String cityName) {
		cityNameInputField.sendKeys(cityName);
	}

	public void postCodeSendKeys(String postCode) {
		postCodeInputField.sendKeys(postCode);
	}

	public void countryNameSendKeys(String countryName) {
		selectObject(countryNameInputField).selectByVisibleText(countryName);
	}

	public void regionNameSendKeys(String regionName) {
		selectObject(regionNameInputField).selectByVisibleText(regionName);
	}

	public void clickContinueBtn() {
		clickContinueBtn.click();
	}

	public void deliveryDetailsContinueBtn() {
//		getExplicitWaitObj()
//				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button-shipping-address")));
		deliveryDetailsContinueBtn.click();
	}

	public void deliveryMethodContinueBtn() {
//		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		getExplicitWaitObj()
				.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#button-shipping-method")));

		deliveryMethodContinueBtn.click();
	}

	public void checkBoxAgree() {
		checkBoxAgree.click();
	}

	public void paymentMethodContinueBtn() {
		paymentMethodContinue.click();
	}

	public OrderPlacedPage confirmBtn() {
		confirmBtn.click();
		return new OrderPlacedPage();
	}

	public OrderPlacedPage checkoutTest(String first_Name, String last_Name, String company_Name, String address_Line1,
			String address_Line2, String city_Name, String post_Code, String country_Name, String region_Name) {
		useNewAddressClick();
		firstNameSendKeys(first_Name);
		lastNameSendKeys(last_Name);
		companyNameSendKeys(company_Name);
		addressLine1SendKeys(address_Line1);
		addressLine2InputField(address_Line2);
		cityNameSendKeys(city_Name);
		postCodeSendKeys(post_Code);
		countryNameSendKeys(country_Name);
		regionNameSendKeys(region_Name);
		clickContinueBtn();
		deliveryDetailsContinueBtn();
		deliveryMethodContinueBtn();
		checkBoxAgree();
		paymentMethodContinueBtn();
		return confirmBtn();

	}

	public Select selectObject(WebElement element) {
		Select sc = new Select(element);
		return sc;
	}

	public WebDriverWait getExplicitWaitObj() {
		WebDriverWait wait = new WebDriverWait(webDriver, 30);
		return wait;
	}
}
