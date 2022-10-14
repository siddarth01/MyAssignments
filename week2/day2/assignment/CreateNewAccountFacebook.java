package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewAccountFacebook {

	
	public static void main(String[] args) throws InterruptedException {
		
		//Download and setup path using WebDriverManager Class
		WebDriverManager.chromedriver().setup();
		
		//Launch Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit Wait for whole upcoming web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Load the URL https://www.facebook.com/
		driver.get("https://www.facebook.com/");
		
		//Click Create New Account Button
		WebElement elementNewAccountButton = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		elementNewAccountButton.click();
		
		//EnterFirstName
		WebElement elementEnterFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		elementEnterFirstName.sendKeys("Clarke");
		
		//EnterLastName
		
		WebElement elementEnterLastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		elementEnterLastName.sendKeys("Gwen");
		
		//Enter Mobile Number
		WebElement elementEnterMobileNumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		
		elementEnterMobileNumber.sendKeys("9500111897");
		
		//Enter Password
		WebElement elementEnterPassword = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		
		elementEnterPassword.sendKeys("12@#Fello8&@");
		
		//Choose Date of Birth
		
		WebElement elementChooseDOB = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select dd1 = new Select(elementChooseDOB);
		
		dd1.selectByVisibleText("18");
		
		//Choose month
		
		WebElement elementChooseMonth = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select dd2 = new Select(elementChooseMonth);
		
		dd2.selectByValue("3");
		
		//Choose Year
		
		WebElement elementChooseYear = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select dd3 = new Select(elementChooseYear);
		
		dd3.selectByIndex(2);
		
		//Choose Female
		
		WebElement elementChooseFemale = driver.findElement(By.xpath("//input[@value='1' ]"));
		
		elementChooseFemale.click();
			
		
	}
}
