package app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SinhHelper extends HelperBase {
	public SinhHelper(WebDriver wd, Actions actions) {
		super(wd, actions);

	}
	
	//Sinh. of getting on main page 
	public void mainMenu() {
		
		waitXpath(".//*[@id='cont_catalog_menu_Lk7Vbr']");
	}
	
	//Sinh. of getting on t-shot page 
	public void pictureManTsCleary() {

		waitXpath(".//*[@id='bx_328740560_18_pict']");
	}
	
	//Sinh. of ManTsCleary
	public void toCartButtonManTsCleary() {
		
		waitXpath(".//*[@id='bx_328740560_18_buy_link']");
		
	}
	public void crossButtonPopUpManCleary() {
		waitXpath(".//*[@id='CatalogSectionBasket_bx_328740560_18']/a");

	}
	
	//Sinh. of WomanTsCleary
	public void toCartButtonWomanTsCleary() {
		
		waitXpath(".//*[@id='bx_328740560_19_buy_link']");

	}
	public void crossButtonPopUpWomanCleary() {
		waitXpath(".//*[@id='CatalogSectionBasket_bx_328740560_19']/a");

	}
	
	//Sinh. of WomanTsNight
	public void toCartButtonWomanTsNight() {
	
		waitXpath(".//*[@id='bx_328740560_20_buy_link']");
	}
	public void crossButtonPopUpWomanNight() {
		waitXpath(".//*[@id='CatalogSectionBasket_bx_328740560_20']/a");
	}

	//Sinh. of editing item N
		public void isItemEdited(List<String> listItem, int n) {
			
		String baseBath=".//*[@id='basket_items']/tbody/tr[";
		String num="]//td[6]//input[@type='text']";
		String sumForItem="]//td[7]/div";
		
		waitNotValue(baseBath+convertIntToString(n)+num,listItem.get(0));
		waitNotText(wd.findElement(By.xpath(baseBath+convertIntToString(n)+sumForItem)),listItem.get(1));
		waitNotText(wd.findElement(By.xpath(".//*[@id='allSum_FORMATED']")), listItem.get(2));

	}
	
}
