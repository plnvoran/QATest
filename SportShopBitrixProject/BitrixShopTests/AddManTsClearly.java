package BitrixShopTests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import model.ProductData;

public class AddManTsClearly extends TestBase {
	static ProductData p;
	Integer number=1;
	
	@BeforeClass
    public void start() throws Exception {
	   
		p=null;
		
		
    }
	
	@Test
	public void testAddProduct() throws InterruptedException {

		//Check that you are on t-shot page
		app.sinhronizationWith().pictureManTsCleary();

		// Get pop up window of man t-shot Clearly
		app.moveOn().popUpWinPictureManTsClearly();
		app.sinhronizationWith().toCartButtonManTsCleary();

		//Get data about product
		p = app.selector().getDataOfManTsCleary();
		
		//Add number
		app.clickOn().addNumberMenTsClearly(number);
		//Get Number
		p.setNum(app.selector().getNumOfManTsCleary());
		
		// Add to card man t-shot Clearly
		app.clickOn().toCartButtonManTsCleary();

		// Close pop up
		app.sinhronizationWith().crossButtonPopUpManCleary();
		app.clickOn().crossButtonPopUpManCleary();

	}

	@DataProvider(name = "create1")
	public static Object[][] createData() {
		return new Object[][] { new Object[] { p } };
	}

}
