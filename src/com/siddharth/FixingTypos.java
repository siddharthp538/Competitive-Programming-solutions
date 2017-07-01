package com.siddharth;

import java.util.Scanner;

public class FixingTypos {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char[] a = str.toCharArray();
		StringBuilder str1 = new StringBuilder(str);
		int i = 0;
		while (i < a.length) {
			if ((i + 3) < a.length) {
				if (str1.charAt(i) == str1.charAt(i + 1) && str1.charAt(i + 2) == str.charAt(i + 3)) {
					str1.deleteCharAt(i + 1);
					str1.deleteCharAt(i + 3);
					i += 2;
				}
				else i++;
			}
			if ((i + 2) < a.length) {
				if (a[i] == a[i + 1] && a[i + 1] == a[i + 2]) {
					str1.deleteCharAt(i);
					str1.deleteCharAt(i + 1);
					i++;
				
				}
				else i++;
			} else
				i++;
		}
		System.out.println(str1);

	}

}
