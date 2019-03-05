package com.capgemini.pojo;

public class StudentClass {
	
		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		private String name;  

	public void displayInfo() {
		System.out.println("Hello:"+name);
		
	}

}