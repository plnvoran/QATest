package app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHelper extends HelperBase {
	
	//Constructor
	public ClickHelper(WebDriver wd, Actions actions) {
		super(wd, actions);
	}
	
	//Clicks for adding of ManTsCleary
	public void toCartButtonManTsCleary() {
		click(By.id("bx_328740560_18_buy_link"));
	}
	public void crossButtonPopUpManCleary() {
		click(By.xpath(".//*[@id='CatalogSectionBasket_bx_328740560_18']/a"));
	}
	
	//Clicks for adding of WomanTsCleary
	public void toCartButtonWomanTsCleary() {
		click(By.id("bx_328740560_19_buy_link"));
	}
	public void crossButtonPopUpWomanCleary() {
		click(By.xpath(".//*[@id='CatalogSectionBasket_bx_328740560_19']/a"));
	}
	
	//Clicks for adding of WomanTsNight
	public void toCartButtonWomanTsNight() {
		click(By.id("bx_328740560_20_buy_link"));
	}
	public void crossButtonPopUpWomanNight() {
		click(By.xpath(".//*[@id='CatalogSectionBasket_bx_328740560_20']/a"));
	}

	

	//Add items, increase numbers
	public void addNumberMenTsClearly(int n) {
		for (int i = 1; i < n; i++) {
			click(By.id("bx_328740560_19_quant_up"));
		}
	}
	public void addNumberWomenTsClearly(int n) {
		for (int i = 1; i < n; i++) {
			click(By.id("bx_328740560_19_quant_up"));
		}
	}
		public void addNumberWomenTsNight(int n) {

		for (int i = 1; i < n; i++) {
			click(By.id("bx_328740560_20_quant_up"));
		}
	}

	//Edit numbers of item
	public void itemInCartPlusOrMinus(String sign, int n, int item) {			
		for (int i = 0; i < n; i++) {
			click(By.xpath(".//*[@id='basket_items']/tbody/tr["+convertIntToString(item)+"]//*[@class='"+sign+"']"));
		}
	}
	
	//Sinh. of editing item N
			public void isItemEdited(List<String> listItem, int n) {	
			
			waitNotValue(".//*[@id='basket_items']/tbody/tr["+convertIntToString(n)+"]//td[6]//input[@type='text']",listItem.get(0));
			waitNotText(wd.findElement(By.xpath(".//*[@id='basket_items']/tbody/tr["+convertIntToString(n)+"]//td[7]/div")),listItem.get(1));
			waitNotText(wd.findElement(By.xpath(".//*[@id='allSum_FORMATED']")), listItem.get(2));

		}

}
