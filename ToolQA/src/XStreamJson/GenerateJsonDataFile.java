package XStreamJson;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GenerateJsonDataFile {
	 
	public static void main(String[] args) throws IOException {
			
		int n=5;
		
		List <UserData> list= new ArrayList<UserData>();
				
		for (int i=1; i<n+1; i++)
		{
			list.add(new UserData("firstname"+i, "lastname"+i, "anonymus"+i, "111000"+i, i+"@gmail.ru"));
		}
								
	
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		

		String json = gson.toJson(list);

		Writer writer = new FileWriter("e://test//users.json");

		writer.write(json);
		writer.close();

	}
}
