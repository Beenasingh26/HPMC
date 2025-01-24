package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankDetailsVerificationTierOne extends BaseClass {

	public BankDetailsVerificationTierOne(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//button[text() = 'Save & Exit']")
	private WebElement saveAndExitButton;
	
	@FindBy(xpath = "//button[text() = 'Previous']")
	private WebElement previousButton;
	
	@FindBy(xpath = "//button[text() = 'Next']")
	private WebElement nextButton;

	public WebElement getSaveAndExitButton() {
		return saveAndExitButton;
	}

	public WebElement getPreviousButton() {
		return previousButton;
	}

	public WebElement getNextButton() {
		return nextButton;
	}
	
	

}
