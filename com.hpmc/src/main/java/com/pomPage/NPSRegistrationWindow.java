package com.pomPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NPSRegistrationWindow extends BaseClass {

	public NPSRegistrationWindow(WebDriver driver) {
		super(driver);
		
	}
	//NPS Registration Window
	@FindBy(xpath = "(//label[text() = 'Monthly'])[1]")
	private WebElement monthlyRadioButton;
	
	@FindBy(xpath = "(//label[text() = 'Quarterly'])[1]")
	private WebElement quatRadioButton;
	
	@FindBy(xpath = "(//label[text() = 'Half Yearly'])[1]")
	private WebElement hYRadioButton;
	
	@FindBy(xpath = "(//label[text() = 'Yearly'])[1]")
	private WebElement yearlyRadioButton;
	
	@FindBy(xpath = "(//label[text() = 'Continuous'])[1]")
	private WebElement contRadioButton;
	
	@FindBy(xpath = "(//select[@class = 'CorporateForm_input__OaB+b'])[2]")
	private WebElement startDateDropdown;
	
	@FindBy(xpath = "(//select[@class = 'CorporateForm_input__OaB+b'])[3]")
	private WebElement endDateDropdown;
	
	@FindBy(xpath = "//label[text() = 'During Month']")
	private WebElement duringMRadioButton;
	
	@FindBy(xpath = "//label[text() = 'Month End']")
	private WebElement monthEndRadioButton;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[1]")
	private WebElement retireAgeTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[2]")
	private WebElement agreementEndDateTF;
	
	//WebElements under Charges Dropdown
	
	@FindBy(xpath = "//p[text() = 'Charges']")
	private WebElement chargeDropdown;
	
	@FindBy(xpath = "(//label[text() = 'Employer'])[1]")
	private WebElement employerRadioButton;
	
	@FindBy(xpath = "(//label[text() = 'Employee'])[1]")
	private WebElement employeeRadioButton;
	
	@FindBy(xpath = "(//label[text() = 'Employer'])[2]")
	private WebElement employerRadioButtonTwo;
	
	@FindBy(xpath = "//label[text() = 'Hybrid']")
	private WebElement hybridRadioButton;
	
	@FindBy(xpath = "(//label[text() = 'Monthly'])[2]")
	private WebElement montRadButton;
	
	@FindBy(xpath = "(//label[text() = 'Quarterly'])[2]")
	private WebElement quaterlyRadioButton;
	
	@FindBy(xpath = "//label[text() = 'Half yearly']")
	private WebElement halfYRadioButton;
	
	@FindBy(xpath = "(//label[text() = 'Yearly'])[2]")
	private WebElement yRadioButton;
	
	@FindBy(xpath = "//button[text() = 'Save&Exit']")
	private WebElement saveAndExitButton;
	
	@FindBy(xpath = "//button[text() = 'Previous']")
	private WebElement prevButton;
	
	@FindBy(xpath = "//button[text() = 'Next']")
	private WebElement nextButton;

	public WebElement getMonthlyRadioButton() {
		return monthlyRadioButton;
	}

	public WebElement getQuatRadioButton() {
		return quatRadioButton;
	}

	public WebElement gethYRadioButton() {
		return hYRadioButton;
	}

	public WebElement getYearlyRadioButton() {
		return yearlyRadioButton;
	}

	public WebElement getContRadioButton() {
		return contRadioButton;
	}

	public WebElement getStartDateDropdown() {
		return startDateDropdown;
	}

	public WebElement getEndDateDropdown() {
		return endDateDropdown;
	}

	public WebElement getDuringMRadioButton() {
		return duringMRadioButton;
	}

	public WebElement getMonthEndRadioButton() {
		return monthEndRadioButton;
	}

	public WebElement getRetireAgeTF() {
		return retireAgeTF;
	}

	public WebElement getAgreementEndDateTF() {
		return agreementEndDateTF;
	}

	public WebElement getChargeDropdown() {
		return chargeDropdown;
	}

	public WebElement getEmployerRadioButton() {
		return employerRadioButton;
	}

	public WebElement getEmployeeRadioButton() {
		return employeeRadioButton;
	}

	public WebElement getEmployerRadioButtonTwo() {
		return employerRadioButtonTwo;
	}

	public WebElement getHybridRadioButton() {
		return hybridRadioButton;
	}

	public WebElement getMontRadButton() {
		return montRadButton;
	}

	public WebElement getQuaterlyRadioButton() {
		return quaterlyRadioButton;
	}

	public WebElement getHalfYRadioButton() {
		return halfYRadioButton;
	}

	public WebElement getyRadioButton() {
		return yRadioButton;
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
	
	//Business Logic
	public void toFillNPSEnrollmentWindow(String retAge, String sla) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 
	    new Select(wait.until(ExpectedConditions.elementToBeClickable(startDateDropdown))).selectByValue("15");

	    new Select(wait.until(ExpectedConditions.elementToBeClickable(endDateDropdown))).selectByValue("20");
	    
	    wait.until(ExpectedConditions.elementToBeClickable(duringMRadioButton)).click();

	    wait.until(ExpectedConditions.visibilityOf(retireAgeTF)).sendKeys(retAge);

	    wait.until(ExpectedConditions.visibilityOf(agreementEndDateTF)).sendKeys(sla);
	    
	    wait.until(ExpectedConditions.elementToBeClickable(chargeDropdown)).click();
	    
	    wait.until(ExpectedConditions.elementToBeClickable(employerRadioButton)).click();

	    wait.until(ExpectedConditions.elementToBeClickable(employerRadioButtonTwo)).click();

	    wait.until(ExpectedConditions.elementToBeClickable(yRadioButton)).click();

	    wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();
	}
	
}
