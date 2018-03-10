package hrank.algorithm.implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PickingNumbers {


    static int pickingNumbers(int[] a) {
        // Complete this function
    	Integer[] IArr= IntegerArr(a);
    	int MaxCount= Integer.MIN_VALUE;
    	int count1=0;
    	for(int i=0; i<a.length-1; ){
    		int diff= Math.abs(IArr[i]-IArr[i+1]);
    		if(diff==0){
    			int count=Collections.frequency(Arrays.asList(IArr), IArr[i]);
    			int diff1=Math.abs(IArr[i]-IArr[i+count]);
    			if(diff1==1){
    				 count1=Collections.frequency(Arrays.asList(IArr), IArr[i+count]);
    			}
    			if((count+count1)>MaxCount){
    				MaxCount= count+count1;
    			}
    			i+=count+count1;
    		}
    		else if(diff==1){
    			int count=Collections.frequency(Arrays.asList(IArr), IArr[i]);
    			count1=Collections.frequency(Arrays.asList(IArr), IArr[i+1]);
    			if((count+count1)>MaxCount){
    				MaxCount= count+count1;
    			}
    			i+=count+count1;
    		}else{
    			i++;
    		}
    		
    		
    	}
    	return MaxCount;
    }

    public static Integer[] IntegerArr(int[] arr){
    	Integer[] IArr = new Integer[arr.length];
    	int index=0;
    	for(int  i:arr){
    		IArr[index++]=i;
    	}
    	Arrays.sort(IArr);
    	return IArr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}
