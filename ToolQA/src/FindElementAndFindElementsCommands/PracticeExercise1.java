package FindElementAndFindElementsCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise1 {

public static void main(String[] args) throws InterruptedException {
		String url="http://toolsqa.wpengine.com/automation-practice-form/";
	
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver ();
		
		driver.get(url);
		//Wait for 5 Sec
		Thread.sleep(5);	
		//firstname
		
		driver.findElement(By.name("firstname")).sendKeys("John");;
		driver.findElement(By.name("lastname")).sendKeys("Smith");
		driver.findElement(By.id("submit")).click();
		
		//driver.quit();
	}
}