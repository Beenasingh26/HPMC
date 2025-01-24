package com.pomPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RMRegEmployeeDetailsForm extends BaseClass {

	public RMRegEmployeeDetailsForm(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[1]")
	private WebElement totalEmployeesTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[2]")
	private WebElement eligibleEmpForNps;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[3]")
	private WebElement expectedNewEmpTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[4]")
	private WebElement abvTenLakhSalEmpTF;
	
	@FindBy(xpath = "(//input[@class = 'CorporateForm_input__OaB+b'])[5]")
	private WebElement compAndBenefitsTF;
	
	@FindBy(xpath = "//button[text() = 'Save&Exit']")
	private WebElement saveAndExitButton;
	
	@FindBy(xpath = "//button[text() = 'Previous']")
	private WebElement previousButton;
	
	@FindBy(xpath = "//button[text() = 'Next']")
	private WebElement nextButton;

	public WebElement getTotalEmployeesTF() {
		return totalEmployeesTF;
	}

	public WebElement getEligibleEmpForNps() {
		return eligibleEmpForNps;
	}

	public WebElement getExpectedNewEmpTF() {
		return expectedNewEmpTF;
	}

	public WebElement getAbvTenLakhSalEmpTF() {
		return abvTenLakhSalEmpTF;
	}

	public WebElement getCompAndBenefitsTF() {
		return compAndBenefitsTF;
	}
	

	// Business Logic
	
    public WebElement getSaveAndExitButton() {
		return saveAndExitButton;
	}

	public WebElement getPreviousButton() {
		return previousButton;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public void toFillEmployeeDetails(String empCount, String empForNps, String newEmpCount, String tenLakhCount, String benefits) {
    	
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait and send value to totalEmployeesTF
        wait.until(ExpectedConditions.visibilityOf(totalEmployeesTF)).sendKeys(empCount);

        // Wait and send value to eligibleEmpForNps
        wait.until(ExpectedConditions.visibilityOf(eligibleEmpForNps)).sendKeys(empForNps);

        // Wait and send value to expectedNewEmpTF
        wait.until(ExpectedConditions.visibilityOf(expectedNewEmpTF)).sendKeys(newEmpCount);

        // Wait and send value to abvTenLakhSalEmpTF
        wait.until(ExpectedConditions.visibilityOf(abvTenLakhSalEmpTF)).sendKeys(tenLakhCount);

        // Wait and send value to compAndBenefitsTF
        wait.until(ExpectedConditions.visibilityOf(compAndBenefitsTF)).sendKeys(benefits);
        
        wait.until(ExpectedConditions.visibilityOf(nextButton)).click();  
        
      }

}
