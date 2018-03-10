package com.hackerrank.hiring.Contest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class SimplestSum {
	static int mod=	100000007;
    static int simplestSum(int k, long a, long b) {
        // Complete this function
    	long simSum =0;
    	for(long i =a; i<=b; i++){
    		simSum=	( (simSum%mod) + (sumFunction(k,i)%mod));
    	}
//    	System.out.println(simSum);
    	return (int)simSum;
    	
    }

static long sumFunction(int k, long n){
	long sum =0;
	for (long i = 1; i <= n; i += 1) {
        sum = 	( (sum%mod) +(i%mod) )%mod;
        i = ( (i%mod) * (k%mod))%mod;
    }
	System.out.println(sum);
	return sum;
}    
    public static void main(String[] args) throws NumberFormatException, IOException {
    	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 //       Scanner in = new Scanner(System.in);
        int q = Integer.parseInt(br.readLine());
        for(int a0 = 0; a0 < q; a0++){
        	String vals[] = br.readLine().split("\\s+");
            int k = Integer.parseInt(vals[0]);
            long a = Long.parseLong(vals[1]);
            long b = Long.parseLong(vals[2]);
            int result = simplestSum(k, a, b);
            System.out.println(result);
        }
//        in.close();
    }
}
