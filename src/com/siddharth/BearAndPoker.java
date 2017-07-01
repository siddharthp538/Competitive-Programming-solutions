package com.siddharth;

import java.util.Scanner;

public class BearAndPoker {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long[] a = new long[(int) n];
		for (long i = 0; i < n; i++)
			a[(int) i] = s.nextLong();
		long gcd = gcd(a[0], a[1]);
		for (long i = 1; i < n; i++) {
			gcd = gcd(gcd, a[(int) i]);
		}
		long k = 0;
		boolean ok = true;
		for (long i = 0; i < n; i++) {
			if ((gcd / a[(int) i]) % 2 != 0 || (gcd / a[(int) i]) % 3 != 0) {
				ok = false;
				break;
			}

		}
		System.out.println(ok ? "Yes" : "No");

	}

	static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static long lcm(long a, long b) {
		return (a * b) / gcd(a, b);
	}
}
