package FindElementAndFindElementsCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise2 {

public static void main(String[] args) throws InterruptedException {
		String url="http://toolsqa.wpengine.com/automation-practice-form/";
		String partialLinkText, linkText;
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver ();
		
		driver.get(url);
		//Wait for 5 Sec
		Thread.sleep(5);	
	
		//Partial Link Test
		partialLinkText=driver.findElement(By.partialLinkText("Partial")).getText();
		
		// Link Test
		linkText=driver.findElement(By.linkText("Link Test")).getText();
		
		System.out.println(partialLinkText);
		System.out.println(linkText);
		
		//Submit click
		driver.findElement(By.tagName("button"));
		driver.findElement(By.linkText("Link Test")).click();
		
		//driver.quit();
	}
}