package WebElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetElemText {
	
	public static void main(String[] args) throws InterruptedException {
	
		String url="file:///E:/_autotests/selenium/test_webelem.html";
		String text;
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver ();
		
		driver.get(url);
		//Wait for 5 Sec
		Thread.sleep(5);
		
		//Text of body
		text=driver.findElement(By.tagName("body")).getText();
		System.out.println("Text of body");
		System.out.println(text);
		
		
		
		
		
		driver.quit();
	}

}
