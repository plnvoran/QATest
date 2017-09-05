package TestProp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestProp {
  @Test
  public void f() throws FileNotFoundException, IOException {
	  
	  Properties properties=new Properties();
	  properties.load(new FileReader(new File(String.format("src/TestProp/config.properties"))));

	  System .out.println(properties.getProperty("web.adminLogin"));
	  System .out.println(  properties.getProperty("web.adminPassword"));
	  
	  
	
	  
  }
}
