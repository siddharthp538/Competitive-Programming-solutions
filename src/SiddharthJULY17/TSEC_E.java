package SiddharthJULY17;

import java.util.Scanner;

class TSEC_E {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), q = s.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextLong();
		long[] tree;
		if (((n) & (n - 1)) == 0) {
			tree = new long[2 * n - 1];
		} else {
			n = (int) (Math.log(n) / Math.log(2));
			n++;
			n = 1 << n;
			tree = new long[2 * n - 1];
		}
		make_tree(tree, a, 0, a.length - 1, 0);
		while (q-- > 0) {
			int k = s.nextInt();
			long max = 0, min = Integer.MAX_VALUE;
			for (int i = 0; i <= a.length - k; i++) {
				max = query(tree, i, i + k - 1, 0, a.length - 1, 0);
				if (max < min)
					min = max;

			}
			System.out.println(min);

		}
	}

	static void make_tree(long[] tree, long[] a, int low, int high, int pos) {
		if (low == high) {
			tree[pos] = a[low];
			return;
		}
		int mid = (low + high) >> 1;
		make_tree(tree, a, low, mid, 2 * pos + 1);
		make_tree(tree, a, mid + 1, high, 2 * pos + 2);
		tree[pos] = Math.max(tree[2 * pos + 1], tree[2 * pos + 2]);
	}

	static long query(long[] tree, int qlow, int qhigh, int low, int high, int pos) {
		if (qlow <= low && qhigh >= high)
			return tree[pos];
		if (qlow > high || qhigh < low)
			return Integer.MIN_VALUE;
		int mid = (low + high) >> 1;
		return Math.max(query(tree, qlow, qhigh, low, mid, 2 * pos + 1),
				query(tree, qlow, qhigh, mid + 1, high, 2 * pos + 2));
	}

}
