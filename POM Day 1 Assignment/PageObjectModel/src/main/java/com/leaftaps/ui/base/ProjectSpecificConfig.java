package com.leaftaps.ui.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcelData2;

public class ProjectSpecificConfig {

	public  RemoteWebDriver driver;
	public String excelFileName;

	@Parameters({ "url", "browserName" })
	@BeforeMethod
	public void driverConfig(String url, String browserName) {
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please select chrome/Firefox");
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void driveClose() {

		driver.close();
	}

	@DataProvider(name = "testData")

	public String[][] sendData() throws IOException {

		String[][] data = ReadExcelData2.getData(excelFileName);
		return data;
	}

}
