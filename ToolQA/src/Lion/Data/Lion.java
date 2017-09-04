package Lion.Data;



public class Lion {
	
	public String state;
	public String statePrevious;
	
	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Lion withState(String state) {
		this.state = state;
		return this;
	}


	public String getStatePrevious() {
		return statePrevious;
	}


	public void setStatePrevious(String statePrevious) {
		this.statePrevious = statePrevious;
	}
	
	
	

}
