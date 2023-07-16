package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Registeration_Table")
public class Register {
	@Id
	private int userid;
	private String password;
	private String address;
	private String mobileno;
	private String email;
	@OneToOne(fetch=FetchType.EAGER)
	private User usr;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User getUsr() {
		return usr;
	}
	public void setUsr(User usr) {
		this.usr = usr;
	}
	public Register(int userid, String password, String address, String mobileno, String email, User usr) {
		super();
		this.userid = userid;
		this.password = password;
		this.address = address;
		this.mobileno = mobileno;
		this.email = email;
		this.usr = usr;
	}
	public Register() {
		super();
	}
	@Override
	public String toString() {
		return "Register [userid=" + userid + ", password=" + password + ", address=" + address + ", mobileno="
				+ mobileno + ", email=" + email + ", usr=" + usr + "]";
	}
	
}
