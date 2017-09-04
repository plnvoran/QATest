package BitrixShopTests;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;

import model.ProductData;

public class CheckSum extends TestBase {
	  float sumFromModel=0;
	  
	@Test
  public void testGetSumFromSite() {
	 
	  	
		
	  	// Goto Cart
		app.goTo().cart();
						
		// Sum from site
		System.out.println("I am getting sum from site:");
		System.out.println(app.selector().getSum());
		
	
  }
  
  @Test(dataProvider = "listFromModel", dataProviderClass =GetThreeProductsDataFromSite.class, priority=1)
	public void sumFromModel(List <ProductData> list) {
	 
	  
	  sumFromModel= app.selector().sumCulculator(list);
	

	  System.out.println("I am getting sum from model:");
	  System.out.println(Float.toString(sumFromModel));
	  
	  }
  
     
  
  @Test (priority=3)
  public void  compareSums() {
	 
	 
		//Compare sums from site and model
		assertEquals(sumFromModel, app.selector().getSum());
	  
	  }
  
}
