package com.siddharth;

import java.util.Scanner;

class AND {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		long sum = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == 1)
				sum++;
		}
		sum = ((sum) * (sum - 1)) / 2;
		System.out.println(sum);
	}

}