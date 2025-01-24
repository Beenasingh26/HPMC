package com.pomPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SchemePreference extends BaseClass {

	public SchemePreference(WebDriver driver) {
		super(driver);
		
	}
	//Scheme Detail
	@FindBy(xpath = "//label[text() = 'Subscriber']")
	private WebElement subRadioButton;
	
	@FindBy(xpath = "//label[text() = 'Corporate']")
	private WebElement corpRadioButton;
	
	//Charge Structure
	@FindBy(xpath = "//p[text() = 'Charge Structure']")
	private WebElement chargeStrucDropdown;
	
	@FindBy(xpath = "(//select[@class = 'CorporateForm_input__OaB+b'])[2]")
	private WebElement standChargesDropdown;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[1]")
	private WebElement accOpenChargesDropdown;

	@FindBy(xpath = "(//select[@class = 'CorporateForm_input__OaB+b'])[3]")
	private WebElement typeContriChargesDropdown;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[2]")
	private WebElement contriChargesTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[3]")
	private WebElement nonFinTransactionTF;
	
	@FindBy(xpath = "(//select[@class='CorporateForm_input__OaB+b'])[4]")
	private WebElement superContriChargesDropdown;
	
	@FindBy(xpath = "(//input[@class='CorporateForm_input__OaB+b'])[4]")
	private WebElement superContriChargesTF;
	
	@FindBy(xpath = "//button[text() = 'Save&Exit']")
	private WebElement saveAndNextButton;
	
	@FindBy(xpath = "//button[text() = 'Previous']")
	private WebElement prevButton;
	
	@FindBy(xpath = "//button[text() = 'Next']")
	private WebElement nextButton;

	public WebElement getSubRadioButton() {
		return subRadioButton;
	}

	public WebElement getCorpRadioButton() {
		return corpRadioButton;
	}

	public WebElement getChargeStrucRadioButton() {
		return chargeStrucDropdown;
	}

	public WebElement getStandChargesDropdown() {
		return standChargesDropdown;
	}

	public WebElement getAccOpenChargesDropdown() {
		return accOpenChargesDropdown;
	}

	public WebElement getTypeContriChargesDropdown() {
		return typeContriChargesDropdown;
	}

	public WebElement getContriChargesTF() {
		return contriChargesTF;
	}

	public WebElement getNonFinTransactionTF() {
		return nonFinTransactionTF;
	}

	public WebElement getSuperContriChargesDropdown() {
		return superContriChargesDropdown;
	}

	public WebElement getSuperContriChargesTF() {
		return superContriChargesTF;
	}
	
	public WebElement getChargeStrucDropdown() {
		return chargeStrucDropdown;
	}

	public WebElement getSaveAndNextButton() {
		return saveAndNextButton;
	}

	public WebElement getPrevButton() {
		return prevButton;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	//Business Logic
	public void toFillSchemePrefForm(String accCharges, String contriCharges, String nonFinTrans, String superContriCharges) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    wait.until(ExpectedConditions.elementToBeClickable(subRadioButton)).click();

	    wait.until(ExpectedConditions.elementToBeClickable(chargeStrucDropdown)).click();

	    new Select(wait.until(ExpectedConditions.elementToBeClickable(standChargesDropdown))).selectByValue("No");

	    wait.until(ExpectedConditions.visibilityOf(accOpenChargesDropdown)).sendKeys(accCharges);

	    new Select(wait.until(ExpectedConditions.elementToBeClickable(typeContriChargesDropdown))).selectByValue("₹ 30");

	    wait.until(ExpectedConditions.visibilityOf(nonFinTransactionTF)).sendKeys(nonFinTrans);

	    new Select(wait.until(ExpectedConditions.elementToBeClickable(superContriChargesDropdown))).selectByValue("Employee");

	    wait.until(ExpectedConditions.visibilityOf(superContriChargesTF)).sendKeys(superContriCharges);
	    
	    wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
		
	}
}
