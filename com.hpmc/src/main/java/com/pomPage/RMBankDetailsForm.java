package com.pomPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RMBankDetailsForm extends BaseClass {

	public RMBankDetailsForm(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//input[@placeholder = 'Ex. 1224-5678-9080-4859']")
	private WebElement accNoTF;
	
	@FindBy(xpath = "//input[@placeholder = 'Ex. SBIN0005943']")
	private WebElement ifscNoTF;
	
	@FindBy(xpath = "//button[text() = 'Fetch']")
	private WebElement fetchButton;
	
	@FindBy(xpath = "//div[text() = 'Failed to fetch bank details']")
	private WebElement failedMessage;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[3]")
	private WebElement bankNameTF;
	
	@FindBy(xpath = "//button[text() = 'Verify Account']")
	private WebElement verifyAccButton;
	
	@FindBy(xpath = "//div[text() = 'Bank Account Details not verifed']")
	private WebElement bankNotVerifiedMessage;
	
	@FindBy(xpath = "//button[text() = 'Save&Exit']")
	private WebElement saveAndExitButton;
	
	@FindBy(xpath = "//button[text() = 'Previous']")
	private WebElement prevButton;
	
	@FindBy(xpath = "//button[text() = 'Next']")
	private WebElement nextButton;

	public WebElement getAccNoTF() {
		return accNoTF;
	}

	public WebElement getIfscNoTF() {
		return ifscNoTF;
	}

	public WebElement getBankNameTF() {
		return bankNameTF;
	}

	public WebElement getVerifyAccButton() {
		return verifyAccButton;
	}

	public WebElement getSaveAndExitButton() {
		return saveAndExitButton;
	}

	public WebElement getPrevButton() {
		return prevButton;
	}

	public WebElement getNextButton() {
		return nextButton;
	}
	
	// Business Logic
	public void toFillBankDetails(String accNo, String ifscNo, String bankName) throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    wait.until(ExpectedConditions.visibilityOf(accNoTF)).sendKeys(accNo);

	    wait.until(ExpectedConditions.visibilityOf(ifscNoTF)).sendKeys(ifscNo);

	    wait.until(ExpectedConditions.visibilityOf(fetchButton)).click();
/*
	    
	    // Check if the "Failed to fetch bank details" message is visible
	    if (wait.until(ExpectedConditions.visibilityOf(failedMessage)) != null && failedMessage.isDisplayed()) {
	        System.out.println("Failed to fetch bank details. Manually entering bank name.");
	        // Send the bankName value to the Bank Name field
	        wait.until(ExpectedConditions.visibilityOf(bankNameTF)).sendKeys(bankName);
	    } else {
	    	
	        wait.until(ExpectedConditions.elementToBeClickable(verifyAccButton)).click();
	    }

	    // Check if the "Bank Account Details not verified" message is displayed
	    if (wait.until(ExpectedConditions.visibilityOf(bankNotVerifiedMessage)) != null && bankNotVerifiedMessage.isDisplayed()) {
	        System.out.println("Bank account details not verified. Proceeding to the next step.");
	        // Click on the Next button
	        wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
	    } else {
	        System.out.println("Bank account verified successfully. Proceeding as usual.");
	    }
	    
	    
*/

	    // Move to next form
	    wait.until(ExpectedConditions.visibilityOf(nextButton)).click();
	    Thread.sleep(2000);
	}

}
