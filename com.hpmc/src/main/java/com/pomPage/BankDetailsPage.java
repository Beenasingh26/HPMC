package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankDetailsPage extends BaseClass {

	public BankDetailsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//label[text() = 'Savings']")
	private WebElement savingCheckbox;
	
	@FindBy(xpath = "//label[text() = 'Current']")
	private WebElement currentCheckbox;
	
	@FindBy(xpath = "//input[@id = 'accNo']")
	private WebElement accNoTF;
	
	@FindBy(xpath = "//input[@id = 'ifsc']")
	private WebElement ifscTF;
	
	@FindBy(xpath = "//button[text() = 'Verify']")
	private WebElement verifyButton;
	
	@FindBy(xpath = "//button[text() = 'Save & Exit']")
	private WebElement saveAndExitButton;
	
	@FindBy(xpath = "//button[text() = 'Previous']")
	private WebElement previousButton;
	
	@FindBy(xpath = "//button[text() = 'Next']")
	private WebElement nextButton;

	public WebElement getSavingCheckbox() {
		return savingCheckbox;
	}

	public WebElement getCurrentCheckbox() {
		return currentCheckbox;
	}

	public WebElement getAccNoTF() {
		return accNoTF;
	}

	public WebElement getIfscTF() {
		return ifscTF;
	}

	public WebElement getVerifyButton() {
		return verifyButton;
	}

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
