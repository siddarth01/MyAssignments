package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificConfig;

public class FindLeads extends ProjectSpecificConfig {

	public FindLeads(RemoteWebDriver receiveddriver) {
		this.driver = receiveddriver;
	}
	
	public FindLeads enterLeadId(String fromLeadID) {
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(fromLeadID);
		return this;
	}
	
	public FindLeads findLead() {
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	public FindLeads checkIfLeadIsDeleted() {
		
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		
		return this;
	}
	
	
}
