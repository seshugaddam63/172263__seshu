package com.first;

public interface Main1 {
	public static void main(String args[]) 
	{
	Lamda1 addition=(a,b)->a+b;
	System.out.println("addition of two number:"+addition.operation(10,2));
	Lamda1 subtraction=(a,b)->a-b;
	System.out.println("subtraction of two number:"+subtraction.operation(10,2));
	Lamda1 division=(a,b)->a/b;
	System.out.println("divition of two number:"+division.operation(10,2));
	Lamda1 multiplication =(a,b)->a*b;
	System.out.println("multiplication of two number:"+multiplication.operation(10,2));
		
	}


}
