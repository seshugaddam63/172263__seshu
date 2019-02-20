package com.seventh;

import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args)
	{
		Map<String,Integer> list = new TreeMap<>();
		list.put("seshu", 1);
		list.put("hari", 2);
		list.put("raja", 3);
		StringBuilder sb = new StringBuilder();
		list.forEach((key,value) ->sb.append(key+value));
		System.out.println(sb);
	}

}
