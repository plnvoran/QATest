package TableTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import XstreamList.Employee;

public class LoopTest {

	public static void main(String[] args) throws InterruptedException {

		String searchingRow = "Burj Khalifa";
		String searchingColumn = "UAE";

		List<WebElement> elements = new ArrayList<WebElement>();

		WebDriver driver = new FirefoxDriver();

		driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
		
		// Get value of first bold column from every row
		elements = driver.findElements(By.xpath(".//*[@id='content']/table/tbody//th"));

		for (int i = 0; i < elements.size(); i++) {

			if (searchingRow.equals(elements.get(i).getText())) {

				System.out.println(elements.get(i).getText());
				System.out.print("Row: ");
				System.out.println(i + 1);
				
				// Get value of every column from row number i
				elements = driver.findElements(By.xpath(".//*[@id='content']/table/tbody/tr[" + (i + 1) + "]/td"));

				for (int j = 0; j < elements.size(); j++) {

					if (searchingColumn.equals(elements.get(j).getText())) {

						System.out.println(elements.get(j).getText());
						System.out.print("Column: ");
						System.out.println(j + 1);

						break;

					} else if (j == elements.size() - 1) {
						
						System.out.println("Column not found");
					}

				}

				break;

			} else if (i == elements.size() - 1) {
				
				System.out.println("Row not found");
			}

		}

	}

}
