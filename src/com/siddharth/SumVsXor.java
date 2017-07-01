package com.siddharth;

import java.util.Scanner;

public class SumVsXor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Long n = s.nextLong();
		String str = Long.toBinaryString(n);
		int c = 0;
		char[] a = str.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == '0')
				c++;
		}
		if (n == 0)
			c = 1;
		System.out.println((long) Math.pow(2, c));
	}

}
