package app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Denis on 19.03.2017.
 */
public class HelperBase {
	public WebDriver wd;
	public Actions actions;

	// Constructor
	public HelperBase(WebDriver wd, Actions actions) {
		this.wd = wd;
		this.actions = actions;
	}

	//Navigators
	public void openPage(String string) {
		wd.get(string);
	}
	public void moveTo(String id) {
		actions.moveToElement(wd.findElement(By.id(id))).build().perform();
	}

	//Clicker
	public void click(By locator) {
		wd.findElement(locator).click();
	}

	//Typer
	protected void type(By locator, String text) {
		click(locator);
		if (text != null) {
			String existingText = wd.findElement(locator).getAttribute("value");
			if (!text.equals(existingText)) {
				wd.findElement(locator).clear();
				wd.findElement(locator).sendKeys(text);
			}
		}
	}

	//Waiter of positive event
	public void waitXpath(String xpathExpression) {
		(new WebDriverWait(wd, 10)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(xpathExpression)));
	}
	
	//Waiters of negative events
	public void waitNotValue(String xpathEx, String num) {
		(new WebDriverWait(wd, 10)).until(ExpectedConditions
				.not(ExpectedConditions.attributeToBe(By.xpath(xpathEx),
						"value", num)));
	}
	public void waitNotText(WebElement e, String text) {
		(new WebDriverWait(wd, 10)).until(ExpectedConditions
				.not(ExpectedConditions.textToBePresentInElement(e, text)));
	}
	
	//Converters
	public int convertStringToInt( String text) {
		return Integer.valueOf(text);
	}
	public String convertIntToString( int n) {	  		  
		return Integer.toString(n);
	}
	public float convertStringToFloat(String a) {

		StringBuffer buffer = new StringBuffer();
		Pattern regexp = Pattern.compile(" руб.");
		Matcher m = regexp.matcher(a);
		while (m.find()) {
			m.appendReplacement(buffer, "");

		}

		a = m.appendTail(buffer).toString();

		StringBuffer buffer2 = new StringBuffer();
		Pattern regexp2 = Pattern.compile(" ");
		Matcher m2 = regexp2.matcher(a);
		while (m2.find()) {
			m2.appendReplacement(buffer2, "");

		}

		return Float.parseFloat(m2.appendTail(buffer2).toString());

	}
	
	
}
