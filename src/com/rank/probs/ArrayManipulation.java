package com.rank.probs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	List<Integer> lst= new ArrayList();
	lst.add(10);lst.add(11);
	for(int k= lst.size(); k>0; k--){
		System.out.println(lst.get(k-1));
	}
    String[] fline = br.readLine().split("\\s+");
    int n= Integer.parseInt(fline[0]);
    long[] arr = new long[n+1];
    int m = Integer.parseInt(fline[1]);
    long val=0;
    for(int a0 = 0; a0 < m; a0++){
    	String[] sline = br.readLine().split("\\s+");
    	int a=Integer.parseInt(sline[0]);
    	int b=Integer.parseInt(sline[1]);
    	int k=Integer.parseInt(sline[2]);
        for(int i=a; i<=b; i++){
        	val= arr[i]+k;
            arr[i]=val;
        	val=0;
        }
        
    }
  
    	Arrays.sort(arr);
      System.out.println(arr[n]);
}

}