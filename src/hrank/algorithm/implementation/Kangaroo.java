package hrank.algorithm.implementation;

import java.util.Scanner;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
		String retValue= "";
		int v = (v1-v2);
		int x = (x2-x1);
		
		if(v==0){
			retValue="NO";
		}else if(v<0){
			retValue="NO";
		}else {
			int value = x%v;
			if(value==0){
				retValue="YES";
			}else {
				retValue="NO";
			}
		}
		
		return retValue;
    }
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
