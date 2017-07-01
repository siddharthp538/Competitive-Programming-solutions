package com.siddharth;

import java.util.Scanner;

public class WilburAndArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		long[] a = new long[(int) n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		long count = Math.abs(-a[0]);
		for (int i = 1; i < n; i++) {
			count += Math.abs(a[i] - a[i - 1]);

		}
		System.out.println(count);

	}

}
