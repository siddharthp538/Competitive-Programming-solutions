package com.siddharth;

import java.util.Scanner;

class CodeChamps2017 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Sum(s.nextLong(), s.nextLong(), s.nextLong(), s.nextLong());
	}

	public static boolean IsPrime(int n) {
		if (n == 1)
			return false;
		if (n % 2 == 0)
			return n == 2;
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void Palin(String str) {
		char[] a = str.toCharArray();
		boolean ok = true;
		for (int i = 0; i < a.length / 2; i++) {
			if (a[i] != a[a.length - 1 - i]) {
				ok = false;
				break;
			}
		}
		if (!ok)
			System.out.println("NO");
		else
			System.out.println("YES");

	}

	public static void Sum(long a, long b, long c, long d) {
		boolean ok = false;
		if (a == 0 || b == 0 || c == 0 || d == 0)
			ok = true;
		else if (a + b + c + d == 0) {
			ok = true;
		} else if (a + b + c == 0) {
			ok = true;
		} else if (a + b == 0) {
			ok = true;
		} else if (b + c + d == 0) {
			ok = true;
		} else if (c + d == 0)
			ok = true;
		else if (b + d == 0)
			ok = true;
		else if (a + c == 0)
			ok = true;
		else if (b + c == 0)
			ok = true;
		else if (a + d == 0)
			ok = true;
		if (ok)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
