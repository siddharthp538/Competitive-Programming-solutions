package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

public class Virtual303A {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		int q = s.nextInt();
		while (q-- > 0) {
			int an = s.nextInt();
			System.out.println(ModifiedBinarySearch(an, a));

		}
		s.close();

	}

	public static int ModifiedBinarySearch(int val, int a[]) {
		if (val == a[0])
			return 1;
		if (val < a[0])
			return 0;
		int f = 0, l = a.length - 1;
		int mid = (l + f) / 2;
		boolean cond1 = false, cond4 = false;

		while (true) {
			if (l == f) {
				cond4 = true;
				break;
			}
			if (a[mid] > val && a[mid - 1] < val) {
				cond1 = true;
				break;
			} else if (a[mid] == val) {

				break;
			} else if (a[mid + 1] > val && a[mid] < val) {

				break;
			}
			if (a[mid] < val) {
				f = mid + 1;
			} else
				l = mid - 1;
			mid = (l + f) / 2;
		}
		if (cond4) {
			++l;
			return l;

		}
		if (cond4)
			return mid;
		++mid;
		return mid;

		// return 0;
	}

}
