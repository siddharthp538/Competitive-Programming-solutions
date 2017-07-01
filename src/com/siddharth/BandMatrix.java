package com.siddharth;

import java.util.Scanner;

class BandMatrix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[][] a = new int[n][n];
			int sum1 = 0, sum0 = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					{
						a[i][j] = s.nextInt();
						if (a[i][j] == 1 && i != j) {
							sum1++;
						} else if (a[i][j] == 0)
							sum0++;
					}
				}
			}
			if (Check1(a))
				System.out.println(n - 1);
			else if (Check0(a))
				System.out.println(0);
			else {
				int ans = 0, i = 1, z = sum0;
				while (2 * i <= z) {
					ans++;
					z -= 2 * i;
					i++;
				}
				System.out.println(n - 1 - ans);

			}

		}

	}

	static boolean Check1(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if ( a[i][j] == 0) {
					return false;
				}
			}
		}
		return true;
	}

	static boolean Check0(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i != j && a[i][j] == 1) {
					return false;
				}
			}
		}
		return true;
	}

}
