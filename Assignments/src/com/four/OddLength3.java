package com.four;

import java.util.ArrayList;

public interface OddLength3 {
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("seshu");
		list.add("sowjanya");
		list.add("siva");
		list.removeIf(n->(n.length()%2!=0));
		for (String x : list)
		{
			System.out.println(x);
		}
	}

}
