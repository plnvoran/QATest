package BitrixShopTests;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import model.ProductData;

public class CheckSum2 extends TestBase {
	  float sumFromModel=0;
	
	  @BeforeClass
	    public void start() throws Exception {
		  System.out.println();
		  System.out.println("# Start CheckSum2");
		  System.out.println();

	    }
	@Test (priority=0)
  public void testGetSumFromSite() {
			
	  	// Goto Cart
		//app.goTo().cart();
						
		// Sum from site
		System.out.println("I am getting sum from site (checksum):");
		float a=app.selector().getSum();
		System.out.println(a);
		
	
  }
  
  @Test(dataProvider = "editedList", dataProviderClass =EditModel.class, priority=1)
	public void sumFromModel(List <ProductData> list) {
	 
	  
	  sumFromModel= app.selector().sumCulculator(list);
	

	  System.out.println("I am getting sum from model (checksum):");
	  System.out.println(sumFromModel);
	  }
  
     
  
  @Test (priority=3)
  public void  compareSums() {
	 
	  
		//Compare sums from site and model
	  
	  float s=app.selector().getSum();
	  System.out.println("sum site "+s);
	  assertEquals(s, sumFromModel);
	  
	  }
  
  @AfterClass
  public void End() throws Exception {
	  System.out.println();
	  System.out.println("# End CheckSum2");
	  System.out.println();

  }
  
}
