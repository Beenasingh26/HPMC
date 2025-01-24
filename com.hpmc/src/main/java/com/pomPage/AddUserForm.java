package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class AddUserForm extends BaseClass {

	public AddUserForm(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath = "//input[@name = 'fullName']")
	private WebElement fullNameTextField;
	
	@FindBy(xpath = "//input[@name = 'email']")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//input[@name = 'contactNo']")
	private WebElement contactNoTextField;
	
	@FindBy(id = "department")
	private WebElement departmentDropdown;
	
	@FindBy(id = "designation")
	private WebElement designationDropdown;
	
	@FindBy(xpath = "//button[@data-toggle='button']")
	private WebElement employeeStatusToggleButton;
	
	@FindBy(xpath = "//input[@name = 'employeeCode']")
	private WebElement employeeCodeTextField;
	
	@FindBy(id = "isAdmin")
	private WebElement userTypeCheckBox;
	
	@FindBy(xpath = "//input[@name = 'password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//input[@name = 'confirm_password']")
	private WebElement confirmPasswordTextField;
	
	@FindBy(xpath = "//button[text() = 'Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//button[text() = 'Add New User']")
	private WebElement addNewUserButton;

	public WebElement getFullNameTextField() {
		return fullNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getContactNoTextField() {
		return contactNoTextField;
	}

	public WebElement getDepartmentDropdown() {
		return departmentDropdown;
	}

	public WebElement getDesignationDropdown() {
		return designationDropdown;
	}

	public WebElement getEmployeeStatusToggleButton() {
		return employeeStatusToggleButton;
	}

	public WebElement getEmployeeCodeTextField() {
		return employeeCodeTextField;
	}

	public WebElement getUserTypeCheckBox() {
		return userTypeCheckBox;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getAddNewUserButton() {
		return addNewUserButton;
	}
	
	//business logic
	public void toAddNewUser(String un,String email,String contactNo,String eCode,String pwd,String confirmPwd) throws InterruptedException
	{
		
		fullNameTextField.sendKeys(un);
		Thread.sleep(2000); 
		emailTextField.sendKeys(email);
		Thread.sleep(2000);
		contactNoTextField.sendKeys(contactNo);
		Thread.sleep(2000);
		employeeStatusToggleButton.click();
		Thread.sleep(2000);
		employeeCodeTextField.sendKeys(eCode);
		Thread.sleep(2000);
		
		Select se = new Select(departmentDropdown);
		se.selectByValue("1");
		Thread.sleep(2000);
		Select sel = new Select(designationDropdown);
		sel.selectByValue("1");
		Thread.sleep(2000);
		
		passwordTextField.sendKeys(pwd);
		Thread.sleep(2000);
		confirmPasswordTextField.sendKeys(confirmPwd);
		Thread.sleep(2000);
		addNewUserButton.click();
		Thread.sleep(2000);
		
//		driver.navigate().to("http://localhost/hpmc-ui/admin/userManagementDashboard/createUser");
//		// Refresh the current page
//		driver.navigate().refresh();
		 
	}

}
