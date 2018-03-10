package com.week36.challenge;

import java.util.Scanner;

public class TestBoard {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        char[][] board = new char[8][8];
        for(int a0 = 0; a0 < t; a0++){
           
            for(int board_i = 0; board_i < 8; board_i++){
                for(int board_j = 0; board_j < 8; board_j++){
                    board[board_i][board_j] = in.next().charAt(0);
                }
            }
        }
        in.close();
	
	int P1r=0, P1c=7;
	int rb=P1r+1;
	for(int c =P1c+1;c<8; c++){
//		System.out.println(rb +" "+c);
		rb++;
	}
	int cb = P1c-1;
	for(int r=P1r+1; r<=P1c; r++){
//		System.out.println(r +" "+cb);
		cb--;
	}
	
	int ch=P1c;
	for(int r=P1r+1; r<8; r++){
		System.out.println(r +" "+ch);
	}
	
	}
	
	
}
