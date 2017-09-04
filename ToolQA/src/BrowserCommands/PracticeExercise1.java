package BrowserCommands;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise1 {

public static void main(String[] args) throws InterruptedException {
		String etalonURL="http://store.demoqa.com/";
		String url;
		String title;
		String pageSource;
		// Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver ();
		
		driver.get("http://store.demoqa.com/");
		//Wait for 5 Sec
		Thread.sleep(5);
		
		title=driver.getTitle();
		System.out.println("The title of page is: "+title);
		System.out.println("The length of page title is: "+title.length());
		url=driver.getCurrentUrl();
		
		if (url.equals(etalonURL)) {
			System.out.println("URL is equal to Etalon URL: "+etalonURL);
		}
		else{
			System.out.println("URL is NOT equal to Etalon URL: "+etalonURL);
		}
		
		//Get Page Source (HTML Source code) and Page Source length
		pageSource=driver.getPageSource();
		System.out.println("#####################");
		System.out.println("The sourse of page is: ");
		System.out.println(pageSource);
		System.out.println("#####################");
				
		//Print Page Length on Eclipse Console.
		System.out.println("The length of page title is: "+pageSource.length());
		
		driver.quit();
	}
}