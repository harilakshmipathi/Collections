package com.java.Conversion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Scanner;

public class ListtoHashtable {
	public void conversion() {
		  int i,fact=1;  
		  LinkedList<Integer> list = new LinkedList<Integer>();

			Scanner sc =new Scanner(System.in);


			System.out.println("enter the number");
			int id = sc.nextInt();  
		  for(i=1;i<=id;i++){    
		      fact=fact*i; 
		      list.add(fact);
		  }    
		  System.out.println("Factorial of "+list);    
		 

			Hashtable<Integer,Integer> table = new Hashtable<Integer, Integer>();

		       System.out.println("table of Key-Values :");
		        
		       for (int j = 0; j< list.size(); j++ ) 
		       {
		    	   table.put(j+1, list.get(j));
		       }
		       
		       System.out.println(table);

		}
		
	
	public static void main(String[] args) {
		ListtoHashtable det = new ListtoHashtable();
		det.conversion();
	}

	
	}
