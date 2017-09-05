package BitrixShopTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import model.ProductData;

public class AddWomanTsNight extends TestBase{
	static ProductData p;
	Integer number=3;

	@BeforeClass
    public void start() throws Exception {
	   
		
		
		
    }
	
	
	@Test
  public void testAddProduct() throws InterruptedException {
		
	  		// Get pop up window of woman t-shot Night
			app.moveOn().popUpWinPictureWomanTsNight();
			app.sinhronizationWith().toCartButtonWomanTsNight();
			
			//Get data about product
			p = app.selector().getDataOfWomanTsNight();
			
			
			//Add number
			app.clickOn().addNumberWomenTsNight(number);
			
			//Get Number
			p.setNum(app.selector().getNumOfWomanTsNight());
						
			
			// Add to card woman t-shot Night
			app.clickOn().toCartButtonWomanTsNight();

			// Close pop up
			app.sinhronizationWith().crossButtonPopUpWomanNight();
			app.clickOn().crossButtonPopUpWomanNight();
			
			
  }
	
	@DataProvider(name = "create3")
	public static Object[][] createData() {
		return new Object[][] { new Object[] { p } };
	}

}
