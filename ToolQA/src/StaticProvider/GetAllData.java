package StaticProvider;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import model.ProductData;

public class GetAllData {

	static List<ProductData> listExp = new ArrayList<ProductData>();

	@Test(dataProvider = "create1", dataProviderClass = StaticProvider1.class)
	public void add1(ProductData item) {
		listExp.add(item);
	}

	@Test(dataProvider = "create2", dataProviderClass = StaticProvider2.class)
	public void add2(ProductData item) {
		listExp.add(item);
	}

	@Test(dataProvider = "create3", dataProviderClass = StaticProvider3.class)
	public void add3(ProductData item) {
		listExp.add(item);
	}

	@Test
	public void print() {
		for (ProductData p : listExp) {
			System.out.println(p.getName());
		}
	}
	
}
