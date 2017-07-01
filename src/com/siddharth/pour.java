package com.siddharth;

import java.util.Scanner;

class pour {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		boolean val = true;
		int ans = 0;
		while (t-- > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			if ((c > a && c > b) || ((gcd(a, b)) == Math.min(a, b)) && gcd(a, b) > 1) {
				val = false;

			} else {
				if (c == Math.abs(a - b)) {
					ans = 2;
				} else if (c == a || c == b) {
					ans = 1;
				} else if (c % Math.min(a, b) == 0) {
					ans = 2 * (c / Math.min(a, b));
				} else
					ans = a + b;
			}
			if (val)
				System.out.println(ans);
			else
				System.out.println(-1);
		}
	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

}
