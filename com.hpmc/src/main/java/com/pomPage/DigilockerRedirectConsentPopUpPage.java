package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigilockerRedirectConsentPopUpPage extends BaseClass {

	public DigilockerRedirectConsentPopUpPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@name = 'digilockerDeclaration']")
	private WebElement digilockerDecCheckBox;
	
	@FindBy(xpath = "//button[text() = 'Proceed With Digilocker']")
	private WebElement proceedWithDigiButton;
	
	@FindBy(xpath = "//button[text() = 'Cancel']")
	private WebElement cancelButton;

	public WebElement getDigilockerDecCheckBox() {
		return digilockerDecCheckBox;
	}

	public WebElement getProceedWithDigiButton() {
		return proceedWithDigiButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

}
