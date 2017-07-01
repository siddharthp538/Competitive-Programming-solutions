package SiddharthJUNE17;

//maximum sum in an interval using segment tree

import java.io.*;
import java.util.*;

class GSS {
	static int[] tree;
	static int[] a;

	public static void main(String[] args) {
		solve();

	}

	public static void solve() {
		Scanner s=new Scanner(System.in);
		PrintWriter w = new PrintWriter(System.out);
		int n = s.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextInt();
		if ((n & (n - 1)) == 0)
			tree = new int[2 * n - 1];
		else {
			n = (int) (Math.log(n) / Math.log(2));
			n++;
			n = 1 << n;
			tree = new int[2 * n - 1];

		}
		make_tree(a, tree, 0, a.length - 1, 0);
		int q = s.nextInt();
		while (q-- > 0) {
			int l = s.nextInt(), r = s.nextInt();
			w.println(query(tree, l - 1, r - 1, 0, a.length - 1, 0));
		}
		w.close();
	}

	static void make_tree(int a[], int[] tree, int low, int high, int pos) {
		if (low == high) {
			tree[pos] = a[high];
			return;
		}
		int mid = (low + high) >> 1;
		make_tree(a, tree, low, mid, 2 * pos + 1);
		make_tree(a, tree, mid + 1, high, 2 * pos + 2);
		tree[pos] = Math.max(Math.max(tree[2 * pos + 1], tree[2 * pos + 2]), tree[2 * pos + 1] + tree[2 * pos + 2]);

	}

	static int query(int[] tree, int qlow, int qhigh, int low, int high, int pos) {
		if (qlow <= low && qhigh >= high)
			return tree[pos];

		if (qlow > high || qhigh < low)
			return Integer.MIN_VALUE;
		int mid = (low + high) >> 1;
		int q1 = query(tree, qlow, qhigh, low, mid, 2 * pos + 1);
		int q2 = query(tree, qlow, qhigh, mid + 1, high, 2 * pos + 2);
		if (q1 < 0 || q2 < 0)
			return Math.max(q1, q2);
		return q1 + q2;

	}

}
