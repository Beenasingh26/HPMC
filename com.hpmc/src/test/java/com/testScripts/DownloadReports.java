package com.testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.genericLibrary.BaseTest;
import com.genericLibrary.FLib;
import com.pomPage.LandingPage;
import com.pomPage.Login;
import com.pomPage.MISReportsPage;

public class DownloadReports extends BaseTest {
	
	@Test(description="Verifying reports download")
	
	public void DownloadReport() throws EncryptedDocumentException, IOException, InterruptedException {
		
		 // Fetching data from Excel for login
        FLib f = new FLib();
        String username = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 0);
        String password = f.getDataFromExcelFile(EXCEL_PATH, LoginSheet, 1, 1);
        
        // Performing login
        Login lp = new Login(driver);
        lp.validLoginToHPMC(username, password);
        
        //Click on Reports from Landing page
        LandingPage lpm = new LandingPage(driver);
        lpm.toAccessReport();
        
        //Click on Download CSV icon
        MISReportsPage mrp = new MISReportsPage(driver);
        mrp.toDownloadReport();
        
	}

}
