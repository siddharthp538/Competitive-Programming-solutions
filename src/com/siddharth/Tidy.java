package com.siddharth;

import java.util.Scanner;

public class Tidy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt(), no = 0;
		while (t-- > 0) {
			long n = s.nextLong();
			while (!lastdigit(n--)) {

			}
			System.out.println("Case #" + (no + 1) + ": " + (n + 1));

		}

	}

	static boolean lastdigit(long n) {
		long ans = n % 10;
		n = n / 10;
		while (n != 0) {
			if (ans < n % 10)
				return false;
			ans = n % 10;
			n =n/ 10;
		}
		return true;
	}

}
