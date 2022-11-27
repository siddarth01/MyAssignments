package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificConfig;

//Extend ProjectSpecificConfig
public class LoginPage extends ProjectSpecificConfig {

	// Should have constructor
	public LoginPage(RemoteWebDriver receiveddriver) {

		this.driver=receiveddriver;
	}

	public LoginPage enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		// return new LoginPage();
		return this;// Alternative way
	}

	public LoginPage enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		// return new LoginPage();
		return this;// Alternative way
	}

	public WelcomePage clickLoginButton_Positive() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
	
	public LoginPage clickLoginButton_Negative() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;//
	}
}
