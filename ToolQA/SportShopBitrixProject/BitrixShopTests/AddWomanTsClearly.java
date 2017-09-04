package BitrixShopTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import model.ProductData;

public class AddWomanTsClearly extends TestBase {
	static ProductData p;
	int numberOfProduct = 2;
	
	@BeforeClass
    public void start() throws Exception {
	   
		p=null;
		
		
    }
	@Test
	public void testAddProduct() throws InterruptedException {

		// Get pop up window of woman t-shot Clearly
		app.moveOn().popUpWinPictureWomanTsClearly();
		app.sinhronizationWith().toCartButtonWomanTsCleary();

		// Get data about product
		p = app.selector().getDataOfWomanTsCleary();

		// Add number
		app.clickOn().addNumberWomenTsClearly(numberOfProduct);
		// Get Number
		p.setNum(app.selector().getNumOfWomanTsCleary());

		// Add to card woman t-shot Clearly
		app.clickOn().toCartButtonWomanTsCleary();

		// Close pop up
		app.sinhronizationWith().crossButtonPopUpWomanCleary();
		app.clickOn().crossButtonPopUpWomanCleary();
	}

	@DataProvider(name = "create2")
	public static Object[][] createData() {
		return new Object[][] { new Object[] { p } };
	}
}