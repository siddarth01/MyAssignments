package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithButton {

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
		driver.get("https://www.leafground.com/button.xhtml");

		String actualTitle = "Dashboard";

		// Click and Confirm title.
		driver.findElement(By.xpath("//span[text()='Click']")).click();

		String currentPageTitle = driver.getTitle();

		if (currentPageTitle == actualTitle) {

			System.out.println("The title is not confirmed");
		}

		else

		{
			System.out.println("The title is confirmed");
		}

		// Navigate back to home page
		driver.navigate().back();

		// Confirm if the button is disabled.

		boolean IsDisabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();

		if (IsDisabled == true) {

			System.out.println("The button is disabled");
		}

		else {

			System.out.println("The button is not disabled");
		}

		// Find the position of the Submit button

		String findPostion = driver.findElement(By.xpath("//span[text()='Submit'][1]")).getLocation().toString();

		System.out.println("The position of the Submit button " + findPostion);

		// Find the Save button color

		String saveButtonColor = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']"))
				.getCssValue("background-color");

		System.out.println("The save button color is " + saveButtonColor);

		// Find the height and width of this button

		WebElement sizeOfButton = driver.findElement(By.xpath("//button[contains(@class,'text-icon-right')]"));

		int getHeight = sizeOfButton.getSize().getHeight();

		int getWidth = sizeOfButton.getSize().getWidth();

		System.out.println("The button height is " + getHeight + " and width is" + getWidth);

		// Mouse over and confirm the color changed

		// Instantiate action class

		Actions action = new Actions(driver);

		// Retrieve WebElement to perform mouse hover
		
		WebElement successButton = driver.findElement(By.xpath("//span[text()='Success']"));

		// Mouse hover
		
		action.moveToElement(successButton).perform();
		
		// Get the background color
		
		System.out.println(successButton.getCssValue("background-color"));

		driver.close();

	}

}
