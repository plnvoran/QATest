package app;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BitrixShopTests.TestBase;
import model.ProductData;

public class PrintHelper extends HelperBase {

	public PrintHelper(WebDriver wd, Actions actions) {
		super(wd, actions);
	}

	public void printModel(List<ProductData> l, String msg) {

		System.out.println("  ##   " + msg);

		float summer = 0;

		for (ProductData p : l) {

			System.out.print(p.getName());
			System.out.print(" ");
			System.out.print(p.getPrice());
			System.out.print(" ");
			System.out.print(p.getNum());
			System.out.print(" ");
			System.out.println();

			summer = summer + (p.getPrice() * p.getNum());

		}
		System.out.println("Summer:");
		System.out.println(summer);
		System.out.println();

	}

	public void printItemNumber(List<String> itemList, String msg, String n) {

		System.out.println("  ##   " + msg);
		System.out.println("  ##   Data of Item " + n + ":");

		for (String par : itemList) {
			System.out.println(par);
		}

	}

	public List<String> getItemFromCart(String n) {
		List<String> itemList = new ArrayList<String>();

		String baseLine = ".//*[@id='basket_items']/tbody/tr[" + n + "]";
		String num = "//input[@type='text']";
		String sumItem = "//td[7]/div";
		String mainSum = ".//*[@id='allSum_FORMATED']";

		itemList.add(wd.findElement(By.xpath(baseLine + num)).getAttribute(
				"value"));
		itemList.add(wd.findElement(By.xpath(baseLine + sumItem)).getText());
		itemList.add(wd.findElement(By.xpath(mainSum)).getText());

		return itemList;

	}

}
