package com.siddharth;

import java.util.Scanner;

class Xyena {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = s.nextInt();
			for (int i = 0; i < n; i++)
				b[i] = s.nextInt();
			int max1 = 0, max2 = 0;
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					max1 += a[i];
				} else {
					max1 += b[i];
				}
			}
			for (int i = 0; i < n; i++) {
				if (i % 2 == 0)
					max2 += b[i];
				else {
					max2 += a[i];
				}
			}
			System.out.println(Math.min(max1, max2));
		}
	}

}
