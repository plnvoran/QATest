package WebElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCSSClass {
	
	public static void main(String[] args) throws InterruptedException {
	
		String url="http://localhost:31107/test_webelem.html";
		String text;
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver ();
		
		driver.get(url);
		//Wait for 5 Sec
		Thread.sleep(5);
		
		
		
		//Value of css div[1]
		text=driver.findElement(By.xpath("html/body/div[1]")).getCssValue("width");
		System.out.println("Value of css div[1]");
		System.out.println(text);
		System.out.println();
		
		//Value of css div[2]
		text=driver.findElement(By.xpath("html/body/div[2]")).getCssValue("width");
		System.out.println("Value of css div[2]");
		System.out.println(text);
		System.out.println();	
		
		//Value of css default
		text=driver.findElement(By.xpath("html/body")).getCssValue("width");
		System.out.println("html/body/");
		System.out.println(text);
		System.out.println();	
		
		//Text of body tag
		text=driver.findElement(By.xpath("html/body")).getText();
		System.out.println("Text of body tag");
		System.out.println(text);
	
		
		
		
		driver.quit();
	}

}
