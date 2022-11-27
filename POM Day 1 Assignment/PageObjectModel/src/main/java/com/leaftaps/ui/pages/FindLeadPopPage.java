package com.leaftaps.ui.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificConfig;

public class FindLeadPopPage extends ProjectSpecificConfig {

	public FindLeadPopPage(RemoteWebDriver receiveddriver) {
		// TODO Auto-generated constructor stub

		this.driver = receiveddriver;
	}

	public FindLeadPopPage enterFirstName(String fname) {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);

		return this;

	}
	
	
	public FindLeadPopPage clickFindLeads() {
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
		
		
	}
	
	
	public String firstResultingLead() {
		
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		
		return leadID;
	}
	
	
	
	
	public MergeLead clickResultingLead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(0));
		return new MergeLead(driver);
		
		
	}
	
	
	
	
	
	

}
