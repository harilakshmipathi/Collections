package com.java.Conversion;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraylisttoArray {
	public void arraytoarraylist() {
		
		  ArrayList<Integer> al = new ArrayList<Integer>();
		    

		    al.add(1); 
		    al.add(2); 
		    al.add(3); 
		    
		  Integer [] array = al.toArray(new Integer [al.size()]);

		  String c=Arrays.toString( array);
		   
		  System.out.println(c);
		   for(Integer I  : array) {
			   System.out.println(I);
		   }
	}
         
	    public static void main(String[] args) {
	    	ArraylisttoArray sc = new ArraylisttoArray();
		     sc.arraytoarraylist();
	}
}
