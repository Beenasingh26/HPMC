package com.pomPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NodalOfficerDetailsForm extends BaseClass {

	public NodalOfficerDetailsForm(WebDriver driver) {
		super(driver);
		
	}
	//Nodal Officer Details
	@FindBy(xpath = "//label[text() = 'Same as SPOC Details']")
	private WebElement sameAsSpocCheckBox;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[1]")
	private WebElement firstNameTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[2]")
	private WebElement middleNameTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[3]")
	private WebElement lastNameTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[4]")
	private WebElement designationTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[5]")
	private WebElement phoneNoTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[6]")
	private WebElement mobNoTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[7]")
	private WebElement emailIdTF;
	
	//Address
	
	@FindBy(xpath = "(//label[text() = 'Same as Company'])[1]")
	private WebElement sameAsCompanyCheckBox;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[8]")
	private WebElement pinCodeTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[9]")
	private WebElement blockNoTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[10]")
	private WebElement premiseTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[11]")
	private WebElement localityTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[12]")
	private WebElement stateTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[13]")
	private WebElement districtTF;
	
	//Alternate Nodal Officer Details
	
	@FindBy(xpath = "//p[text() = 'Alternate Nodal Officer Details']")
	private WebElement altNodalDropdown;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[14]")
	private WebElement fNameTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[15]")
	private WebElement mNameTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[16]")
	private WebElement lNameTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[17]")
	private WebElement altDesignationTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[18]")
	private WebElement pNumberTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[19]")
	private WebElement mobNumberTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[20]")
	private WebElement emailTF;
	
	//Address
	@FindBy(xpath = "(//label[text() = 'Same as Company'])[2]")
	private WebElement sameAsCompanyAddCheckBox;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[21]")
	private WebElement pinCodeTextField;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[22]")
	private WebElement blockNumberTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[23]")
	private WebElement buildingTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[24]")
	private WebElement areaTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[25]")
	private WebElement unionTeritoryTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[26]")
	private WebElement cityTF;
	
	@FindBy(xpath = "//button[text() = 'Save&Exit']")
	private WebElement saveAndNextButton;
	
	@FindBy(xpath = "//button[text() = 'Previous']")
	private WebElement previousButton;
	
	@FindBy(xpath = "//button[text() = 'Next']")
	private WebElement nextButton;
		
	public WebElement getSameAsSpocCheckBox() {
		return sameAsSpocCheckBox;
	}

	public WebElement getFirstNameTF() {
		return firstNameTF;
	}

	public WebElement getMiddleNameTF() {
		return middleNameTF;
	}

	public WebElement getLastNameTF() {
		return lastNameTF;
	}

	public WebElement getDesignation() {
		return designationTF;
	}

	public WebElement getPhoneNoTF() {
		return phoneNoTF;
	}

	public WebElement getMobNoTF() {
		return mobNoTF;
	}

	public WebElement getEmailIdTF() {
		return emailIdTF;
	}

	public WebElement getSameAsCompanyCheckBox() {
		return sameAsCompanyCheckBox;
	}

	public WebElement getPinCodeTF() {
		return pinCodeTF;
	}
	
	public WebElement getBlockNoTF() {
		return blockNoTF;
	}
	
	public WebElement getPremiseTF() {
		return premiseTF;
	}

	public WebElement getLocalityTF() {
		return localityTF;
	}

	public WebElement getStateTF() {
		return stateTF;
	}

	public WebElement getDistrictTF() {
		return districtTF;
	}

	public WebElement getfNameTF() {
		return fNameTF;
	}

	public WebElement getmNameTF() {
		return mNameTF;
	}

	public WebElement getlNameTF() {
		return lNameTF;
	}

	public WebElement getAltDesignationTF() {
		return altDesignationTF;
	}

	public WebElement getpNumberTF() {
		return pNumberTF;
	}

	public WebElement getMobNumberTF() {
		return mobNumberTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}
	
	

	public WebElement getSameAsCompanyAddCheckBox() {
		return sameAsCompanyAddCheckBox;
	}

	public WebElement getPinCodeTextField() {
		return pinCodeTextField;
	}

	public WebElement getBlockNumberTF() {
		return blockNumberTF;
	}

	public WebElement getBuildingTF() {
		return buildingTF;
	}

	public WebElement getAreaTF() {
		return areaTF;
	}

	public WebElement getUnionTeritoryTF() {
		return unionTeritoryTF;
	}

	public WebElement getCityTF() {
		return cityTF;
	}

	public WebElement getSaveAndNextButton() {
		return saveAndNextButton;
	}

	public WebElement getPreviousButton() {
		return previousButton;
	}

	public WebElement getNextButton() {
		return nextButton;
	}
	
	//Business Logic
	public void toEnterNodalOfficerDetails(String designation, String pNo) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(sameAsSpocCheckBox)).click();
        
        wait.until(ExpectedConditions.visibilityOf(designationTF)).sendKeys(designation);
        wait.until(ExpectedConditions.visibilityOf(phoneNoTF)).sendKeys(pNo);
        Thread.sleep(2000);        
        wait.until(ExpectedConditions.elementToBeClickable(sameAsCompanyCheckBox)).click();
        
	}
	
    public void toEnterAltNodalOfficerDetails(String fName, String mName, String lName, String altDesig, String pNo, String mobNo, String email) throws InterruptedException {
        //Filling Alternate Nodal Officer Details
        wait.until(ExpectedConditions.visibilityOf(altNodalDropdown)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(fNameTF)).sendKeys(fName);
        wait.until(ExpectedConditions.visibilityOf(mNameTF)).sendKeys(mName);
        wait.until(ExpectedConditions.visibilityOf(lNameTF)).sendKeys(lName);
        wait.until(ExpectedConditions.visibilityOf(altDesignationTF)).sendKeys(altDesig);
        wait.until(ExpectedConditions.visibilityOf(pNumberTF)).sendKeys(pNo);
        wait.until(ExpectedConditions.visibilityOf(mobNumberTF)).sendKeys(mobNo);
        wait.until(ExpectedConditions.visibilityOf(emailTF)).sendKeys(email);
       
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(sameAsCompanyAddCheckBox)).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
        
	}

}
