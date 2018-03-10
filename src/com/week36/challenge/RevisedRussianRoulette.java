package com.week36.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RevisedRussianRoulette {

	static int[] revisedRussianRoulette(int[] doors) {
		List<Integer> doorlist =getAsList(doors);
		int maxvalue = Collections.frequency(doorlist, 1);
		for (int i = 0; i < doorlist.size() - 1; i++) {
			if (doorlist.get(i) == 1) {
				if (doorlist.get(i + 1) == 1) {
					doorlist.set(i+1, 0);
				}
			}
		}
		int minvalue = Collections.frequency(doorlist, 1);
		int[] res = { minvalue, maxvalue };
		return res;
	}

	static List<Integer> getAsList(int[] doors){
		List<Integer> list = new ArrayList<>();
		for(int d:doors){
			list.add(d);
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] doors = new int[n];
		for (int doors_i = 0; doors_i < n; doors_i++) {
			doors[doors_i] = in.nextInt();
		}
		int[] result = revisedRussianRoulette(doors);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();

	}
}
