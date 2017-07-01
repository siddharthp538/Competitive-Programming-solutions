package com.siddharthapril17;

import java.util.Arrays;
import java.util.Scanner;

class iopcB {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = s.nextInt();

			Arrays.sort(a);
			int temp = 0;
			for (int i = a.length - 2; i >= 0; i--) {
				if (a[i] != a[a.length - 1]) {
					temp = a[i];
					break;
				}
			}

			System.out.println(temp % a[a.length - 1]);
		}

	}

}
