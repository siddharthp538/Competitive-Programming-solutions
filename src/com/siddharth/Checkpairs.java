package com.siddharth;

import java.util.Scanner;

public class Checkpairs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt(), k = s.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = s.nextInt();
			int i = 0, j = 1;
			boolean ok = false;
			while (i < n) { // 2-p-technique
				int diff = a[j] - a[i];
				if (diff == k + 1) {
					ok = true;
					break;
				} else if (diff < k) {
					j++;
				} else if (diff > k) {
					i++;
					j = i + 1;
				} else if (j == n - 1) {
					i++;
					j = i + 1;
				} else
					j++;

			}
			System.out.println(ok);

		}
	}

}
