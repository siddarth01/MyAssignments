package week4.day1.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {

		// Windows Handling Concept

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		// Implicit Wait for whole upcoming web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Enter UserName and Password Using Id Locator

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on Login Button using Class Locator

		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on CRM/SFA Link

		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		// Click on contacts Button

		driver.findElement(By.linkText("Contacts")).click();

		// Click on Merge Contacts using Xpath Locator

		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		// Click on Widget of From Contact

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();

		// Click on First Resulting Contact

		Set<String> windowSet = driver.getWindowHandles();

		// Copy the set into list
		List<String> windowList = new ArrayList<>(windowSet);

		String firstWindowHandle = windowList.get(1);

		// Switch to first window
		driver.switchTo().window(firstWindowHandle);

		// Click on First Resulting Contact

		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).click();

		// Go back to first window
		driver.switchTo().window(windowList.get(0));

		// Click on Widget of To Contact

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

		Set<String> windowSet1 = driver.getWindowHandles();

		// Copy the set into list
		List<String> windowList1 = new ArrayList<>(windowSet1);

		driver.switchTo().window(windowList1.get(1));

		// Click on Second Resulting Contact
		driver.findElement(
				By.xpath("//table[@class='x-grid3-row-table']/following::table/tbody[1]/tr[1]/td[1]/div[1]/a[1]"))
				.click();
		
		// Click on Widget of To Contact
		driver.switchTo().window(windowList.get(0));

		// Click on Merge button using Xpath Locator

		driver.findElement(By.xpath("//a[text()='Merge']")).click();

		// Accept the Alert
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		//Verify the title of the page
		
		String pageTitle = driver.getTitle();
		
		String ActualTitle = "View Contact | opentaps CRM";
		
		if(ActualTitle.equals(pageTitle)) {
			
			System.out.println("The title is confirmed");
		}
		
		else {
			
			System.out.println("The title is not confirmed");
		}
		
		

	}
}
