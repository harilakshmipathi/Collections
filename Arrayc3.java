package com.java.Conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Arrayc3 {
	
	public void conversion() {
		
		int [] i   = {1,2,4,5};
		
	List<Integer> sc = new ArrayList<>(i.length);
		
		sc.add(6);
		for(int j : i) {
			sc.add(Integer.valueOf(j));
		
		}
		System.out.println(sc);
	}

	public static void main(String[] args) {
		Arrayc3 sc = new Arrayc3();
		sc.conversion();

	}

	

}
