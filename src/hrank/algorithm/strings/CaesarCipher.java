package hrank.algorithm.strings;

import java.util.Scanner;

public class CaesarCipher {

	static String caesarCipher(String s, int k) {
		StringBuffer cipher = new StringBuffer();
		while(k>26){
			k=k-26;
		}
		for (char c : s.toCharArray()) {
			if (Character.isLowerCase(c)) {
				int x = (int) c;
				if (x + k > 122) {
					int value = (x + k) - 122 + 96;
					cipher.append((char) value);
				} else {
					cipher.append((char) (x+k));
				}
			}else if(Character.isUpperCase(c)) {
				int x = (int) c;
				if (x + k > 90) {
					int value = (x + k) - 90 + 64;
					cipher.append((char) value);
				}else {
					cipher.append((char) (x+k));
				}
			}else {
				cipher.append(c);
			}
		}

		return cipher.toString();
			
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
