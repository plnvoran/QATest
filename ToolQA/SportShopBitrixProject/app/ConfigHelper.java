package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ConfigHelper extends HelperBase {

	Properties properties;

	 
	//Constructor
		public ConfigHelper(WebDriver wd, Actions actions) throws FileNotFoundException, IOException {
			super(wd, actions);
			
			this.properties=new Properties();
			this.properties.load(new FileReader(new File(String.format("src/TestProp/config.properties"))));
		}
		
		public int getDeltaItem1()
		{
			
			 System .out.println(this.properties.getProperty("Item_2_number_for_add"));
			  System .out.println(this.  properties.getProperty("Item_3_number_for_add"));
			return 1;
		}
		
		public int getDeltaItem2()
		{
			return 1;
		}
		
}
