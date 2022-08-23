package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class OrderPlacedPage extends TestBase {

	public OrderPlacedPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "#common-success h1")
	private WebElement orderPlacedSuccessMessage;

	public String getMessageDisplayed() {
		return orderPlacedSuccessMessage.getText();
	}
}
