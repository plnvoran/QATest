package XStreamJson;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.thoughtworks.xstream.XStream;

import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;

public class WriteTest {

	public static void main(String[] args) {

        Product product = new Product("Banana", "123", 23.00);
        
        XStream xstream = new XStream(new JsonHierarchicalStreamDriver());
      
        xstream.alias("product", Product.class);

        System.out.println(xstream.toXML(product));		
        
        //Write to a file in the file system
        try {
            FileOutputStream fs = new FileOutputStream("e://test//product.json", true);
            
           
            xstream.toXML(product, fs);
            
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
		
	}

}