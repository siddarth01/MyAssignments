package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificConfig;

//Extend ProjectSpecificConfig
public class HomePage extends ProjectSpecificConfig {

	//Should have constructor
	public HomePage(RemoteWebDriver receiveddriver) {
		
		this.driver=receiveddriver;
	}
	
	public MyLeadsPage clickLeads() {
		
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
	}
}
