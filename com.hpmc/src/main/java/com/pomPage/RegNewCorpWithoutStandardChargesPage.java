package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegNewCorpWithoutStandardChargesPage extends BaseClass {

	public RegNewCorpWithoutStandardChargesPage(WebDriver driver) {
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
	
	@FindBy(name = "acOpeningCharge")
	private WebElement acOpeningChargeTextField;
	
	@FindBy(xpath = "(//select[@class = 'form-control'])[2]")
	private WebElement typeOfContributionChargesDropdown;
	
	@FindBy(id = "nonFinTransactions")
	private WebElement nonFinTransactionTextField;
	
	@FindBy(id = "superContribCharges")
	private WebElement superContribChargesTextField;
	
	@FindBy(xpath = "//button[text() = 'Proceed']")
	private WebElement proceedButton;
	
	@FindBy(xpath = "(//button[text() = 'Proceed'])[2]")
	private WebElement proceedToList;

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

	public WebElement getAcOpeningChargeTextField() {
		return acOpeningChargeTextField;
	}

	public WebElement getTypeOfContributionChargesDropdown() {
		return typeOfContributionChargesDropdown;
	}

	public WebElement getNonFinTransactionTextField() {
		return nonFinTransactionTextField;
	}

	public WebElement getSuperContribChargesTextField() {
		return superContribChargesTextField;
	}

	public WebElement getProceedButton() {
		return proceedButton;
	}

	public WebElement getProceedToList() {
		return proceedToList;
	}
	
	//business logic
	public void toClickCorpRadioButton() throws InterruptedException
	{
		corporateRadioButton.click();
		Thread.sleep(5000);
	}
	
	public void toRegCorpWithoutStandardCharges(String panNo, String corpName, String fn, String ln, String email, String mobNo, String aoc, String nft, String sac) throws InterruptedException
	{
		
		panNumberTextField.sendKeys(panNo);
		Thread.sleep(2000);
		getDetailsButton.click();
		Thread.sleep(5000);
		corporateNameTextField.sendKeys(corpName);
		Thread.sleep(2000);
		firstNameTextField.sendKeys(fn);
		Thread.sleep(2000);
		lastNameTextField.sendKeys(ln);
		Thread.sleep(2000);
		emailIdTextField.sendKeys(email);
		Thread.sleep(2000);
		mobileNumberTextField.sendKeys(mobNo);
		Thread.sleep(5000);
		standardChargesDropdown.sendKeys("No");
		Thread.sleep(5000);
		acOpeningChargeTextField.sendKeys(aoc);
		Thread.sleep(5000);
		
//		// Assume driver is your WebDriver instance
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//		// Wait until the dropdown element is visible and clickable
//		WebElement chargeDropdown = wait.until(ExpectedConditions.elementToBeClickable(typeOfContributionChargesDropdown));
//
//		// Create a Select instance for the dropdown element
//		Select sel = new Select(chargeDropdown);
//
//		// Select the option by visible text
//		sel.selectByIndex(1);
		
		
		typeOfContributionChargesDropdown.sendKeys("₹ 30");
		Thread.sleep(5000);
		nonFinTransactionTextField.sendKeys(nft);
		Thread.sleep(3000);
		superContribChargesTextField.sendKeys(sac);
		Thread.sleep(3000);
		proceedButton.click();
		Thread.sleep(3000);
		proceedToList.click();
		
		Thread.sleep(3000);
		
	}

}
