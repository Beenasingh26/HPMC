package com.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.genericLibrary.BaseTest;
import com.genericLibrary.FLib;
import com.genericLibrary.WorkLib;
import com.pomPage.AddUserForm;
import com.pomPage.LandingPage;
import com.pomPage.Login;
import com.pomPage.ManagementPage;
import com.pomPage.UserManagement;

public class AddMultipleUser extends BaseTest { 
//    String email = "siya" + WorkLib.getRandomNumber() + "@gmail.com";
//    String eCode = "A023" + WorkLib.getRandomNumber() + "9";
//    String contactNo = "9090905" + WorkLib.getRandomNumber();

    @Test(description = "Verifying add new user form by adding multiple user with same name")
    public void AddUser() throws EncryptedDocumentException, IOException, InterruptedException {

        // fetching data from Excel
        FLib f = new FLib();
        String username = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 0);
        String password = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 1);

        // performing login
        Login lp = new Login(driver);
        lp.validLoginToHPMC(username, password);

        // click on Management from Landing page
        LandingPage lpm = new LandingPage(driver);
        lpm.toAccessManagement();

        // click on User Management from Management page
        ManagementPage mp = new ManagementPage(driver);
        mp.toAccessUserManagement();

        // enter required field on Add User Form
        String un = f.getDataFromExcelFile(EXCEL_PATH, AddNewUserSheet, 1, 0);
        String pwd = f.getDataFromExcelFile(EXCEL_PATH, AddNewUserSheet, 1, 5);
        String confirmPwd = f.getDataFromExcelFile(EXCEL_PATH, AddNewUserSheet, 1, 6);

        UserManagement um = new UserManagement(driver);

        // Loop through 5 iterations
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Iteration: " + i);
            
            String email = "siya" + WorkLib.getRandomNumber() + "@gmail.com";
            String eCode = "G" + WorkLib.getRandomNumber();
            String contactNo = "8009543" + WorkLib.getRandomNumber();

            // Get the current URL once
            String currentUrl = driver.getCurrentUrl();
            System.out.println("Current URL before checking: " + currentUrl);

            // Only proceed with adding a new user if the URL is not the restricted one
            if (!currentUrl.equals("http://localhost/hpmc-ui/admin/userManagementDashboard/createUser")) {
                // Open the Add New User form
                um.toOpenAddNewUserForm();
            } else {

                System.out.println("Current URL is restricted. Skipping 'Add New User' action.");
                continue; 
            }

            // Initialize the AddUserForm class and call the method to add a new user
            AddUserForm adf = new AddUserForm(driver);
            adf.toAddNewUser(un, email, contactNo, eCode, pwd, confirmPwd);
            Thread.sleep(6000);

            currentUrl = driver.getCurrentUrl();
            System.out.println("Current URL after adding user: " + currentUrl);
        }
    }
}
