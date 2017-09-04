package DropDownMultySelect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultiSelect {

	public static void main(String[] args)

	{

		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");

		Select selectCont = new Select(driver.findElement(By.id("continents")));
		selector(selectCont, 1, 2);
		checkSelectinFromPage(selectCont);

		Select selectComm = new Select(driver.findElement(By.id("selenium_commands")));
		selector(selectComm, 1, 2);
		checkSelectinFromPage(selectComm);

		

	}

	public static void selector(Select oSelect, int firstN, int secondN) {
		List<WebElement> items = oSelect.getOptions();

		if (oSelect.isMultiple()) {
			oSelect.selectByIndex(firstN);
			oSelect.selectByIndex(secondN);

			System.out.println("You have selected in multy way:");
			System.out.println(items.get(firstN).getText());
			System.out.println(items.get(secondN).getText());

		} else {
			oSelect.selectByIndex(firstN);
			System.out.println("You have selected in simle way:");
			System.out.println(items.get(firstN).getText());
		}

	}

	public static void checkSelectinFromPage(Select oSelect) {
		List<WebElement> items = oSelect.getAllSelectedOptions();

		for (WebElement item : items) {

			System.out.println("The item has been selected:");
			System.out.println(item.getText());
		}

	}

}
