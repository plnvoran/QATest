package TwoDataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Create {
  static DataForTest i = new DataForTest();

	
	@Test
  public void f() {
	
		i.setI(1);
		
  }
	
	@DataProvider(name = "create")
	public static Object[][] createData() {
		return new Object[][] { new Object[] { i } };
	}
}
