package org.seshu.javasprings;

public class Triangle {
	private String type;
	private int height;
	
	
	public Triangle(String type) {
		super();
		this.type = type;
	
	}
	public Triangle(int height) {
		super();
		this.height = height;
	}
	
	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}
	public String getType() {
		return type;
	}
	
	public int getHeight() {
		return height;
	}
	public void draw()
	{
		 System.out.println(getType() + "i am here" +getHeight());
	//	System.out.println("triangle drawn");
	}

}
