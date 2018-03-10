package com.rank.probs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayManipulation1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] fline = br.readLine().split("\\s+");
		int n = Integer.parseInt(fline[0]);
		int m = Integer.parseInt(fline[1]);
		int[] arr = new int[n+1];
		
		for(int i=0; i<m; i++){
			String[] values = br.readLine().split("\\s+");
			int a = Integer.parseInt(values[0]);
			int b = Integer.parseInt(values[1]);
			int k = Integer.parseInt(values[2]);
			arr[a-1]+=k;
			if( (b)<n ){ arr[b+1] -= k;}
			
		}
		int x=0, max=0;
		for(int j=0; j<n; j++){
			x = x+arr[j];
			if(max<x)
				max=x;
		}
		
		System.out.println(max);
	}
}
