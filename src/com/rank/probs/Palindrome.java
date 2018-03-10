package com.rank.probs;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     String A=sc.next();
     char[] array= A.toCharArray();
     int len=A.length();
     int l=len-1, i;
     for(i=0; i<=len/2-1; i++){
    	 if(array[i]==array[l--]){
    		 
    	 }else {break;}
     }
     if(i==len/2){
    	 System.out.println("Palindrome");
     }
}
}
