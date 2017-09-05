
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExamleFirst {

	public static WebDriver driver;

	public static void main(String[] args) {

		String secondWinHandle = "";

		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Launch the URL
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");

		// Get first window id
		String firstWinHandle = driver.getWindowHandle();
		System.out.println("First Win Handle:");
		System.out.println(firstWinHandle);

		// Run new window
		driver.findElement(By.xpath(".//*[@id='content']/p[3]/button")).click();

		Set<String> handles = driver.getWindowHandles();

		Iterator iter = handles.iterator();
		System.out.println("Second Win Handle:");
		while (iter.hasNext()) {

			if (iter.next() != firstWinHandle) {
				secondWinHandle = iter.next().toString();
				System.out.println(secondWinHandle);

			}

		}

		driver.switchTo().window(secondWinHandle).close();
	}
}
