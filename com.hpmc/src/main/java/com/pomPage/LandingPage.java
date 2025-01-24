package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BaseClass {

	public LandingPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[@class = 'MainSidebar_active__dGxZO']")
	private WebElement dashBoardIcon;

	@FindBy(xpath = "(//span[@class = 'MainSidebar_sidebar_icons__ocsph'])[1]")
	private WebElement reportsIcon;
	

	@FindBy(xpath = "(//span[@class = 'MainSidebar_sidebar_icons__ocsph'])[2]")
	private WebElement managementIcon;
	
	@FindBy(xpath = "//p[text() = 'Corporate Journey']")
	private WebElement corporateJourney;
	
	
	public WebElement getCorporateJourney() {
		return corporateJourney;
	}


	public WebElement getDashBoardIcon() {
		return dashBoardIcon;
	}


	public WebElement getReportsIcon() {
		return reportsIcon;
	}


	public WebElement getManagementIcon() {
		return managementIcon;
	}
	
	public void toAccessManagement() throws InterruptedException
	{
		managementIcon.click();
		Thread.sleep(2000);
		
	}
	
	public void toAccessReport() throws InterruptedException
	{
		reportsIcon.click();
		Thread.sleep(2000);
	}
	
	public void toAccessCorpJourney() throws InterruptedException
	{
		corporateJourney.click();
		Thread.sleep(2000);
	}

}
