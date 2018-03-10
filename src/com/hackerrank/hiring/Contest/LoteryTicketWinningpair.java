package com.hackerrank.hiring.Contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LoteryTicketWinningpair {

	static int winningLotteryTicket(String[] tickets) {
		// Complete this function
		int winnningPairs = 0;
		for (int i = 0; i < tickets.length; i++) {
			int[] a = getthedigitcounts(tickets[i]);
			for (int j = i + 1; j < tickets.length; j++) {
				winnningPairs += getthedigitcounts1(a, tickets[j]);
			}
		}

		return winnningPairs;
	}

	static int[] getthedigitcounts(String a) {
		int[] digitCount = new int[10];
		for (char c : a.toCharArray()) {
			digitCount[c - '0']++;
		}
		return digitCount;
	}

	static int getthedigitcounts1(int[] arr, String b) {
		 //int[] temp=Arrays.copyOf(arr, arr.length);
		 int[] temp= new int[arr.length];
		System.arraycopy(arr, 0, temp, 0, arr.length);;
		int returnVal = 0;
		boolean flag=false;
		for (char c : b.toCharArray()) {
			temp[c - '0']++;
		}
		Arrays.sort(temp);
		int ret=Arrays.binarySearch(temp, 0);
		
		if(ret<0)
			returnVal++;
		
		return returnVal;
	}

	static Set<Long> getUniqueDigits(String a) {
		Set<Long> unqDigits = new HashSet<>();
		long n1 = Long.parseLong(a);
		int u = 0;
		long store = 0;
		long digit = 0;
		while (n1 > 0) {
			long n = n1 % 10;
			digit = 1 << (n);
			if ((store & digit) == 0) {
				unqDigits.add(n);
				store |= digit;
				u++;
			}

			n1 /= 10;

		}
		// System.out.println(u);
		return unqDigits;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//	int n = in.nextInt();
		int n = Integer.parseInt(br.readLine());
		String[] tickets = new String[n];
		for (int tickets_i = 0; tickets_i < n; tickets_i++) {
			tickets[tickets_i] = br.readLine();
		}
		int result = winningLotteryTicket(tickets);
		System.out.println(result);
//		in.close();
	}
}
