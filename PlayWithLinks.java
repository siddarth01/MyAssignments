package week2.day2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithLinks {

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
		driver.get("https://www.leafground.com/link.xhtml");

		// Take me to dashboard //Go to Dashboard-----------------------------------
		driver.findElement(By.linkText("Go to Dashboard")).click();

		// Back to Home page
		driver.navigate().back();

		// Find my destination //Find the URL without clicking me.
		// --------------------------

		System.out.println("The destination URL is "
				+ driver.findElement(By.linkText("Find the URL without clicking me.")).getAttribute("href"));

		// Am I broken link?-------------------------

		WebElement clickBrokenLink = driver.findElement(By.linkText("Broken?"));

		clickBrokenLink.click();

		String pageSource = driver.getPageSource();

		// Check if the link is broken
		if (pageSource.contains("HTTP ERROR 404")) {

			System.out.println("Link is broken");
		}

		else {

			System.out.println("Link is not broken");
		}

		driver.navigate().back();

		// Duplicate Link-----------------------
		// Get the list of duplicate links

		List<WebElement> listOfDuplicateLinks = driver.findElements(By.linkText("Go to Dashboard"));

		// Total number of links
		int totalNumberOfLinks = listOfDuplicateLinks.size();

		System.out.println("The number of Duplicate links " + totalNumberOfLinks);

		// Count Number of Links--------------------------------

		List<WebElement> listofAllLinks = driver.findElements(By.tagName("a"));

		int totalNumberOfAllLinks = listofAllLinks.size();

		System.out.println("The number of all links in web page is  " + totalNumberOfAllLinks);

		// Count Layout Links---------------------------------

		driver.findElement(By.linkText("How many links in this layout?")).click();

		List<WebElement> listofAllLinksInThisLayout = driver.findElements(By.tagName("a"));

		int totalNumberOfLinks2 = listofAllLinksInThisLayout.size();

		System.out.println("The number of all links in web page is  " + totalNumberOfLinks2);

		driver.close();

	}

}
