package com.siddharthapril17;

import java.util.Scanner;

class ALtime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			String str = s.next();
			char[] a = str.toCharArray();
			int n = a.length;
			int count = 0, max = 0, zero = 0;
			for (int i = 0; i < n - 1; i++) {
				if (a[i] == a[i + 1]) {
					max++;
				} else {
					if (a[i] == '1') {
						count++;

					} else
						zero++;
					max = 0;
				}

			}
			if (a[a.length - 1] == '1') {
				count++;

			} else
				zero++;
			if (count == 1) {
				System.out.println("YES");
			} else
				System.out.println("NO");

		}
	}

}
