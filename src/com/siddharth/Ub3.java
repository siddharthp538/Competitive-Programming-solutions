package com.siddharth;

import java.util.Scanner;

public class Ub3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), b = s.nextInt();
		int[] a = new int[n];
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, i = 0;
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);

		}
		int k = 1, div = 0;
		while (true) {
			if (max % (min / k) == 0) {
				div = max / (min / k);
				break;
			}
			if (k > b / 2)
				break;
			k++;
		}
		if (div == 0)
			System.out.println(0);
		else
			System.out.println(max / div);
	}

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

}
