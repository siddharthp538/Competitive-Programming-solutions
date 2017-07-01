package com.siddharth;

import java.util.Scanner;

public class cakes {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt(), caseno = 0;

		while (t-- > 0) {

			String str = s.next();
			int k = s.nextInt();
			char[] a = str.toCharArray();
			int count = 0;
			boolean ok = true;
			while (!check(a)) {
				count++;
				if (count > a.length) {
					ok = false;
					break;
				}

				for (int i = 0; i < a.length; i++) {
					if (a[i] == '-') {
						int j = 0, temp = i;
						if (i + k - 1 < a.length) {
							while (j < k) {
								if (a[temp] == '+')
									a[temp] = '-';
								else
									a[temp] = '+';
								temp++;
								j++;
							}

						}
						break;
					}

				}
			}
			if (ok)
				System.out.println("Case #" + (++caseno) + ": " + count);
			else {
				System.out.println("Case #" + (++caseno) + ": " + "IMPOSSIBLE");
			}
		}

	}

	public static boolean check(char[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == '-')
				return false;
		}
		return true;
	}

}