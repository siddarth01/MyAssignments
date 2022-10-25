package week4.day1.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceCustomerService {

	public static void main(String[] args) {

		// setup the driver
		WebDriverManager.chromedriver().setup();

		// Disable notifications

		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);

		// Open URL

		driver.get("https://login.salesforce.com/?locale=in");

		// maximize window

		driver.manage().window().maximize();

		// Implicit wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// enter username

		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");

		// enter password

		driver.findElement(By.id("password")).sendKeys("Password#123");

		// click login button

		driver.findElement(By.id("Login")).click();

		// Click Learn More under Mobile Publisher

		driver.findElement(By.xpath("//span[text()='Learn More']")).click();

		// Find the windows

		Set<String> windowSet = driver.getWindowHandles();

		// Convert the set of windows to list

		List<String> windowlist = new ArrayList<String>(windowSet);

		// Get the current opened window

		driver.switchTo().window(windowlist.get(1));

		// Click the confirmation ok button in the current page

		driver.findElement(By.xpath("//button[text()='Confirm']")).click();

		// Get the title of current page

		String title = driver.getTitle();

		System.out.println("The title of current page " + title);

		// Get back to parent windows

		driver.switchTo().window(windowlist.get(0));
		
		//Close browser
		
		driver.close();

	}
}
