package SiddharthJUNE17;

import java.io.PrintWriter;
import java.util.Scanner;

class COURAGE {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PrintWriter w = new PrintWriter(System.out);
		int n = s.nextInt();
		long a[] = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextLong();
		int q = s.nextInt();
		Pair[] tree;
		if (((n) & (n - 1)) == 0)
			tree = new Pair[2 * n - 1];
		else {
			n = (int) (Math.log(n) / Math.log(2));
			n++;
			n = 1 << n;
			tree = new Pair[2 * n - 1];
		}
		for (int i = 0; i < tree.length; i++)
			tree[i] = new Pair();
		make_tree(tree, a, 0, a.length - 1, 0);
		while (q-- > 0) {
			String str = s.next();
			if (str.equals("COUNT")) {
				int l = s.nextInt(), r = s.nextInt();
				long sum = query_sum(tree, l, r, 0, a.length - 1, 0);
				long min = query_min(tree, l, r, 0, a.length - 1, 0);
				w.println(sum - min);

			} else if (str.equals("EAT")) {
				int l = s.nextInt(), r = s.nextInt();
				a[r] -= l;
				query_update(tree, 0, a.length - 1, 0, r, -l);

			} else {
				int l = s.nextInt(), r = s.nextInt();
				a[r] += l;
				query_update(tree, 0, a.length - 1, 0, r, l);

			}

		}
		w.close();

	}

	static void make_tree(Pair[] tree, long[] a, int low, int high, int pos) {
		if (low == high) {
			tree[pos].sum = a[low];
			tree[pos].min = a[low];
			return;
		}
		int mid = (low + high) >> 1;
		make_tree(tree, a, low, mid, 2 * pos + 1);
		make_tree(tree, a, mid + 1, high, 2 * pos + 2);
		tree[pos].sum = tree[2 * pos + 1].sum + tree[2 * pos + 2].sum;
		tree[pos].min = Math.min(tree[2 * pos + 1].min, tree[2 * pos + 2].min);
	}

	static long query_sum(Pair[] tree, int qlow, int qhigh, int low, int high, int pos) {
		if (qlow <= low && qhigh >= high)
			return tree[pos].sum;
		if (qlow > high || qhigh < low)
			return 0;
		int mid = (low + high) >> 1;
		return (query_sum(tree, qlow, qhigh, low, mid, 2 * pos + 1)
				+ query_sum(tree, qlow, qhigh, mid + 1, high, 2 * pos + 2));
	}

	static long query_min(Pair[] tree, int qlow, int qhigh, int low, int high, int pos) {
		if (qlow <= low && qhigh >= high)
			return tree[pos].min;
		if (qlow > high || qhigh < low)
			return Integer.MAX_VALUE;
		int mid = (low + high) >> 1;
		return Math.min(query_min(tree, qlow, qhigh, low, mid, 2 * pos + 1),
				query_min(tree, qlow, qhigh, mid + 1, high, 2 * pos + 2));
	}

	static void query_update(Pair[] tree, int low, int high, int pos, int index, int diff) {
		if (index < low || index > high)
			return;
		tree[pos].sum += diff;
		if (low == high) {
			tree[pos].min += diff;
		}
		if (low != high) {
			int mid = (low + high) >> 1;
			query_update(tree, low, mid, 2 * pos + 1, index, diff);
			query_update(tree, mid + 1, high, 2 * pos + 2, index, diff);
			tree[pos].min = Math.min(tree[2 * pos + 1].min, tree[2 * pos + 2].min);
		}
	}

}

class Pair {
	long sum, min;

	Pair(long sum, long min) {
		this.sum = sum;
		this.min = min;
	}

	Pair() {

	}
}
