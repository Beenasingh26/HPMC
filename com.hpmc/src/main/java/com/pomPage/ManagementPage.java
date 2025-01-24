package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManagementPage extends BaseClass {

	public ManagementPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//p[text() = 'User Management']")
	private WebElement userManagement;
	
	@FindBy(xpath = "//p[text() = 'MIS Report']")
	private WebElement misReport;
	
	@FindBy(xpath = "//p[text() = 'Authorization Management']")
	private WebElement authorizationManagement;
	
	@FindBy(xpath = "//p[text() = 'Master Management']")
	private WebElement masterManagement;

	public WebElement getUserManagement() {
		return userManagement;
	}

	public WebElement getMisReport() {
		return misReport;
	}

	public WebElement getAuthorizationManagement() {
		return authorizationManagement;
	}

	public WebElement getMasterManagement() {
		return masterManagement;
	}
	
	public void toAccessUserManagement() throws InterruptedException
	{
		userManagement.click();
		Thread.sleep(2000);
	}

}
