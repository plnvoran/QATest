package XStreamJson;

public class Product {

	public Product(String name, String id, double d) {
	
		this.name = name;
		this.id = id;
		this.price =  d;
	}

	public String name;
	public String  id;
	public double price;

	
	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
}
