package com.rank.stats;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MeanMeadianMode {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		Map<Double, Integer> freq= new HashMap<>();
		int size=in.nextInt();
		double[] array= new double[size];
		double mean=0, median=0, minValMode=0;
		for(int i=0; i<size; i++){
			array[i]=in.nextInt();
			mean+=array[i];
			if(freq.containsKey(array[i])){
				freq.put(array[i], freq.get(array[i]+1));
			}else{
				freq.put(array[i], 1);
			}
		}
		Arrays.sort(array);
		int j=array.length/2;
		if(array.length%2==0){
			median= (array[j-1]+array[j])/2;
		}else{
			median=(array[j])/2;
		}
		double maxValInMap=Collections.max(freq.values());
		 minValMode=Integer.MAX_VALUE;
		 for(Entry<Double, Integer> map1: freq.entrySet()){
			double  key=map1.getKey();
			if(freq.get(key)==maxValInMap){
				if(key<minValMode){
					minValMode=key;
				}
			}
		 }
		 System.out.println(mean/array.length);
		 System.out.println(median);
		 System.out.println((int)minValMode);
		 
	}
}
