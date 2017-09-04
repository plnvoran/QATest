package app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class ApplicationManager {
	public WebDriver wd;
		
	Actions actions;
	public NavigationHelper navigationHelper;
	public ClickHelper ClickHelper;
	public MoveHelper moveHelper;
	public SinhHelper sinhHelper;
	public ClickHelper clickHelper;
	public SelectorHelper selectorHelper;
	public PrintHelper printHelper;
	public ConfigHelper configHelper;
	
				
	 public void beforeTest(String browser) throws FileNotFoundException, IOException {
    	 
   	  // If the browser is Firefox, then do this
   	 
   	  if(browser.equals("firefox")) {
   	 
   		  this.wd = new FirefoxDriver();
   	 
   	  // If browser is IE, then do this	  
   	 
   	  }else if (browser.equals("chrome")) {

			// Here I am setting up the path for my IEDriver

			String exePath = "C:\\Users\\Denis Litinskiy\\Examples\\Toolsqa\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);

			this.wd = new ChromeDriver();
		}

   	this.actions = new Actions(this.wd);
    wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
  	wd.manage().window().maximize();
  	navigationHelper = new NavigationHelper(wd, actions);
  	moveHelper = new MoveHelper(wd, actions);
  	sinhHelper = new SinhHelper(wd, actions);
  	clickHelper = new ClickHelper(wd, actions);
  	selectorHelper = new SelectorHelper(wd, actions);
  	printHelper = new PrintHelper(wd, actions);
  	configHelper = new ConfigHelper (wd, actions);
   	  } 

  
	 


	public void init() throws IOException {

	
	}

	public void stop() {
		wd.quit();
	}

	public NavigationHelper goTo() {
		return navigationHelper;
	}

	public MoveHelper moveOn() {
		return moveHelper;
	}

	public SinhHelper sinhronizationWith() {
		return sinhHelper;
	}

	public ClickHelper clickOn() {
		return clickHelper;
	}

	public SelectorHelper selector() {
		return selectorHelper;
	}

	public PrintHelper print() {
		return printHelper;
	}

	public ConfigHelper config() {
		return configHelper;
	}
}
