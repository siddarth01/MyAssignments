package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithRadio {

	public static void main(String[] args) {

		// Download and setup path using WebDriverManager Class
		WebDriverManager.chromedriver().setup();

		// Launch Browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Implicit Wait for whole upcoming web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open URL
		driver.get("https://www.leafground.com/radio.xhtml");

		// Your most favorite browser--------------------------------

		driver.findElement(By.xpath("(//label[text()='Edge'])[1]")).click();

		// UnSelectable

		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();

		// Find the default select radio button-----------------

		// driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).click();

		// Select the age group (only if not selected)------------------------------
		boolean IsAgeSelected = driver
				.findElement(By.xpath("//h5[text()='Select the age group (only if not selected)']/following::span[3]"))
				.isSelected();

		if (!IsAgeSelected == true)

		{
			driver.findElement(
					By.xpath("//h5[text()='Select the age group (only if not selected)']/following::span[3]")).click();
		}

		 driver.close();

	}
}
