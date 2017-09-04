package app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class MoveHelper extends HelperBase {

	public MoveHelper(WebDriver wd, Actions actions) {
		super(wd, actions);
		}
			
	public void popUpWinPictureManTsClearly ()
	{
		moveTo("bx_328740560_18_pict");
	}
		
	public void popUpWinPictureWomanTsClearly ()
	{
		moveTo("bx_328740560_19_pict");
	}

	public void popUpWinPictureWomanTsNight() {
		moveTo("bx_328740560_20_pict");
	}
	
}

	

