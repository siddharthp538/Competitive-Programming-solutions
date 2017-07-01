package com.siddharth;

import java.util.Scanner;

public class Taxes {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long temp = n;
		while (!prime(temp)) {
			temp--;
		}
		if (n == temp) {
			System.out.println(1);
		} else {
			if ((n - temp) == 1) {
				while (!prime(temp)) {
					temp--;
				}
				long check = n - temp;
				if (prime(check)) {
					System.out.println(2);
					return;
				}
				long ans1 = div(n - temp);
				System.out.println(++ans1);

			} else {
				long check = n - temp;
				if (prime(check)) {
					System.out.println(2);
					return;
				}
				long ans1 = div(n - temp);
				System.out.println(++ans1);

			}
		}

	}

	public static boolean prime(long n) {
		if (n % 2 == 0)
			return n == 2;
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static long div(long n) {
		for (long i = n - 1; i >= 2; i--) {
			if (n % i == 0) {
				return i;
			}

		}
		return 0;
	}

}
