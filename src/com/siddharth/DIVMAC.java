package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

class DIVMAC {

	public static void main(String[] args) {
		boolean prime[] = new boolean[100001];
		seive(prime);
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int[] segtree = new int[getlength(n)];
		int[] lazy = new int[segtree.length];
		constructTree(a, segtree, 0, n - 1, 0);
		System.out.println(getmin(segtree, 1, 2, 0, n - 1, 0));

	}

	public static void update(int[] segtree, int[] lazy, int start, int end, int delta, int low, int high, int pos) {
		if (low > high) {
			return;
		}

		
		if (lazy[pos] != 0) {
			segtree[pos] += lazy[pos];
			if (low != high)
			{ 
				lazy[2 * pos + 1] += lazy[pos];
				lazy[2 * pos + 2] += lazy[pos];
			}
			lazy[pos] = 0;
		}

		
		if (start > high || end < low) {
			return;
		}

		
		if (start <= low && end >= high) {
			segtree[pos] += delta;
			if (low != high) {
				lazy[2 * pos + 1] += delta;
				lazy[2 * pos + 2] += delta;
			}
			return;
		}

		
		int mid = (low + high) / 2;
		update(segtree, lazy, start, end, delta, low, mid, 2 * pos + 1);
		update(segtree, lazy, start, end, delta, mid + 1, high, 2 * pos + 2);
	}

	public static int getmin(int segtree[], int qlow, int qhigh, int low, int high, int pos) {
		if (qlow <= low && qhigh >= high) {
			return segtree[pos];
		}
		if (qlow > high || qhigh < low) {
			return Integer.MAX_VALUE;
		}
		int mid = (low + high) / 2;
		return Math.min(getmin(segtree, qlow, qhigh, low, mid, 2 * pos + 1),
				getmin(segtree, qlow, qhigh, mid + 1, high, 2 * pos + 2));

	}

	public static void constructTree(int[] input, int[] segtree, int low, int high, int pos) {
		if (low == high) {
			segtree[pos] = input[low];
			return;
		}
		int mid = (low + high) / 2;
		constructTree(input, segtree, low, mid, 2 * pos + 1);
		constructTree(input, segtree, mid + 1, high, 2 * pos + 2);
		segtree[pos] = Math.min(segtree[2 * pos + 1], segtree[2 * pos + 2]);

	}

	public static int getlength(int n) {
		if (((n) & (n - 1)) == 0)
			return (2 * n) - 1;
		int ans = (int) (Math.log10(n) / Math.log10(2));
		++ans;
		ans = (int) Math.pow(2, ans);
		ans = 2 * ans - 1;
		return ans;

	}

	public static int LeastPrimeDivisor(int x, boolean[] prime) {
		if (x < 2)
			return 1;
		if (x % 2 == 0)
			return 2;

		else {
			int index = 3;
			while (index <= x) {
				if (prime[index])
					return index;
				index++;
			}
			return 1;
		}

	}

	public static void seive(boolean prime[]) {
		Arrays.fill(prime, true);
		for (int i = 2; i <= 100000; i++) {
			if (prime[i]) {
				for (int j = i * i; j <= 100000; j += i) {
					prime[j] = false;
				}
			}
		}
	}

}
