package Lion;

import java.util.Scanner;

import Lion.Behavior.Behavior;
import Lion.Data.Lion;
import Lion.Logic.Parts;

public class Game {

	public static void main(String[] args) {
		
		Parts parts = new Parts ();
		Lion lion;
		Behavior behavior = new Behavior();
		Scanner sc = new Scanner(System.in); 

		parts.messageForStart();
		lion=parts.setStartState(sc);
		
		for (int i=0; i<5; i++)
		{
		
		parts.messageForGetInput(5-i);
		String input = parts.getInput(sc);				
		parts.printResults(behavior.behavior(input, lion));
		
		}
	}
}
