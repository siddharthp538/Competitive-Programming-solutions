package SiddharthJUNE17;

import java.io.*;
import java.util.*;

class XORSE {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = 100001;
		long[] pre_tree = new long[n];
		pre_tree[0] = 0;
		for (int i = 1; i <= 100000; i++)
			pre_tree[i] = pre_tree[i - 1] ^ i;
		for (int i = 0; i <= 100000; i++)
			System.out.println(pre_tree[i]);

		/*
		 * long[] tree; if ((n & (n - 1)) == 0) tree = new long[2 * n - 1]; else
		 * { n = (int) (Math.log(n) / Math.log(2)); n++; n = 1 << n; tree = new
		 * long[2 * n - 1];
		 * 
		 * } make_tree(tree, pre_tree, 0, pre_tree.length - 1, 0); int q =
		 * s.nextInt(); while (q-- > 0) { int l = s.nextInt(), r = s.nextInt();
		 * System.out.println(query(tree, l, r, 0, pre_tree.length - 1, 0)); }
		 */

	}

	static void make_tree(long[] tree, long[] pre_tree, int low, int high, int pos) {
		if (low == high) {
			tree[pos] = pre_tree[low];
			return;
		}
		int mid = (low + high) >> 1;
		make_tree(tree, pre_tree, low, mid, 2 * pos + 1);
		make_tree(tree, pre_tree, mid + 1, high, 2 * pos + 2);
		tree[pos] = tree[2 * pos + 1] ^ tree[2 * pos + 2];

	}

	static long query(long[] tree, int qlow, int qhigh, int low, int high, int pos) {
		if (qlow <= low && qhigh >= high)
			return tree[pos];
		if (qhigh < low || qlow > high)
			return 0;
		int mid = (low + high) >> 1;
		return (query(tree, qlow, qhigh, low, mid, 2 * pos + 1) ^ query(tree, qlow, qhigh, mid + 1, high, 2 * pos + 2));
	}
}
