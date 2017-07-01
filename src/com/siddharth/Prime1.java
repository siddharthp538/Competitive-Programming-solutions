package com.siddharth;

import java.util.Scanner;

class Prime1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		while (t-- > 0) {
			int count = 0;
			int n = s.nextInt();
			for (int i = 2; i <= n; i++) {
				if (IsPrime(i)) {
					// System.out.println(i);
					count += i
							;
				}
			}
			System.out.println(count);
		}
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

}
// 2
// 2 50
// 1 100
