package com.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.genericLibrary.BaseTest;
import com.genericLibrary.FLib;
import com.pomPage.AddUserForm;
import com.pomPage.LandingPage;
import com.pomPage.Login;
import com.pomPage.ManagementPage;
import com.pomPage.UserManagement;

public class AddNewUser extends BaseTest { 
//	String email = "sonam"+WorkLib.getRandomNumber()+"@gmail.com";
//	String eCode = "A001"+WorkLib.getRandomNumber()+"1";
//	String contactNo = "9090905"+WorkLib.getRandomNumber();
	
	@Test(description = "Verifying add new user form by adding a user")

	public void AddUser() throws EncryptedDocumentException, IOException, InterruptedException{
		
		//fetching data from Excel
		 FLib f = new FLib();
		 String username = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 0);
		 String password = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 1);
			
		 //performing login
		 Login lp = new Login(driver);
		 lp.validLoginToHPMC(username, password);
			
		 //click on Management from Landing page
		 LandingPage lpm = new LandingPage(driver);
		 lpm.toAccessManagement();
			
		 //click on User Management from Management page
		 ManagementPage mp = new ManagementPage(driver);
		 mp.toAccessUserManagement();
		 
		//enter required field on Add User Form
		 String un = f.getDataFromExcelFile(EXCEL_PATH, AddNewUserSheet1, 1, 0);
		 String email = f.getDataFromExcelFile(EXCEL_PATH, AddNewUserSheet1, 1, 1);
		 String contactNo = f.getDataFromExcelFile(EXCEL_PATH, AddNewUserSheet1, 1, 3);
		 String eCode = f.getDataFromExcelFile(EXCEL_PATH, AddNewUserSheet1, 1, 4);
		 String pwd = f.getDataFromExcelFile(EXCEL_PATH, AddNewUserSheet1, 1, 5);
		 String confirmPwd = f.getDataFromExcelFile(EXCEL_PATH, AddNewUserSheet1, 1, 6);
		
		 //click on Add New User
		 UserManagement um = new UserManagement(driver);
		 um.toOpenAddNewUserForm();
		 
		 AddUserForm adf = new AddUserForm(driver);
		 adf.toAddNewUser(un, email, contactNo, eCode, pwd, confirmPwd);
		 
	}

//	public void addAllUsers () throws EncryptedDocumentException, IOException {
//		 FLib f = new FLib();
//		 Iterator<Row> itr = f.getRowsFromExcelFile(EXCEL_PATH, AddNewUserSheet);
//		 while(itr.hasNext()) {
//			 Row row = itr.next();
//			 String name = row.getCell(USER_SHEET_NAME_COLUMN).getStringCellValue();
//		 }
//	}

}