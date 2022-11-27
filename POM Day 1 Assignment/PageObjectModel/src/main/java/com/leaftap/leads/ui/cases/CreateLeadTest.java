package com.leaftap.leads.ui.cases;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.base.ProjectSpecificConfig;
import com.leaftaps.ui.pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificConfig {

	@BeforeTest
	public void setData() {

		excelFileName = "tc001";
	}

	@Test(dataProvider = "testData")
	public void createLead(String username, String password, String cname, String fname, String lname) {

		LoginPage pg = new LoginPage(driver);
		pg.enterUserName(username)
		.enterPassword(password)
		.clickLoginButton_Positive()
		.clickCRMSSFA()
		.clickLeads()
		.clickCreateLead()
		.enterFirstName(fname)
		.enterLastName(lname)
		.enterCompanyName(cname)
		.clickSubmit();

	}
}
