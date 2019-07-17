package com.java.Conversion;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashmaptoArraylist {
	
	public void conversion() {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"hari");
		map.put(2,"haran");
		
		System.out.println(map);
		
		Set<Integer> v =  map.keySet();
		
		ArrayList<Integer> sc = new ArrayList<Integer>(v);
		
		System.out.println("map to key");
		
		for(Integer s :sc) {
			System.out.println(s);
		}
		System.out.println();
		
		Collection<String> values = map.values();
		
		System.out.println("map to values");
		
		ArrayList<String> b = new ArrayList<String>(values);
		for(String str: b) {
			System.out.println(b);
		}
			
		System.out.println();
		
		Set<Entry<Integer, String>> entrySet = map.entrySet(); 
		
		ArrayList<Entry<Integer, String>> s = new ArrayList<Entry<Integer,String>>(entrySet);
		
		System.out.println();
		
		System.out.println("map  key and values");

		
		for(Entry<Integer,String> set:s) {
			System.out.println(set.getKey() + set.getValue());
		}
	}

	public static void main(String[] args) {
		HashmaptoArraylist con = new HashmaptoArraylist();
		con.conversion();

	}

}
