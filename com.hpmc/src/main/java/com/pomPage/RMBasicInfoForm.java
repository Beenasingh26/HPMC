package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RMBasicInfoForm extends BaseClass {

	public RMBasicInfoForm(WebDriver driver) {
		super(driver);
	}
	//Register New Corporate
	
	//New Registration
	@FindBy(xpath = "//input[@placeholder = 'Ex. PCMCK9393J']")
	private WebElement panTF;
	
	@FindBy(xpath = "//input[@placeholder = 'Ex. Genpact...']")
	private WebElement corpNameTF;

	@FindBy(xpath = "(//select[@class = 'CorporateForm_input__OaB+b'])[1]")
	private WebElement consOfBusinessDopdown;
	
	@FindBy(xpath = "(//select[@class = 'CorporateForm_input__OaB+b'])[2]")
	private WebElement sectorDropdown;
	
	@FindBy(xpath = "(//select[@class = 'CorporateForm_input__OaB+b'])[3]")
	private WebElement craNameDropdown;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[4]")
	private WebElement groupEntity;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[5]")
	private WebElement corporateEmail;
	
	@FindBy(xpath = "//label[text() = 'New Registration']")
	private WebElement newRegRadioButton;
	
	@FindBy(xpath = "//label[text() = 'POP Shift']")
	private WebElement popShiftRadioButton;
	
	//POP Shift form webelement
	
	@FindBy(xpath = "//input[@placeholder = 'Ex.  1242423']")
	private WebElement choNumberTF;
	
	@FindBy(xpath = "(//select[@class = 'CorporateForm_input__OaB+b'])[4]")
	private WebElement nameOfExistingPopTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[7]")
	private WebElement existingPopRegNoTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[8]")
	private WebElement nameOfTargetedTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[9]")
	private WebElement targetedPopRegNoTF;
	
	@FindBy(xpath = "//button[text() = 'Save&Exit']")
	private WebElement saveAndExitButton;
	
	@FindBy(xpath = "//button[text() = 'Next']")
	private WebElement nextButton;

	public WebElement getPanTF() {
		return panTF;
	}

	public WebElement getCorpNameTF() {
		return corpNameTF;
	}

	public WebElement getConsOfBusinessDopdown() {
		return consOfBusinessDopdown;
	}

	public WebElement getSectorDropdown() {
		return sectorDropdown;
	}

	public WebElement getCraNameDropdown() {
		return craNameDropdown;
	}

	public WebElement getGroupEntity() {
		return groupEntity;
	}

	public WebElement getCorporateEmail() {
		return corporateEmail;
	}

	public WebElement getNewRegRadioButton() {
		return newRegRadioButton;
	}

	public WebElement getPopShiftRadioButton() {
		return popShiftRadioButton;
	}

	public WebElement getChoNumberTF() {
		return choNumberTF;
	}

	public WebElement getNameOfExistingPopTF() {
		return nameOfExistingPopTF;
	}

	public WebElement getExistingPopRegNoTF() {
		return existingPopRegNoTF;
	}

	public WebElement getNameOfTargetedTF() {
		return nameOfTargetedTF;
	}

	public WebElement getTargetedPopRegNoTF() {
		return targetedPopRegNoTF;
	}

	public WebElement getSaveAndExitButton() {
		return saveAndExitButton;
	}

	public WebElement getNextButton() {
		return nextButton;
	}
	
	//Business Logic
//	public void toEnterBasicInfo(String constBussiness, String sector, String craName, String grpEntity, String corpEmail) throws InterruptedException {
//		consOfBusinessDopdown.sendKeys(constBussiness);
//		Thread.sleep(2000);
//		sectorDropdown.sendKeys(sector);
//		Thread.sleep(2000);
//		craNameDropdown.sendKeys(craName);
//		Thread.sleep(2000);
		public void toEnterBasicInfo(String grpEntity, String corpEmail) throws InterruptedException {
			
		Select sel = new Select(consOfBusinessDopdown);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		Select se = new Select(sectorDropdown);
		se.selectByIndex(1);
		Select s = new Select(craNameDropdown);
		s.selectByIndex(1);
		groupEntity.sendKeys(grpEntity);
		Thread.sleep(2000);
		corporateEmail.sendKeys(corpEmail);
		Thread.sleep(2000);
		nextButton.click();
			
	}
	
}
