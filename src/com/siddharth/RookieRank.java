package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

public class RookieRank {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		int count = 1, element = 1, max = Integer.MIN_VALUE;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] == a[i + 1]) {
				count++;
			} else {

				if (count > max) {
					element = a[i];
					max = count;
				}

				count = 1;
			}
		}
		if (count > max) {
			element = a[a.length - 1];
			max = count;
		}
		System.out.println(element);

	}

}
