package XStreamJson;

import java.math.BigDecimal;
import java.util.List;

public class Staff {

	private String name;
	private int age;
	private String position;
	private int salary;
	public Staff(String name, int age, String position, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.position = position;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + ", position=" + position + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPosition() {
		return position;
	}
	public int getSalary() {
		return salary;
	}

	
	
}