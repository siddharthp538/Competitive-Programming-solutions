package com.siddharthapril17;

//dp
import java.util.Scanner;


class SUMTRI {
	static long ans = 0;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long t = s.nextLong();
		while (t-- > 0) {

			int n = s.nextInt();
			long[][] memo = new long[n][n];
			long[][] dp = new long[n][n];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					dp[i][j] = s.nextLong();

				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					memo[i][j] = -1;
				}
			}
			for (int i = 0; i < n; i++) {
				memo[n - 1][i] = dp[n - 1][i];
			}

			solve(0, 0, 0, n, memo, dp);
			System.out.println(memo[0][0]);

		}

	}

	static long solve(int i, int j, long sum, long n, long memo[][], long dp[][]) {
		sum = 0;
		if (i == n)

			return sum;

		if (memo[i][j] != -1) {

			
			return (memo[i][j]);
		}

		sum += dp[i][j];
		long ans1 = solve(i + 1, j, sum, n, memo, dp) + dp[i][j];
		long ans2 = solve(i + 1, j + 1, sum, n, memo, dp) + dp[i][j];

		memo[i][j] = Math.max(ans1, ans2);
		return memo[i][j];

	}

}
