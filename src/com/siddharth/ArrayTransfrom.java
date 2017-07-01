package com.siddharth;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class ArrayTransfrom {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int k = s.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}

			boolean ok = false;
			if (getsize(a) <= 2)
				System.out.println("YES");
			else {
				while (true) {

					if (!solve(n, k, a)) {
						System.out.println("NO");
						break;
					}
					if (getsize(a) <= 2) {
						System.out.println("YES");
						break;
					}

				}
			}

		}
	}

	public static boolean solve(int n, int k, int[] a) {
		boolean ok = false;
		Arrays.sort(a);
		int i = 0, j = 1;

		while (j < n) {
			int diff = a[j] - a[i];

			if (diff == k + 1) {
				// count++;
				//j++;
				ok = true;
				break;
			} else if (diff > k + 1) {
				i++;
			} else if (diff < k + 1) {
				j++;
			}
		}
		if (ok)
			update(a, k, j);
		return ok;
	}

	public static int getsize(int a[]) {
		HashSet<Integer> set = new HashSet<>();
		int n = a.length;
		for (int i = 0; i < n; i++) {
			set.add(a[i]);
		}
		return set.size();

	}

	public static void update(int[] a, int k, int j) {
		int n = a.length;
		a[j] -= k;
		for (int i = 0; i < n; i++) {
			if (i != j) {
				a[i] += k;
			}
		}
	}

}
