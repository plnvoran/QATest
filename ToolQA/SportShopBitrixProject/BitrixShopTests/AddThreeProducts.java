package BitrixShopTests;


import java.util.ArrayList;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.Test;

import model.ProductData;

public class AddThreeProducts extends TestBase {

	@Test
	public void testAddProduct() throws InterruptedException {

		
		
		// Entrance on site
		app.goTo().homePage();
		app.sinhronizationWith().mainMenu();

		// Goto to T-short page
		app.goTo().tShortPage();
		app.sinhronizationWith().pictureManTsCleary();

		// Get pop up window of man t-shot Clearly
		app.moveOn().popUpWinPictureManTsClearly();
		app.sinhronizationWith().toCartButtonManTsCleary();

		// Add to card man t-shot Clearly
		app.clickOn().toCartButtonManTsCleary();

		// Close pop up
		app.sinhronizationWith().crossButtonPopUpManCleary();
		app.clickOn().crossButtonPopUpManCleary();

		// Get pop up window of woman t-shot Clearly
		app.moveOn().popUpWinPictureWomanTsClearly();
		app.sinhronizationWith().toCartButtonWomanTsCleary();

		// Add to card woman t-shot Clearly
		app.clickOn().toCartButtonWomanTsCleary();

		// Close pop up
		app.sinhronizationWith().crossButtonPopUpWomanCleary();
		app.clickOn().crossButtonPopUpWomanCleary();

		// Get pop up window of woman t-shot Night
		app.moveOn().popUpWinPictureWomanTsNight();
		app.sinhronizationWith().toCartButtonWomanTsNight();

		// Add to card woman t-shot Night
		app.clickOn().toCartButtonWomanTsNight();

		// Close pop up
		app.sinhronizationWith().crossButtonPopUpWomanNight();
		app.clickOn().crossButtonPopUpWomanNight();

	

	}

}
