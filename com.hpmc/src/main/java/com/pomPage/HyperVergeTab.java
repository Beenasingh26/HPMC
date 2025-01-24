package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HyperVergeTab extends BaseClass {

	public HyperVergeTab(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id = 'aadhaar_1']")
	private WebElement aadharNoTF;
	
	@FindBy(xpath = "//input[@id = 'enter_captcha']")
	private WebElement captchaTF;
	
	@FindBy(xpath = "//button[text() = ' Next ']")
	private WebElement nextButton;
	
	@FindBy(xpath = "//input[@id = 'otp_1']")
	private WebElement aadharOtpTF;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//input[@id = 'v_pin']")
	private WebElement digilockerSecPinTF;
	
	@FindBy(xpath = "//button[@id = 'button']")
	private WebElement continueToNext;
	
	@FindBy(xpath = "//input[@value='Allow']")
	private WebElement allowButton;

	public WebElement getAadharNoTF() {
		return aadharNoTF;
	}

	public WebElement getCaptchaTF() {
		return captchaTF;
	}
	

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getAadharOtpTF() {
		return aadharOtpTF;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getDigilockerSecPinTF() {
		return digilockerSecPinTF;
	}

	public WebElement getContinueToNext() {
		return continueToNext;
	}
	
	public WebElement getAllowButton() {
		return allowButton;
	}

	//Business Logic
	public void toLinkDigilocker(String aadhar) throws InterruptedException {
		aadharNoTF.sendKeys(aadhar);
		Thread.sleep(2000);
		captchaTF.click();
		Thread.sleep(5000);
		nextButton.click();
		Thread.sleep(1000);
		aadharOtpTF.click();
		Thread.sleep(10000);
		continueButton.click();
		Thread.sleep(1000);
		digilockerSecPinTF.click();
		Thread.sleep(5000);
		continueToNext.click();
		Thread.sleep(1000);
		allowButton.click();
	}
	

}
