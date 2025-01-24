package com.pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MISReportsPage extends BaseClass {

	public MISReportsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[text()='Download CSV']")
	private WebElement downloadCsvIcon;
	
	@FindBy(xpath = "//div[text()='Download PDF']")
	private WebElement downloadPdfIcon;
	
	@FindBy(xpath = "//p[text()='Audit Trail Report']")
	private WebElement auditTrailReportTab;
	
	@FindBy(xpath = "//p[text()='FR Report']")
	private WebElement frReportTab;
	
	@FindBy(xpath = "//p[text()='Corporate CHO Auto Populate Report']']")
	private WebElement choAutoPopulateReportTab;
	
	@FindBy(xpath = "//p[text()='API Report']")
	private WebElement apiReportTab;
	
	@FindBy(xpath = "//p[text()='User Report']")
	private WebElement userReportTab;
	
	@FindBy(xpath = "//p[text()='CERSAI Report']")
	private WebElement cersaiReportTab;
	
	@FindBy(xpath = "//p[text()='Migration Report']")
	private WebElement migrationReportTab;
	
	@FindBy(xpath = "//p[text()='I-PIN Report']")
	private WebElement iPinReportTab;
	
	@FindBy(xpath = "//p[text()='CSRF TRACKER Report']")
	private WebElement csrfTrackerReportTab;
	
	@FindBy(xpath = "//p[text()='Migration OPS Report']")
	private WebElement migrationOpsReportTab;
	
	@FindBy(xpath = "//p[text()='Profile Modification Report']")
	private WebElement profileModificationReportTab;
	
	@FindBy(xpath = "//p[text()='Contribution Report']")
	private WebElement contributionReportTab;
	
	@FindBy(xpath = "//p[text()='CKYC Report']")
	private WebElement ckycReportTab;
	
	@FindBy(xpath = "//p[text()='Contribution Report-1']")
	private WebElement contributionReportOne;
	
	@FindBy(xpath = "//p[text()='Contribution Report-2']")
	private WebElement contributionReportTwo;
	
	@FindBy(xpath = "//p[text()='Contribution Report-3']")
	private WebElement contributionReportThree;
	
	@FindBy(xpath = "//p[text()='Contribution Report-4']")
	private WebElement contributionReportFour;
	
	@FindBy(xpath = "//p[text()='Contribution Report-5']")
	private WebElement contributionReportFive;
	
	@FindBy(xpath = "//p[text()='Contribution Report-6']")
	private WebElement contributionReportSix;
	
	@FindBy(xpath = "//p[text()='Contribution Report-7']")
	private WebElement contributionReportSeven;
	
	@FindBy(xpath = "//p[text()='Contribution List']")
	private WebElement contributionListTab;
	
	@FindBy(xpath = "//p[text()='GST Receipt']")
	private WebElement gstReceiptTab;
	
	@FindBy(xpath = "//p[text()='PRAN Wise Contribution Month Wise']")
	private WebElement pranWiseContributionMonthWise;
	
	@FindBy(xpath = "//p[text()='Active PRAN List']")
	private WebElement activePranList;
	
	@FindBy(xpath = "//p[text()='Request List with status']")
	private WebElement requestListWithStatus;

	@FindBy(xpath = "//p[text()='Welcome Kit']")
	private WebElement welcomeKitTab;

	public WebElement getDownloadCsvIcon() {
		return downloadCsvIcon;
	}

	public WebElement getDownloadPdfIcon() {
		return downloadPdfIcon;
	}

	public WebElement getAuditTrailReportTab() {
		return auditTrailReportTab;
	}

	public WebElement getFrReportTab() {
		return frReportTab;
	}

	public WebElement getChoAutoPopulateReportTab() {
		return choAutoPopulateReportTab;
	}

	public WebElement getApiReportTab() {
		return apiReportTab;
	}

	public WebElement getUserReportTab() {
		return userReportTab;
	}

	public WebElement getCersaiReportTab() {
		return cersaiReportTab;
	}

	public WebElement getMigrationReportTab() {
		return migrationReportTab;
	}

	public WebElement getiPinReportTab() {
		return iPinReportTab;
	}

	public WebElement getCsrfTrackerReportTab() {
		return csrfTrackerReportTab;
	}

	public WebElement getMigrationOpsReportTab() {
		return migrationOpsReportTab;
	}

	public WebElement getProfileModificationReportTab() {
		return profileModificationReportTab;
	}

	public WebElement getContributionReportTab() {
		return contributionReportTab;
	}

	public WebElement getCkycReportTab() {
		return ckycReportTab;
	}

	public WebElement getContributionReportOne() {
		return contributionReportOne;
	}

	public WebElement getContributionReportTwo() {
		return contributionReportTwo;
	}

	public WebElement getContributionReportThree() {
		return contributionReportThree;
	}

	public WebElement getContributionReportFour() {
		return contributionReportFour;
	}

	public WebElement getContributionReportFive() {
		return contributionReportFive;
	}

	public WebElement getContributionReportSix() {
		return contributionReportSix;
	}

	public WebElement getContributionReportSeven() {
		return contributionReportSeven;
	}

	public WebElement getContributionListTab() {
		return contributionListTab;
	}

	public WebElement getGstReceiptTab() {
		return gstReceiptTab;
	}

	public WebElement getPranWiseContributionMonthWise() {
		return pranWiseContributionMonthWise;
	}

	public WebElement getActivePranList() {
		return activePranList;
	}

	public WebElement getRequestListWithStatus() {
		return requestListWithStatus;
	}

	public WebElement getWelcomeKitTab() {
		return welcomeKitTab;
	}
	
	//business logic
	
	public void toDownloadReport() throws InterruptedException
	{
		downloadCsvIcon.click();
		Thread.sleep(5000);
		downloadPdfIcon.click();
		Thread.sleep(2000);
		
	}

	
}
