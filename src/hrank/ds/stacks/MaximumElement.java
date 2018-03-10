package hrank.ds.stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Stack;

public class MaximumElement {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack();
		int maxVal=Integer.MIN_VALUE;
		int q = Integer.parseInt(br.readLine());
		for(int i=0; i<q; i++){
			String[] s = br.readLine().split("\\s+") ;
			int val = Integer.parseInt(s[0]);

			if(val==1){
				int item = Integer.parseInt(s[1]);
				stack.push(item);
				if(maxVal<item){
					maxVal=item;
				}
			}
			
			if(val==2){
				int item = stack.pop();
				if(item == maxVal){
					maxVal=Integer.MIN_VALUE;
					for(int e: stack){
						if(maxVal<e){
							maxVal=e;
						}
					}
				}
			}
			
			if(val==3){
				
				System.out.println(maxVal);
				System.out.println(Collections.max(stack));
			}
		}
	}
}
