package week4.Day2.Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		//// disable notifications
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);

		// Launch the URL https://www.chittorgarh.com/
		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();

		// Implicit Wait for whole upcoming web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Go to Mens Fashion
		driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]")).click();

		// Go to Sports Shoes

		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();

		// Get the count of the sports shoes

		String countOfShoes = driver
				.findElement(By.xpath("//div[text()='Sports Shoes for Men']/following-sibling::div")).getText();

		System.out.println("The count of sport shoes is :" + countOfShoes);

		// Click Training shoes

		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

		Thread.sleep(2000);

		// Sort by Low to High

		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();

		driver.findElement(By.xpath("//li[text()[normalize-space()='Price Low To High']]")).click();

		Thread.sleep(2000);

		// Check if the items displayed are sorted correctly

		List<WebElement> findAllPrices = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));

		List<String> priceList = new ArrayList<String>();

		for (WebElement price : findAllPrices) {

			priceList.add(price.getAttribute("data-price"));
		}

		String firstItemPrice = priceList.get(0);

		int firstItemPriceValue = Integer.parseInt(firstItemPrice);

		String secondItemPrice = priceList.get(1);

		int secondItemPriceValue = Integer.parseInt(secondItemPrice);

		if (firstItemPriceValue < secondItemPriceValue) {

			System.out.println("The Items are displayed sorted low to high");
		}

		else {
			System.out.println("The Items are not displayed sorted low to high");

		}

		Thread.sleep(2000);
		// Select the price range (900-1200)

		WebElement enterFromValue = driver.findElement(By.xpath("//input[@name='fromVal']"));

		enterFromValue.clear();
		enterFromValue.sendKeys("900");

		WebElement enterToValue = driver.findElement(By.xpath("//input[@name='toVal']"));

		enterToValue.clear();
		enterToValue.sendKeys("1200");

		driver.findElement(By.xpath("//div[text()[normalize-space()='GO']]")).click();

		Thread.sleep(4000);

		// Filter with color Navy
		driver.findElement(By.xpath("//a[text()=' Navy']/following-sibling::span")).click();

		// verify the all applied filters

		List<WebElement> filter = driver.findElements(By.xpath("(//div[@class=\"filters\"])[1]"));

		List<String> appliedfilter = new ArrayList<String>();

		for (WebElement eachVal : filter) {

			appliedfilter.add(eachVal.getText());

		}

		System.out.println("The applied filters are :" + appliedfilter);

		Thread.sleep(2000);

		// Mouse Hover on first resulting Training shoes
		WebElement quickView = driver
				.findElement(By.xpath("//h1[text()[normalize-space()='Training Shoes']]/following::img[2]"));

		Actions action = new Actions(driver);

		action.moveToElement(quickView).perform();

		// click QuickView button

		driver.findElement(By.xpath(
				"//h1[text()[normalize-space()='Training Shoes']]/following::img[2]/following::div[text()[normalize-space()='Quick View']]"))
				.click();

		Thread.sleep(2000);
		// Print the cost and the discount percentage

		String getCost = driver
				.findElement(By.xpath("//div[@class='quickViewHead']/following::span[@class='payBlkBig']")).getText();

		String getDiscount = driver
				.findElement(By.xpath("//div[@class='quickViewHead']/following::span[@class='percent-desc ']"))
				.getText();

		System.out.println("The total cost is " + getCost + " The total discount is " + getDiscount);

		// Take the snapshot of the shoes

		TakesScreenshot shoe = (TakesScreenshot) driver;

		File source = shoe.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, new File("C://Testleaf//Selenium//src//Screenshot/shoe.png"));

		System.out.println("Screen shot Captured");

		// Close the current window

		driver.close();

		// Close the main window

		driver.quit();

	}
}
