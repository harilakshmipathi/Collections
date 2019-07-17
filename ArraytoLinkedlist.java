package com.java.Conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ArraytoLinkedlist {
	public void arrayToloinkedlist() {
		
	
		Integer [] n= {1,2,3,4,5}; 

		System.out.println(n);
		LinkedList<Integer> sc = new LinkedList<Integer>(Arrays.asList(n));
		
		sc.add(6);
		sc.add(7);
		sc.add(8);
		
		System.out.println(sc);
		
		for(Integer i : sc) {
		
		System.out.println(i);
	}
	}

	public static void main(String[] args) {
		
		ArraytoLinkedlist sc = new ArraytoLinkedlist();
		sc.arrayToloinkedlist();
	}

	
}
