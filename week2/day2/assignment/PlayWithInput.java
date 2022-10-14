package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithInput {

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
		driver.get("https://www.leafground.com/input.xhtml");

		// Enter you name

		driver.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("Jaya Siddarth");

		// Enter and confirm Error Message

		driver.findElement(By.xpath("//input[contains(@id,'age')]")).sendKeys(Keys.ENTER);

		String ErrorMessage = driver.findElement(By.xpath("//span[contains(@id,'error')]")).getText();

		String ActualErrorMessage = "Age is mandatory";

		if (ActualErrorMessage.equals(ErrorMessage)) {

			System.out.println("The error message is confirmed");
		}

		else {
			System.out.println("The error message is nt confirmed");
		}

		// Append Country to this City

		WebElement CityName = driver.findElement(By.xpath("//input[contains(@class,'city')]"));

		String GetCityName = CityName.getAttribute("value");

		CityName.clear();

		CityName.sendKeys(GetCityName + "(India)");

		// Click and Confirm Label Position Changes

		WebElement UsernameLabel = driver.findElement(By.xpath("//label[text()='Username']"));

		String CurrentLocation = UsernameLabel.getLocation().toString();

		WebElement UsernameTextBox = driver.findElement(By.xpath("//input[contains(@id,'float-input')]"));

		UsernameTextBox.click();

		String CurrentChangedLocation = UsernameLabel.getLocation().toString();

		if (CurrentLocation == CurrentChangedLocation) {
			System.out.println("The label position is not changed");
		}

		else {
			System.out.println("The label position is changed");
		}

		// Verify if text box is disabled

		boolean CheckEnabled = driver.findElement(By.xpath("//input[@placeholder='Disabled']")).isEnabled();

		if (CheckEnabled == false) {

			System.out.println("The text box is disabled");
		}

		else {

			System.out.println("The text box is enabled");
		}

		// Type your name and choose the third option

		WebElement SearchTextBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));

		SearchTextBox.sendKeys("Jaya");

		driver.findElement(By.xpath("//li[@role='option'][3]")).click();

		// Clear the typed text
		WebElement ClearTextBox = driver.findElement(By.xpath("//input[@value='Can you clear me, please?']"));

		ClearTextBox.click();

		ClearTextBox.clear();

		// Retrieve the typed text.

		WebElement TypedText = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));

		String ActualTypedText = TypedText.getAttribute("value");

		TypedText.clear();

		TypedText.sendKeys(ActualTypedText);

		// Type email and Tab. Confirm control moved to next element.

		WebElement EmailTextBox = driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));

		EmailTextBox.sendKeys("siddarth01@gmail.com");

		String EmailTextBoxPosition = EmailTextBox.getLocation().toString();

		EmailTextBox.sendKeys(Keys.TAB);

		WebElement currentElement = driver.switchTo().activeElement();

		String CurrentElementPosition = currentElement.getLocation().toString();

		if (EmailTextBoxPosition == CurrentElementPosition) {

			System.out.println("The control is not mooved to next element");
		}

		else {
			System.out.println("The control is  moved to next element");
		}

		// Type about yourself

		currentElement.sendKeys("I am an IT engineer");

		// Text Editor

		driver.findElement(By.xpath("//span[@class='ql-font ql-picker'][1]")).click();

		driver.findElement(By.xpath("//span[@data-value='monospace'][1]")).click();

		WebElement Paragraph = driver.findElement(By.xpath("//div[@id='j_idt88:j_idt103_editor']/div[1]/p "));

		Paragraph.sendKeys("This is a font size");

		// Type number and spin to confirm value changed

		WebElement SpinTextBox = driver.findElement(By.xpath("(//input[contains(@class,'spinner')])"));

		SpinTextBox.sendKeys("123");

		String GetCurrentBeforeSpinTextBoxValue = SpinTextBox.getAttribute("value");

		driver.findElement(By.xpath("(//a[contains(@class,'spinner-up')])")).click();

		String GetCurrentAfterSpinTextBoxValue = SpinTextBox.getAttribute("value");

		if (GetCurrentAfterSpinTextBoxValue == GetCurrentBeforeSpinTextBoxValue) {

			System.out.println("The value is not changed");
		}

		else {
			System.out.println("The value is changed");
		}

		// Type random number (1-100) and confirm slider moves correctly
		
		WebElement SliderPosition = driver.findElement(By.xpath("(//span[contains(@style,'0%')])"));
		
		String currentSlideLocation = SliderPosition.getLocation().toString();
		
		driver.findElement(By.xpath("(//input[contains(@id,'slider')])")).sendKeys("23");
		
		String currentUpdatedSlideLocation = SliderPosition.getLocation().toString();
		
		if(currentUpdatedSlideLocation==currentSlideLocation) {
			
			System.out.println("The slider does not move correctly");
		}
		
		else {
			
			System.out.println("The slider does move correctly");
		}
		
		//Click and Confirm Keyboard appears

		driver.findElement(By.xpath("(//input[contains(@class,'keypad')])")).click();
		
		WebElement Keyboard = driver.findElement(By.xpath("(//div[contains(@class,'keypad-popup')])"));
		
		boolean Isdisplayed = Keyboard.isDisplayed();
		
		
		if(Isdisplayed == true) {
			
			System.out.println("Keyboard is displayed");
			
			
		}
		
		else
		{
			System.out.println("Keyboard is not  displayed");
		}
		
		
		//Custom Toolbar
		
		
	}
}
