package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InvestmentDetailsPage extends BaseClass {

	public InvestmentDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "(//button[text() = 'Previous'])[2]")
	private WebElement previousButton;
	
	@FindBy(xpath = "//button[text() = 'Next']")
	private WebElement nextButton;

	public WebElement getPreviousButton() {
		return previousButton;
	}

	public WebElement getNextButton() {
		return nextButton;
	}
	
}
