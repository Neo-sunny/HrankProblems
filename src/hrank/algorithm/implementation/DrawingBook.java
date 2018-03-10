package hrank.algorithm.implementation;

import java.util.Scanner;

public class DrawingBook {

	static int solve(int n, int p){
        // Complete this function
		int retVal=0;
		int tpt= n/2;
		int mirror_point= tpt/2;
		int pagestoturn=p/2;
		if(pagestoturn<=mirror_point){
			retVal= pagestoturn;
		}else if(pagestoturn>mirror_point){
			retVal= tpt-pagestoturn;
		}
	
		return retVal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
