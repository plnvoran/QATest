package BitrixShopTests;

import org.testng.annotations.Test;

public class TestNotEC extends TestBase{
  @Test
  public void f() {
	  
	// Entrance on site
	  app.goTo().tShortPage();
		app.sinhronizationWith().pictureManTsCleary();
		
		// Get pop up window of woman t-shot Clearly
		app.moveOn().popUpWinPictureWomanTsClearly();
		app.sinhronizationWith().toCartButtonWomanTsCleary();
			
		//Add number
		app.clickOn().addNumberWomenTsClearly(2);
		
		app.sinhronizationWith().waitNotValue("bx_328740560_19_quantity", "1");
		
	
		

	  
  }
}
