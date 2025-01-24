package com.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.genericLibrary.BaseTest;
import com.genericLibrary.FLib;
import com.pomPage.Login;

public class InValidLogin extends BaseTest {
	
	@Test(description = "Verifying invalid login..")
	public void ILogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FLib f=new FLib();
		String username = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 0);
		String password = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 1);
		
		//to access login page business logic
		Login lp=new Login(driver);
		lp.validLoginToHPMC(username, password);
		
	}
}
