package week4.Day2.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragPlayGround {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		// Launch the URL https://www.chittorgarh.com/
		driver.get("https://www.leafground.com/drag.xhtml");

		driver.manage().window().maximize();

		// Implicit Wait for whole upcoming web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Task1:Draggable --------->

		WebElement dragElement = driver.findElement(By.xpath("//h4[text()='Draggable']/following::div[3]"));

		// Get Location of the webelement

		Point location = dragElement.getLocation();

		// Get X Coordinate

		int x = location.getX();

		// Get Y coordinate

		int y = location.getY();

		// Action Class

		Actions builder = new Actions(driver);

		// Drag the web element to some other x,y coordinates

		builder.dragAndDropBy(dragElement, x + 10, y + 2).perform();

		// Task2:Droppable------------------>

		// Webelement to be dragged

		WebElement source = driver.findElement(By.id("form:drag"));

		// Webelement to be dropped

		WebElement destination = driver.findElement(By.id("form:drop"));

		// Drag and Drop the corresponding element

		builder.dragAndDrop(source, destination).perform();

		// Task 3: Draggable Columns-------------------------

		// Find the web element of name column header

		WebElement nameColumn = driver
				.findElement(By.xpath("//h5[text()='Draggable Columns']/following::th[@aria-label='Name'][1]"));

		// Find the web element of quantity column header

		WebElement quantityColumn = driver
				.findElement(By.xpath("//h5[text()='Draggable Columns']/following::th[@aria-label='Quantity'][1]"));

		// Drag name column to quantity columns

		builder.clickAndHold(nameColumn).moveToElement(quantityColumn).release(quantityColumn).perform();

		// Task 4 : Draggable Rows---------------------------

		// Find the web element of second row with value ignore first row header

		WebElement secondRow = driver
				.findElement(By.xpath("(//div[@class='ui-datatable-tablewrapper']/table/tbody/tr[1]/td[1])[2]"));

		// Find the web element of fourth row

		WebElement fourthRow = driver
				.findElement(By.xpath("(//div[@class='ui-datatable-tablewrapper']/table/tbody/tr[5]/td[2])[2]"));

		builder.clickAndHold(secondRow).moveToElement(fourthRow).release(fourthRow).perform();

		// Task 7: Range Slider.

		// Get the WebElement of starting slider point

		WebElement sliderStart = driver.findElement(By.xpath("//h4[text()='Range Slider']/following::span[2]"));

		// Move the slider towards right

		builder.clickAndHold(sliderStart).moveByOffset(40, 0).release().perform();

		// Task 6: Progress Bar

		// Click start button
		driver.findElement(By.xpath("//span[text()='Start']")).click();

		Thread.sleep(5000);

		String value = driver.findElement(By.xpath("//h5[text()='Progress Bar']/following::div[3]")).getText();

		System.out.println(value);

		// Task 7:Resize image

		WebElement imageElement = driver.findElement(By.xpath("//img[@id='form:logo']"));

		builder.dragAndDropBy(imageElement, 15, 3).perform();

	}
}
