package com.leaftaps.ui.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.leaftaps.ui.base.ProjectSpecificConfig;

public class MergeLead extends ProjectSpecificConfig {

	public MergeLead(RemoteWebDriver receiveddriver) {
		// TODO Auto-generated constructor stub
		this.driver = receiveddriver;
	}
	
	public FindLeadPopPage clickFromLeadLookup() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return new  FindLeadPopPage(driver);
		
	}
	
	public FindLeadPopPage clickToLeadLookup(){
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return new FindLeadPopPage(driver) ;
	
	}
	
	public ViewLeadPage clickMergeLead() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		return new ViewLeadPage(driver);
	}

}
