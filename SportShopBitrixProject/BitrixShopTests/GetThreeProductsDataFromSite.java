package BitrixShopTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import model.ProductData;

public class GetThreeProductsDataFromSite extends TestBase{
	static List<ProductData> listFromModel = new ArrayList<ProductData>();
	
	@BeforeClass
    public void start() throws Exception {
	  System.out.println();
	  System.out.println("# Start GetThreeProductsDataFromSite");
	  System.out.println();
	  
	 listFromModel.clear();
	   
	 
    }
	
	
	

	@Test(dataProvider = "create1", dataProviderClass =AddManTsClearly.class)
	public void add1(ProductData item) {
		listFromModel.add(item);
	}

	@Test(dataProvider = "create2", dataProviderClass = AddWomanTsClearly.class)
	public void add2(ProductData item) {
		listFromModel.add(item);
	}

	@Test(dataProvider = "create3", dataProviderClass = AddWomanTsNight.class)
	public void add3(ProductData item) {
		listFromModel.add(item);
		
	app.print().printModel(listFromModel, "Create model");
	}

	
	@DataProvider(name = "listFromModel")
	public static Object[][] createData() {
		return new Object[][] { new Object[] { listFromModel } };
	}
	
	@AfterClass
    public void end() throws Exception {
	  		
		
	System.out.println();
	  System.out.println("# End GetThreeProductsDataFromSite");
	  System.out.println();

    }
}
