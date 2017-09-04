package BitrixShopTests;

import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EditCart extends TestBase {
	
	String plus="plus";
	String minus="minus";
	
	//int item2=2;
	//int item3=3;
	
	
	@BeforeClass
	public void start() throws Exception {
		System.out.println();
		System.out.println("# Start Edit Cart");
		System.out.println();

	}
	
	@Parameters({ "item2",  "item3"})
	@Test
	public void testEditCart(String item2, String item3) {
		
	int n2=	app.goTo().convertStringToInt(item2);
		int n3=app.goTo().convertStringToInt(item3);
		
		
		// Goto Cart
		app.goTo().cart();

		// ##AJUST ITEM 2
		// Print item 2 before ajust
		List<String> listItem = app.print().getItemFromCart("2");
		app.print().printItemNumber(listItem, "Before", "2");
		// Ajust
		app.clickOn().itemInCartPlusOrMinus(plus, 1, n2);
		// Sync of changing sum and num
		app.sinhronizationWith().isItemEdited(listItem, 2);
		// Print item 2 after ajust
		app.print().printItemNumber(app.print().getItemFromCart("2"), "After",
				"2");

		// ##AJUST ITEM 3
		// Print item 3 before ajust
		listItem = app.print().getItemFromCart("3");
		app.print().printItemNumber(listItem, "Before", "3");
		// Ajust
		app.clickOn().itemInCartPlusOrMinus(minus, 1, n3);
		// Sync of changing sum and num
		app.sinhronizationWith().isItemEdited(listItem, 3);
		// Print item 3 after ajust
		app.print().printItemNumber(app.print().getItemFromCart("3"), "After",
				"3");

	}

	@AfterClass
	public void end() throws Exception {
		System.out.println();
		System.out.println("# End Edit Cart");
		System.out.println();

	}
}
