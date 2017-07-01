package com.siddharth;

import java.util.Scanner;

//oct16
class FENWITER {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			String s1 = s.next(), s2 = s.next(), s3 = s.next(), temp = s2;
			int n = s.nextInt(), i = 0;
			for (i = 0; i < n - 1; i++) {
				s2 += temp;
			}
			s1 = s1 + s2 + s3;
			long count = -1;
			for (i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == '1')
					count++;
			}

			System.out.println(count);
		}
	}

}
