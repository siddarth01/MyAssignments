package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificConfig;

//Extend ProjectSpecificConfig
public class ViewLeadPage extends ProjectSpecificConfig {

	// Should have constructor
	public ViewLeadPage(RemoteWebDriver receiveddriver) {
		this.driver = receiveddriver;
	}

	public void printLeadID() {

	}

	public EditLeadPage clickEditButton() {

		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		return new EditLeadPage(driver);
	}

	public MyLeadsPage clickDeleteButton() {

		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		return new MyLeadsPage(driver);
	}
	
	public FindLeads clickFindLeadButton() {
		
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeads(driver);
	}
	
	
}
