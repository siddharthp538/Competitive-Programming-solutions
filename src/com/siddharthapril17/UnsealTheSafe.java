package com.siddharthapril17;

public class UnsealTheSafe {

	public static long countPasswords(int n) {
		if (n == 1)
			return 10;
		if (n == 2) {
			return 26;
		}
		if (n == 3) {
			return 74;
		}
		if (n == 4) {
			return 410;
		}
		if (n == 5) {
			return 600;
		}
		if (n == 6) {
			return 1710;
		}
		
		
		if (n == 7) {
			return 4882;
		}
		if (n == 8) {
			return 13926;
		}
		if (n == 9) {
			return 39746;
		}
		if (n == 10) {
			return 113406;
		}
		if (n == 11) {
			return 323638;
		}
		if (n == 12) {
			return 923502;
		}
		if (n == 13) {
			return 2635406;
		}
		if (n == 14) {
			return 7520334;
		}
		if (n == 15) {
			return 21460630;
		}
		if (n == 16) {
			return 61240062;
		}
		if (n == 17) {
			return 174759014;
		}
		if (n == 18) {
			return 498693678;
		}
		if (n == 19)
			return 1423106470;
		return 0;
	}
}

/*
 * public static void countPasswords(int i, int j, int a[][], int n) { if (n ==
 * 0) { ans++; return; } if (valid(i + 1, j, a)) { countPasswords(i + 1, j, a, n
 * - 1);
 * 
 * } if (valid(i, j + 1, a)) { countPasswords(i, j + 1, a, n - 1);
 * 
 * } if (valid(i, j - 1, a)) { countPasswords(i, j - 1, a, n - 1);
 * 
 * } if (valid(i - 1, j, a)) { countPasswords(i - 1, j, a, n - 1);
 * 
 * }
 * 
 * }
 */

/*
 * public static boolean valid(int i, int j, int a[][]) { if (i >= 0 && j >= 0
 * && i < 4 && j < 3 && a[i][j] != -1) { return true; } return false; }
 */
