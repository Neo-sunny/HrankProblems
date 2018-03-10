package com.week36.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAndMate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			char[][] board = new char[8][8];
			for (int board_i = 0; board_i < 8; board_i++) {
				char[] a=in.next().toCharArray();
				for (int board_j = 0; board_j < 8; board_j++) {
					
					board[board_i][board_j] = a[board_j];
				}
			}
			int result = waysToGiveACheck(board);
			System.out.println(result);
		}
		in.close();
	}

	static int waysToGiveACheck(char[][] board) {
		// Complete this function
		int Pr = 0, P1r = 0, P1c = 0, Pc = 0, kr = 0, kc = 0, checMate = 0;

		/* Find where king and pawn is sitting? */
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 8; c++) {
				if (board[r][c] == 'P') {
					Pr = r;
					Pc = c;
				} else if (board[r][c] == 'k') {
					kr = r;
					kc = c;
				}
			}
		}
		P1r = Pr - 1;
		P1c = Pc;
		/* checking whether i check and mate using King/ghora */
		if (kr == 1) {
			if (P1c + 2 == kc || P1c - 2 == kc) {
				checMate++;
			}
		}
		
		checMate+=checkMateWithHathi(board, P1r, P1c);
		checMate+= checkMateWithMantri(board, P1r, P1c);
		checMate+=checkMateWithwazir(board, P1r, P1c);
		
		return checMate;

	}

	/* checking whether i check and mate using Rook/Hathi */
	static int checkMateWithHathi(char[][] board, int P1r, int P1c) {
		int ch = P1c, checkmate = 0;
		for (int r = P1r + 1; r < 8; r++) {
			if (board[r][ch] == 'k') {
				checkmate++;
				break;
			}
		}
		return checkmate;
	}
	
	/* checking whether i check and mate using Mantri/Queen */
	static int checkMateWithMantri(char[][] board, int P1r, int P1c) {
		int rb = P1r + 1, checMate = 0;
		for (int c = P1c + 1; c < 8; c++) {
			if (board[rb][c] == 'k') {
				checMate++;
				break;
			}
			rb++;
		}
		int cb = P1c - 1;
		for (int r = P1r + 1; r <= P1c; r++) {
			if (board[r][cb] == 'k') {
				checMate++;
				break;
			}
			cb--;
		}
		
		int ch = P1c;
		for (int r = P1r + 1; r < 8; r++) {
			if (board[r][ch] == 'k') {
				checMate++;
				break;
			}
		}
		
		return checMate;
	}
	/* checking whether i check and mate using Wazir/Bishop */
	static int checkMateWithwazir(char[][] board, int P1r, int P1c) {
		int rb = P1r + 1, checMate = 0;
		for (int c = P1c + 1; c < 8; c++) {
			if (board[rb][c] == 'k') {
				checMate++;
				break;
			}
			rb++;
		}
		int cb = P1c - 1;
		for (int r = P1r + 1; r <= P1c; r++) {
			if (board[r][cb] == 'k') {
				checMate++;
				break;
			}
			cb--;
		}
		
		return checMate;
	}
}
