package com.rank.probs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ArrayList1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		Map<Integer, List> map= new HashMap<Integer, List>();
		List<Integer> li;
		for (int i = 1; i <= n; i++) {
			int size=input.nextInt();
			li= new ArrayList<Integer>();
			for(int j=1; j<=size;j++ ){
				int n1 = input.nextInt();
				li.add(n1);
				System.out.println(li);
			}
			map.put(Integer.valueOf(i), li)	;
		}
		int query=input.nextInt();
		for(int q=0; q<query; q++){
			int i1=input.nextInt();
			int i2=input.nextInt();
			int index=--i2;
			List<Integer> res=map.get(i1);
			try{
			
				System.out.println(res.get(index));
			}catch(IndexOutOfBoundsException e){
				System.out.println("ERROR!");
			}
			
		}
		
	}

}
