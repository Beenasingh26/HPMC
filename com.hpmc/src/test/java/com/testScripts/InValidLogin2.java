package com.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.genericLibrary.BaseTest;
import com.genericLibrary.FLib;
import com.pomPage.Login;

public class InValidLogin2 extends BaseTest {

	@Test(description = "Verifying login with Invalid Credentials")
	
	public void InVLogin() throws EncryptedDocumentException, IOException, InterruptedException {
		FLib f = new FLib();
		String username = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet1, 1, 0);
		String password = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet1, 1, 1);
		
		Login lp = new Login(driver);
		lp.inValidLoginToHPMC(username, password);
	}
}
