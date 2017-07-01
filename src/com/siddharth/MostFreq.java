package com.siddharth;

import java.util.Scanner;

class MostFreq {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int q = s.nextInt();
		int[] a = new int[n];
		int[][] dp = new int[n][3];
		// element firstindex lastindex[n][3]
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			dp[i][0] = a[i];
		}

		dp[0][1] = 0;

		for (int i = 1; i < n; i++) {

			if (a[i] != a[i - 1]) {
				dp[i][1] = i;
				dp[i - 1][2] = i - 1;
			} else {
				dp[i][1] = dp[i - 1][1];
			}
		}
		dp[n - 1][2] = n - 1;

		for (int i = n - 2; i >= 0; i--) {
			if (dp[i][0] == dp[i + 1][0]) {
				dp[i][2] = dp[i + 1][2];
			}
		}
		while (q-- > 0) {
			int l = s.nextInt()-1;
			int r = s.nextInt()-1;
			int k = s.nextInt();
			int mid = (r + l) / 2;
			int low = dp[mid][1];
			int high = dp[mid][2];
			if (low < l)
				low = l;
			if (high > r)
				high = r;
			if (high - low + 1 >= k) {
				System.out.println(dp[mid][0]);
			} else
				System.out.println(-1);
		}

	}

}
