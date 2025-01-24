package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RMBasicDetailsForm extends BaseClass {

	public RMBasicDetailsForm(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//label[text() = 'Myself (RM)']")
	private WebElement myselfRadioButton;
	
	@FindBy(xpath = "//label[text() = 'Corporate (Nodal Officer)']")
	private WebElement corporateRadioButton;
	
	@FindBy(name = "panNumber") 
	private WebElement panNumberTF;
	
	@FindBy(xpath = "//button[text() = 'Get Details']")
	private WebElement getDetailsButton;
	
	@FindBy(name = "corporateName")
	private WebElement corpNameTF;
	
	@FindBy(xpath = "//button[text() = 'Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//button[text() = 'Proceed']")
	private WebElement proceedButton;
	
	@FindBy(xpath = "//div[contains(text(),'Corporate already registered')]")
	private WebElement corpAlreadyRegMessage;
	
	@FindBy(xpath = "(//button[text() = 'Proceed'])[2]" )
	private WebElement proceedToBasicDetailsPage;

	@FindBy(xpath = "//button[text() = 'Close']")
	private WebElement closeButton;
	
	public WebElement getProceedToBasicDetailsPage() {
		return proceedToBasicDetailsPage;
	}

	public WebElement getMyselfRadioButton() {
		return myselfRadioButton;
	}

	public WebElement getCorporateRadioButton() {
		return corporateRadioButton;
	}

	public WebElement getPanNumberTF() {
		return panNumberTF;
	}
	
	public WebElement getGetDetailsButton() {
		return getDetailsButton;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

	public WebElement getCorpNameTF() {
		return corpNameTF;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getProceedButton() {
		return proceedButton;
	}
		
		
	public WebElement getCorpAlreadyRegMessage() {
		return corpAlreadyRegMessage;
	}
	
	//Business Logic

	public void toClickOnMySelfRM() {
		myselfRadioButton.click();
	} 
	
	public void toEnterBasicDetailsForCorpReg(String pan, String corpName) throws InterruptedException 
	{
	   
	        // Enter PAN number and click "Get Details"
	        panNumberTF.sendKeys(pan);
	        Thread.sleep(2000);
	        getDetailsButton.click();
	        Thread.sleep(3000);
	        corpNameTF.sendKeys(corpName);
	        

//	        // Wait for the corp name field to be available
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	        WebElement corpTF = wait.until(ExpectedConditions.visibilityOf(corpNameTF));
//	        corpTF.sendKeys(corpName);

	        // Click "Proceed" button
	        Thread.sleep(3000); // Minimized delay
	        proceedButton.click();

	        Thread.sleep(3000);
	        proceedToBasicDetailsPage.click();
	        Thread.sleep(1000); // Minimized delay
	}

}
