package hrank.algo.sorting;

import java.util.Scanner;

public class BigNumberSorting {

	static String[] bigSorting(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int j = i;
			while (j > 0) {
				if (arr[j - 1].length() > arr[j].length()) {
					String intmed = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = intmed;

				} else if (arr[j - 1].length() == arr[j].length()) {
					if (arr[j - 1].compareTo(arr[j]) > 0) {
						String intmed = arr[j - 1];
						arr[j - 1] = arr[j];
						arr[j] = intmed;

					}
				}
				j--;
			}

		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] arr = new String[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.next();
		}
		String[] result = bigSorting(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");

		in.close();
	}

}
