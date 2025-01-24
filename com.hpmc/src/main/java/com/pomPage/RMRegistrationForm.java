package com.pomPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RMRegistrationForm extends BaseClass {

	public RMRegistrationForm(WebDriver driver) {
		super(driver);
	}
	
	//SPOC For Corporate
	
	@FindBy(xpath = "//p[text() = 'SPOC For Corporate']")
	private WebElement spocCorpDropdown;
	
	@FindBy(xpath = "(//input[@placeholder = 'Ex.  Sunil Sharma...'])[1]")
	private WebElement spocNameForCorp;
	
	@FindBy(xpath = "(//input[@placeholder = 'Ex.  SunilSharma@gmail.com'])[1]")
	private WebElement emailIdTF;
	
	@FindBy(xpath = "(//input[@placeholder = 'Ex.  9876543210'])[1]")
	private WebElement mobNoTF;
	
	@FindBy(xpath = "(//input[@placeholder = 'Ex.  9876543210'])[2]")
	private WebElement altMobNoTF;
	
	//Compensation and Benefit
	
	@FindBy(xpath = "(//div[@id ='panel1a-header'])[2]")
	private WebElement headDetailsDropdown;
	
	@FindBy(xpath = "(//input[@placeholder = 'Ex.  Sunil Sharma...'])[2]")
	private WebElement nameTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[6]")
	private WebElement emailTF;
	
	@FindBy(xpath = "(//input[@placeholder = 'Ex.  9876543210'])[3]")
	private WebElement mobTF;
	
	@FindBy(xpath = "(//input[@placeholder = 'Ex.  9876543210'])[4]")
	private WebElement altMobTF;
	
	//Entity Number
	
	@FindBy(xpath = "(//div[@id = 'panel1a-header'])[3]")
	private WebElement entityNoDropdown;
	
	@FindBy(xpath = "//input[@placeholder = 'Ex.  22AAAAA0000A1Z5']")
	private WebElement gstNoTF;
	
	@FindBy(xpath = "//input[@placeholder = 'Ex. L17110MH1973PLX19789']")
	private WebElement cinNoTF;
	
	//Head HR
	
	@FindBy(xpath = "(//div[@id = 'panel1a-header'])[4]")
	private WebElement headHrDetailsDropdown;
	
	@FindBy(xpath = "(//input[@placeholder = 'Ex.  Sunil Sharma...'])[3]")
	private WebElement hrNameTF;
	
	@FindBy(xpath = "(//input[@placeholder = 'Ex.  SunilSharma@gmail.com'])[3]")
	private WebElement hrEmailTF;
	
	@FindBy(xpath = "(//input[@placeholder = 'Ex.  1234567890'])[1]")
	private WebElement hrMobNoTF;
	
	@FindBy(xpath = "(//input[@placeholder = 'Ex.  1234567890'])[2]")
	private WebElement hrAltMobNoTF;
	
	//Head Office Address
	
	@FindBy(xpath = "(//div[@id = 'panel1a-header'])[5]")
	private WebElement headOfficeAddDropdown;
	
	@FindBy(xpath = "//input[@placeholder='Ex.  123405']")
	private WebElement pinCodeTF;
	
	@FindBy(xpath = "//input[@placeholder='Ex.  19283']")
	private WebElement blockNoTF;
	
	@FindBy(xpath = "(//input[@placeholder='Ex.  pali'])[1]")
	private WebElement premiseTF;
	
	@FindBy(xpath = "(//input[@placeholder='Ex.  pali'])[2]")
	private WebElement localityTF;
	
	@FindBy(xpath = "//input[@placeholder='Ex.  haryana']")
	private WebElement stateTF;
	
	@FindBy(xpath = "//input[@placeholder='Ex.  faridabad']")
	private WebElement districtTF;
	
	@FindBy(xpath = "(//input[@placeholder='Ex. 9876543210'])[1]")
	private WebElement headOfficeMobTF;
	
	@FindBy(xpath = "(//input[@placeholder='Ex. 9876543210'])[2]")
	private WebElement headOfficePNoTF;
	
	@FindBy(xpath = "(//input[@placeholder='Ex. 9876543210'])[3]")
	private WebElement faxNoTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[24]")
	private WebElement corpHeadOfficeLocTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[25]")
	private WebElement corpSubOfficeLocTF;
	
	@FindBy(xpath = "//label[text() = 'Yes']")
	private WebElement yesRadioButton;
	
	@FindBy(xpath = "//label[text() = 'No']")
	private WebElement noRadioButton;
	
	//Closer
	
	@FindBy(xpath = "//button[text() = 'Save&Exit']")
	private WebElement saveAndExitButton;
	
	@FindBy(xpath = "//button[text() = 'Previous']")
	private WebElement previousButton;
	
	@FindBy(xpath = "//button[text() = 'Next']")
	private WebElement nextButton;
	
	//Getter
	public WebElement getSpocCorpDropdown() {
		return spocCorpDropdown;
	}

	public WebElement getSpocNameForCorp() {
		return spocNameForCorp;
	}

	public WebElement getEmailIdTF() {
		return emailIdTF;
	}

	public WebElement getMobNoTF() {
		return mobNoTF;
	}

	public WebElement getAltMobNoTF() {
		return altMobNoTF;
	}

	public WebElement getHeadDetailsDropdown() {
		return headDetailsDropdown;
	}

	public WebElement getNameTF() {
		return nameTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getMobTF() {
		return mobTF;
	}

	public WebElement getAltMobTF() {
		return altMobTF;
	}

	public WebElement getEntityNoDropdown() {
		return entityNoDropdown;
	}

	public WebElement getGstNoTF() {
		return gstNoTF;
	}

	public WebElement getCinNoTF() {
		return cinNoTF;
	}

	public WebElement getHeadHrDetailsDropdown() {
		return headHrDetailsDropdown;
	}

	public WebElement getHrNameTF() {
		return hrNameTF;
	}

	public WebElement getHrEmailTF() {
		return hrEmailTF;
	}

	public WebElement getHrMobNoTF() {
		return hrMobNoTF;
	}

	public WebElement getHrAltMobNoTF() {
		return hrAltMobNoTF;
	}

	public WebElement getHeadOfficeAddDropdown() {
		return headOfficeAddDropdown;
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

	public WebElement getHeadOfficeMobTF() {
		return headOfficeMobTF;
	}

	public WebElement getHeadOfficePNoTF() {
		return headOfficePNoTF;
	}

	public WebElement getFaxNoTF() {
		return faxNoTF;
	}

	public WebElement getCorpHeadOfficeLocTF() {
		return corpHeadOfficeLocTF;
	}

	public WebElement getCorpSubOfficeLocTF() {
		return corpSubOfficeLocTF;
	}

	public WebElement getYesRadioButton() {
		return yesRadioButton;
	}

	public WebElement getNoRadioButton() {
		return noRadioButton;
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
	
	//Business Logic
	
	public void toFillSpocForCorpForm(String spocName, String emailId, String mobNo, String altMob ) throws InterruptedException {
		spocNameForCorp.sendKeys(spocName);	
		Thread.sleep(2000);
		emailIdTF.sendKeys(emailId);
		Thread.sleep(2000);
		mobNoTF.sendKeys(mobNo);
		Thread.sleep(2000);
		altMobNoTF.sendKeys(altMob);
		Thread.sleep(2000);
	}
	
	public void toFillCompensationAndBenefitsForm(String name, String email, String mob, String alternateMob) throws InterruptedException {
		headDetailsDropdown.click();
		Thread.sleep(1000);
		nameTF.sendKeys(name);
		Thread.sleep(1000);
		emailTF.sendKeys(email);
		Thread.sleep(1000);
		mobTF.sendKeys(mob);
		Thread.sleep(1000);
		altMobTF.sendKeys(alternateMob);
	}
	
	public void toFillEntityNumber(String gstNumber, String cinNumber) throws InterruptedException {
		entityNoDropdown.click();
		Thread.sleep(2000);
		gstNoTF.sendKeys(gstNumber);
		Thread.sleep(1000);
		cinNoTF.sendKeys(cinNumber);
		Thread.sleep(1000);
	}
	
	public void toFillHeadHrDetails(String hrName, String hrEmail, String hrMob, String hrAltMob) throws InterruptedException {
		headHrDetailsDropdown.click();
		Thread.sleep(1000);
		hrNameTF.sendKeys(hrName);
		Thread.sleep(1000);
		hrEmailTF.sendKeys(hrEmail);
		Thread.sleep(1000);
		hrMobNoTF.sendKeys(hrMob);
		Thread.sleep(1000);
		hrAltMobNoTF.sendKeys(hrAltMob);
		Thread.sleep(1000);
	}
	
	public void toFillHeadOfficeAddress(String pin, String block, String premise, String area, String state, String city, String officeMob, String officePhone, String officeFax, String headOfficeLoc, String subOLoc) throws InterruptedException {
		// Initialize WebDriverWait with Duration
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    // Perform actions with explicit waits
	    wait.until(ExpectedConditions.elementToBeClickable(headOfficeAddDropdown)).click();
	    wait.until(ExpectedConditions.visibilityOf(pinCodeTF)).sendKeys(pin);
	    wait.until(ExpectedConditions.visibilityOf(blockNoTF)).sendKeys(block);
	    wait.until(ExpectedConditions.visibilityOf(premiseTF)).sendKeys(premise);
	    wait.until(ExpectedConditions.visibilityOf(localityTF)).sendKeys(area);
	    wait.until(ExpectedConditions.visibilityOf(stateTF)).sendKeys(state);
	    wait.until(ExpectedConditions.visibilityOf(districtTF)).sendKeys(city);
	    wait.until(ExpectedConditions.visibilityOf(headOfficeMobTF)).sendKeys(officeMob);
	    wait.until(ExpectedConditions.visibilityOf(headOfficePNoTF)).sendKeys(officePhone);
	    wait.until(ExpectedConditions.visibilityOf(faxNoTF)).sendKeys(officeFax);
	    wait.until(ExpectedConditions.visibilityOf(corpHeadOfficeLocTF)).sendKeys(headOfficeLoc);
	    wait.until(ExpectedConditions.visibilityOf(corpSubOfficeLocTF)).sendKeys(subOLoc);
	    Thread.sleep(2000);
	    wait.until(ExpectedConditions.elementToBeClickable(yesRadioButton)).click();
	    wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
	}

}
 