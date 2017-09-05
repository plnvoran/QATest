package Lion.Logic;

import java.util.Scanner;

import Lion.Behavior.Behavior;
import Lion.Data.Lion;
import Lion.Data.Output;

public class Parts {
	
	public void messageForStart() {
		System.out.println("Game The Lion's started. ");
		System.out.println("You have 5 times fo plaing");
		System.out.println("Type the lion's state in the begining of the game and press Enter");
		System.out.println("Satisfied - press s, Hungry: - press h: ");
	}
	
	public  Lion setStartState(Scanner sc) {
		String line = "";
				
		line = sc.nextLine(); 
		Lion lion = new Lion().withState(line);
		
		return lion;
		
	}
	
	public void messageForInputOutside() {
	
		System.out.println("Antilope - press a, Hanter: - press h:");
	}
	
	public String getInput(Scanner sc) {
		String line = "";	
		line = sc.nextLine();
		return line;
		
	}
	
	public void print(Output output, Lion lion) {
		
		System.out.println("Lion's action is:");
		System.out.println(output.getAction());
		System.out.println(output.getMsg());
		System.out.println(lion.getState());
						
		
	}
}
