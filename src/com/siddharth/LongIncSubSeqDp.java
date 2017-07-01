package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

class LongIncSubSeqDp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int[] sol = new int[n];
		Arrays.fill(sol, 1);
		for (int i = 1; i < n; i++) {
			int j = 0;
			while (i != j) {
				if (a[j] < a[i]) {
					sol[i] = Math.max(sol[i], sol[j] + 1);

				}
				j++;
			}
		}

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, sol[i]);
		}
		System.out.println(max);

	}

}
