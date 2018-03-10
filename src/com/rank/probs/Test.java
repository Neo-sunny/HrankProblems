package com.rank.probs;

import java.util.Stack;

public class Test {
	void aa(String str){System.out.println("Str");}
	void aa(Object str){System.out.println("Thread");}
	
	
	public static void main(String[] args) {
		new Test().aa(null);
		System.out.println();
		Stack<Integer> stack = new Stack<>();
		stack.push(90);
		System.out.println(stack.pop());
	}
}
