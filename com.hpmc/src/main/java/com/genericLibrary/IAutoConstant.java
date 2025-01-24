package com.genericLibrary;

public interface IAutoConstant {
	//properties path
	String PROP_FILE="./src/test/resources/TestData/commanData.properties";
	
	
	//excel path
	String EXCEL_PATH="./src/test/resources/TestData/HPMCData.xlsx";
//	String EXCEL_PATH2="./src/test/resources/TestData/RMCorpRegistaration.xlsx";
	String LoginSheet="Credentials";
	String LoginSheet1="InvalidCredentials";
	
	
	//Defining column for CorporateRegister Sheet
	String CorporateRegisterSheet="CorporateRegister";
	int CORP_SHEET_PAN_COLUMN = 0;
    int CORP_SHEET_CORPNAME_COLUMN = 1;
    int CORP_SHEET_FN_COLUMN = 2;
    int CORP_SHEET_LN_COLUMN = 3;
    int CORP_SHEET_EMAIL_COLUMN = 4;
    int CORP_SHEET_MOB_COLUMN = 5;
    int CORP_SHEET_AOC_COLUMN = 6;
    int CORP_SHEET_NFT_COLUMN = 7;
    int CORP_SHEET_SAC_COLUMN = 8;
	
  //Defining column for AddNewUser/AddNewUser1 Sheet
	String AddNewUserSheet="AddNewUser";
	String AddNewUserSheet1="AddNewUser1";
	int USER_SHEET_NAME_COLUMN = 0;
	int USER_SHEET_EMAIL_COLUMN = 1;
	int USER_SHEET_CONTACT_COLUMN = 3;
	int USER_SHEET_ECODE_COLUMN = 4;
	int USER_SHEET_PASSWORD_COLUMN = 5;
	int USER_SHEET_CONFIRM_PASSWORD_COLUMN = 6;
	
	//Defining column for PranJourney Sheet
	String PranJourneySheet="PranJourney";
	int PRAN_SHEET_PAN_COLUMN = 0;
	int PRAN_SHEET_DOB_COUMN = 1;
	
	//Defining column for ContactDetails
	String ContactDetailsSheet="ContactDetail";
	int CONTACT_SHEET_MOBILE_COLUMN = 0;
	int CONTACT_SHEET_EMAIL_COLUMN = 1;
	

	//Defining column for Corp Register (RM) Sheet
	String RMBasicDetailsSheet="RMBasicDetails";
	int RM_SHEET_PAN_COLUMN = 0;
	int RM_SHEET_CORPNAME_COLUMN = 1;
		
	
	//Defining column to fill Basic Information (RMBasicInfoSheet)
	String RMBasicInfoSheet = "RMBasicInfo";
	int RMBASIC_SHEET_CONST_COLUMN = 0;
	int RMBASIC_SHEET_SECTOR_COLUMN = 1;
	int RMBASIC_SHEET_CRANAME_COLUMN = 2;
	int RMBASIC_SHEET_GRPENTITY_COLUMN = 3;
	int RMBASIC_SHEET_CORPMAIL_COLUMN = 4;
	
