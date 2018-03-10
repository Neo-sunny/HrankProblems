package com.rank.recursion;

public class Rec2 {

	public static void main(String[] args) {
		int result = compute(4);
		System.out.println(result);
	}
	 static int compute(int n){
		 if(n==1)
			 return 1;
		 else
			 return n*compute(n-1);
			 
	 }
}
