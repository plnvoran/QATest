package Lion;

import java.util.Scanner;

import Lion.Behavior.Behavior;
import Lion.Data.Lion;
import Lion.Data.Outside;
import Lion.Logic.Parts;

public class Game {

	public static void main(String[] args) {
		Parts parts = new Parts ();
		String line = "";
		Outside outside;
		Lion lion;
		Behavior behavior = new Behavior();
		Scanner sc = new Scanner(System.in); // создаём объект класса Scanner

		parts.messageForStart();
		lion=parts.setStartState(sc);
		
		for (int i=0; i<10; i++)
		{
		
		parts.messageForInputOutside();
		outside=parts.setOutside(sc);
		behavior.behavior(outside, lion);
		
		}
	}
}
