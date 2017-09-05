package XstreamList;

import model.ProductData;

public class Employee {
    private String name;
    private String designation;
    private String department;

    
    
    public Employee withName(String name) {
        this.name = name;
        return this;
    }
    
    public Employee withDesignation(String designation) {
        this.designation = designation;
        return this;
    }
    
    public Employee withDepartment(String department) {
        this.department = department;
        return this;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDesignation() {
        return designation;
    }
    
    public String getDepartment() {
        return department;
    }
    
    
    
    @Override
    public String toString() {
        return "Name : "+this.name+
        "\nDesignation : "+this.designation+
        "\nDepartment : "+this.department;
    }
}