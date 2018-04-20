package hrank.algorithm.strings;

import java.util.Scanner;

public class HackerRankInAString {

	static String hackerrankInString(String s) {
        // Complete this function
		char[] hrank = {'h','a','c','k','e','r','r','a','n','k'};
		int start=1, prevIndex=0;
		char[] scharArray = s.toCharArray();
		for(int i=0; i<scharArray.length; i++){
			if(scharArray[i] == 'h'){
				prevIndex=i;
			}else if(scharArray[i] == hrank[start]){
				if(i>prevIndex){
					prevIndex=i;
					start++;
				}
			}
			
		}
		if(start == hrank.length)
		return "YES";
		else{
			return "NO";
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();
    }
}
