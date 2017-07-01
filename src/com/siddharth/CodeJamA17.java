package com.siddharth;

import java.util.Scanner;

public class CodeJamA17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt(), caseno = 0;

		while (t-- > 0) {

			String str = s.next();
			int k = s.nextInt();
			char[] a = str.toCharArray();
			int c = 0;
			boolean done = true;
			while (!check1(a)) {
				c++;
				if (c > 100) {
					done = false;
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
			if (done)
				System.out.println("Case #" + (++caseno) + ": " + c);
			else {
				System.out.println("Case #" + (++caseno) + ": " + "IMPOSSIBLE");
			}
		}

	}

	public static boolean check1(char[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == '-')
				return false;
		}
		return true;
	}

}
