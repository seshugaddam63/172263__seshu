package com.exc;

public class DiscountRate {
	private static double serviceDiscountPremium=0.2;
	private static double serviceDiscountGold=0.15;
	private static double serviceDiscountSilver=0.1;
	private static double productDiscountPremium=0.1;
	private static double productDiscountGold=0.1;
	private static double productDiscountSilver=0.1;
	
	
	public static double getserviceDiscountRate(String type)
	{
		switch(type)
		{
		case "premium":
			return serviceDiscountPremium;
		case "Gold":
			return serviceDiscountGold;
		case "silver":
			return serviceDiscountSilver;
			
		}
		return productDiscountGold;
		
	}
	
	
	public static double getProductDiscountRate(String type) {
		switch(type) {
		case "premium":
			return productDiscountPremium;
		case "Gold":
			return productDiscountGold;
		case "Silver":
			return  productDiscountSilver;
		}
		return productDiscountGold;
	}
		
		
	}
	
	