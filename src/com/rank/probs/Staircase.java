package com.rank.probs;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder build= new StringBuilder(); 
        for(int i=0; i<n; i++){
        	build.append(" ");
        }   
        int j=0;
        for(int i=1; i<=n; i++){
        	build.replace(build.length()-i, build.length()-j, "#");
        	System.out.println(build);
        	j++;
        }
    }
}
