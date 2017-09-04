package TwoDataProviders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Sum {
	
	public static List<DataForTest> list = new ArrayList<DataForTest>();

	@BeforeTest
	public void start(){
					  
		Collections.reverse(list);
		for (int i=0; i<list.size(); i++)
		{
		list.remove(i);
		}
		System.out.println("BC");	
    
	}
	
	
	
	@Test
	(dataProvider = "create", dataProviderClass =Create.class)
	public void f( DataForTest i) {
     
		list.add(i);
	}
	
	
	@DataProvider(name = "sum")
	public static Object[][] createData() {
		System.out.println("DP");
		return new Object[][] { new Object[] { list } };
	
	}
	
	
	
	
	
	
}
