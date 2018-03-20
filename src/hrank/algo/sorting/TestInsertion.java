package hrank.algo.sorting;

import java.util.Arrays;

public class TestInsertion {

	public static void main(String[] args) {
		int[] x= {7,2,9,1};
		InsertionSort(x);
	}
	
	public static void InsertionSort(int[] arr){
		
		for(int i=0;i<arr.length;i++){
			int j=i;
			int val=arr[i];
			while(j>0 && arr[j-1]>arr[j]){
				//swap
				int intmed= arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=intmed;
				j--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
