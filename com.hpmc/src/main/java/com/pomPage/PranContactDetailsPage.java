package com.pomPage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PranContactDetailsPage extends BaseClass {

	public PranContactDetailsPage(WebDriver driver) {
		super(driver);		
	}
	
	@FindBy(xpath = "//input[@name = 'contact']")
	private WebElement mobNoTextField;
	
	@FindBy(xpath = "(//div[text() = 'Send OTP'])[1]")
	private WebElement sendOtpButton;
	
	
	@FindBy(xpath = "//input[@name = 'email']")
	private WebElement emailTextField;
	
	@FindBy(xpath = "(//div[text() = 'Send OTP'])[2]")
	private WebElement sendOtpBtn;

	@FindBy(name = "isTermCondition")
	private WebElement termConditionCheckBox;
	
	@FindBy(xpath = "(//button[text() = 'Proceed'])[1]")
	private WebElement proceedButton;
	
	@FindBy(xpath = "(//button[text() = 'Proceed'])[2]")
	private WebElement proceedToBasicInfo;

	public WebElement getMobNoTextField() {
		return mobNoTextField;
	}

	public WebElement getSendOtpButton() {
		return sendOtpButton;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getSendOtpBtn() {
		return sendOtpBtn;
	}

	public WebElement getTermConditionCheckBox() {
		return termConditionCheckBox;
	}

	public WebElement getProceedButton() {
		return proceedButton;
	}

	public WebElement getProceedToBasicInfo() {
		return proceedToBasicInfo;
	}
	
	//Business Logic
	
	public void toFillContactDetails(String mob, String email) throws InterruptedException {
		//Send Mobile Number
		mobNoTextField.sendKeys(mob);
		Thread.sleep(2000);
		
		//Send Email
		emailTextField.sendKeys(email);
		Thread.sleep(2000);
		
		//Verify Mobile Number and Email
		sendOtpButton.click();
		sendOtpBtn.click();
		Thread.sleep(10000);
		
		//Click on Terms & Conditions check box and proceed
		termConditionCheckBox.click();
		
		//Scroll and Click on Proceed Button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement proceedBtn = wait.until(ExpectedConditions.elementToBeClickable(proceedButton));
		// Use JavaScriptExecutor to click if displayed and enabled
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (proceedBtn.isDisplayed() && proceedBtn.isEnabled()) {
		    js.executeScript("arguments[0].click()", proceedBtn);
		}

//		proceedButton.click();
		
	
		proceedToBasicInfo.click();
		Thread.sleep(2000);
		
		
	}

}
