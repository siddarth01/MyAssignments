package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificConfig;

//Extend ProjectSpecificConfig
public class CreateLeadPage extends ProjectSpecificConfig {

	// Should have constructor
	public CreateLeadPage(RemoteWebDriver receiveddriver) {
		this.driver=receiveddriver;
	}
	
	//return same class type
	public CreateLeadPage enterFirstName(String fname ) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(fname);
		//navigate back to same page
		return this;
	}

	public CreateLeadPage enterLastName(String lname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(lname);
		return this;
	}

	public CreateLeadPage enterCompanyName(String cname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(cname);
		return this;
	}

	public ViewLeadPage clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
