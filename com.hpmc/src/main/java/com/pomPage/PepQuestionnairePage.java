package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PepQuestionnairePage extends BaseClass {

	public PepQuestionnairePage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath = "//button[text() = 'Head of State or Government']")
	private WebElement headOfStateTab;
	
	@FindBy(xpath = "//button[text() = 'Member of a Political Party']")
	private WebElement memOfPoliticalPartyTab;
	
	@FindBy(xpath = "//button[contains(text(), 'Senior Government')]")
	private WebElement seniorGovTab;
	
	@FindBy(xpath = "//button[contains(text(), 'Central Corporations')]")
	private WebElement centralCorpTab;
	
	@FindBy(xpath = "(//label[text() = 'Yes'])[2]")
	private WebElement yesRadioButton;
	
	@FindBy(xpath = "(//label[text() = 'No'])[2]")
	private WebElement noRadioButton;
	
	@FindBy(xpath = "//input[@placeholder = 'Enter Relationship']")
	private WebElement relationshipTF;
	
	@FindBy(name = "natureOfWork")
	private WebElement natureOfWorkTF;
	
	@FindBy(xpath = "//input[@placeholder = 'Enter nature of the organization']")
	private WebElement natureofOrgTF;
	
	@FindBy(name = "workPlaceArea")
	private WebElement workPlaceAreaTF;
	
	@FindBy(name = "inProfileSince")
	private WebElement profileSinceTF;
	
	@FindBy(xpath = "(//input[@type = 'checkbox'])[2]")
	private WebElement pepCatagoryCheckbox;
	
	@FindBy(xpath = "//button[text() = 'Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//button[text() = 'Cancel']")
	private WebElement cancelButton;

	public WebElement getHeadOfStateTab() {
		return headOfStateTab;
	}

	public WebElement getMemOfPoliticalPartyTab() {
		return memOfPoliticalPartyTab;
	}

	public WebElement getSeniorGovTab() {
		return seniorGovTab;
	}

	public WebElement getCentralCorpTab() {
		return centralCorpTab;
	}

	public WebElement getYesRadioButton() {
		return yesRadioButton;
	}

	public WebElement getNoRadioButton() {
		return noRadioButton;
	}

	public WebElement getRelationshipTF() {
		return relationshipTF;
	}

	public WebElement getNatureOfWorkTF() {
		return natureOfWorkTF;
	}

	public WebElement getNatureofOrgTF() {
		return natureofOrgTF;
	}

	public WebElement getWorkPlaceAreaTF() {
		return workPlaceAreaTF;
	}

	public WebElement getProfileSinceTF() {
		return profileSinceTF;
	}

	public WebElement getPepCatagoryCheckbox() {
		return pepCatagoryCheckbox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	
}
