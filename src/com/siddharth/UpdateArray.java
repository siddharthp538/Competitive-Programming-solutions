package com.siddharth;

import java.util.Scanner;

public class UpdateArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			sum += a[i];
		}
		System.out.println((sum / n) + 1);

	}

}
