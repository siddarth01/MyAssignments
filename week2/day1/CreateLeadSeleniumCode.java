package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadSeleniumCode {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		//Login Page
		WebElement ElementUserName = driver.findElement(By.id("username"));
		ElementUserName.sendKeys("Demosalesmanager");
		
		WebElement ElementPassword = driver.findElement(By.id("password"));
		ElementPassword.sendKeys("crmsfa");
		
		WebElement ElementLogin = driver.findElement(By.className("decorativeSubmit"));
		ElementLogin.click();
		
		WebElement ElementCRMSFALink = driver.findElement(By.linkText("CRM/SFA"));
		ElementCRMSFALink.click();
		
		//Click Lead Tab
		WebElement ElementLeadTabLink = driver.findElement(By.linkText("Leads"));
		ElementLeadTabLink.click();
		
		//Create Lead Link
		WebElement ElementCreateLeadLink = driver.findElement(By.linkText("Create Lead"));
		ElementCreateLeadLink.click();
		
		WebElement ElementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		ElementCompanyName.sendKeys("TestLeafChennai");
		
		WebElement ElementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		ElementFirstName.sendKeys("Jaya");
		
		WebElement ElementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		ElementLastName.sendKeys("Siddarth");
		
		WebElement ElementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		ElementFirstNameLocal.sendKeys("Jaya");
		
		WebElement ElementDepartmentName=driver.findElement(By.id("createLeadForm_departmentName"));
		ElementDepartmentName.sendKeys("IT");
		
		WebElement ElementDescription=driver.findElement(By.id("createLeadForm_description"));
		ElementDescription.sendKeys("24 Hours Service");
		
		WebElement elementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmail.sendKeys("Jaya@tl.org");
		
		WebElement elementCreateLeadClick = driver.findElement(By.className("smallSubmit"));
		elementCreateLeadClick.click();
		
		String Title = driver.getTitle();
		System.out.println("The title of the web page is " +Title);
		
		
		
	}
}
