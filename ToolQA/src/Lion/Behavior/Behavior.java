package Lion.Behavior;

import Lion.Data.Lion;
import Lion.Data.Outside;

public class Behavior {

	public void behavior(Outside outside, Lion lion) {
		String action = "";

		if (outside.getTarget().equals("h")) {

			if (lion.getState().equals("Hungry")) {
				action = "Run";
				lion.setStatePrevious("Hungry");
				lion.setState("Hungry");
			} else if (lion.getState().equals("Satisfied")) {
				action = "Run";
				lion.setStatePrevious("Satisfied");
				lion.setState("Hungry");
			}

		} else if (outside.getTarget().equals("a")) {
			if (lion.getState().equals("Hungry")) {
				action = "Eat";
				lion.setStatePrevious("Hungry");
				lion.setState("Satisfied");
			} else if (lion.getState().equals("Satisfied")) {
				action = "Sleep";
				lion.setStatePrevious("Satisfied");
				lion.setState("Hungry");
			}
		}
		
		System.out.println("Lion action:");
		System.out.println(action);

		if (lion.getState().equals(lion.getStatePrevious())) {
			System.out.println("Lion state has not been changed and now is:");
		} else {
			System.out.println("Lion state has been changed to:");
		}

		System.out.println(lion.getState());

	}

}
