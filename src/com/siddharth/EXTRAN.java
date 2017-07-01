package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

class EXTRAN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = s.nextInt();
			Arrays.sort(a);
			if (a[1] - a[0] != 1) {
				System.out.println(a[0]);
			} else {
				for (int i = 0; i < a.length - 1; i++) {
					if (a[i + 1] - a[i] != 1) {
						if (i == a.length - 2) {
							System.out.println(a[i + 1]);
							break;
						} else {
							System.out.println(a[i]);
							break;
						}
					}

				}
			}
		}
	}

}
