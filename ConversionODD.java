package com.java.Conversion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ConversionODD {
	
	public  void ConversionODD_even() {
	
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int id = sc.nextInt();
		
		 if ( id % 2 == 0 ){
			System.out.println("given numberis  even");
			list.add(id);
		}
		else {
			System.out.println("given number is odd ");
	
			
		}
	System.out.println(list);
		 
		HashMap<Integer,Integer> Map = new HashMap<Integer, Integer>();
	      

	       System.out.println("map of Key-Values :");
	        
	       for (int i = 0; i < list.size(); i++ ) 
	       {
	       	Map.put(i, list.get(i)+1);
	       }
	       System.out.println(Map);

	}
	public static void main(String[] args) {
		ConversionODD det =new ConversionODD();
		det.ConversionODD_even();

}

	}
