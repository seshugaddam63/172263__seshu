package com.second;

public interface Main2 {
	public static void main(String args[]) 
	{
		Lambda2 o=(price,status)->
		{
			if(price>10000 && status=="Accepted")
			{System.out.println("Accepted");
			
			
			}
			};
			o.check(1100000,"Accepted");
		


}


}
