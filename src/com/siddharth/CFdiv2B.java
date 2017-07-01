package com.siddharth;

import java.util.Scanner;

public class CFdiv2B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int temp = 0, c = 0, i = 0, j = 1, max = Integer.MIN_VALUE;
		for (i = 0; i < n; i++) {
			c = 0;
			temp = a[i];
			for (j = i + 1; j < n; j++) {
				boolean ok = false;
				if (temp > a[j]) {
					c++;
					temp = a[j - 1] + 1;

					ok = true;
				} else if (temp == a[j] && c == 1) {
					break;
				}
				if (c > 1)
					break;
				if (!ok) {
					temp = a[j];
				}

			}
			j--;
			max = Math.max(max, j - i + 1);

		}
		System.out.println(max);

	}

}
