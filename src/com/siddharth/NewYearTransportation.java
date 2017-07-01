package com.siddharth;

import java.util.Scanner;

public class NewYearTransportation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int val = s.nextInt();
		int[] a = new int[n - 1];
		for (int i = 0; i < n - 1; ++i) {
			a[i] = s.nextInt();
		}
		System.out.println(dfs(val, a, 1) ? "YES" : "NO");

	}

	public static boolean dfs(int val, int[] a, int n) {
		if (n == val)
			return true;
		if (n > a.length)
			return false;
		return dfs(val, a, (n + a[n - 1]));
	}

}
