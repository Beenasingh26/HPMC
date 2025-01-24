package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserManagement extends BaseClass {

	public UserManagement(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//button[@class = 'GoBackButton_back_btn__mCy+Y']")
	private WebElement goBack;
	
	@FindBy(xpath = "//button[text() = 'Bulk Import']")
	private WebElement bulkImport;
	
	@FindBy(xpath = "//button[text() = 'Add New User']")
	private WebElement addNewUser;
	
	@FindBy(xpath = "//button[text() = 'HPMC User ']")
	private WebElement hpmcUser;
	
	@FindBy(xpath = "//button[text() = 'Non HPMC User ']")
	private WebElement nonHpmcUser;
	
	@FindBy(xpath = "//div[text() = 'Export CSV']")
	private WebElement exportCsv;
	
	@FindBy(xpath = "//input[@placeholder = 'Search Name']")
	private WebElement searchNameTextField;
	
	@FindBy(xpath = "//input[@value = 'Search']")
	private WebElement searchbutton;

	public WebElement getGoBack() {
		return goBack;
	}

	public WebElement getBulkImport() {
		return bulkImport;
	}

	public WebElement getAddNewUser() {
		return addNewUser;
	}

	public WebElement getHpmcUser() {
		return hpmcUser;
	}

	public WebElement getNonHpmcUser() {
		return nonHpmcUser;
	}

	public WebElement getExportCsv() {
		return exportCsv;
	}

	public WebElement getSearchNameTextField() {
		return searchNameTextField;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	public void toOpenAddNewUserForm() throws InterruptedException
	{
		addNewUser.click();
		Thread.sleep(3000);
	}
	
	
}
