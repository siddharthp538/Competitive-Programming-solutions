package com.siddharth;

import java.util.Scanner;

public class hourrank19A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n;) {
			count++;
			i += a[i] + 1;
		}
		System.out.println(count);
	}

}
