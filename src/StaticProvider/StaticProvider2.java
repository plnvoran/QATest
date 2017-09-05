package StaticProvider;


import org.testng.annotations.DataProvider;


import model.ProductData;

public class StaticProvider2 {   
	
	@DataProvider(name = "create2")
	  public static Object[][] createData() {
	    return new Object[][] {
	      new Object[] { new ProductData().withName("test name2").withPrice(20).withNum(2) }
	    };
	  }
	
}

	
	
