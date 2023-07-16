package com.demo.beans;

public class Register {
	//username | password | emailid          | type | gender | mobileNumber
	private String username;
	private String password;
	private String emaiId;
	private String type;
	private String gender;
	private String mobileNumber="xxxx994022";
	
	
	public Register() {
		super();
	}
	public Register(String username, String password, String emaiId, String type, String gender) {
		super();
		this.username = username;
		this.password = password;
		this.emaiId = emaiId;
		this.type = type;
		this.gender = gender;
		this.mobileNumber="xxxx994022";
	}
	
	//getUsername,getPassword,getEmaiId,getType,getGender,getMobileNumber
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmaiId() {
		return emaiId;
	}
	public void setEmaiId(String emaiId) {
		this.emaiId = emaiId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Register [username=" + username + ", password=" + password + ", emaiId=" + emaiId + ", type=" + type
				+ ", gender=" + gender + ", mobileNumber=" + mobileNumber + "]";
	}
	
	
}
