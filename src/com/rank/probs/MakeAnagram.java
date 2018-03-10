package com.rank.probs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class MakeAnagram {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the two strings");
		String s1=input.nextLine();
		String s2=input.nextLine();
		System.out.println(isAnagram(s1,s2));
		
		HashMap<Integer, String> map= new LinkedHashMap<>();
		
//		int[] lettercount= new int[26];
//	 for(char c:s1.toCharArray()){
//		 lettercount[c-'a']++;
//	 }
//	 for(char c:s2.toCharArray()){
//		 lettercount[c-'a']--;
//	 }
//		int chars_to_delete=0;
//	 for(int i:lettercount){
//		 chars_to_delete  =chars_to_delete+Math.abs(i); 
//	 }
//	 
//	 System.out.println(chars_to_delete);
	}
	
	 static boolean isAnagram(String a, String b) {
	        int counter=0;
	        // Complete the function by writing your code here.
	        int[] letterCount= new int[40];
	        for(char c:(a.toLowerCase()).toCharArray()){
	        	letterCount[c-'a']++;
	        }
	        for(char c:(b.toLowerCase()).toCharArray()){
	        	letterCount[c-'a']--;
	        }
	        for(int res:letterCount){
	            counter=counter+res;
	        }
	        if(counter==0)
	            return true;
	        else
	            return false;
	    }

}
