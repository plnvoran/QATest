package WebElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCSS {
	
	public static void main(String[] args) throws InterruptedException {
	
		String url="file:///E:/_autotests/selenium/style_test.html";
		String text;
		
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver ();
		
		driver.get(url);
		//Wait for 5 Sec
		Thread.sleep(5);
		
		
		
		//Value of css h1[1]
		text=driver.findElement(By.xpath("html/body/h1[1]")).getCssValue("color");
		System.out.println("Value of css h1[1]");
		System.out.println(text);
		System.out.println();
		
		//Value of css h1[2]
		text=driver.findElement(By.xpath("html/body/h1[2]")).getCssValue("color");
		System.out.println("Value of css h1[2]");
		System.out.println(text);
		System.out.println();	
		
		//Value of css default
		text=driver.findElement(By.xpath("html/body")).getCssValue("color");
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
