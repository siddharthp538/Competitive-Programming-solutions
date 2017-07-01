package com.siddharth;

import java.util.Scanner;

public class TwoButtons {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), m = s.nextInt();
		int ans = Integer.MAX_VALUE;
		if (n > m) {
			System.out.println(Math.abs(n - m));
			return;
		}
		ans = Math.min(ans, Math.min(RB(n, m), BB(n, m)));
		ans = Math.min(ans, CheckThree(n, m));

		System.out.println(ans);

	}

	public static int RB(int n, int m) {
		double k = (double) n;
		double l = (double) m;
		double var_temp = 0.0;
		var_temp = (double) (l / k);
		if (var_temp == (int) var_temp) {
			int var = (int) var_temp;
			if (((var) & (var - 1)) == 0)
				return (int) (Math.log(var_temp) / Math.log(2));
		}
		return Integer.MAX_VALUE;
	}

	public static int BB(int n, int m) {
		int count = Integer.MAX_VALUE, l = 0;
		double i = 0.0, var = 0.0;
		double k = (double) n;
		double c = (double) m;

		for (i = n - 1; i >= 1; i--) {
			var = (m / i);
			if (var == (int) var) {

				if (((int) var & (int) (var - 1)) == 0) {
					break;

				}
			}
		}
		if (i > 0)

		{
			l += (n - i) + (Math.log(m / i) / Math.log(2));

			return l;
		}
		return count;

	}

	public static int CheckThree(int n, int m) {
		int c = 0;
		// n = 2 * n;
		while (n < m) {
			n = 2 * n;

			c++;
			if (n == m)
				return c;
		}
		c += n - m;

		return c;
	}
}
