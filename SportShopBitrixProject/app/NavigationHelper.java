package app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigationHelper extends HelperBase {

	public NavigationHelper(WebDriver wd, Actions actions) {
		super(wd, actions);

	}

	public void homePage() {
		openPage("http://localhost:6448");
	}

	public void tShortPage() {
		openPage("http://localhost:6448/catalog/t-shirts/");

	}

	public void cart() {
		openPage("http://localhost:6448/personal/cart/");
	}
	
}
