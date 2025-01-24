package com.testScripts;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;

import com.genericLibrary.BaseTest;
import com.genericLibrary.FLib;
import com.pomPage.PranContactDetailsPage;
import com.pomPage.PranRegistrationPage;

public class PranRegistration extends BaseTest {

    @Test(description = "Verifying Pran Registration Journey")
    public void pranRegistration() throws InterruptedException, EncryptedDocumentException, IOException {
        System.out.println("Starting PRAN Registration Journey");

        // Open the application
        navigateToApplication();

        // Perform PRAN registration steps
        performPranRegistration();

        // Fill contact details
        fillContactDetails();

        System.out.println("PRAN Registration Journey completed successfully.");
    }

    private void navigateToApplication() throws InterruptedException {
    	// Applying implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Opening the application URL");
        driver.get("http://localhost/hpmc-ui/subscriber?corporateId=NTc4&corpName=Pcriss");
        Thread.sleep(2000);
    }

    private void performPranRegistration() throws EncryptedDocumentException, IOException, InterruptedException {
        System.out.println("Clicking on 'Start Your Journey' button");
        PranRegistrationPage pr = new PranRegistrationPage(driver);
        pr.toAccessStartYourJourneyButton();

        System.out.println("Loading Pran registration data from Excel file");
        FLib f = new FLib();
        Iterator<Row> rowIterator = f.getRowsFromExcelFile(EXCEL_PATH, PranJourneySheet);

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            if (row.getRowNum() == 0) {
                System.out.println("Skipping header row");
                continue;
            }

            String pan = getCellValue(row.getCell(PRAN_SHEET_PAN_COLUMN));
            String dob = getCellValue(row.getCell(PRAN_SHEET_DOB_COUMN));

            if (pan == null || dob == null) {
                System.out.println("Skipping row due to missing data: PAN or DOB is null");
                continue;
            }

            System.out.println("Processing row: PAN = " + pan + ", DOB = " + dob);
            pr.toPassDataWithNps(pan, dob);
        }
    }

    private void fillContactDetails() throws EncryptedDocumentException, IOException, InterruptedException {
        System.out.println("Loading contact details from Excel file");
        FLib f = new FLib();
        Iterator<Row> rowIterator = f.getRowsFromExcelFile(EXCEL_PATH, ContactDetailsSheet);

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            if (row.getRowNum() == 0) {
                System.out.println("Skipping header row");
                continue;
            }

            String mob = getCellValue(row.getCell(CONTACT_SHEET_MOBILE_COLUMN));
            String email = getCellValue(row.getCell(CONTACT_SHEET_EMAIL_COLUMN));

            if (mob == null || email == null) {
                System.out.println("Skipping row due to missing data: MOB or EMAIL is null");
                continue;
            }

            System.out.println("Processing row: MOB = " + mob + ", EMAIL = " + email);
            PranContactDetailsPage cd = new PranContactDetailsPage(driver);
            cd.toFillContactDetails(mob, email);
        }
    }

    private String getCellValue(Cell cell) {
        if (cell == null) {
            return null;
        }
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf((long) cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            default:
                return null;
        }
    }
}
