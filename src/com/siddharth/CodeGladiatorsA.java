package com.siddharth;

import java.util.Scanner;

public class CodeGladiatorsA {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt(), y = s.nextInt();
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int jumps = 1, temp = x, ans = 0;
		;
		for (int i = 0; i < n; i++) {
			temp = x;
			while (temp < a[i]) {
				jumps++;
				temp -= y;
				temp += x;
			}
			ans += jumps;
			jumps = 1;

		}
		System.out.println(ans);

	}

}
