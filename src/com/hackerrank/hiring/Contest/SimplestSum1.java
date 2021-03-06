package com.hackerrank.hiring.Contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimplestSum1 {

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
//	        in.close();
	    }
	static int mod=	100000007;
    static int simplestSum(int k, long a, long b) {
        // Complete this function
    	long simSum =0;
  /*  	
    	for(long i =a; i<=b; i++){
    		simSum=	( (simSum%mod) + (sumFunction(k,i)%mod));
    	}
 */   	
//    	System.out.println(simSum);
    long n= b-a+1;long p=0;long tsum=0,diff=0;
    while(n>0){
    	long x=n;
    	long sum= sumFunction(k,p+1);
    	long pow= (long)Math.pow(k,a );
    	n=n-pow;
    	if(n<pow){
    		tsum= tsum+ sum*x;
    	}else{
    		tsum= tsum+ sum*pow;
    	}
    	a++;
    	p=p+pow;
    }
    	
    	System.out.println(tsum);
    	
    	
    	return (int)simSum;
    	
    }	
    static long sumFunction(int k, long n){
    	long sum =0;
    	for (long i = 1; i <= n; i += 1) {
            sum = 	( (sum%mod) +(i%mod) )%mod;
            i = ( (i%mod) * (k%mod))%mod;
        }
 //   	System.out.println(sum);
    	return sum;
    }	
	
	
}
