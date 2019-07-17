package com.java.Conversion;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Split {

	public void listandmap() {
		LinkedList<String> list = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the name:");

    	String id = sc.nextLine();
    	System.out.println("original string"+id);
    	
    	String r = id.replaceAll("[^a-zA-Z]", "") ;
    	System.out.println(r);
    	
    	System.out.println("Split the words");
    	
    	String[] space = id.split("\\s,");
    	
    	System.out.println(space);
    	for(String h : space)
    		list.add(h);
    	System.out.println("After removing space" +list);
	
	LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
	for(int i=0; i<list.size();i++) {
		map.put(list.get(i), i+1);
	}
	System.out.println(map);
}		
	

	public static void main(String[] args) {
		Split s = new Split();
		s.listandmap();

	}

	
}
