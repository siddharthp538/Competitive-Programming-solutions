package com.siddharth;

import java.util.Scanner;

public class LuckyDiv {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] a = { 4, 7, 44, 77, 47, 74, 444, 447, 477, 474, 777, 774, 744, 747 };
		int n = s.nextInt();
		boolean ok = false;
		for (int i = 0; i < a.length; i++) {
			if (n % a[i] == 0) {
				ok = true;
				break;
			}
		}
		System.out.println(ok ? "YES" : "NO");

	}
}
