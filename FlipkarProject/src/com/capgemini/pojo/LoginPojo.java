package com.capgemini.pojo;

public class LoginPojo {
	String userName;
	String password;
	public LoginPojo(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginPojo [userName=" + userName + ", password=" + password + "]";
	}
	

}

