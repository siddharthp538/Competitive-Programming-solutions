package com.siddharth;

import java.util.Scanner;

public class AliceAndBob {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		getWinner(s);
		s.close();
	}

	public static void getWinner(Scanner s) {
		long n = s.nextLong();
		long[] a = new long[(int) n];
		long max = Long.MIN_VALUE;
		for (long i = 0; i < n; i++) {
			a[(int) i] = s.nextLong();
			max = max(a[(int) i], max);
		}
		long gcd = gcd(a[0], a[1]);
		for (int i = 1; i < a.length; i++) {
			gcd = gcd(a[i], gcd);
		}
		max /= gcd;
		System.out.println((max - n) % 2 == 0 ? "Bob" : "Alice");

	}

	public static long gcd(long a, long b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	public static long max(long a, long b) {
		return a > b ? a : b;
	}

}