package BitrixShopTests;

import org.testng.annotations.Test;

public class Start extends TestBase {
	@Test
	public void testStart() {

		// Entrance on site
		app.goTo().homePage();
		app.sinhronizationWith().mainMenu();

		// Goto to T-short page
		app.goTo().tShortPage();
		
	}
}
