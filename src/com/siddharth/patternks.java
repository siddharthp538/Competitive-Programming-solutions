package com.siddharth;

import java.util.Scanner;

public class patternks {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt(), c = 1;
		while (t-- > 0) {
			String str1 = s.next();
			String str2 = s.next();
			char[] a = str1.toCharArray();
			char[] b = str2.toCharArray();
			boolean ok = false;
			int x = 0, ia = 0, ib = 0;
			int max = Math.max(str1.length(), str2.length());
			while (ia < a.length || ib < b.length) {
				if (a[ia] == '*') {
					ib += 4;
					ia++;
					if (ib > b.length) {
						ok = true;
						break;
					}
				} else if (b[ib] == '*') {
					ia += 4;
					ib++;
					if (ia > a.length) {
						ok = true;
						break;
					}
				} else if (a[ia] != b[ib]) {
					ok = false;
					break;
				} else {
					ia++;
					ib++;
				}
				// break;

			}

			if (ok)
				System.out.println("Case #" + (c++) + ": " + "TRUE");
			else
				System.out.println("Case #" + (c++) + ": " + "FALSE");
		}
	}

}
