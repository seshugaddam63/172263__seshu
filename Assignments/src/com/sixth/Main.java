package com.sixth;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("seshu");
		al.add("shiva");
		al.add("hari");
		
		al.replaceAll(x->x.toUpperCase());
		
		
		al.forEach(System.out::println);
		
	}

}
