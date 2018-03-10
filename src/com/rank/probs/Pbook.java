package com.rank.probs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pbook {

	public static void main(String []argh)
	   {
	       Map<String, Integer> pbook= new HashMap<>();
	       System.out.println(16%1000000007); 
	      Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	    
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         in.nextLine();
	         pbook.put(name,phone);
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	              if(pbook.containsKey(s)){
	            	  System.out.println(s+"="+pbook.get(s));
	              }else{
	            	  System.out.println("Not found");
	              }
	      }
	      
	   }
}
