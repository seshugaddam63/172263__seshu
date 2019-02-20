package com.first;

public class FruitArryListMain {
	public static void main(String[] args)
	{
	FruitArrayList obj = new FruitArrayList();
	Fruit f1 = new Fruit("pineapple", 75, 35, "light yellow");
	Fruit f2 = new Fruit("apple", 120, 50, "red");
	Fruit f3 = new Fruit("mango", 90, 30, "yellow");
	Fruit f4 = new Fruit("banana", 80, 30, "thick yellow");
	Fruit f5 = new Fruit("strawberry", 90, 60, "red");
	
         obj.addnew(f1);
         obj.addnew(f2);
         obj.addnew(f3);
         obj.addnew(f4);
         obj.addnew(f5);
  
         obj.display();
         System.out.println("------------");    
         obj.sort();
         obj.SortFruitName();
         obj.sortFruitColor();

         
         
  
	
	
	
	
	

	
	}
}
