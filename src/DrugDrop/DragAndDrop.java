package DrugDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Action;

import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";

		driver.get(URL);

		// It is always advisable to Maximize the window before performing
		// DragNDrop action

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

		WebElement Scroll = driver.findElement(By.xpath(".//div/div/div[3]/h2"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", Scroll);

		WebElement From = driver.findElement(By.xpath(
				".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));

		WebElement To = driver.findElement(By.xpath(
				".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));

		Actions builder = new Actions(driver);

		Action dragAndDrop = builder.clickAndHold(From)

				.moveToElement(To)

				.release(To)

				.build();

		dragAndDrop.perform();

		String Thrillers = driver
				.findElement(By
						.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td[4]/span"))
				.getText();

		if (Thrillers.equals("Thrillers"))

		{
			((JavascriptExecutor) driver).executeScript("alert('Thrillers is in the Bestsellers');");
		} else {
			{
				((JavascriptExecutor) driver).executeScript("alert('Something is wrong');");
			}
		}

	}

}