package com.java.Conversion;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedlisttoArraylist {
	public void conversion() {
	LinkedList<String> sc = new LinkedList<String>();
	sc.add("hari");
	sc.add("menon");
	sc.add("boomi");
	sc.add("andro");
	
	System.out.println("before convert into arraylist"+sc);
	
	ArrayList<String> array= new ArrayList<String>(sc);
	
	System.out.println("after the conversion");
	
	for(String str:array) {
		System.out.println(str);
	}
	
		
	}

	public static void main(String[] args) {
		LinkedlisttoArraylist sc = new LinkedlisttoArraylist();
		sc.conversion();
	}


}
