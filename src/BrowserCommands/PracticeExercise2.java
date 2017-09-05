package BrowserCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise2 {

public static void main(String[] args) throws InterruptedException {
		
		String url="http://demoqa.com/frames-and-windows/";
		
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver ();
		
		driver.get(url);
		//Wait for 5 Sec
		Thread.sleep(5);
		
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		//Wait for 5 Sec
		Thread.sleep(5);
		
		
		driver.close();
	}
}