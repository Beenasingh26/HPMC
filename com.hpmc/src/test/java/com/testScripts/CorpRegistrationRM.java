package com.testScripts;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;

import com.genericLibrary.BaseTest;
import com.genericLibrary.FLib;
import com.pomPage.CorporateOnboardingPage;
import com.pomPage.LandingPage;
import com.pomPage.Login;
import com.pomPage.NPSRegistrationWindow;
import com.pomPage.NodalOfficerDetailsForm;
import com.pomPage.RMBankDetailsForm;
import com.pomPage.RMBasicDetailsForm;
import com.pomPage.RMBasicInfoForm;
import com.pomPage.RMRegEmployeeDetailsForm;
import com.pomPage.RMRegistrationForm;
import com.pomPage.RMSigningForm;
import com.pomPage.SchemePreference;

public class CorpRegistrationRM extends BaseTest {

    @Test(description = "Verifying New Corporate Registration for RM")
    public void corpRegistration() throws EncryptedDocumentException, IOException, InterruptedException {
        System.out.println("Starting Corporate Registration Test");

        FLib f = new FLib();

        // Fetching data from Excel for login
        String username = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 2, 0);
        String password = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 2, 1);
        System.out.println("Fetched login details from Excel: Username - " + username);

        // Performing login
        Login lp = new Login(driver);
        lp.validLoginToHPMC(username, password);
        System.out.println("Logged in successfully.");

        // Access Corporate Journey
        LandingPage pg = new LandingPage(driver);
        pg.toAccessCorpJourney();
        System.out.println("Navigated to Corporate Journey page.");

        // Navigate to Corporate Onboarding Pages
        CorporateOnboardingPage cop = new CorporateOnboardingPage(driver);
        cop.toClickRegisterNewCorporate();
        System.out.println("Clicked on Register New Corporate RM button.");

        // Enter Basic Details
        enterBasicDetails();

        // Enter Basic Information
        enterBasicInformation();

        // Filling Registration Form
        fillingRegistrationForm();
        
        //Filling Emp Details
        enterEmployeeDetails();
        
        //Filling Bank Details
        enterBankDetails();
        
        //Filling Nodal Officer Details
        enterNodalOfficersDetails();
        
        //Filling Scheme Preference
        enterNPSRegistrationDetails();
        enterSchemePreferences();
        
        enterSigningDetails();

        System.out.println("Corporate Registration Test Completed.");
    }

    public void enterBasicDetails() throws InterruptedException, EncryptedDocumentException, IOException {
        System.out.println("Entering Basic Details for Corporate Registration.");
        FLib f = new FLib();
        Iterator<Row> itr = f.getRowsFromExcelFile(EXCEL_PATH, RMBasicDetailsSheet);

        while (itr.hasNext()) {
            Row row = itr.next();

            if (row.getRowNum() == 0) {
                System.out.println("Skipping header row in Basic Details sheet.");
                continue;
            }

            String pan = getCellValue(row, RM_SHEET_PAN_COLUMN);
            String corpName = getCellValue(row, RM_SHEET_CORPNAME_COLUMN);

            System.out.println("Registering corporate with PAN: " + pan + ", Name: " + corpName);

            RMBasicDetailsForm rm = new RMBasicDetailsForm(driver);
            rm.toEnterBasicDetailsForCorpReg(pan, corpName);
        }

        System.out.println("Completed entering Basic Details.");
    }

    public void enterBasicInformation() throws InterruptedException, EncryptedDocumentException, IOException {
        System.out.println("Entering Basic Information for Corporate Registration.");
        FLib f = new FLib();
        Iterator<Row> itr = f.getRowsFromExcelFile(EXCEL_PATH, RMBasicInfoSheet);

        while (itr.hasNext()) {
            Row row = itr.next();

            if (row.getRowNum() == 0) {
                System.out.println("Skipping header row in Basic Information sheet.");
                continue;
            }

            // Extract data
            String grpEntity = getCellValue(row, RMBASIC_SHEET_GRPENTITY_COLUMN);
            String corpMail = getCellValue(row, RMBASIC_SHEET_CORPMAIL_COLUMN);

            System.out.println("Entering Group Entity: " + grpEntity + ", Corporate Email: " + corpMail);

            RMBasicInfoForm bif = new RMBasicInfoForm(driver);
            bif.toEnterBasicInfo(grpEntity, corpMail);
        }

        System.out.println("Completed entering Basic Information.");
    }

    public void fillingRegistrationForm() throws EncryptedDocumentException, IOException, InterruptedException {
        System.out.println("Filling Registration Form for Corporate Registration.");
        FLib f = new FLib();
        Iterator<Row> itr = f.getRowsFromExcelFile(EXCEL_PATH, RMRegistrationSheet);

        while (itr.hasNext()) {
            Row row = itr.next();

            if (row.getRowNum() == 0) {
                System.out.println("Skipping header row in Registration Form sheet");
                continue;
            }

            // Extract data from Excel Sheet
            String spocName = getCellValue(row, RMREG_SHEET_SPOC_NAME_COLUMN);
            String emailId = getCellValue(row, RMREG_SHEET_EMAIL_COLUMN);
            String mobNo = getCellValue(row, RMREG_SHEET_MOBILE_COLUMN);
            String altMob = getCellValue(row, RMREG_SHEET_ALT_MOBILE_COLUMN);
            System.out.println("Filling SPOC Details: Name - " + spocName + ", Email - " + emailId);

            String name = getCellValue(row, RMREG_SHEET_NAME_COLUMN);
            String email = getCellValue(row, RMREG_SHEET_MAIL_COLUMN);
            String mob = getCellValue(row, RMREG_SHEET_MOB_COLUMN);
            String alternateMob = getCellValue(row, RMREG_SHEET_ALTE_MOBILE_COLUMN);
            System.out.println("Filling Compensation and Benefits Head Details: Name - " + name);

            String gstNumber = getCellValue(row, RMREG_SHEET_GST_NUMBER_COLUMN);
            String cinNumber = getCellValue(row, RMREG_SHEET_CIN_NUMBER_COLUMN);
            System.out.println("Filling Entity Numbers: GST - " + gstNumber + ", CIN - " + cinNumber);

            String hrName = getCellValue(row, RMREG_SHEET_HR_NAME_COLUMN);
            String hrEmail = getCellValue(row, RMREG_SHEET_HR_EMAIL_COLUMN);
            String hrMob = getCellValue(row, RMREG_SHEET_HR_MOBILE_COLUMN);
            String hrAltMob = getCellValue(row, RMREG_SHEET_HR_ALT_MOBILE_COLUMN);
            System.out.println("Filling Head HR Details: Name - " + hrName + ", Email - " + hrEmail);

            String pin = getCellValue(row, RMREG_SHEET_PIN_COLUMN);
            String block = getCellValue(row, RMREG_SHEET_BLOCK_COLUMN);
            String premise = getCellValue(row, RMREG_SHEET_PREMISE_COLUMN);
            String area = getCellValue(row, RMREG_SHEET_AREA_COLUMN);
            String state = getCellValue(row, RMREG_SHEET_STATE_COLUMN);
            String city = getCellValue(row, RMREG_SHEET_CITY_COLUMN);
            String officeMob = getCellValue(row, RMREG_SHEET_OFFICE_MOBILE_COLUMN);
            String officePhone = getCellValue(row, RMREG_SHEET_OFFICE_PHONE_COLUMN);
            String officeFax = getCellValue(row, RMREG_SHEET_OFFICE_FAX_COLUMN);
            String headOfficeLoc = getCellValue(row, RMREG_SHEET_HEAD_OFFICE_LOC_COLUMN);
            String subOLoc = getCellValue(row, RMREG_SHEET_SUB_OFFICE_LOC_COLUMN);
            System.out.println("Filling Office Address: City - " + city + ", State - " + state);

            RMRegistrationForm rm = new RMRegistrationForm(driver);
            rm.toFillSpocForCorpForm(spocName, emailId, mobNo, altMob);
            rm.toFillCompensationAndBenefitsForm(name, email, mob, alternateMob);
            rm.toFillEntityNumber(gstNumber, cinNumber);
            rm.toFillHeadHrDetails(hrName, hrEmail, hrMob, hrAltMob);
            rm.toFillHeadOfficeAddress(pin, block, premise, area, state, city, officeMob, officePhone, officeFax, headOfficeLoc, subOLoc);
        }

        System.out.println("Completed filling Registration Form.");
    }
    
    public void enterEmployeeDetails() throws InterruptedException, EncryptedDocumentException, IOException {
        System.out.println("Entering Employee Details for Corporate Registration.");
        FLib f = new FLib();
        Iterator<Row> itr = f.getRowsFromExcelFile(EXCEL_PATH, RMEmpDetailsSheet);

        while (itr.hasNext()) {
            Row row = itr.next();

            if (row.getRowNum() == 0) {
                System.out.println("Skipping header row in sheet.");
                continue;
            }

            // Extract data
            String empCount = getCellValue(row, EMP_DETAIL_SHEET_EMPCOUNT_COLUMN);
            String empForNps = getCellValue(row, EMP_DETAIL_SHEET_NPS_COLUMN);
            String newEmpCount = getCellValue(row, EMP_SHEET_NEWCOUNT_COLUMN);
            String tenLakhCount = getCellValue(row, EMP_SHEET_ABOVETEN_COLUMN);
            String benefits = getCellValue(row, EMP_SHEET_BENEFITS_COLUMN);

            RMRegEmployeeDetailsForm ed = new RMRegEmployeeDetailsForm(driver);
            ed.toFillEmployeeDetails(empCount, empForNps, newEmpCount, tenLakhCount, benefits);
        }

        System.out.println("Completed employee details.");
    }
    
    public void enterBankDetails() throws InterruptedException, EncryptedDocumentException, IOException {
        System.out.println("Entering Bank Details for Corporate Registration.");
        FLib f = new FLib();
        Iterator<Row> itr = f.getRowsFromExcelFile(EXCEL_PATH, RMBankDetailsSheet);

        while (itr.hasNext()) {
            Row row = itr.next();

            if (row.getRowNum() == 0) {
                continue;
            }

            // Extract data
            String accNo = getCellValue(row, BANK_DETAIL_SHEET_ACC_COLUMN);
            String ifscNo = getCellValue(row, BANK_DETAIL_SHEET_IFSC_COLUMN);
            String bankName = getCellValue(row, BANK_DETAIL_SHEET_BANK_COLUMN);

            RMBankDetailsForm ed = new RMBankDetailsForm(driver);
            ed.toFillBankDetails(accNo, ifscNo, bankName);
        }

        System.out.println("Completed Bank details.");
    }
    
    public void enterNodalOfficersDetails() throws InterruptedException, EncryptedDocumentException, IOException {
        System.out.println("Entering Nodal Officers Details for Corporate Registration.");
        FLib f = new FLib();
        Iterator<Row> itr = f.getRowsFromExcelFile(EXCEL_PATH, RMNodalOfficerDetailsSheet);

        while (itr.hasNext()) {
            Row row = itr.next();

            if (row.getRowNum() == 0) {
                continue;
            }

            //Nodal Officer Details
            String designation = getCellValue(row, NODAL_OFFICER_DESIGNATION_COLUMN);
            String pNo = getCellValue(row, NODAL_OFFICER_PHONE_COLUMN);
            
            //Alternate Officer Details
            String fName  = getCellValue(row, NODAL_OFFICER_FNAME_COLUMN);
            String mName = getCellValue(row, NODAL_OFFICER_MNAME_COLUMN);
            String lName = getCellValue(row, NODAL_OFFICER_LNAME_COLUMN);
            String altDesig = getCellValue(row, NODAL_OFFICER_ALT_DESIGNATION_COLUMN);
            String phoneNo = getCellValue(row, NODAL_OFFICER_ALTPHONE_COLUMN);
            String mobNo = getCellValue(row, NODAL_OFFICER_ALTMOB_COLUMN);
            String email = getCellValue(row, NODAL_OFFICER_ALTEMAIL_COLUMN);

            NodalOfficerDetailsForm nd = new NodalOfficerDetailsForm(driver);
            nd.toEnterNodalOfficerDetails(designation, pNo);
            nd.toEnterAltNodalOfficerDetails(fName, mName, lName, altDesig, phoneNo, mobNo, email);
        }	

        System.out.println("Completed Nodal Officer details.");
    }
    
    public void enterNPSRegistrationDetails() throws InterruptedException, EncryptedDocumentException, IOException {
        System.out.println("Entering NPS Registration.");
        FLib f = new FLib();
        Iterator<Row> itr = f.getRowsFromExcelFile(EXCEL_PATH, NPSRegWindowDetailsSheet);

        while (itr.hasNext()) {
            Row row = itr.next();

            if (row.getRowNum() == 0) {
                continue;
            }

            // Extract data
            String retAge = getCellValue(row, NPS_RETIREMENT_DATE_COLUMN);
            String sla = getCellValue(row, NPS_SLA_COLUMN);

            NPSRegistrationWindow rw = new NPSRegistrationWindow(driver);
            rw.toFillNPSEnrollmentWindow(retAge, sla);
        }

        System.out.println("Completed NPS Registration form.");
    }
    
    public void enterSchemePreferences() throws InterruptedException, EncryptedDocumentException, IOException {
        FLib f = new FLib();
        Iterator<Row> itr = f.getRowsFromExcelFile(EXCEL_PATH, SchemePreferencesSheet);

        while (itr.hasNext()) {
            Row row = itr.next();

            if (row.getRowNum() == 0) {
                continue;
            }

            // Extract data
            String accCharges = getCellValue(row, ACC_OPENING_CHARGES_COLUMN);
            String contriCharges = getCellValue(row, CONTRI_CHARGES_COLUMN);
            String nonFinTrans = getCellValue(row, NON_FIN_TRANSACTION_COLUMN);
            String superContriCharges = getCellValue(row, SUPER_ANNU_CONTRI_CHARGES_COLUMN);

            SchemePreference sp = new SchemePreference(driver);
            sp.toFillSchemePrefForm(accCharges, contriCharges, nonFinTrans, superContriCharges);
        }

        System.out.println("Completed Scheme Preferences form.");
    }
    
    public void enterSigningDetails() throws InterruptedException, EncryptedDocumentException, IOException {
        FLib f = new FLib();
        Iterator<Row> itr = f.getRowsFromExcelFile(EXCEL_PATH, RMSigningDetailsSheet);

        while (itr.hasNext()) {
            Row row = itr.next();

            if (row.getRowNum() == 0) {
                continue;
            }

            // Extract data
            String corpAuName = getCellValue(row, CORP_AUTH_NAME_COLUMN);
            String corpAuPlace = getCellValue(row, CORP_AUTH_PLACE_COLUMN);
            String corpAuDesig = getCellValue(row, CORP_AUTH_DESIGNATION_COLUMN);
            String corpAuDept = getCellValue(row, CORP_AUTH_DEPARTMENT_COLUMN);
            String hdfcAuName = getCellValue(row, HDFC_AUTH_NAME_COLUMN);
            String hdfcAuPlace = getCellValue(row, HDFC_AUTH_PLACE_COLUMN);
            String hdfcAuDesig = getCellValue(row, HDFC_AUTH_DESIGNATION_COLUMN);
            String hdfcAuDept = getCellValue(row, HDFC_AUTH_DEPARTMENT_COLUMN);

            RMSigningForm sign = new RMSigningForm(driver);
            sign.toFillSigningForm(corpAuName, corpAuPlace, corpAuDesig, corpAuDept, hdfcAuName, hdfcAuPlace, hdfcAuDesig, hdfcAuDept);
        }

        System.out.println("Completed Scheme Preferences form.");
    }

    private String getCellValue(Row row, int cellIndex) {
        Cell cell = row.getCell(cellIndex);
        if (cell == null) {
            return "";
        }
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }
}
