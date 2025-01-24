package com.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.genericLibrary.BaseTest;
import com.genericLibrary.FLib;
import com.pomPage.LandingPage;
import com.pomPage.Login;
import com.pomPage.ManagementPage;
import com.pomPage.UserManagement;

public class UserManagementTab extends BaseTest {
	
	@Test(description = "Verifying user management and Add New User tab")
	
	public void ClickUserManagement() throws EncryptedDocumentException, IOException, InterruptedException {
		FLib f = new FLib();
		String username = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 0);
		String password = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 1);
		
		Login lp = new Login(driver);
		lp.validLoginToHPMC(username, password);
		
		LandingPage lpm = new LandingPage(driver);
		lpm.toAccessManagement();
		
		ManagementPage mp = new ManagementPage(driver);
		mp.toAccessUserManagement();
		
		UserManagement um = new UserManagement(driver);
		um.toOpenAddNewUserForm();
	}

}

