package StaticProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import model.ProductData;

public class StaticProvider3 {
	@DataProvider(name = "create3")
	  public static Object[][] createData() {
	    return new Object[][] {
	      new Object[] { new ProductData().withName("test name3").withPrice(30).withNum(3) }
	    };
	  }
}
