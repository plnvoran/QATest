package XStreamJson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import model.ProductData;

public class ReadFromJSON {
	
	public static void main(String[] args) throws IOException {
		
		
	BufferedReader reader = new BufferedReader(new FileReader (new File ("e://test//staff.json")));
	String json="";
	String line = reader.readLine();
	
	while (line !=null)
	{
		json+=line;
		line=reader.readLine();
		
	}
	
	Gson gson = new Gson();
	List<Staff> s =gson.fromJson(json, new TypeToken<List<Staff>>(){}.getType());
	
	
	for ( Staff e : s) {

		System.out.print(e.getName());
		System.out.print(" ");
		System.out.print(e.getAge());
		System.out.print(" ");
		System.out.print(e.getPosition());
		System.out.print(" ");
		System.out.print(e.getSalary());
		System.out.print(" ");
		System.out.println();
		System.out.println();

		
	}
	
	}
}
