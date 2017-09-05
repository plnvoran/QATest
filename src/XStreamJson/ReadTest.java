package XStreamJson;



import com.thoughtworks.xstream.XStream;

import com.thoughtworks.xstream.io.json.JsonHierarchicalStreamDriver;

public class ReadTest {

	public static void main(String[] args) {
		String json = "{\"product\":{\"name\":\"Banana\",\"id\":123"
		    + ",\"price\":23.0}}";
		    
		XStream xstream = new XStream(new JsonHierarchicalStreamDriver());
		xstream.alias("product", Product.class);
		Product product = (Product)xstream.fromXML(json);
		System.out.println(product);
	}

}