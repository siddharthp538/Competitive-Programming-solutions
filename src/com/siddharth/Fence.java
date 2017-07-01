package com.siddharth;

import java.util.Scanner;

public class Fence {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		long[] a = new long[n];
		long[] dp = new long[n];
		dp[0] = a[0] = s.nextInt();
		for (int i = 1; i < n; i++) {
			a[i] = s.nextInt();
			dp[i] = a[i] + dp[i - 1];
		}
		long min = dp[k - 1], temp = 0, low = 1;
		for (int i = k; i < n; i++) {
			temp = dp[i] - dp[i - k];
			if (temp < min) {
				low = i - k + 2;
				min = temp;
			}
		}
		System.out.println(low);

	}

}
