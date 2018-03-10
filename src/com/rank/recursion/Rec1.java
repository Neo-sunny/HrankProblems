package com.rank.recursion;

public class Rec1 {
 public static void main(String[] args) {
	 xmethod(5);
 }
 static void xmethod(int n){
	 
	 if(n>0){
		 xmethod(n-1); 
		 System.out.println(n);
	 }
		 
	 
 }
}
