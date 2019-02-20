package com.eight;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args)
	{
		ArrayList<Integer> ai = new ArrayList<>();
		ai.add(1);
		ai.add(5);
		ai.add(3);
		 
		Thread tr = new Thread()
		{
			public void run()
			{
				ai.forEach(System.out::println);
			}
		};
		tr.start();
	}

}
