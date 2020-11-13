package book_store;

public class User {
	private static int userid;
	private String email;
	private String fullname;
	private String password;
	
	
	public User() {
		super();
	}
	
	
	public User(int userid,String email, String fullname, String password) {
		super();
		User.userid = userid;
		this.email = email;
		this.fullname = fullname;
		this.password = password;
	}


	public void setUserid(int userid) {
		User.userid = userid;
	}
	
	public static int getUserid() {
		return userid;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return " email=" + email + " fullname=" + fullname + " password=" + password;
	}
	
	
	
}
