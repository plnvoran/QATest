package XStreamJson;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class ConvertObjToJSON {
	public static void main(String[] args) throws IOException {
		
		
		List <Staff> list= new ArrayList<Staff>();
				
		Staff king = new Staff("Ivan", 4, "King", 100);
		Staff queen = new Staff("Elizabeth", 1, "Queen", 200);
				
		list.add(king);
		list.add(queen);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		

		String json = gson.toJson(list);

		Writer writer = new FileWriter("e://test//staff.json");

		writer.write(json);
		writer.close();

	}
}
