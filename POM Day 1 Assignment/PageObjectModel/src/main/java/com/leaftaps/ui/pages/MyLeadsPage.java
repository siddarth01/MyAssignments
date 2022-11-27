package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificConfig;

//Extend ProjectSpecificConfig
public class MyLeadsPage extends ProjectSpecificConfig {

	//Should have constructor
	public MyLeadsPage(RemoteWebDriver receiveddriver) {
		
		this.driver=receiveddriver;
	}
	
	public CreateLeadPage clickCreateLead() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	
	public ViewLeadPage clickFirstResultingLead() {
		
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/following::a")).click();
		return new ViewLeadPage(driver);
	}
	
	public MergeLead clickMergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLead(driver);
		
	}
}
