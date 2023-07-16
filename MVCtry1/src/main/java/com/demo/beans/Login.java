package com.demo.beans;

public class Login {
//username | password | emailid     | type
	private String username;
	private String password;
	private String emailid;
	private String type;
	public String getUsername() {
		return username;
	}
	//getUsername, getPassword, getEmailid, getType
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public Login() {
		super();
	}
	public Login(String username, String password, String emailid, String type) {
		super();
		this.username = username;
		this.password = password;
		this.emailid = emailid;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", emailid=" + emailid + ", type=" + type
				+ "]";
	}
	
	
}
