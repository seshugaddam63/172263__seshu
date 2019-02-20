package com.fifth;

import java.util.ArrayList;

public class Mainn5 {

	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<String>();
		al.add("rishi");
		al.add("niharika");
		al.add("ram");
		al.add("seshu");
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder("ABC");
		al.forEach(x->sb.append(x.charAt(0)));
		System.out.println(sb);
		
		
		
		
	}

}
