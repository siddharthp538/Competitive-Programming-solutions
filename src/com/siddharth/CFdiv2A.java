package com.siddharth;

import java.util.Scanner;

public class CFdiv2A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		long sum = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % k == 0) {
				sum += (a[i] / k)/2;
			} else {
				sum += a[i] / k;
				sum++;
				
			}
		}
		if (sum % 2 == 0) {
			System.out.println(sum / 2);
			return;
		}
		sum /= 2;

		System.out.println(++sum);
	}

}
