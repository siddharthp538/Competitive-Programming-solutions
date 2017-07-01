package com.siddharth;

import java.util.Scanner;

class FebLong2017 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		int x = s.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		while (x-- > 0) {
			int l = s.nextInt();
			int r = s.nextInt();
			int k = s.nextInt();
			MFRQ(a, l, r, k);
			System.out.println();

		}

	}

	public static void MFRQ(int[] a, int l, int r, int k) {
		int count = 1;
		if (k == 0) {
			System.out.print(-1);
			return;
		}

		boolean ok = false;
		for (int i = l - 1; i < r - 1; i++) {
			if (a[i] == a[i + 1])
				count++;
			else {
				if (count >= k) {
					System.out.print(a[i] + " ");
					ok = true;

				}
				count = 1;

			}
		}
		if (count >= k) {
			System.out.print(a[r - 1]);
			ok = true;
		}
		if (!ok)
			System.out.print(-1);
		
	}

}
