package com.java.Conversion;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ConvertExample {
	 
	 
	public void linkedtoarray() {
	    LinkedList<String> linkedlist = new LinkedList<String>();
		   
		   linkedlist.add("hari");
	   
	    String[] array = linkedlist.toArray(new String[linkedlist.size()]);
	  
	    System.out.println("Array Elements:");
	  
	       System.out.println(Arrays.toString(array));

	       for(String s :array) {
	    	   System.out.println(s);
	       }
	    }

public static void main(String[] args) {
	ConvertExample sc = new ConvertExample();
	sc.linkedtoarray();
	
}

}
	
