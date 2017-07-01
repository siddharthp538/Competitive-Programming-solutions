package com.siddharth;

import java.util.Scanner;

public class CHPAD {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char[] a = str.toCharArray();
		boolean ok = false;
		for (int i = 0; i < str.length() - 2; i++) {
			if (a[i] == 'A' && a[i + 1] == 'B') {
				if (a[i + 1] == 'B' || a[i + 2] == 'C') {
					ok = true;
					break;
				}
			}
			if (a[i] == 'B' && a[i + 1] == 'A') {
				if (a[i + 1] == 'A' || a[i + 2] == 'B') {
					ok = true;
					break;
				}
			}
		}
		System.out.println(ok ? "NO" : "YES");
	}
}
