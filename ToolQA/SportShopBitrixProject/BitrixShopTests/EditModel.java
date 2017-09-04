package BitrixShopTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.ProductData;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TwoDataProviders.DataForTest;

public class EditModel extends TestBase {
	
	static List<ProductData> l = new ArrayList<ProductData>();
	
	@BeforeClass
	public void start() throws Exception {
		
		System.out.println();
		System.out.println("# Start EditModel");
		System.out.println();
		
	 l=null;
	 l= new ArrayList<ProductData>();
			
		
	
	}
	
	@Test(dataProvider = "listFromModel", dataProviderClass = GetThreeProductsDataFromSite.class)
	public void testEditModel(List<ProductData> listFromModel) {
		
		app.print().printModel(listFromModel, "Model before edit");
		listFromModel.get(1).setNum(3);
		listFromModel.get(2).setNum(2);
		
		l=listFromModel;
	
		app.print().printModel(listFromModel, "Model after edit");
		
	
	}
    

	
	@DataProvider(name = "editedList")
		public static Object[][] createData() {
		return new Object[][] { new Object[] { l } };
	}
	
	

	@AfterClass
	public void End() throws Exception {
		
		System.out.println();
		System.out.println("# End EditModel");
		System.out.println();

	}
}