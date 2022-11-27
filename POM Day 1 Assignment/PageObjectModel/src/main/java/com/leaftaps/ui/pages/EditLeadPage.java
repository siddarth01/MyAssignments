package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.ui.base.ProjectSpecificConfig;

public class EditLeadPage extends ProjectSpecificConfig {

	public EditLeadPage(RemoteWebDriver receiveddriver) {
		this.driver = receiveddriver;
	}

	public EditLeadPage editCompany(String cname) {

		WebElement editCompany = driver.findElement(By.id("updateLeadForm_companyName"));
		editCompany.clear();
		editCompany.sendKeys(cname);
		return this;
	}

	public MyLeadsPage clickUpdate() {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		return new MyLeadsPage(driver);
	}
}
