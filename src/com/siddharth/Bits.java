package com.siddharth;

import java.util.Scanner;

public class Bits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int max = 0, m1 = 0, m2 = 0, m3 = 0, m4 = 0, m5 = 0, m6 = 0, n = s.nextInt(), a = s.nextInt(), b = s.nextInt(),
				c = s.nextInt();

		if (n % a == 0)
			m1 = n / a;
		max = m1 > max ? m1 : max;

		if (n % b == 0)
			m2 = n / b;
		max = m2 > max ? m2 : max;

		if (b % c == 0)
			m3 = n / c;
		max = m3 > max ? m3 : max;
		if (a + b + c == n)
			m4 = 3;
		max = m4 > max ? m4 : max;
		if (a + b == n || a + c == n || b + c == n)
			m5 = 2;
		max = m5 > max ? m5 : max;
		if (a == n || b == n || c == n)
			m6 = 1;
		max = m6 > max ? m6 : max;
		System.out.println(max);
	}

}
