package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class CamerasPage extends TestBase {

	public CamerasPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "div.product-layout:last-of-type button:first-of-type")
	private WebElement clickAddToCart;

	@FindBy(css = "ul.list-inline >li:nth-of-type(5) span")
	private WebElement clickCheckoutBtn;

	public void clickAddToCartTest() {
		clickAddToCart.click();
	}

	public CheckoutPage clickCheckoutBtnTest() {
		clickCheckoutBtn.click();
		return new CheckoutPage();
	}

	public CheckoutPage goToCheckOutPage() {
		clickAddToCartTest();
		return clickCheckoutBtnTest();

	}

}
