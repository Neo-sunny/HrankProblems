package hrank.algorithm.implementation;

import java.util.Scanner;

public class MigratoryBirds {

	static int migratoryBirds(int n, int[] ar) {
        // Complete this function
		int maxCount=Integer.MIN_VALUE;
		int value1=0,value2=0,value3=0,value4=0,value5=0,value=0;
		for(int i=0; i<n; i++){
			if(ar[i]==1){ value1++; 
				if(value1>maxCount){
					maxCount=value1;
					value=1;
				}
			}
			else if(ar[i]==2){ value2++; 
			if(value2>maxCount){
				maxCount=value2;
				value=2;
			}
			}
			else if(ar[i]==3){ value3++;
			if(value3>maxCount){
				maxCount=value3;
				value=3;
			}
			}
			else if(ar[i]==4){ value4++; 
			if(value4>maxCount){
				maxCount=value4;
				value=4;
			}
			}
			else if(ar[i]==5){ value5++; 
			if(value5>maxCount){
				maxCount=value5;
				value=5;
			}
			}
		}
		
		return value;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n);
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
