package com.siddharthapril17;

import java.util.Scanner;

public class Permutation {
	static int count = 0, fin_ans = 0, mod = 1000000007;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int q = s.nextInt();
		int[][] ans = new int[17][17];

		for (int i = 1; i <= 16; i++) {

			for (int j = 1; j <= i; j++) {
				int[] a = new int[i];
				for (int k = 0; k < i; k++) {
					a[k] = k + 1;
				}
				if (i != 1)
					get_all_pairs(a, 0, i, j);
				
					ans[i][j] = fin_ans;
				fin_ans = 0;

			}
		}
		while (q-- > 0) {
			int n = s.nextInt();
			int b = s.nextInt();

			System.out.println(ans[n][b] % mod);

		}

	}

	static void get_all_pairs(int[] a, int ind, int n, int k) {
		if (ind >= n - 1) {
			int count = 0;
			for (int i = 1; i < n - 1; i++) {
				if (a[i] < a[i - 1] || a[i] < a[i + 1]) {
					count++;
				}

			}
			if (a[0] < a[1])
				count++;
			if (a[n - 2] > a[n - 1])
				count++;
			if (count >= k) {
				fin_ans++;

			}

			return;
		}

		for (int i = ind; i < n; i++) {

			int temp = a[ind];
			a[ind] = a[i];
			a[i] = temp;

			get_all_pairs(a, ind + 1, n, k);

			temp = a[ind];
			a[ind] = a[i];
			a[i] = temp;
		}
	}
}
