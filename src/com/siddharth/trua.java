package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

class trua {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int l = s.nextInt();
		int r = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		int max_sum = 0;
		int min_diff = Integer.MAX_VALUE;
		for (int i = 1; i < n; i++) {
			min_diff = Math.min(min_diff, a[i] - a[i - 1]);
			max_sum = Math.max(max_sum, a[i] + a[i - 1]);
		}
		
		
		
		
		
	}

}
