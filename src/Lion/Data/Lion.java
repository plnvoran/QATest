package Lion.Data;



public class Lion {
	
	public String state;
	public String statePrevious;
	
	public String action;
	public String msg;
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
		
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
