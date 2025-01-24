package com.testScripts;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;

import com.genericLibrary.BaseTest;
import com.genericLibrary.FLib;
import com.pomPage.AddUserForm;
import com.pomPage.LandingPage;
import com.pomPage.Login;
import com.pomPage.ManagementPage;
import com.pomPage.UserManagement;

public class AddAllUserFromExcel extends BaseTest { 

    // Test case for adding a new user
    @Test(description = "Verifying add new user form by adding multiple user simultaneously")
    public void AddUser() throws EncryptedDocumentException, IOException, InterruptedException {
        
        // Fetching data from Excel for login
        FLib f = new FLib();
        String username = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 0);
        String password = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 1);
        
        // Performing login
        Login lp = new Login(driver);
        lp.validLoginToHPMC(username, password);
        
        // Click on Management from Landing page
        LandingPage lpm = new LandingPage(driver);
        lpm.toAccessManagement();
        
        // Click on User Management from Management page
        ManagementPage mp = new ManagementPage(driver);
        mp.toAccessUserManagement();
        
        
        // Add all users from the Excel sheet
        addAllUsers();
    }

    // Method to add all users from Excel
    public void addAllUsers() throws EncryptedDocumentException, IOException, InterruptedException {
        FLib f = new FLib();
        Iterator<Row> itr = f.getRowsFromExcelFile(EXCEL_PATH, AddNewUserSheet);
        
        while (itr.hasNext()) {
            Row row = itr.next();
            
         // Skip the header row if needed
            if (row.getRowNum() == 0) {
                continue;
            }
            
            // Extract user details from the Excel row
            String name = row.getCell(USER_SHEET_NAME_COLUMN).getStringCellValue();
            String email = row.getCell(USER_SHEET_EMAIL_COLUMN).getStringCellValue();
            String contactNo = row.getCell(USER_SHEET_CONTACT_COLUMN).getStringCellValue();
            String eCode = row.getCell(USER_SHEET_ECODE_COLUMN).getStringCellValue();
            String pwd = row.getCell(USER_SHEET_PASSWORD_COLUMN).getStringCellValue();
            String confirmPwd = row.getCell(USER_SHEET_CONFIRM_PASSWORD_COLUMN).getStringCellValue();
            
         // Click on Add New User
            UserManagement um = new UserManagement(driver);
            um.toOpenAddNewUserForm();
            
            // Instantiate the AddUserForm page object
            AddUserForm adf = new AddUserForm(driver);
            
            // Fill in the form using the toAddNewUser method
            adf.toAddNewUser(name, email, contactNo, eCode, pwd, confirmPwd);
            
            // Optional: Add some wait here if the form takes time to process
            Thread.sleep(5000);
           
        }
    }
}

