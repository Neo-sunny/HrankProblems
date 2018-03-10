package com.rank.recursion;

public class RevAString {

	public static void main(String[] args) {
		reverseRecursion("neosunny");
	} 
	
	static void reverseNormal(String str){
		StringBuilder s= new StringBuilder();
		char[] arr= str.toCharArray();
		for(int i=arr.length-1; i>=0; i--){
			s=s.append(arr[i]);
		}
		System.out.println(s);
	}
	static void reverseNormal1(String str){
		StringBuilder s= new StringBuilder();
		for(int i=str.length()-1; i>=0; i--){
			s=s.append(str.substring(i, i+1));
		}
		System.out.println(s);
	}
	
	static String reverseRecursion(String str){
		
		if(!str.equals("")){
			System.out.print(str.substring(str.length()-1));
		  return	reverseRecursion(str.substring(0,str.length()-1));
	}
	return null;
	}
	
static void reverseRecursion1(String str){
		
		if(!str.equals("")){
			System.out.print(str.substring(str.length()-1));
		  	reverseRecursion(str.substring(0,str.length()-1));
		}
	
}
}