package com.testScripts;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;

import com.genericLibrary.BaseTest;
import com.genericLibrary.FLib;
import com.pomPage.CorporateOnboardingPage;
import com.pomPage.LandingPage;
import com.pomPage.Login;
import com.pomPage.RegNewCorpWithStandardChargesForm;

public class RegCorpWithStandardCharges extends BaseTest {

    @Test(description = "Verifying register new corporate form by adding multiple corporate with standard charges simultaneously")
    public void registerCorporate() throws EncryptedDocumentException, IOException, InterruptedException {
        FLib f = new FLib();
        
        // Fetching data from Excel for login
        String username = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 0);
        String password = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 1);

        System.out.println("Fetched login details from Excel");

        // Performing login
        Login lp = new Login(driver);
        lp.validLoginToHPMC(username, password);
        System.out.println("Logged in successfully with username: " + username);

        // Access Corporate Journey
        LandingPage pg = new LandingPage(driver);
        pg.toAccessCorpJourney();
        System.out.println("Navigated to Corporate Journey");

        // Navigate to Corporate Onboarding Pages
        CorporateOnboardingPage cop = new CorporateOnboardingPage(driver);
        cop.toClickRegisterNewCorporate();
        System.out.println("Clicked on Register New Corporate");

//        // Interact with Register New Corporate form
//        RegNewCorpWithStandardChargesForm ncf = new RegNewCorpWithStandardChargesForm(driver);
//        ncf.toClickCorpRadioButton();
//        System.out.println("Clicked on Corporate radio button");

        // Register all corporate users from the Excel sheet
        regCorpWithStandardCharges();
    }

    private void regCorpWithStandardCharges() throws EncryptedDocumentException, IOException, InterruptedException {
        FLib f = new FLib();
        
        // Fetching iterator for rows in the Excel sheet (Corporate Register Data)
        Iterator<Row> itr = f.getRowsFromExcelFile(EXCEL_PATH, CorporateRegisterSheet);

        while (itr.hasNext()) {
            Row row = itr.next();

            // Skip the header row if needed
            if (row.getRowNum() == 0) {
                System.out.println("Skipping header row");
                continue;
            }
            
            // Extract user details from the Excel row
            String panNo = row.getCell(CORP_SHEET_PAN_COLUMN).getStringCellValue();
            String corpName = row.getCell(CORP_SHEET_CORPNAME_COLUMN).getStringCellValue();
            String fn = row.getCell(CORP_SHEET_FN_COLUMN).getStringCellValue();
            String ln = row.getCell(CORP_SHEET_LN_COLUMN).getStringCellValue();
            String email = row.getCell(CORP_SHEET_EMAIL_COLUMN).getStringCellValue();
            String mobNo = row.getCell(CORP_SHEET_MOB_COLUMN).getStringCellValue();

            System.out.println("Registering corporate: " + corpName);

            RegNewCorpWithStandardChargesForm ncf = new RegNewCorpWithStandardChargesForm(driver);
//            ncf.toClickCorpRadioButton();
            boolean result = ncf.toRegCorpWithStandardCharges(panNo, corpName, fn, ln, email, mobNo);
            if(!result) {
            	System.out.println("Duplicate Pan found");
            	continue;
            }

            System.out.println("Successfully registered corporate: " + corpName);
            
            // Navigate to Corporate Onboarding Pages
            CorporateOnboardingPage cop = new CorporateOnboardingPage(driver);
            cop.toClickRegisterNewCorporate();
        }
    }
}
