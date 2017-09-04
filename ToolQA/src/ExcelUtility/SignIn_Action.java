
package ExcelUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ExcelUtility.ExcelUtils;

// Now this method does not need any arguments

public class SignIn_Action {
	
	
	public static void login(WebDriver driver, int n) throws Exception {
		String z = "";

		for (int i = 1; i < n + 1; i++) {

			String sUserName = ExcelUtils.getCellData(i, 1);

			String sPassword = ExcelUtils.getCellData(i, 2);

			driver.get(Constant.URL);
			driver.findElement(By.name("USER_LOGIN")).clear();
			driver.findElement(By.name("USER_LOGIN")).sendKeys(sUserName);
			
			driver.findElement(By.name("USER_PASSWORD")).clear();
			driver.findElement(By.name("USER_PASSWORD")).sendKeys(sPassword);
			driver.findElement(By.name("Login")).click();

			z = new WebDriverWait(driver, 5)
					.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath(".//*[@id='bx_basketFKauiI']/div/div[1]/a[1]")))
					.getText();

			if (z.equals("Denis Litinskiy")) {
				System.out.println("OK");
				ExcelUtils.setCellData("Pass", i, 3);
				logout(driver);
				
			} else {
				System.out.println("Fail");
				ExcelUtils.setCellData("Fail", i, 3);

			}

		}
	}
	
	public static void logout(WebDriver driver)
	{
		String z = "";

		driver.findElement(By.xpath(".//*[@id='bx_basketFKauiI']/div/div[1]/a[2]")).click();
		z = new WebDriverWait(driver, 5)
				.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath(".//*[@id='bx_basketFKauiI']/div/div[1]/a[1]")))
				.getText();

		if (z.equals("Войти")) {
			System.out.println("Logout OK");
			
		} else {
			System.out.println("Logout Fail");
			

		}
	}
	
}