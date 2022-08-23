package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "#content h2")
	private WebElement myAccountText;

	@FindBy(css = "ul.nav.navbar-nav>li:nth-of-type(7)>a")
	private WebElement cameraCategorySelected;

	public String getTextFromMyAccount() {
		return myAccountText.getText();
	}

	public CamerasPage cameraCategorySelected() {
		cameraCategorySelected.click();
		return new CamerasPage();
	}

	public CamerasPage selectCategory() {
		getTextFromMyAccount();
		return cameraCategorySelected();
	}
}
