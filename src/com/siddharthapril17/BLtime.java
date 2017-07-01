package com.siddharthapril17;

import java.util.ArrayList;
import java.util.Scanner;

class BLtime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt(), p = s.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();

			}
			ArrayList<Long> A = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				long ans = 0;
				for (int j = i; j < n; j++) {
					ans += a[j];
					A.add(ans % p);
				}

			}
			long max = Integer.MIN_VALUE;
			for (int i = 0; i < A.size(); i++) {
				max = Math.max(A.get(i), max);
			}
			int count = 0;
			for (int i = 0; i < A.size(); i++) {
				if (A.get(i) == max)
					count++;
			}
			System.out.println(max + " " + count);
		}
	}

}
