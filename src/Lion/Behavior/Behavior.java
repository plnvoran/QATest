package Lion.Behavior;

import Lion.Data.Lion;
import Lion.Data.Output;


public class Behavior {

	public Output behavior(String input, Lion lion) {
		
		Output output=new Output();	
	
		if (input.equals("h")) {

			if (lion.getState().equals("h")) {
				output.setAction("Run");
				lion.setStatePrevious("h");
				lion.setState("h");
			} else if (lion.getState().equals("s")) {
				output.setAction("Run");
				lion.setStatePrevious("s");
				lion.setState("Hungry");
			}

		} else if (input.equals("a")) {
			if (lion.getState().equals("h")) {
				output.setAction("Eat");
				lion.setStatePrevious("h");
				lion.setState("s");
			} else if (lion.getState().equals("s")) {
				output.setAction("Sleep");
				lion.setStatePrevious("Satisfied");
				lion.setState("h");
			}
		}
		

		if (lion.getState().equals(lion.getStatePrevious())) {
			output.setMsg("Lion state has not been changed and now is:");
		} else {
			output.setMsg("Lion state has been changed to:");
		}

		return output;
	}

}
