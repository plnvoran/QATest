package TwoDataProviders;

import java.util.ArrayList;
import java.util.List;


import org.testng.annotations.Test;


public class Sum2 {
	
	public  List<DataForTest> list = new ArrayList<DataForTest>();
	
	@Test
	(dataProvider = "sum", dataProviderClass =Sum.class)
	public void f(List<DataForTest> list ) {
		for (DataForTest j : list)
		{
			
			System.out.println(j.getI());
		}
		
	}
	
	
	
	
}