	//Defining column for RM_Registration form
	String RMRegistrationSheet = "RMRegistration";
	int RMREG_SHEET_SPOC_NAME_COLUMN = 0;
	int RMREG_SHEET_EMAIL_COLUMN = 1;
	int RMREG_SHEET_MOBILE_COLUMN = 2;
	int RMREG_SHEET_ALT_MOBILE_COLUMN = 3;
	int RMREG_SHEET_NAME_COLUMN = 4;
	int RMREG_SHEET_MAIL_COLUMN = 5;
	int RMREG_SHEET_MOB_COLUMN = 6;
	int RMREG_SHEET_ALTE_MOBILE_COLUMN = 7;
	int RMREG_SHEET_GST_NUMBER_COLUMN = 8;
	int RMREG_SHEET_CIN_NUMBER_COLUMN = 9;
	int RMREG_SHEET_HR_NAME_COLUMN = 10;
	int RMREG_SHEET_HR_EMAIL_COLUMN = 11;
	int RMREG_SHEET_HR_MOBILE_COLUMN = 12;
	int RMREG_SHEET_HR_ALT_MOBILE_COLUMN = 13;
	int RMREG_SHEET_PIN_COLUMN = 14;
	int RMREG_SHEET_BLOCK_COLUMN = 15;
	int RMREG_SHEET_PREMISE_COLUMN = 16;
	int RMREG_SHEET_AREA_COLUMN = 17;
	int RMREG_SHEET_STATE_COLUMN = 18;
	int RMREG_SHEET_CITY_COLUMN = 19;
	int RMREG_SHEET_OFFICE_MOBILE_COLUMN = 20;
	int RMREG_SHEET_OFFICE_PHONE_COLUMN = 21;
	int RMREG_SHEET_OFFICE_FAX_COLUMN = 22;
	int RMREG_SHEET_HEAD_OFFICE_LOC_COLUMN = 23;
	int RMREG_SHEET_SUB_OFFICE_LOC_COLUMN = 24;
	
	//Defining column for RM_Emp_Details form
	String RMEmpDetailsSheet = "RMEmpDetails";
	int EMP_DETAIL_SHEET_EMPCOUNT_COLUMN = 0;
	int EMP_DETAIL_SHEET_NPS_COLUMN = 1;
	int EMP_SHEET_NEWCOUNT_COLUMN = 2;
	int EMP_SHEET_ABOVETEN_COLUMN = 3;
	int EMP_SHEET_BENEFITS_COLUMN = 4;
	
	//Defining column for RM_Bank_Details form
	String RMBankDetailsSheet = "RMBankDetails";
	int BANK_DETAIL_SHEET_ACC_COLUMN = 0;
	int BANK_DETAIL_SHEET_IFSC_COLUMN = 1;
	int BANK_DETAIL_SHEET_BANK_COLUMN = 2;
	
	//Defining column for RM_Nodal_Officer_Details form
	String RMNodalOfficerDetailsSheet = "RMNodalOfficerDetails";
	int NODAL_OFFICER_DESIGNATION_COLUMN = 0;
	int NODAL_OFFICER_PHONE_COLUMN = 1;
	int NODAL_OFFICER_FNAME_COLUMN = 2;
	int NODAL_OFFICER_MNAME_COLUMN = 3;
	int NODAL_OFFICER_LNAME_COLUMN = 4;
	int NODAL_OFFICER_ALT_DESIGNATION_COLUMN = 5;
	int NODAL_OFFICER_ALTPHONE_COLUMN = 6;
	int NODAL_OFFICER_ALTMOB_COLUMN = 7;
	int NODAL_OFFICER_ALTEMAIL_COLUMN = 8;
	
	//Defining column for NPSRegWindow
	String NPSRegWindowDetailsSheet = "NPSRegWindow";
	int NPS_RETIREMENT_DATE_COLUMN = 0;
	int NPS_SLA_COLUMN = 1;
	
	//Defining columns for Schema Preference
	String SchemePreferencesSheet = "SchemePreferences";
	int ACC_OPENING_CHARGES_COLUMN = 0;
	int CONTRI_CHARGES_COLUMN = 1;
	int NON_FIN_TRANSACTION_COLUMN = 2;
	int SUPER_ANNU_CONTRI_CHARGES_COLUMN = 3;
	
	//Defining columns for Auth Signing Form
	String RMSigningDetailsSheet = "RMSigningDetails";
	int CORP_AUTH_NAME_COLUMN = 0;
	int CORP_AUTH_PLACE_COLUMN = 1;
	int CORP_AUTH_DESIGNATION_COLUMN = 2;
	int CORP_AUTH_DEPARTMENT_COLUMN = 3;
	
	int HDFC_AUTH_NAME_COLUMN = 4;
	int HDFC_AUTH_PLACE_COLUMN = 5;
	int HDFC_AUTH_DESIGNATION_COLUMN = 6;
	int HDFC_AUTH_DEPARTMENT_COLUMN = 7;
	
	}
