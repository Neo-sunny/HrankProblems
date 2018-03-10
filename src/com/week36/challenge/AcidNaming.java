package com.week36.challenge;

import java.util.Scanner;

public class AcidNaming {

	static String acidNaming(String acid_name) {

		String returnValue = "";
		if (acid_name.startsWith("hydro") && acid_name.endsWith("ic")) {
			returnValue = "non-metal acid";

		} else if (acid_name.endsWith("ic")) {
			returnValue = "polyatomic acid";
		} else {
			returnValue = "not an acid";
		}

		return returnValue;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int a0 = 0; a0 < n; a0++) {
			String acid_name = in.next();
			String result = acidNaming(acid_name);
			System.out.println(result);
		}
		in.close();
	}
}
