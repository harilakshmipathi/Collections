package com.java.Conversion;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoArraylist {
	
	public void arrayToArraylist() {
		String [] array = {"hari","menon","kanaga","booomi"};
		
		ArrayList<String> sc = new ArrayList<>(Arrays.asList(array));
		sc.add("prakash");
		sc.add("andro");
		
		System.out.println(sc);
		
		for(String s :sc) {
			System.out.println(s);
		}
		
	}


	public static void main(String[] args) {
		
		ArraytoArraylist s = new ArraytoArraylist();
		s.arrayToArraylist();
	}

	
}
