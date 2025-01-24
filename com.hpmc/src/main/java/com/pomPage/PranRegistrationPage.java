package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PranRegistrationPage extends BaseClass {

	public PranRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	//Start Journey
	@FindBy(xpath = "//button[text() = 'Start Your Journey']")
	private WebElement startJourneyButton;
	
	@FindBy(xpath = "//input[@placeholder = 'EX-MPNPK0200K']")
	private WebElement startpanTF;
	
	@FindBy(xpath = "//input[@name = 'dob']")
	private WebElement dobTF;
	
	@FindBy(xpath = "//button[text() = 'Proceed']")
	private WebElement proceedButton;
	
	@FindBy(xpath = "//button[text() = 'Close']")
	private WebElement closeNpsButton;
	
	
	//Resume Journey
	@FindBy(xpath = "//button[text() = 'Resume Your Journey']")
	private WebElement resumeJourneyButton;
	
	@FindBy(xpath = "//input[@name = 'pan']")
	private WebElement panNoTF;
	
	@FindBy(xpath = "//input[@name = 'contact']")
	private WebElement mobNoTF;
	
	@FindBy(xpath = "//button[text() = 'Send OTP']")
	private WebElement sendOtpButton;
	
	@FindBy(xpath = "//button[text() = 'Close']")
	private WebElement closeButton;

	public WebElement getStartJourneyButton() {
		return startJourneyButton;
	}

	public WebElement getStartpanTF() {
		return startpanTF;
	}

	public WebElement getDobTF() {
		return dobTF;
	}

	public WebElement getProceedButton() {
		return proceedButton;
	}

	public WebElement getCloseNpsButton() {
		return closeNpsButton;
	}

	public WebElement getResumeJourneyButton() {
		return resumeJourneyButton;
	}

	public WebElement getPanNoTF() {
		return panNoTF;
	}

	public WebElement getMobNoTF() {
		return mobNoTF;
	}

	public WebElement getSendOtpButton() {
		return sendOtpButton;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}
	
	//Business Logic
	
	public void toAccessStartYourJourneyButton() throws InterruptedException {
		startJourneyButton.click();
		Thread.sleep(2000);

	}
	public void toPassDataWithNps(String pan, String dob) throws InterruptedException {
		startpanTF.sendKeys(pan);
		Thread.sleep(2000);
		dobTF.sendKeys(dob);
		Thread.sleep(2000);
		proceedButton.click();
		Thread.sleep(2000);
	}

}
