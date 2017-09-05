package BitrixShopTests;



import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import app.ApplicationManager;

/**
 * Created by Denis on 18.03.2017.
 */
public class TestBase {
	 protected static final ApplicationManager app
     = new ApplicationManager();
    

    @BeforeSuite
    @Parameters("browser")
    public void setUp(String browser) throws Exception {

        app.init();
        app.beforeTest(browser);
        

    }
    
   
   
    @AfterSuite
    public void End() throws Exception {

        app.stop();

    }
    
    

}
