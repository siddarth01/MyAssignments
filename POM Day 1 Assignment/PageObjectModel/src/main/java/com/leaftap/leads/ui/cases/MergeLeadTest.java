package com.leaftap.leads.ui.cases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificConfig;
import com.leaftaps.ui.pages.FindLeadPopPage;
import com.leaftaps.ui.pages.LoginPage;

public class MergeLeadTest extends ProjectSpecificConfig {

	@BeforeTest
	public void setData() {

		excelFileName = "TC007";
	}
	
	@Test(dataProvider = "testData")
	public void mergeLead(String username, String password, String f_LeadName, String l_LeadName,  String errorMsg) {
		
		String fromLeadID = 
				new LoginPage(driver)
				.enterUserName(username)
				.enterPassword(password)
				.clickLoginButton_Positive()
				.clickCRMSSFA()
				.clickLeads()
				.clickMergeLead()
				.clickFromLeadLookup()
				.enterFirstName(f_LeadName)
				.clickFindLeads()
				.firstResultingLead();
		
				new FindLeadPopPage(driver)
				.clickResultingLead()
				.clickToLeadLookup()
				.enterFirstName(l_LeadName)
				.clickFindLeads()
				.clickResultingLead()
				.clickMergeLead()
				.clickFindLeadButton()
				.enterLeadId(fromLeadID)
				.findLead();
			
				
		
	}
}
