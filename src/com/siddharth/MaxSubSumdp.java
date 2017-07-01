package com.siddharth;

import java.util.Scanner;

public class MaxSubSumdp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			int[] dp = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = dp[i] = s.nextInt();
			MaxSubarray(n, a);
			MaxSubSeqSumdp(n, a, dp);

			System.out.println();
		}
	}

	public static void MaxSubSeqSumdp(int n, int[] a, int[] dp) {
		for (int i = 1; i < n; i++) {
			int j = 0;
			while (i != j) {
				if (a[j] <= a[i]) {
					dp[i] = Math.max(dp[j] + a[i], dp[i]);
				}
				j++;
			}
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(dp[i], max);
		}

		System.out.print(" " + max);
		return;
	}

	public static void MaxSubarray(int n, int[] a) {
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

		for (int i = 0; i < n; i++) {
			max_ending_here = max_ending_here + a[i];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;

			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		System.out.print(max_so_far);

	}
}