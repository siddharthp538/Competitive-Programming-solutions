package com.siddharthapril17;

import java.util.Scanner;

class IOPC17A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {

			String str = s.next();
			int n = str.length();
			char[] a = str.toCharArray();
			if (check(a, 0, n)) {
				System.out.println(0);
				continue;
			}
			if (n % 2 == 1) {
				System.out.println(-1);
				continue;
			}
			if ((n & n - 1) != 0) { // check_power_of_two
				if (check(a, n / 2, n) || check(a, 0, n / 2 - 1)) {
					System.out.println(1);
				} else {
					System.out.println(-1);
				}

			} else if ((n & n - 1) == 0) {
				long mult = 2, max = 0, temp = 0;
				while (mult <= n) {
					for (int i = 0; i < n - 1; i += mult) {
						long count = 1;
						temp = 0;
						int x = i;
						while (temp++ < mult - 1) {
							if (a[x] == a[x + 1])
								count++;
							if (count == mult) {
								i = n;
								max = mult;

							}
							x++;
						}

					}
					mult *= 2;
				}
				int ans1 = (int) (Math.log(n) / Math.log(2));
				if (max == 0)
					System.out.println(ans1);
				else {

					int ans = (int) (Math.log(max) / Math.log(2));

					System.out.println(ans1 - ans);
				}
			}

		}
	}

	public static boolean check(char[] a, int f, int l) {
		for (int i = f; i < l - 1; i++) {
			if (a[i] != a[i + 1])
				return false;
		}
		return true;
	}

}
