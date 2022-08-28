package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Utils.Utils;

public class YourAccountHasBeenCreatedPage extends TestBase {

	public YourAccountHasBeenCreatedPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "#content h1")
	private WebElement getHeadingText;

	public String getText() {
		return Utils.getText(getHeadingText);
	}
}
