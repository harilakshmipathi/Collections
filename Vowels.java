package com.java.Conversion;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Vowels {

	public void liasadnamap() {
		
		LinkedList<String> list = new LinkedList<String>();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the name");
		String id = sc.nextLine();
		
		
		String str=id.replaceAll("[aeiouAEIOU]","");
		
		list.add(str);
		System.out.println(list);
		
		LinkedHashMap<Integer,String> map  =new LinkedHashMap<Integer,String>();
		
		for(int i=0; i<list.size();i++) {
			map.put(i+1, list.get(i));
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		Vowels s = new Vowels();
		s.liasadnamap();

	}


}
