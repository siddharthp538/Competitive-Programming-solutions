package SiddharthMay17;

import java.util.Scanner;

class PhilStone {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt(), m = s.nextInt();
			int[][] dp = new int[n][m];
			int[][] a = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = s.nextInt();
					dp[i][j] = -1;

				}
			}
			int c = 0;
			for (int i = 0; i < m; i++) {
				solve(0, c, n, m, 0, a, dp);
				c++;
			}
			int ans = Integer.MIN_VALUE;
			for (int i = 0; i < m; i++) {
				ans = Math.max(dp[0][i], ans);

			}
			System.out.println(ans);

		}
		// w.close();
	}

	public static int solve(int i, int j, int n, int m, int sum, int[][] a, int dp[][]) {
		sum = 0;
		int ans1 = 0, ans2 = 0, ans3 = 0;
		if (i == n || j == m)
			return sum;
		if (dp[i][j] != -1)
			return dp[i][j];
		sum += a[i][j];
		if (valid(i + 1, j - 1, n, m))
			ans1 = solve(i + 1, j - 1, n, m, sum, a, dp) + a[i][j];

		if (valid(i + 1, j, n, m))
			ans2 = solve(i + 1, j, n, m, sum, a, dp) + a[i][j];

		if (valid(i + 1, j + 1, n, m))
			ans3 = solve(i + 1, j + 1, n, m, sum, a, dp) + a[i][j];

		dp[i][j] = Math.max(Math.max(ans1, ans2), ans3);
		return dp[i][j];

	}

	static boolean valid(int i, int j, int n, int m) {
		if (i == -1 || j == -1)
			return false;

		return true;
	}

	static int solve1(int n, int ans) {
		if (n == 0)
			return ans;
		return solve1(n / 10, (ans * 10 + n % 10));
	}

}
