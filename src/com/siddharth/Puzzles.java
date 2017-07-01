package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int count = Integer.MAX_VALUE;
		int[] a = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		for (int i = 0; i <= m - n; i++) {
			count = Math.min(a[n + i-1] - a[i], count);
		}
		System.out.println(count);

	}

}
