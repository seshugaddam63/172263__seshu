package com.capgemini.pojo;

public class RegistrationPojo {
	String Email;
	String password;
	String repeatpassword;
	public RegistrationPojo(String email, String rpassword, String repeatpassword) {
		super();
		Email = email;
		this.password = password;
		this.repeatpassword = repeatpassword;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRepeatpassword() {
		return repeatpassword;
	}
	public void setRepeatpassword(String repeatpassword) {
		this.repeatpassword = repeatpassword;
	}
	@Override
	public String toString() {
		return "RegistrationPojo [Email=" + Email + ", password=" + password + ", repeatpassword=" + repeatpassword
				+ "]";
	}
	
	
	

}
