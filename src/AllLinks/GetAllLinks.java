package AllLinks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetAllLinks {

	public static void main(String[] args) {
		
		// Create a new instance of the Firefox driver
				WebDriver driver = new FirefoxDriver ();
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        
				//Launch the Online Store Website
				driver.get("https://githowto.com/");
				
				driver.findElement(By.xpath(".//*[@id='navbar-collapse-01']/ul/li/a/i")).click();
			
				
				(new WebDriverWait(driver, 10)).until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(".//*[@id='main']/div/div/div[1]/ul/li[1]/a")));
				
				
				List<WebElement> linksList = new ArrayList<WebElement>();
											
				
				linksList=driver.findElements(By.xpath(".//*[@id='main']/div/div/div/ul//a"));
				
				for (WebElement l:linksList )
				{
					System.out.print(l.getText());
					
					System.out.print(" https://githowto.com");	
					
					System.out.println(l.getAttribute("href"));
			}
		 
	}

}
