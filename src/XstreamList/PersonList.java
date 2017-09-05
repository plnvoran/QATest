package XstreamList;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

    public List<Employee> list;

    

	public PersonList(){
        list = new ArrayList<Employee>();
    }

   
    
    public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}
}