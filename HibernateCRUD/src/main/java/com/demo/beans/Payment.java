package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="paymentTable")
public class Payment {
	private String card;
	@Id
	private String email;
	private String bankName;
	private int bankId;
	private double amount;
	@OneToOne(fetch=FetchType.EAGER)
	private Orders ord1;
	
	
	
	public Payment() {
		super();
	}
	public Payment(String card, String email, String bankName, int bankId, double amount, Orders ord1) {
		super();
		this.card = card;
		this.email = email;
		this.bankName = bankName;
		this.bankId = bankId;
		this.amount = amount;
		this.ord1 = ord1;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Orders getOrd1() {
		return ord1;
	}
	public void setOrd1(Orders ord1) {
		this.ord1 = ord1;
	}
	@Override
	public String toString() {
		return "Payment [card=" + card + ", email=" + email + ", bankName=" + bankName + ", bankId=" + bankId
				+ ", amount=" + amount + "]";
	}
}
