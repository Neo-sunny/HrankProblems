package hrank.algorithm.implementation;

import java.util.Scanner;

public class MagicSquare {

	static int formingMagicSquare(int[][] s) {
        // Complete this function
		int cost =0;
		int[][] msqure= new int[][]{{4,9,2},{3,5,7},{8,1,6}};
		for(int row=0; row<3; row++){
			for(int col=0; col<3; col++){
				if(s[row][col]!=msqure[row][col]){
					cost+= Math.abs((s[row][col]-msqure[row][col]));
				}
			}
		}
		
		return cost;
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i = 0; s_i < 3; s_i++){
            for(int s_j = 0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        int result = formingMagicSquare(s);
        System.out.println(result);
        in.close();
    }
}
