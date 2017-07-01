package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

class SORTROW {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt(), n = t, temp = t;
		int[] a = new int[t];
		while (t-- > 0) {
			int i = 0;

			while (n-- > 0) {
				a[i] = s.nextInt();

				i++;
			}
			n = temp;

			int max1 = 0, max2 = 0;
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1])
					max1++;
				else
					max2++;
			}
			if (max1 == (n - 1) || max2 == (n - 1)) {
				if (max1 == (n - 1)) {
					for (int u = a.length - 1; u >= 0; u--)
						System.out.print(a[u] + " ");
				} else if (max2 == (n - 1)) {
					for (int u = 0; u < a.length; u++)
						System.out.print(a[u] + " ");
				}
			} else if (max1 > max2) {
				Arrays.sort(a);
				for (int u = 0; u < a.length ; u++)
					System.out.print(a[u] + " ");
			} else {
				Arrays.sort(a);
				for (int u = a.length - 1; u >= 0; u--)
					System.out.print(a[u] + " ");
			}

			System.out.println();

		}
	}
}
