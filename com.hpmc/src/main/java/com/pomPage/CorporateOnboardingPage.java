package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CorporateOnboardingPage extends BaseClass {

	public CorporateOnboardingPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[text() = 'Register New Corporate']")
	private WebElement registerNewCorporateButton;
	
	@FindBy(xpath = "//button[text() = 'GO BACK']")
	private WebElement goBackButton;
	
	@FindBy(xpath = "//h3[text() = 'Corporate Onboarding']")
	private WebElement corporateOnboardingTab;
	
	@FindBy(xpath = "//p[text() = 'Download CHO Form']")
	private WebElement downloadChoForm;
	
	@FindBy(xpath = "//div[text() = 'Export CSV']")
	private WebElement exportCSV;
	
	@FindBy(xpath = "//button[text() = 'Proceed']")
	private WebElement proceedButton;

	public WebElement getRegisterNewCorporate() {
		return registerNewCorporateButton;
	}

	public WebElement getGoBackButton() {
		return goBackButton;
	}

	public WebElement getCorporateOnboardingTab() {
		return corporateOnboardingTab;
	}

	public WebElement getDownloadChoForm() {
		return downloadChoForm;
	}

	public WebElement getExportCSV() {
		return exportCSV;
	}
	
	public WebElement getProceedButton() {
		return proceedButton;
	}
	
	//business login
	public void toClickRegisterNewCorporate() throws InterruptedException {
		registerNewCorporateButton.click();
		Thread.sleep(2000);
		proceedButton.click();
		Thread.sleep(2000);
		
	}
	
}
