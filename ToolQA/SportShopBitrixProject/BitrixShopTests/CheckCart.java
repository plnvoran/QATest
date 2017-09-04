package BitrixShopTests;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import model.ProductData;

public class CheckCart extends TestBase {
	@BeforeClass
    public void start() throws Exception {
	  System.out.println();
	  System.out.println("# Start CheckCart");
	  System.out.println();
	
	   
	 
    }
	
	@AfterClass
    public void end() throws Exception {
	  System.out.println();
	  System.out.println("# End CheckCart");
	  System.out.println();
	  

	 
    }
	
	
	
	@Test(dataProvider = "listFromModel", dataProviderClass =GetThreeProductsDataFromSite.class, priority=1)
  public void testCheckCart(List <ProductData> listFromModel) {
		
		app.goTo().cart();

		// Get content of the cart
		List<ProductData> cart = app.selector().getListElements();
		// Print content of the cart
		app.print().getItemFromCart("1");
		app.print().printModel(cart, "cart");
		app.print().printModel(listFromModel, "model");
		assertEquals(listFromModel, cart);
	
  }
}
