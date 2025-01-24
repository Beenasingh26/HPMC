package com.pomPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegNewCorpWithStandardChargesForm extends BaseClass {

	public RegNewCorpWithStandardChargesForm(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[text() = 'GO BACK']")
	private WebElement goBackTab;
	
	@FindBy(xpath = "//label[text() = 'Corporate (Nodal Officer)']")
	private WebElement corporateRadioButton;
	
	@FindBy(name = "panNumber")
	private WebElement panNumberTextField;
	
	@FindBy(xpath = "//button[text() = 'Get Details']")
	private WebElement getDetailsButton;
	
	@FindBy(xpath = "//input[@name = 'corporateName']")
	private WebElement corporateNameTextField;
	
	@FindBy(id = "noFirstName")
	private WebElement firstNameTextField;
	
	@FindBy(id = "noLastName")
	private WebElement lastNameTextField;
	
	@FindBy(id = "noEmailId")
	private WebElement emailIdTextField;
	
	@FindBy(id = "noMobileNumber")
	private WebElement mobileNumberTextField;
	
	@FindBy(xpath = "(//select[@class = 'form-control'])[1]")
	private WebElement standardChargesDropdown;
	
	@FindBy(xpath = "//option[text() = 'Yes']")
	private WebElement yes;

	@FindBy(id = "acOpeningCharge")
	private WebElement accountOpeningChargeTF;
	
	@FindBy(xpath = "(//select[@class = 'form-control'])[2]")
	private WebElement typeOfContributionChargesDropdown;
	
	@FindBy(id = "contriCharges")
	private WebElement contributionChargesTF;

	@FindBy(id = "nonFinTransactions")
	private WebElement nonFinTransactionTextField;
	
	@FindBy(xpath = "(//select[@class = 'form-control'])[3]")
	private WebElement superannuationContriChargesDropdown;
	
	@FindBy(id = "superContribCharges")
	private WebElement superannuationContriChargesTextField;
	
	@FindBy(xpath = "//button[text() = 'Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//button[text() = 'Proceed']")
	private WebElement proceedButton;
	
	@FindBy(xpath = "(//button[text() = 'Proceed'])[2]")
	private WebElement proceedToList;
	
	@FindBy(xpath = "//div[text() = 'Corporate for given pan already exists']")
	private WebElement duplicatePanMessage;
	
	@FindBy(xpath = "//div[text() = 'Invalid PAN']")
	private WebElement invalidPanMessage;
	
	@FindBy(xpath = "//div[text() = 'Corporate already registered with given PAN or Name!']")
	private WebElement corpAlreadyRegMessage;

	public WebElement getCorpAlreadyRegMessage() {
		return corpAlreadyRegMessage;
	}

	public WebElement getInvalidPanMessage() {
		return invalidPanMessage;
	}

	public WebElement getDuplicatePanMessage() {
		return duplicatePanMessage;
	}

	public WebElement getGoBackTab() {
		return goBackTab;
	}

	public WebElement getCorporateRadioButton() {
		return corporateRadioButton;
	}

	public WebElement getPanNumberTextField() {
		return panNumberTextField;
	}
	
	public WebElement getGetDetailsButton() {
		return getDetailsButton;
	}

	public WebElement getCorporateNameTextField() {
		return corporateNameTextField;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailIdTextField() {
		return emailIdTextField;
	}

	public WebElement getMobileNumberTextField() {
		return mobileNumberTextField;
	}

	public WebElement getStandardChargesDropdown() {
		return standardChargesDropdown;
	}
	
	public WebElement getYes() {
		return yes;
	}

	public WebElement getAccountOpeningChargeTF() {
		return accountOpeningChargeTF;
	}

	public WebElement getTypeOfContributionChargesDropdown() {
		return typeOfContributionChargesDropdown;
	}
	
	public WebElement getContributionChargesTF() {
		return contributionChargesTF;
	}

	public WebElement getNonFinTransactionTextField() {
		return nonFinTransactionTextField;
	}

	public WebElement getSuperannuationContriChargesDropdown() {
		return superannuationContriChargesDropdown;
	}

	public WebElement getSuperannuationContriChargesTextField() {
		return superannuationContriChargesTextField;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getProceedButton() {
		return proceedButton;
	}
	
	public WebElement getProceedToList() {
		return proceedToList;
	}

	
//	//business logic
//	public void toClickCorpRadioButton() throws InterruptedException
//	{
//		corporateRadioButton.click();
//		Thread.sleep(5000);
//	}
	
	public void fillInputFields(String panNo) throws InterruptedException{
		
		corporateRadioButton.click();
		Thread.sleep(5000);
		
		panNumberTextField.sendKeys(panNo);
		Thread.sleep(2000);
		
		getDetailsButton.click();
		Thread.sleep(5000);
	}
	
	public boolean isDuplicatePan(String panNo) throws InterruptedException{
		boolean result = false;
		fillInputFields(panNo);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    try {
	        if (wait.until(ExpectedConditions.visibilityOf(duplicatePanMessage)) != null) {
	            driver.navigate().refresh();
	            Thread.sleep(2000); // Allow time for the page to refresh
	            result = true; // PAN is a duplicate
	        }
	    } catch (Exception e) {
	        // Check if the invalid PAN message is displayed
	            System.out.println("No duplicate or invalid PAN message displayed for: " + panNo);
	    }
		return result;
	}
	public boolean toRegCorpWithStandardCharges(String panNo, String corpName, String fn, String ln, String email, String mobNo) throws InterruptedException 
	{
		boolean result = isDuplicatePan(panNo);
		if(result) {
			return false;
		} else {
			System.out.println("No duplicate PAN found. Continuing with the next registration steps.");
		}
		
		//Code to refresh page while pan is duplicate	        
		/*
		 * if(duplicatePanMessage.isDisplayed()) { driver.navigate().refresh();
		 * Thread.sleep(2000);
		 * 
		 * fillInputFields(panNo); } else { System.out.
		 * println("No duplicate PAN found. Continuing with the next registration steps."
		 * ); }
		 */
	        Thread.sleep(2000);		
	        
		
		corporateNameTextField.sendKeys(corpName);
		Thread.sleep(2000);
		firstNameTextField.sendKeys(fn);
		Thread.sleep(2000);
		lastNameTextField.sendKeys(ln);
		Thread.sleep(2000);
		emailIdTextField.sendKeys(email);
		Thread.sleep(2000);
		mobileNumberTextField.sendKeys(mobNo);
		Thread.sleep(2000);
		
		//Handling onchange event from dropdown using sendKeys
		standardChargesDropdown.sendKeys("Yes");
		Thread.sleep(2000);
		
//		Select sel = new Select(superannuationContriChargesDropdown);
//		sel.selectByVisibleText("Employee");
		 
		proceedButton.click();
		Thread.sleep(5000);
		
		if(popUpvisible()) {
			return false;
		}
		
		proceedToList.click();
		Thread.sleep(3000);	
		return true;
		
	}
	
	public boolean popUpvisible() throws InterruptedException{
		if (wait.until(ExpectedConditions.visibilityOf(corpAlreadyRegMessage)) != null) {
            driver.navigate().refresh();
            Thread.sleep(2000); // Allow time for the page to refresh
            return true; // PAN is a duplicate
        }
		return false;
	}
	
//	public void toRegCorpWithoutStandardCharges(String panNo, String corpName, String fn, String ln, String email, String mobNo, String aoc, String nft, String sac) throws InterruptedException
//	{
//		corporateRadioButton.click();
//		panNumberTextField.sendKeys(panNo);
//		firstNameTextField.sendKeys(fn);
//		lastNameTextField.sendKeys(ln);
//		emailIdTextField.sendKeys(email);
//		mobileNumberTextField.sendKeys(mobNo);
//		Select sel = new Select(standardChargesDropdown);
//		Thread.sleep(2000);
//		sel.selectByVisibleText("No");
//		Thread.sleep(2000);
//		accountOpeningChargeTF.sendKeys(aoc);
//		Select se = new Select(typeOfContributionChargesDropdown);
//		Thread.sleep(2000);
//		se.selectByVisibleText("₹ 30");
//		Thread.sleep(2000);
//		nonFinTransactionTextField.sendKeys(nft);
//		Select s = new Select(superannuationContriChargesDropdown);
//		s.selectByVisibleText("Employee");
//		Thread.sleep(2000);
//		superannuationContriChargesTextField.sendKeys(sac);
//		Thread.sleep(2000);
//		proceedButton.click();
//		Thread.sleep(2000);
//	}
	
}
