package model;

public class ProductData {

	

	

	@Override
	public String toString() {
		return "ProductData [index=" + index + ", name=" + name + ", price=" + price + ", num=" + num + "]";
	}

	private int index;
	private String name;
	private float price;
	private int num;
		
	public ProductData withIndex(int index) {
		this.index = index;
		return this;
	}
	
	public void setNum (int num) {
		this.num= num;
		
	}
	
	public ProductData withName(String name) {
		this.name = name;
		return this;
	}
	
	
	

	public ProductData withPrice(float price) {
		this.price = price;
		return this;
	}
	
	public ProductData withNum(int num) {
		this.num = num;
		return this;
	}
	
	public int getIndex() {
		return index;
	}

	

	public String getName() {
		return name;
	}

	

	public float getPrice() {
		return price;
	}

	public float getNum() {
		return num;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + num;
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductData other = (ProductData) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num != other.num)
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}
	
	
	
	}
	
	
	
	
	

