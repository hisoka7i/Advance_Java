package com.demo.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="userTable")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	@Column(name="username",nullable=false)
	private String uname;
	@Column(name="password",nullable=false)
	private String upass;
	@OneToOne(mappedBy="usr", cascade=CascadeType.ALL)
	@JoinColumn(name="uId")
	private Register reg;
	@OneToMany(mappedBy="usr1")
	private List<Orders> ord;
	
	public User() {
		super();
	}
	public User(int userId, String uname, String upass, Register reg, List<Orders> ord) {
		super();
		this.userId = userId;
		this.uname = uname;
		this.upass = upass;
		this.reg = reg;
		this.ord = ord;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", uname=" + uname + ", upass=" + upass + ", ord=" + ord + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public Register getReg() {
		return reg;
	}
	public void setReg(Register reg) {
		this.reg = reg;
	}
	public List<Orders> getOrd() {
		return ord;
	}
	public void setOrd(List<Orders> ord) {
		this.ord = ord;
	}
	
	
}
