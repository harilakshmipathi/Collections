package com.java.Conversion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Conversion {
	
	
public void isPrime() {
       
ArrayList<String> list = new ArrayList<String>();

Scanner s = new Scanner(System.in);  
System.out.print("Enter a number : ");  
int n = s.nextInt(); 

int i =0;
int num =0;

String  primeNumbers = "";

for (i = 1; i <= n; i++)         
{ 		  	  
   int counter=0; 	  
   for(num =i; num>=1; num--)
{
      if(i%num==0)
  {
	counter = counter + 1;
  }
}
if (counter ==2)
{
  //Appended the Prime number to the String
  primeNumbers = primeNumbers + i + " ";
  list.add(primeNumbers);

System.out.println("Prime numbers  are :");
System.out.println(list);


HashMap<Integer,String> Map = new HashMap<Integer, String>();
	

       System.out.println("map of Key-Values :");
        
       for (int j = 0; j < list.size(); j++ ) 
       {
       	Map.put(j+1, list.get(j));
       	
     
}
       System.out.println(Map);   



}
}
}
	
public static void main(String[] args) {
	Conversion det =new Conversion();
	det.isPrime();

}

}

