package com.rank.probs;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the array size and number of rotation");
		int size=input.nextInt();
		int numOfRot=input.nextInt();
		int[] arr= new int[size];
		System.out.println("enter the array elements");
		for(int i=0; i<size; i++){
			arr[i]=input.nextInt();
		}
		// rotating array left
		int temp=0;
		for(int i=0;i<numOfRot; i++){	
			temp=arr[0];
			for(int j=0; j<size-1; j++){
				arr[j]=arr[j+1];
			}
			arr[size-1]=temp;
		}
		
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
}
