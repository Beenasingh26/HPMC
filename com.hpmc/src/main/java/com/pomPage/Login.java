package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends BaseClass{

	public Login(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="email")
	private WebElement userNameTextField;
	
	@FindBy(id="password")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginButton;
	
	@FindBy(xpath="//input[@placeholder='Enter captcha']")
	private WebElement captchaTextField;

	public WebElement getCaptchaTextField() {
		return captchaTextField;
	}

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//business logic 
	public void validLoginToHPMC(String email,String password) throws InterruptedException
	{
	userNameTextField.sendKeys(email);
	passwordTextField.sendKeys(password);
	captchaTextField.sendKeys(" ");
	Thread.sleep(5000);
	loginButton.click();
	Thread.sleep(5000);
	
	}
	
	public void inValidLoginToHPMC(String email,String password) throws InterruptedException
	{
		userNameTextField.sendKeys(email);
		passwordTextField.sendKeys(password);
		captchaTextField.sendKeys(" ");
		Thread.sleep(5000);
		loginButton.click();
		Thread.sleep(5000);
	
	}
	
	


}
