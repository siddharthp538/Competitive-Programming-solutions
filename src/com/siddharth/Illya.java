package com.siddharth;

import java.util.Scanner;

public class Illya {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int[] dp = new int[str.length() - 1];
		int[] sum = new int[str.length() - 1];
		int i = 0;
		for (i = 1; i < dp.length; i++) {
			if (str.charAt(i) == str.charAt(i - 1))
				dp[i - 1]++;
		}
		if (str.charAt(i) == str.charAt(i - 1))
			dp[i - 1]++;

		sum[0] = dp[0];
		for (i = 1; i < sum.length; i++) {
			sum[i] = sum[i - 1] + dp[i - 1];
		}
		int m = s.nextInt();
		while (m-- > 0) {
			int l = s.nextInt(), r = s.nextInt();
			if (r - l == 1)
				System.out.println(dp[--l]);
			else {
				l--;
				r--;
				r--;
				if (l >= r)
					System.out.println(0);
				else
					System.out.println(sum[r] - sum[l]);

			}
		}

	}
}
