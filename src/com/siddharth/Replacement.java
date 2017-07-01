package com.siddharth;

import java.util.Scanner;

public class Replacement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		String str = s.next();
		char[] a = str.toCharArray();
		while (m-- > 0) {
			int pos = s.nextInt();
			char val = s.next().charAt(0);
			a[pos - 1] = val;
			long ans = FofS(a);
			System.out.println(ans);

		}
		s.close();
		return ;
		

	}

	public static long FofS(char[] a) {
		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == '.' && a[i + 1] == '.')
				count++;
		}

		return count;
	}

}
