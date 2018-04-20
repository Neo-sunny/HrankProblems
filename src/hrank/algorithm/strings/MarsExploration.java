package hrank.algorithm.strings;

import java.util.Scanner;

public class MarsExploration {

	static int marsExploration(String s) {
        // Complete this function
		int altered=0;int j=0;
		for(char ch: s.toCharArray()){
			
			if(j==0){
				if(ch!='S'){ altered++; }
			}if(j==1){
				if(ch!='O'){ altered++; }
			}if(j==2){
				if(ch!='S'){ altered++; }
			}
			j++;
			if(j>2){ j=0;}
		}
		
		
		return altered;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = marsExploration(s);
        System.out.println(result);
        in.close();
    }
}
