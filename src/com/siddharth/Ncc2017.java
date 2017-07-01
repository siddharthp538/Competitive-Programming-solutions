package com.siddharth;

import java.util.Scanner;

class Ncc2017 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int x = 0;
			int n = s.nextInt();
			int i, j;
			int[] a = new int[n];
			for (i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			int[][] dp = new int[n][n];
			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++)
					dp[i][j] = -1;
			}

			System.out.println(f(0, n - 1, dp, a, 0, n));
		}
	}

	public static int f(int i, int j, int[][] dp, int[] a, int x, int n) {
		if (i == j + 1)
			return 0;
		if (dp[i][j] != -1)
			return dp[i][j];
		x = n - (j - i + 1) + 1;
		dp[i][j] = Math.max((a[i] * x) + f(i + 1, j, dp, a, x, n), (a[j] * x) + f(i, j - 1, dp, a, x, n));
		return dp[i][j];

	}

}
