package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicInfoForPranJourney extends BaseClass {

	public BasicInfoForPranJourney(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[text() = 'Proceed With Aadhar Verification']")
	private WebElement aadharVerificationButton;
	
	@FindBy(name = "digilockerDeclaration")
	private WebElement digilockerConsentCheckBox;
	
	@FindBy(xpath = "//button[text() = 'Proceed With Digilocker']")
	private WebElement proceedDigilockerButton;
	
	@FindBy(xpath = "//button[text() = 'Cancel']")
	private WebElement cancelButton;
	
	//Subscriber Datails
	
	@FindBy(xpath = "//select[@name = 'titleId']")
	private WebElement titleDropdown;
	
	@FindBy(xpath = "//input[@id = 'fullName']")
	private WebElement fullNameTF;
	
	@FindBy(xpath = "//select[@id = 'genderId']")
	private WebElement genederDropdown;
	
	@FindBy(xpath = "//select[@id = 'educationQualificationId']")
	private WebElement eduQualDropdown;
	
	@FindBy(xpath = "//select[@id = 'politicallyExposedId']")
	private WebElement polExposedDropdown;
	
	@FindBy(xpath = "//select[@id = 'howDidUHearAboutNps']")
	private WebElement hereAboutNpsDropdown;
	
	@FindBy(xpath = "(//div[@class = 'MuiAccordionSummary-expandIconWrapper css-1fx8m19'])[1]")
	private WebElement subscriberDetailsDropdown;
	
	//Personal Details
	
	@FindBy(xpath = "(//div[@class = 'MuiAccordionSummary-expandIconWrapper css-1fx8m19'])[2]")
	private WebElement personalDetailsDropdown;
	
	@FindBy(xpath = "//input[@id = 'fatherName']")
	private WebElement fNameTF;
	
	@FindBy(xpath = "//input[@id = 'motherName']")
	private WebElement mNameTF;
	
	@FindBy(xpath = "//input[@id = 'cityOfBirth']")
	private WebElement cityOfBirthTF;
	
	@FindBy(xpath = "//select[@id = 'parentNameOnPran']")
	private WebElement pNameOnPranDropdown;
	
	@FindBy(xpath = "//select[@id = 'maritalStatusId']")
	private WebElement maritalStatusDropdown;
	
	//Employment Details
	
	@FindBy(xpath = "//input[@id = 'employeeCode']")
	private WebElement empoloyeeCodeTF;
	
	@FindBy(xpath = "//select[@id = 'incomeRangeId']")
	private WebElement incomeRangeDropdow;
	
	@FindBy(xpath = "//input[@id = 'doj']")
	private WebElement dojTF;
	
	@FindBy(xpath = "//select[@id = 'subscriberCbo']")
	private WebElement cboNumberDropdown;
	
	//Nominee Details Tier 1
	
	@FindBy(xpath = "//input[@name = 'name1']")
	private WebElement nomineeNameTF;
	
	@FindBy(xpath = "//select[@name = 'nomineeRelationship1']")
	private WebElement nomineeRelationDropdown;
	
	@FindBy(xpath = "//input[@name = 'dob1']")
	private WebElement dobTextField;
	
	@FindBy(xpath = "//input[@id = 'guardianName']")
	private WebElement guardianNameTF;
	
	@FindBy(xpath = "//button[text() = 'Add Another Nominee']")
	private WebElement addAnotherNomButton;
	
	//Closer
	
	@FindBy(xpath = "//button[text() = 'Save & Exit']")
	private WebElement saveAndExitButton;
	
	@FindBy(xpath = "//button[text() = 'Next']")
	private WebElement nextButton;
	
	//Getter for WebElements

	public WebElement getAadharVerificationButton() {
		return aadharVerificationButton;
	}

	public WebElement getDigilockerConsentCheckBox() {
		return digilockerConsentCheckBox;
	}

	public WebElement getProceedDigilockerButton() {
		return proceedDigilockerButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getTitleDropdown() {
		return titleDropdown;
	}

	public WebElement getFullNameTF() {
		return fullNameTF;
	}

	public WebElement getGenederDropdown() {
		return genederDropdown;
	}

	public WebElement getEduQualDropdown() {
		return eduQualDropdown;
	}

	public WebElement getPolExposedDropdown() {
		return polExposedDropdown;
	}

	public WebElement getHereAboutNpsDropdown() {
		return hereAboutNpsDropdown;
	}

	public WebElement getSubscriberDetailsDropdown() {
		return subscriberDetailsDropdown;
	}

	public WebElement getPersonalDetailsDropdown() {
		return personalDetailsDropdown;
	}

	public WebElement getfNameTF() {
		return fNameTF;
	}

	public WebElement getmNameTF() {
		return mNameTF;
	}

	public WebElement getCityOfBirthTF() {
		return cityOfBirthTF;
	}

	public WebElement getpNameOnPranDropdown() {
		return pNameOnPranDropdown;
	}

	public WebElement getMaritalStatusDropdown() {
		return maritalStatusDropdown;
	}

	public WebElement getEmpoloyeeCodeTF() {
		return empoloyeeCodeTF;
	}

	public WebElement getIncomeRangeDropdow() {
		return incomeRangeDropdow;
	}

	public WebElement getDojTF() {
		return dojTF;
	}

	public WebElement getCboNumberDropdown() {
		return cboNumberDropdown;
	}

	public WebElement getNomineeNameTF() {
		return nomineeNameTF;
	}

	public WebElement getNomineeRelationDropdown() {
		return nomineeRelationDropdown;
	}

	public WebElement getDobTextField() {
		return dobTextField;
	}

	public WebElement getGuardianNameTF() {
		return guardianNameTF;
	}

	public WebElement getAddAnotherNomButton() {
		return addAnotherNomButton;
	}

	public WebElement getSaveAndExitButton() {
		return saveAndExitButton;
	}

	public WebElement getNextButton() {
		return nextButton;
	}
	
	public void toVerifyAadhar() throws InterruptedException {
		aadharVerificationButton.click();
		Thread.sleep(2000);
		digilockerConsentCheckBox.click();
		Thread.sleep(1000);
		proceedDigilockerButton.click();
		Thread.sleep(1000);
		
		}
	
	//public void 
	

}
