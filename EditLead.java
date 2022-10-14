package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		// Open the URL

		driver.get("http://leaftaps.com/opentaps/control/main");

		//Maximize the windowz
		driver.manage().window().maximize();
   
		//Implicit Wait for whole upcoming web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Enter Username

		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));

		Username.sendKeys("Demosalesmanager");

		// Enter the password

		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));

		Password.sendKeys("crmsfa");

		// Click Login

		WebElement LoginClick = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));

		LoginClick.click();

		// Click crm/sfa link

		WebElement ClickCRMSFALink = driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));

		ClickCRMSFALink.click();

		// Click Leads link

		WebElement ClickLeadLink = driver.findElement(By.xpath("//a[text()='Leads']"));

		ClickLeadLink.click();

		// Click Find leads

		WebElement FindLeadLink = driver.findElement(By.xpath("//a[text()='Find Leads']"));

		FindLeadLink.click();

		// Enter first name

		WebElement FirstName = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));

		FirstName.sendKeys("Jaya");

		// Click Find leads button

		WebElement FindLeadButton = driver.findElement(By.xpath("//button[text()='Find Leads']"));

		FindLeadButton.click();

		// Click on first resulting lead

		WebElement FindResultingLead = driver.findElement(By.xpath("(//a[text()='Jaya'])[1]"));

		FindResultingLead.click();

		// Verify title of the page

		String title = driver.getTitle();

		String ActualTitle = "View Lead | opentaps CRM";

		if (ActualTitle.equals(title)) {

			System.out.println("The title is verified ");
		} else {

			System.out.println("The title is not verified ");
		}

		// Click Edit

		WebElement EditResultingLead = driver.findElement(By.xpath("//a[text()='Edit']"));

		EditResultingLead.click();

		// Change the company name

		WebElement ChangeCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));

		ChangeCompanyName.clear();

		ChangeCompanyName.sendKeys("TestLeafGlobalIndia");

		// Click Update
		WebElement UpdateCompanyName = driver.findElement(By.xpath("//input[@value='Update']"));

		UpdateCompanyName.click();

		// Confirm the changed name appears

		String ActualCompanyName = "TestLeafGlobalIndia";
        
		//Get the current company name
		String UpdatedCompanyName = driver.findElement(By.xpath("//span[contains(text(),'TestLeafGlobalIndia')]")).getText();
        
		//Check if the current company name contains the updated name
		if (UpdatedCompanyName.contains(ActualCompanyName)) {

			System.out.println("The company name is updated ");
		}

		else {

			System.out.println("The company name is not updated ");
		}

		// Close the browser (Do not log out)

		driver.close();

	}
}
