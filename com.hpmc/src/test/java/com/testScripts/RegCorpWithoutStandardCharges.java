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
import com.pomPage.RegNewCorpWithoutStandardChargesPage;

public class RegCorpWithoutStandardCharges extends BaseTest {

    // Test case for registering new corporates
    @Test(description = "Verifying register new corporate form by adding multiple corporate without standard charges simultaneously")
    public void regCorporate() throws EncryptedDocumentException, IOException, InterruptedException {
        
        // Logging the start of the test case
        System.out.println("Starting the regCorp test case.");

        // Fetching data from Excel for login
        FLib f = new FLib();
        String username = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 0);
        String password = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 1);
        
        // Logging the fetched credentials
        System.out.println("Fetched username: " + username);
        System.out.println("Fetched password: " + password);

        // Performing login
        Login lp = new Login(driver);
        lp.validLoginToHPMC(username, password);
        
        // Logging the login status
        System.out.println("Logged in successfully.");

        // Click on Corporate Journey
        LandingPage lpg = new LandingPage(driver);
        lpg.toAccessCorpJourney();
        
        // Logging the navigation to Corporate Journey
        System.out.println("Navigated to Corporate Journey.");

        // Click on Register New Corporate
        CorporateOnboardingPage cpg = new CorporateOnboardingPage(driver);
        cpg.toClickRegisterNewCorporate();
        
        // Logging the click action on Register New Corporate
        System.out.println("Clicked on Register New Corporate.");

        // Select Corporate (Nodal Officer) radio button
        RegNewCorpWithoutStandardChargesPage rwsc = new RegNewCorpWithoutStandardChargesPage(driver);
        rwsc.toClickCorpRadioButton();
        
        // Logging the selection of the Corporate (Nodal Officer) radio button
        System.out.println("Selected Corporate (Nodal Officer) radio button.");

        // Add all corporate from the Excel sheet
        registerAllCorporates();
        
    }

    // Method to add all users from Excel
    private void registerAllCorporates() throws EncryptedDocumentException, IOException, InterruptedException {
        

        FLib f = new FLib();
        Iterator<Row> rowIterator = f.getRowsFromExcelFile(EXCEL_PATH, CorporateRegisterSheet);

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            // Skip the header row if needed
            if (row.getRowNum() == 0) {
                continue;
            }

            // Extract user details from the Excel row
            String panNo = getCellValue(row, CORP_SHEET_PAN_COLUMN);
            String corpName = getCellValue(row, CORP_SHEET_CORPNAME_COLUMN);
            String firstName = getCellValue(row, CORP_SHEET_FN_COLUMN);
            String lastName = getCellValue(row, CORP_SHEET_LN_COLUMN);
            String email = getCellValue(row, CORP_SHEET_EMAIL_COLUMN);
            String mobileNo = getCellValue(row, CORP_SHEET_MOB_COLUMN);
            String aoc = getCellValue(row, CORP_SHEET_AOC_COLUMN);
            String nft = getCellValue(row, CORP_SHEET_NFT_COLUMN);
            String sac = getCellValue(row, CORP_SHEET_SAC_COLUMN);

            // Logging the extracted user details
            System.out.println("Registering corporate with details: PAN No: " + panNo + ", Corporate Name: " + corpName + 
                               ", First Name: " + firstName + ", Last Name: " + lastName + ", Email: " + email + 
                               ", Mobile No: " + mobileNo + ", AOC: " + aoc + ", NFT: " + nft + ", SAC: " + sac);

            // Register the corporate without standard charges
            RegNewCorpWithoutStandardChargesPage rwsc = new RegNewCorpWithoutStandardChargesPage(driver);
            rwsc.toRegCorpWithoutStandardCharges(panNo, corpName, firstName, lastName, email, mobileNo, aoc, nft, sac);
            
            // Logging the completion of the registration for each corporate
            System.out.println("Registered corporate: " + corpName);
            
            // Again click on Register New Corporate
            CorporateOnboardingPage cpg = new CorporateOnboardingPage(driver);
            cpg.toClickRegisterNewCorporate();
            
         // Again select Corporate (Nodal Officer) radio button
            RegNewCorpWithoutStandardChargesPage rws = new RegNewCorpWithoutStandardChargesPage(driver);
            rws.toClickCorpRadioButton();
        }

        // Logging the completion of the registration process
        System.out.println("Completed the registration of all corporates.");
    }

    // Helper method to get cell value as String
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
