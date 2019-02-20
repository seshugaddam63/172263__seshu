package com.first;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.*;

public class FruitArrayList {

		ArrayList<Fruit> fr = new ArrayList<Fruit>();
		
	void addnew(Fruit f)
	{
		fr.add(f);
	}
	void display()
	{
		fr.forEach(System.out::println);
	}
	void sort()
	{
		
		
			List<Fruit> result = fr.stream().filter(s->s.getCalories()<100).sorted(). 
                    collect(Collectors.toList()); 
                  result.forEach(System.out::println); 


		
	}
	void SortFruitName()
	{

		List<Fruit> result = fr.stream().sorted(Comparator.comparing(Fruit :: getColor)). 
                collect(Collectors.toList()); 
              result.forEach(e->System.out.println("Name:"+e.getName()+"Color:"+e.getColor())); 

	}
	void sortFruitColor()
	{
		
		
			List<Fruit> result = fr.stream().filter(s->s.getColor().equals("red")).sorted(). 
                    collect(Collectors.toList()); 
                  result.forEach(e->System.out.println("Color:"+e.getColor()+"Price:"+e.getPrice())); 


		
	}
		
	}


