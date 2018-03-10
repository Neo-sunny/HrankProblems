package hrank.ds.stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	static String isBalanced(String s) {
		String retValue= "";
		Stack<Character> bp = new Stack<Character>();
		for (char b : s.toCharArray()) {
			if (b == '(' || b == '{' || b == '[') {
				bp.push(b);
			} else {
				if(!bp.isEmpty()){
				char item = bp.pop();
				
				if (b == ')' && item == '(') {
				} else if (b == '}' && item == '{') {
				} else if (b == ']' && item == '[') {
				} else {
					retValue= "NO";
					break;
				}
			}else{
				retValue= "NO";
				break;
			}
				
			}
			
		}
		if(bp.isEmpty() && retValue.equals("")){
			retValue= "YES";
		}else if(!bp.isEmpty() && retValue.equals("")){
			retValue= "NO";
		}
		return retValue;
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String s = in.next();
			String result = isBalanced(s);
			System.out.println(result);
		}
		in.close();
	}
}
