package com.hackerrank.hiring.Contest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int max = Integer.MIN_VALUE;
		LinkedHashMap<String, Integer> maxQuens = new LinkedHashMap();
		for (int a0 = 0; a0 < n; a0++) {
			String name = in.next();
			int d = in.nextInt();
			int j = in.nextInt();
			int diff = j - d;
			if (diff > max) {
				max = diff;
			}
			maxQuens.put(name, diff);
		}
		String name = "";
		int value = 0;
		for (Map.Entry<String, Integer> vals : maxQuens.entrySet()) {
			name = vals.getKey();
			value = vals.getValue();
			if (value == max)
				break;
		}
		System.out.println(name + " " + value);
		in.close();
	}
}
