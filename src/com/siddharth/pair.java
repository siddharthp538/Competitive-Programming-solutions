package com.siddharth;

import java.util.Scanner;

class pair {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int m = s.nextInt(), n = s.nextInt();
			long ans = lcm(m, n);
			long a1 = ans / m;

			long a2 = ans / n;
			System.out.println(--a1 + " " + --a2);

		}
	}

	static long gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	static long lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

}
