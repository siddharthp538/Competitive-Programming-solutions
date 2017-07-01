package com.siddharth;

import java.util.Scanner;

public class Ribbon {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int count = 1, max = 0;
		;
		for (int i = 0; i < n - 1; i++) {
			if (a[i] < a[i + 1])
				count++;
			else {
				max = Math.max(max, count);
				count = 1;

			}
		}
		max = Math.max(max, count);
		System.out.println(max);

	}

}