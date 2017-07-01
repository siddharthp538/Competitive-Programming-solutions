package com.siddharth;

import java.util.Scanner;

public class hourrank19B {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			sum ^= a[i];
		}
		int count = 0;
		long temp = 0;
		// temp ^= a[0];

		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {
				temp = 0;
				for (int k = 0; k < i; k++) {
					temp ^= a[k];
				}
				for (int m = j + 1; m < n; m++) {

					temp ^= a[m];
				}
				if (temp == 0)
					count++;

			}

		}
		System.out.println(count);
	}

}
