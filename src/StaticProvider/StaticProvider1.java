package StaticProvider;




import org.testng.annotations.DataProvider;

import model.ProductData;

public class StaticProvider1 {
	
	@DataProvider(name = "create1")
	  public static Object[][] createData() {
	    return new Object[][] {
	      new Object[] { new ProductData().withName("test name1").withPrice(10).withNum(1) }
	    };
	  }
	}
