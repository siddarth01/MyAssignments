package com.leaftap.leads.ui.cases;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificConfig;
import com.leaftaps.ui.pages.EditLeadPage;
import com.leaftaps.ui.pages.LoginPage;

public class EditLeadTest extends ProjectSpecificConfig {

	@BeforeTest
	public void setData() {

		excelFileName = "tc001";
	}
	
	@Test(dataProvider = "testData")
	public void editLead(String username, String password, String cname, String fname, String lname) {
		
		LoginPage pg = new LoginPage(driver);
		pg.enterUserName(username)
		.enterPassword(password)
		.clickLoginButton_Positive()
		.clickCRMSSFA()
		.clickLeads()
		.clickFirstResultingLead()
		.clickEditButton()
		.editCompany(cname)
		.clickUpdate();
	}
	
	
}
