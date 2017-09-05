package XStreamJson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class AddUsers {
	
public static void main(String[] args) throws IOException {
		
	
			WebDriver driver = new FirefoxDriver ();
				
			
			BufferedReader reader = new BufferedReader(new FileReader (new File ("e://test//users.json")));
			String json="";
			String line = reader.readLine();
			
			while (line !=null)
			{
				json+=line;
				line=reader.readLine();
				
			}
			
			Gson gson = new Gson();
			List<UserData> listOfUsers =gson.fromJson(json, new TypeToken<List<UserData>>(){}.getType());
			
			
			driver.get("http://localhost:6448/login/?register=yes");
					 					
			for (UserData user: listOfUsers)
			{
				
				driver.get("http://localhost:6448/login/?register=yes");
				
				new WebDriverWait(driver, 5)
	 			.until(ExpectedConditions
	 					.textToBe(By.xpath(".//*[@id='bx_basketFKauiI']/div/div[1]/a[2]"), "Регистрация"));
				
				
				driver.findElement(By.name("USER_NAME")).clear();
				driver.findElement(By.name("USER_NAME")).sendKeys(user.getFirstname());
				
				driver.findElement(By.name("USER_LAST_NAME")).clear();
				driver.findElement(By.name("USER_LAST_NAME")).sendKeys(user.getLastname());
				
				driver.findElement(By.name("USER_LOGIN")).clear();
				driver.findElement(By.name("USER_LOGIN")).sendKeys(user.getLogin());
				
				driver.findElement(By.name("USER_PASSWORD")).clear();
				driver.findElement(By.name("USER_PASSWORD")).sendKeys(user.getPassword());
				
				driver.findElement(By.name("USER_CONFIRM_PASSWORD")).clear();
				driver.findElement(By.name("USER_CONFIRM_PASSWORD")).sendKeys(user.getPassword());
		 		
				driver.findElement(By.name("USER_EMAIL")).clear();
				driver.findElement(By.name("USER_EMAIL")).sendKeys(user.getEmail());
				
		 		driver.findElement(By.name("Register")).click();
		 			 	
		 		//(new WebDriverWait(driver, 5)).until(ExpectedConditions
					//	.visibilityOfElementLocated(By.xpath(xpathExpression)));
		 		
		 		new WebDriverWait(driver, 5)
		 			.until(ExpectedConditions
		 					.textToBe(By.xpath(".//*[@id='bx_basketFKauiI']/div/div[1]/a[2]"), "Выйти"));
					
		 		driver.findElement(By.xpath(".//*[@id='bx_basketFKauiI']/div/div[1]/a[2]")).click();
		 		
		 		
			}
			
	       reader.close();
			// Close the driver
	        driver.quit();
		

	}
	
}
