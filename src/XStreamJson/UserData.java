package XStreamJson;

public class UserData {

	String firstname;
	String lastname;
	String login;
	String password;
	String email;
		
	public UserData(String firstname, String lastname, String login, String password, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.login = login;
		this.password = password;
		this.email = email;
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getLogin() {
		return login;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	
	
	
}
