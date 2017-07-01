package com.siddharth;

import java.util.Scanner;

public class CodeGaldiatorsB {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		String str1 = s.next(), str2 = s.next();
		long ascii1 = 0, asci2 = 0;

		for (int i = 0; i < n; i++) {
			ascii1 += (int) str1.charAt(i);
			asci2 += (int) str2.charAt(i);
		}
		int count = 0;
		if (ascii1 == asci2)
			count++;
		int temp = 0;
		for (int i = n; i < m; i++) {
			asci2 += (int) str2.charAt(i) - (int) str2.charAt(temp);
			if (ascii1 == asci2)
				count++;
			temp++;

		}
		System.out.println(count);

	}

}
