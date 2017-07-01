package com.siddharth;

import java.util.Scanner;

public class GoodSubString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char[] a = str.toCharArray();
		int ac = 0, bc = 0, even = 0, odd = a.length, pc = 1;
		if (a[0] == 'a') {
			ac = 1;
		} else
			bc = 1;

		for (int i = 1; i < a.length; i++) {
			int x = (i + 1) % 2;

			if (i < a.length) {
				pc = 1;
				if (a[i] == 'a' && x == 0) {
					ac++;
					even += ac - 1;
				} else if (a[i] == 'a' && x == 1) {
					ac++;
					odd += ac - 1;
				} else if (a[i] == 'b' && x == 0) {
					bc++;
					even += bc - 1;
				} else {
					bc++;
					odd += bc - 1;
				}

			}
		}

		System.out.println(even + " " + odd);
	}

}
