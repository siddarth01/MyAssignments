package week4.Day2.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		// Launch the URL https://www.chittorgarh.com/
		driver.get("https://www.chittorgarh.com/");

		driver.manage().window().maximize();

		// Implicit Wait for whole upcoming web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Click on stock market

		driver.findElement(By.xpath("//a[text()='STOCK MARKET ']")).click();

		// Click on NSE bulk Deals

		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();

		// Get all the Security names

		// Webelement for the security name colum

		List<WebElement> findSecurityNames = driver.findElements(
				By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tbody//tr"));

		// create a list
		List<String> securityList = new ArrayList<String>();

		// Get the size of the list
		int size = findSecurityNames.size();

		System.out.println("----The security available in table are:----");

		// iterate through the table
		for (int i = 1; i <= size; i++) {

			// Get the values from Security Column

			String text = driver.findElement(By.xpath(
					"//table[@class='table table-bordered table-condensed table-striped']//tbody//tr[" + i + "]/td[3]"))
					.getText();

			System.out.println(text);

			// Add each security name to the list
			securityList.add(text);

		}

		// the total number of security including Duplicates

		int countofAllSecurityIncludingDuplicates = securityList.size();

		System.out.println("The total number of security:" + countofAllSecurityIncludingDuplicates);

		// Create a set to remove duplicate value
		Set<String> securityNames = new LinkedHashSet<String>();
		
		System.out.println("The duplicate security are:--------------------");
		
		//Print the duplicate security names
		for (String eachSecurityName : securityList ) {
			
			if(!securityNames.add(eachSecurityName)) {
				
				
			System.out.println(eachSecurityName);
			}
		}
		
		//Get the count of all security without duplicate
		int countofAllSecurityWithoutDuplicates = securityNames.size();
		
		System.out.println("The total number of security without Duplicates:" + countofAllSecurityWithoutDuplicates);
		
		//Check for duplicate security
		
		if(countofAllSecurityIncludingDuplicates==countofAllSecurityWithoutDuplicates) {
			
			System.out.println("There are no duplicate security in table");
		}
		
		else {
			
			System.out.println("There are  duplicate security in table");
		}
		
		driver.close();

	}

}
