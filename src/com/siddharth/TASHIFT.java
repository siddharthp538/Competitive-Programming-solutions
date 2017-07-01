package com.siddharth;

import java.util.Scanner;

class TASHIFT {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str1 = s.next(), str2 = s.next();
		char[] a = str1.toCharArray();
		char b[] = str2.toCharArray();
		long max = Long.MIN_VALUE, var = 0;
		int ans = 0;
		for (int i = 0; i < a.length; i++) {

			var = GetCount(a, b, i);
			if (var > max) {
				ans = i;
				max = var;

			}
			if (var == n)
				break;

		}
		System.out.println(ans);

	}

	public static long GetCount(char[] a, char[] b, int k) {
		int i, count = 0, j = 0;
		boolean ok = true;
		for (i = k; i < a.length; i++) {
			if (a[j] == b[i]) {
				count++;
				j++;
			} else if (a[j] != b[i]) {
				ok = false;
				break;
			}

		}
		i = 0;
		if (ok) {
			while (i != k) {
				if (a[j] == b[i]) {
					count++;
					j++;
				} else if (a[j] != b[i]) {
					ok = false;
					break;
				}
				i++;
			}
		}
		return count;
	}

}
