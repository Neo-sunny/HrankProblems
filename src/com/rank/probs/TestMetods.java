package com.rank.probs;

import java.util.Scanner;

public class TestMetods {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
     String s = scan.nextLine();
 if(s!=""){

     String[] words=(s.trim()).split("[\\W|_]+");
     scan.close();
     System.out.println(words.length);
     for(String s1:words){
        System.out.println(s1);
        }
     }
 }
	
}
