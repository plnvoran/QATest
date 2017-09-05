package XstreamList;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import XstreamAlias.Blog;
import XstreamAlias.Entry;

import com.thoughtworks.xstream.XStream;

import XStreamJson.UserData;

public class Writer {

	public static void main(String[] args) {

		XStream xs = new XStream();

	

		// Write to a file in the file system
		try {
			FileOutputStream fs = new FileOutputStream(
					"e://test//employeedata.xml", true);

			xs.toXML(generateContacts(5), fs);

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}

	public static List<UserData> generateContacts(int count) {
		List <UserData> listOfEmp = new ArrayList<UserData>();
		
		
		for (int i=1; i<count+1; i++)
		{
			listOfEmp.add(new UserData("xml_firstname"+i, "xml_lastname"+i, "xml_anonymus"+i, "111000"+i, i+"_xml@gmail.ru"));
		}

		
		return listOfEmp;
	}

}