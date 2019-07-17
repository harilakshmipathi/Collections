
package com.java.Conversion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FactorialConversion {
	
	public void conversion() {
		  int i,fact=1;  
		  ArrayList<Integer> list = new ArrayList<Integer>();

			Scanner sc =new Scanner(System.in);


			System.out.println("enter the number");
			int id = sc.nextInt();  
		  for(i=1;i<=id;i++){    
		      fact=fact*i; 
		      list.add(fact);
		  }    
		  System.out.println("Factorial of "+list);    
		 

			HashMap<Integer,Integer> Map = new HashMap<Integer, Integer>();

		       System.out.println("map of Key-Values :");
		        
		       for (int j = 0; j< list.size(); j++ ) 
		       {
		       	Map.put(j+1, list.get(j));
		       }
		       
		       System.out.println(Map);

		}
		
	
	public static void main(String[] args) {
		FactorialConversion det = new FactorialConversion();
		det.conversion();
	}

	
	}


