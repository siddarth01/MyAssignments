package week4.day1.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsPlayground {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/window.xhtml");

		driver.manage().window().maximize();

		// Implicit Wait for whole upcoming web elements

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Task1 :Click and Confirm new Window Opens------------------------------

		// Get current window handle

		String currentWindowHandle = driver.getWindowHandle();

		// Click Open button

		driver.findElement(By.xpath("//span[text()='Open']")).click();

		// Get all windows handles in set

		Set<String> windowHandleSet = driver.getWindowHandles();

		// Convert set to list

		List<String> windowsHandleList = new ArrayList<String>(windowHandleSet);

		// Switch current opened window

		driver.switchTo().window(windowsHandleList.get(1));

		// Get the current window handle

		String switchedWindowHandle = driver.getWindowHandle();

		// Check if current window is opened

		if (currentWindowHandle != switchedWindowHandle) {

			System.out.println("The New window is opened ");

		}

		else {

			System.out.println("The new window is not opened");
		}

		// Switch back to parent window

		driver.switchTo().window(windowsHandleList.get(0));

		// Task 2:Close all windows except Primary------------------------

		// Click Close Window button

		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();

		// Get first window Handle

		String firstWindowHandle = driver.getWindowHandle();

		System.out.println("The first window handle is " + firstWindowHandle);

		// Get all windows handles

		Set<String> windowHandles = driver.getWindowHandles();

		// loop through window handle

		for (String eachWindowHandle : windowHandles) {

			// Close all window handles except first one

			if (!eachWindowHandle.equals(firstWindowHandle)) {

				driver.switchTo().window(eachWindowHandle);
				driver.close();
			}

		}
		// Switch back to parent window

		driver.switchTo().window(windowsHandleList.get(0));

		// Get WindowHandle of Parent Window.

		String parentWindowHandle = driver.getWindowHandle();

		// Task 3:Find the number of opened tabs--------------

		// Click Multiple Tab Button

		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();

		// Get all window handles

		Set<String> windowHandlesSet = driver.getWindowHandles();

		// Print the number of opened Tabs

		System.out.println("The number of opened tabs are : " + windowHandlesSet.size());

		// loop all windows to close it

		for (String eachWindowHandle : windowHandlesSet) {

			if (!eachWindowHandle.equals(parentWindowHandle)) {

				driver.switchTo().window(eachWindowHandle);
				driver.close();
			}

		}

		// Task 4 ------Open with delay-----------

		// Switch back to parent window

		driver.switchTo().window(windowsHandleList.get(0));

		//Open 2 tabs with delay
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();

		driver.quit();

	}

}
