package BitrixShopTests;

import java.util.List;

import org.testng.annotations.Test;

import model.ProductData;

public class ClearModel {
	 @Test(dataProvider = "editedList", dataProviderClass =EditModel.class, priority=1)
		public void testClearModel(List <ProductData> list) {
		 
  }
}
