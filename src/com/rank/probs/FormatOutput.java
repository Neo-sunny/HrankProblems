package com.rank.probs;

import java.util.Scanner;

public class FormatOutput {

	

	    public static void main(String[] args) {
	            Scanner sc=new Scanner(System.in);
	            System.out.println("================================");
	            for(int i=0;i<3;i++)
	            {
	                String s1=sc.next();
	                int x=sc.nextInt();
	                System.out.printf("%-15s",s1);
	                System.out.printf("%03d",x);
	            }
	            System.out.println("================================");
	            int input=sc.nextInt();
	            String s=String.valueOf(input);
	            for(int i=1; i<=10;i++){
	            	System.out.println(input+" "+"x"+" "+i+" "+"="+" "+(input*i));
	            }
	    }
	}

//2 x 1 = 2
//2 x 2 = 4