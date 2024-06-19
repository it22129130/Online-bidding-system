package com.customer;

public class contact {

	private int idcustomer;
	private String fullname;
	private String email;
	private String message;
	
	public contact(int idcustomer, String fullname, String email, String message) {
		
		this.idcustomer = idcustomer;
		this.fullname = fullname;
		this.email = email;
		this.message = message;
	}

	public int getIdcustomer() {
		return idcustomer;
	}

	public void setIdcustomer(int idcustomer) {
		this.idcustomer = idcustomer;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
