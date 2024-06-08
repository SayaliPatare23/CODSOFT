package com.codesoft.atminterface;

public class PanCard {
	private String name;
	private String dob;
	private String panNumber;
	public PanCard(String name, String dob, String panNumber) {
		super();
		this.name = name;
		this.dob = dob;
		this.panNumber = panNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	@Override
	public String toString() {
		return "PanCard [name=" + name + ", dob=" + dob + ", panNumber=" + panNumber + "]";
	}

	
	
}
