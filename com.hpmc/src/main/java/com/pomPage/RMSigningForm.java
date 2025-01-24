package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RMSigningForm extends BaseClass {

	public RMSigningForm(WebDriver driver) {
		super(driver);
		
	}
	//Signing Authority : Corporate 
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[1]")
	private WebElement corpAuthName;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[2]")
	private WebElement corpAuthPlace;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[3]")
	private WebElement corpAuthDesignation;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[4]")
	private WebElement corpAuthDepartment;
	
	//Signing Authority : HDFC Pension (To be filled by POP)
	@FindBy(xpath = "//p[text() = 'Signing Authority : HDFC Pension (To be filled by POP)']")
	private WebElement hdfcAuthDropdown;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[5]")
	private WebElement hdfcAuthName;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[6]")
	private WebElement hdfcAuthPlace;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[7]")
	private WebElement hdfcAuthDesignation;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[8]")
	private WebElement hdfcAuthDepartment;
	
	@FindBy(xpath = "//button[text() = 'Save&Exit']")
	private WebElement saveNExitButton;
	
	@FindBy(xpath = "//button[text() = 'Previous']")
	private WebElement prevButton;
	
	@FindBy(xpath = "//button[text() = 'Preview & Submit']")
	private WebElement prevNSubButton;

	public WebElement getCorpAuthName() {
		return corpAuthName;
	}

	public WebElement getCorpAuthPlace() {
		return corpAuthPlace;
	}

	public WebElement getCorpAuthDesignation() {
		return corpAuthDesignation;
	}

	public WebElement getCorpAuthDepartment() {
		return corpAuthDepartment;
	}

	public WebElement getHdfcAuthDropdown() {
		return hdfcAuthDropdown;
	}

	public WebElement getHdfcAuthName() {
		return hdfcAuthName;
	}

	public WebElement getHdfcAuthPlace() {
		return hdfcAuthPlace;
	}

	public WebElement getHdfcAuthDesignation() {
		return hdfcAuthDesignation;
	}

	public WebElement getHdfcAuthDepartment() {
		return hdfcAuthDepartment;
	}
	
	public WebElement getSaveNExitButton() {
		return saveNExitButton;
	}

	public WebElement getPrevButton() {
		return prevButton;
	}

	public WebElement getPrevNSubButton() {
		return prevNSubButton;
	}

	//Business Logic
	public void toFillSigningForm(String corpAuName, String corpAuPlace, String corpAuDesig, String corpAuDept, String hdfcAuName, String hdfcAuPlace, String hdfcAuDesig, String hdfcAuDept) throws InterruptedException {
		//Signing Authority : Corporate 
		corpAuthName.sendKeys(corpAuName);
		Thread.sleep(1000);
		corpAuthPlace.sendKeys(corpAuPlace);
		Thread.sleep(1000);
		corpAuthDesignation.sendKeys(corpAuDesig);
		Thread.sleep(1000);
		corpAuthDepartment.sendKeys(corpAuDept);
		Thread.sleep(1000);
		
		//Signing Authority : HDFC Pension (To be filled by POP)
		hdfcAuthDropdown.click();
		Thread.sleep(1000);
		hdfcAuthName.sendKeys(hdfcAuName);
		Thread.sleep(1000);
		hdfcAuthPlace.sendKeys(hdfcAuPlace);
		Thread.sleep(1000);
		hdfcAuthDesignation.sendKeys(hdfcAuDesig);
		Thread.sleep(1000);
		hdfcAuthDepartment.sendKeys(hdfcAuDept);
		Thread.sleep(1000);
		prevNSubButton.click();
	}

}
