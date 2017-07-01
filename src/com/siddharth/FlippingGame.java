package com.siddharth;

import java.util.Scanner;

public class FlippingGame {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int dp[] = new int[n];
		for (int i = 0; i < n; i++) {
			dp[i] = s.nextInt();
		}
		int fi = 0, li = 0;
		if (CheckAllOne(dp))
			System.out.println(n - 1);
		else if (CheckAllZero(dp))
			System.out.println(n);
		else {
			for (int i = 0; i < n; i++) {
				if (dp[i] == 0) {
					fi = i;
					break;
				}

			}
			for (int i = n - 1; i >= 0; i--) {
				if (dp[i] == 0) {
					li = i;
					break;
				}
			}
			int c = 0;
			for (int i = fi; i <= li; i++) {
				if (dp[i] == 1)
					c++;
			}
			int sum = li - fi + 1 - c;
			System.out.println(sum + fi + n - 1 - li);

		}

	}

	public static boolean CheckAllOne(int[] dp) {
		for (int i = 0; i < dp.length; i++) {
			if (dp[i] == 0)
				return false;
		}
		return true;
	}

	public static boolean CheckAllZero(int[] dp) {
		for (int i = 0; i < dp.length; i++) {
			if (dp[i] == 1)
				return false;
		}
		return true;
	}

}
