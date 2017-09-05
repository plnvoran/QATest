package automationFramework;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

public class MultiBrowser {

	public WebDriver driver;

	@Parameters("browser")

	@BeforeClass

	// Passing Browser parameter from TestNG xml

	public void beforeTest(String browser) {

		// If the browser is Firefox, then do this

		if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

			// If browser is IE, then do this

		} else if (browser.equalsIgnoreCase("chrome")) {

			// Here I am setting up the path for my IEDriver

			String exePath = "C:\\Users\\Denis Litinskiy\\Examples\\Toolsqa\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);

			driver = new ChromeDriver();
		}

	}

	// Once Before method is completed, Test method will start

	@Test
	public void login() throws InterruptedException {
		driver.get("http://localhost:6448/");
		driver.get("http://localhost:6448/catalog/t-shirts/");

	}

	@AfterClass
	public void afterTest() {

		driver.quit();

	}

}