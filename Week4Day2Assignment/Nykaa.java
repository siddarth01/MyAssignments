package week4.Day2.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		// Launch the URL https://www.chittorgarh.com/
		driver.get("https://www.nykaa.com/");

		driver.manage().window().maximize();

		// Implicit Wait for whole upcoming web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Mouseover on Brands and Search L'Oreal Paris
		WebElement brandElement = driver.findElement(By.xpath("//a[text()='brands']"));

		Actions builder = new Actions(driver);

		builder.moveToElement(brandElement).perform();

		// Click L'Oreal Paris

		Thread.sleep(2000);

		driver.findElement(By.id("brandSearchBox")).sendKeys("Lo");

		driver.findElement(By.partialLinkText("L'Oreal Paris")).click();

		// Check the title contains L'Oreal Paris(Hint-GetTitle)

		String getTitle = driver.getTitle();

		String checkValue = "L'Oreal Paris";

		if (getTitle.contains(checkValue)) {

			System.out.println("Title contains L'Oreal Paris ");
		}

		else {
			System.out.println("Title not contains L'Oreal Paris ");

		}

		// Click sort By and select customer top rated

		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();

		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();

		Thread.sleep(2000);

		// Click Category and click Hair->Click haircare->Shampoo

		driver.findElement(By.xpath("//span[text()='Category']")).click();

		driver.findElement(By.xpath("//span[text()='Hair']")).click();

		driver.findElement(By.xpath("//span[@class='filter-name '][1]")).click();

		driver.findElement(By.xpath("//span[text()='Hair Care']/following::span[text()='Shampoo']")).click();

		// Click->Concern->Color Protection

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Concern']")).click();

		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();

		// check whether the Filter is applied with Shampoo

		String text = driver.findElement(By.xpath("//span[text()='Filters Applied']/following::span[text()='Shampoo']"))
				.getText();

		System.out.println(text);

		String checktext = "Shampoo";

		if (text.equals(checktext)) {

			System.out.println("Shampoo is there under filter");

		} else {

			System.out.println("Shampoo is not there under filter");
		}

		// Click on L'Oreal Paris Colour Protect Shampoo

		Thread.sleep(2000);

		driver.findElement(By.xpath("//img[@alt=\"L'Oreal Paris Colour Protect Shampoo\"]")).click();

		Set<String> windowHandleSet = driver.getWindowHandles();

		List<String> windowsHandleList = new ArrayList<String>(windowHandleSet);

		driver.switchTo().window(windowsHandleList.get(1));

		String getAmount = driver.findElement(By.xpath("//span[text()='MRP:']/following::span")).getText();

		// GO to the new window and select size as 175ml

		Select quantity = new Select(driver.findElement(By.xpath("//select[@title='SIZE']")));

		quantity.selectByVisibleText("175ml");

		// Print MRP

		System.out.println("The MRP of the product is " + getAmount);

		// Click on ADD to BAG

		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();

		// Go to Shopping Bag

		driver.findElement(By.xpath("//span[@class='cart-count']")).click();

		// Print the Grand Total amount

		Thread.sleep(2000);

		driver.switchTo().frame(0);

		String grandAmount = driver.findElement(By.xpath("//span[text()='Grand Total']/../preceding-sibling::div/span"))
				.getText();

		System.out.println("The grand Total Amount is " + grandAmount);

		// Click Proceed

		driver.findElement(By.xpath("//span[text()='Proceed']")).click();

		// Click on Continue as Guest

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();

		// Check if this grand total is the same in step 14

		String currentGrandTotal = driver.findElement(By.xpath("//div[text()='Grand Total']/following::span"))
				.getText();

		if (currentGrandTotal.contains(grandAmount)) {

			System.out.println("Both Grand Total are same");
		}

		else {
			System.out.println("Both Grand Total are not same");
		}

		// Close all windows
		driver.quit();

	}
}
