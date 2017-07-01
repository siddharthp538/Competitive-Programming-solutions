package com.siddharthapril17;

import java.util.Scanner;

class SMarket {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt(), q = s.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			while (q-- > 0) {
				int l = s.nextInt(), r = s.nextInt(), b = s.nextInt();
				System.out.println(cal(a, l, r, b));

			}

		}

	}

	public static int cal(int[] a, int l, int r, int b) {
		l--;
		r--;
		int count = 1, ans = 0;
		for (int i = l; i < r; i++) {
			if (a[i] == a[i + 1])
				count++;
			else {
				if (count >= b)
					ans++;
				count = 1;

			}

		}
		if (count >= b) {
			ans++;
		}

		return ans;

	}

}
