package com.java.Conversion;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Pasword {
	public void listandmap() {
		
		LinkedList<String> list = new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String a=sc.next();


		String p = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,20}";

		if(a.matches(p)) {
         list.add(a);
         System.out.println(list+"your password is vaild");
		  }
		 else
		 System.out.println("check your password");
	
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		
		for(int i=0; i<list.size();i++) {
			map.put(list.get(i), i+1);
		}
		System.out.println(map);
	}
		

	public static void main(String[] args) {
		
		Pasword s = new Pasword();
		s.listandmap();
	}

	

}
