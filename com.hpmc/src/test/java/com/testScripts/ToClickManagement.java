package com.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.genericLibrary.BaseTest;
import com.genericLibrary.FLib;
import com.pomPage.LandingPage;
import com.pomPage.Login;

public class ToClickManagement extends BaseTest {
	
	@Test(description = "Verifying management icon")
	
	public void ClickManagement() throws InterruptedException, EncryptedDocumentException, IOException {
		FLib f = new FLib();
		String username = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 0);
		String password = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 1);
		
		Login lp = new Login(driver);
		lp.inValidLoginToHPMC(username, password);
		
		LandingPage lpm = new LandingPage(driver);
		lpm.toAccessManagement();
	}

}
