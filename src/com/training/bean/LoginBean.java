package com.training.bean;

public class LoginBean {
	
	
	private String firstname;
	private String lastname;
	private String eMail;
	private String phone;
	private String usrname;
	private String password;

	public LoginBean() {
	}

	public LoginBean(String firstname, String lastname, String eMail, String phone, String usrname,
			String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.eMail = eMail;
		this.phone = phone;
		this.usrname = usrname;
		this.password = password;
	}
	
	public String getfirstname() {
		return firstname;
	}

	public String getlastname() {
		return lastname;
	}
	
	public String geteMail() {
		return eMail;
	}
	
	public String getphone() {
		return phone;
	}
	public String getusrname() {
		return usrname;
	}
	
	public String getpassword() {
			return password;
		
	}

	
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}


	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public void setphone(String phone) {
		this.phone = phone;
	}
	
	public void setusrname(String usrname) {
		this.usrname = usrname;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginBean [usrname=" + usrname + ", password=" + password + "]";
	}

}
