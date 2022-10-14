package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithSelect {

	public static void main(String[] args) throws InterruptedException {

		// Download and setup path using WebDriverManager Class
		WebDriverManager.chromedriver().setup();

		// Launch Browser
		ChromeDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Implicit Wait for whole upcoming web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open URL
		driver.get("https://www.leafground.com/select.xhtml");

		// Which is your favorite UI Automation tool?

		WebElement selectElement = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));

		Select dd1 = new Select(selectElement);

		dd1.selectByVisibleText("Selenium");

		// Choose your preferred country

		driver.findElement(By.xpath("//label[text()='Select Country']")).click();

		driver.findElement(By.xpath("//li[text()='Brazil']")).click();

		Thread.sleep(2000);
		// Confirm Cities belongs to Country is loaded

		driver.findElement(By.xpath("//label[text()='Select City']")).click();

		driver.findElement(By.xpath("//li[text()='Rio de Janerio']")).click();

		Thread.sleep(2000);

		// Choose the Course------------------------

		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();

		driver.findElement(By.xpath("//li[text()='PostMan']")).click();

		Thread.sleep(2000);

		// Choose language randomly----------------------

		driver.findElement(By.xpath("//label[text()='Select Language']")).click();

		driver.findElement(By.xpath("//li[text()='Tamil']")).click();
		
		Thread.sleep(2000);
		
		//Select 'Two' irrespective of the language chosen
		
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[4]")).click();

		driver.findElement(By.xpath("//li[text()='இரண்டு']")).click();
		
		Thread.sleep(2000);


	}
}
