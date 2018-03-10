package com.rank.probs;

import java.util.Scanner;

public class BigSum {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int pSum=0, sSum=0, tSum=0;
	        int n = in.nextInt();
	        int a[][] = new int[n][n];
	        for(int a_i=0; a_i < n; a_i++){
	            for(int a_j=0; a_j < n; a_j++){
	                a[a_i][a_j] = in.nextInt();
	            }
	        }
	        for(int a_i=0; a_i < n; a_i++){
	            for(int a_j=0; a_j < n; a_j++){
	               if(a_i==a_j){
	            	   pSum+=a[a_i][a_j] ;
	               }
	            }
	        }
	        int index=n-1,j=0;
	       while(index>=0){
	    	   sSum+=a[j][index];
	    	   j++;index--;
	       }
	        int sum=pSum-sSum;
	       tSum+=Math.abs(sum);
	       System.out.println(tSum);
	        
	    }
	}
