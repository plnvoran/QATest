package FindElementAndFindElementsCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByClass {

public static void main(String[] args) throws InterruptedException {
		String url="http://toolsqa.wpengine.com/automation-practice-form/";
	String button;
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver ();
		
		driver.get(url);
		//Wait for 5 Sec
		Thread.sleep(5);	
		//firstname
		
		button=driver.findElement(By.className("btn btn-info")).getText();
		//driver.findElement(By.className("btn btn-info")).click();
		
		System.out.println(button);
		
		//driver.quit();
	}
}