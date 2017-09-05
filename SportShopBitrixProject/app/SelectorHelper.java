package app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import model.ProductData;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SelectorHelper extends HelperBase {

	public SelectorHelper(WebDriver wd, Actions actions) {
		super(wd, actions);

	}

		
	public float sumCulculator(List<ProductData> listFromModel) {
		float summer = 0;
			
		for (ProductData b: listFromModel)
		{						
			summer = summer + (b.getPrice()*b.getNum());		
		}
						
		return summer;
	}

	public float getSum() {
		String itogo = "allSum_FORMATED";
		return convertStringToFloat(wd.findElement(By.xpath( ".//*[@id='"+itogo+"']")).getText());
	}

	

	public List<ProductData> getListElements() {

		List<ProductData> listFromCart = new ArrayList<ProductData>();

		List <WebElement> elementsOfCart =
		wd.findElements(By.xpath(".//*[@id='basket_items']/tbody/tr"));
		
		for (WebElement item :elementsOfCart)

		{
			
			listFromCart.add(
					new ProductData()
					.withName(item.findElement(By.xpath(".//td[3]/h2/a")).getText())
					.withPrice(convertStringToFloat(item.findElement(By.xpath(".//td[5]/div[1]")).getText()))
					.withNum(convertStringToInt(item.findElement(By.xpath(".//td[6]/input")).getAttribute("value")))
					)  ;
			
			

		}
		return listFromCart;

	}
	
	public void prinListElement(List<ProductData> before) {
		
			System.out.println("I am printing from model:");
			for (ProductData b: before)
			{
		
			System.out.print(b.getName());
			System.out.print(" ");
			System.out.print(b.getPrice());
			System.out.print(" ");
			System.out.print(b.getNum());
			System.out.println();
			
			}
		
		

	}



	public ProductData getDataOfManTsCleary() {
	
		return new ProductData()
		.withName(wd.findElement(By.xpath(".//*[@id='bx_328740560_18']/div[1]/a")).getText())
		.withPrice(convertStringToFloat(wd.findElement(By.xpath(".//*[@id='bx_328740560_18_price']")).getText()))
		;
		
	     
		
	}

	public int getNumOfManTsCleary() {
		return Integer.valueOf(wd.findElement(By.id("bx_328740560_18_quantity")).getAttribute("value"));
				
	}


	public ProductData getDataOfWomanTsCleary() {
		return new ProductData()
				.withName(wd.findElement(By.xpath(".//*[@id='bx_328740560_19']/div[1]/a")).getText())
				.withPrice(convertStringToFloat(wd.findElement(By.xpath(".//*[@id='bx_328740560_19_price']")).getText()))
				
						;
				
	}

	public int getNumOfWomanTsCleary() {
		return Integer.valueOf(wd.findElement(By.id("bx_328740560_19_quantity")).getAttribute("value"));
				
	}


	public ProductData getDataOfWomanTsNight() {
		
		return new ProductData()
				.withName(wd.findElement(By.xpath(".//*[@id='bx_328740560_20']/div[1]/a")).getText())
				.withPrice(convertStringToFloat(wd.findElement(By.xpath(".//*[@id='bx_328740560_20_price']")).getText()))
				
				;
				
	}



	public int getNumOfWomanTsNight() {
		// TODO Auto-generated method stub
		return Integer.valueOf(wd.findElement(By.id("bx_328740560_20_quantity")).getAttribute("value"));
	}



	

	
}
