package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithCheckBox {

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
		driver.get("https://www.leafground.com/checkbox.xhtml");
		
		//Basic Checkbox
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		//Notification
		
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
		//Choose your favorite language(s)
		
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		
		//Tri State Checkbox
		
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		
		//Toggle Switch
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		//Verify if check box is disabled
		
		boolean isEnabled = driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']/following::span")).isSelected();
		
		if(!isEnabled == true) {
			
			System.out.println("The Checkbox is disabled");
		}
		
		//Select Multiple
		
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		
		driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
		
		driver.findElement(By.xpath("(//label[text()='Barcelona'])[2]")).click();
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		
		
	}
}
