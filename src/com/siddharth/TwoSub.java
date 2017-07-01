package com.siddharth;

import java.util.Scanner;

public class TwoSub {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		if (str.length() <= 3)
			System.out.println("NO");
		else {
			char[] a = str.toCharArray();
			int i = 0, n = str.length();
			boolean ok1 = false, ok2 = false;
			while (i < n) {
				if (a[i] == 'B' && a[i + 1] == 'A') {
					ok2 = true;
				}
				
			}
		}

	}

}
