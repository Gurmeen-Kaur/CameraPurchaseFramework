package com.SeleniumPractice.AutomationFramework.com.naveenautomation.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;
import com.naveenautomation.Utils.Utils;

public class MyAccountPage extends TestBase {

	public MyAccountPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "#content h2")
	private WebElement myAccountText;

	@FindBy(css = "ul.nav.navbar-nav>li:nth-of-type(7)>a")
	private WebElement cameraCategorySelected;

	@FindBy(css = "#content >ul:first-of-type>li:nth-of-type(2) a")
	private WebElement changeYourPassword;

	@FindBy(css = "#content>ul:nth-of-type(2)>li:first-of-type a")
	private WebElement viewOrderHistory;

	public String getTextFromMyAccount() {
		return Utils.getText(myAccountText);
	}

	public ChangePasswordPage clickChangeYourPassword() {
		Utils.click(changeYourPassword);
		return new ChangePasswordPage();
	}

	public OrderHistoryPage viewOrderHistoryBtnClick() {
		Utils.click(viewOrderHistory);
		return new OrderHistoryPage();
	}

	public CamerasPage cameraCategorySelected() {
		Utils.click(cameraCategorySelected);
		return new CamerasPage();
	}

	public CamerasPage selectCategory() {
		getTextFromMyAccount();
		return cameraCategorySelected();

	}
}
