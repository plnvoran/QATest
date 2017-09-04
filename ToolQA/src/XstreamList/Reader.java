package XstreamList;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import model.ProductData;

import com.thoughtworks.xstream.*;
import com.thoughtworks.xstream.io.xml.DomDriver;

import XStreamJson.UserData;

public class Reader {

    public static void main(String[] args) {
        XStream xs = new XStream(new DomDriver());
      

        try {
            FileInputStream fis = new FileInputStream("e://test//employeedata.xml");
           
         
           // PersonList pList = (PersonList)xs.fromXML(fis);
            List<UserData> pList = (ArrayList<UserData>)xs.fromXML(fis);
            
            
            
         printModel (pList);
     

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }
    
    public static void printModel(List<UserData> l) {

		for (UserData p : l) {

			System.out.print(p.getFirstname());
			System.out.println();
			
		

		}
		

	}
}