package hrank.algorithm.strings;

import java.util.Scanner;

public class CaesarCipher {

	static String caesarCipher(String s, int k) {
		// Complete this function
		StringBuffer sbuf = new StringBuffer();
		for (char c : s.toCharArray()) {
			Character.isLowerCase(c);
			int x = (int) c;
			if ((x > 96 && x < 124) || (x > 64 && x < 92)) {
				int val = x + k;
				if ((val > 123)) {
					val = (val - 123) + 96;
					sbuf.append((char) (val));
				} else {
					sbuf.append((char) (val));
				}
				if (val > 91) {
					val = (val - 91) + 64;
					sbuf.append((char) (val));
				} else {
					sbuf.append((char) (val));
				}

			} else {
				sbuf.append((char) (x));
			}
		}
		return sbuf.toString();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();
		String result = caesarCipher(s, k);
		System.out.println(result);
		in.close();
	}
}
