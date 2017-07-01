package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

public class AppleAndToaster {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		long arraysum = 0, sum = 0, diff = 0;
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
			arraysum += a[i];

		}
		Arrays.sort(a);
		if (n == 1) {
			sum = a[0];
		} else {
			sum = 2 * arraysum;
			for (int i = 0; i < n - 2; i++) {
				diff += a[i];
				sum += (arraysum - diff);
			}
		}
		System.out.println(sum);
	}

}
