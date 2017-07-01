package com.siddharth;

import java.util.Scanner;

class ltime {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			boolean ok = false;
			int a = s.nextInt(), b = s.nextInt();
			if (a % 2 == 0) {
				if (b == a - 2 && (a - 2) > 0) {
					ok = true;
				} else if (b == a + 2 && (a + 2) > 0) {
					ok = true;
				} else if (b == a - 1 && (a - 1) > 0) {
					ok = true;
				}
				
				
			} else {
				if (b == a - 2 && (a - 2) > 0) {
					ok = true;
				} else if (b == a + 1 && (a + 1) > 0) {
					ok = true;
				} else if (b == a + 2 && (a + 2) > 0) {
					ok = true;
				}
			}
			System.out.println(ok ? "YES" : "NO");
		}
	}

}
