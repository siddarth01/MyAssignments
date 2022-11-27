package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificConfig;

//Extend ProjectSpecificConfig
public class WelcomePage extends ProjectSpecificConfig {

	// Should have constructor
	public WelcomePage(RemoteWebDriver receiveddriver) {
		this.driver=receiveddriver;
	}

	public HomePage clickCRMSSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage(driver);
	}

	public LoginPage clickLogout() {
		
			driver.findElement(By.className("decorativeSubmit")).click();
			return new LoginPage(driver);
	}
}
