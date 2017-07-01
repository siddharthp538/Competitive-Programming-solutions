package SiddharthJUNE17;

import java.io.*;
import java.util.*;

class MULTQ3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PrintWriter w = new PrintWriter(System.out);
		int n = s.nextInt(), q = s.nextInt(), temp = n;
		N[] tree;
		long[] lazy;
		if (((n) & (n - 1)) == 0) {
			tree = new N[2 * n - 1];
			lazy = new long[2 * n - 1];
		} else {
			n = (int) (Math.log(10) / Math.log(2));
			n++;
			n = 1 << n;
			tree = new N[2 * n - 1];
			lazy = new long[2 * n - 1];
		}
		for (int i = 0; i < tree.length; i++) {
			tree[i] = new N();
		}
		make_tree(tree, 0, temp - 1, 0);

		while (q-- > 0) {
			int type = s.nextInt(), l = s.nextInt(), r = s.nextInt();
			if (type == 0)
				update(tree, lazy, l, r, 0, temp - 1, 0);
			else
				w.println(query(tree, lazy, l, r, 0, temp - 1, 0));
		}
		w.close();

	}

	static void make_tree(N[] tree, int low, int high, int pos) {
		if (low == high) {
			tree[pos].value = 3;
			tree[pos].freq = 1;
			return;
		}
		int mid = (low + high) >> 1;
		make_tree(tree, low, mid, 2 * pos + 1);
		make_tree(tree, mid + 1, high, 2 * pos + 2);
		tree[pos].value = tree[2 * pos + 1].value + tree[2 * pos + 2].value;
		tree[pos].freq = tree[2 * pos + 1].freq + tree[2 * pos + 2].freq;
	}

	static void update(N[] tree, long[] lazy, int qlow, int qhigh, int low, int high, int pos) {
		if (low > high)
			return;
		if (lazy[pos] != 0) {
			tree[pos].value += lazy[pos];
			if (tree[pos].value % 3 == 0)
				tree[pos].freq = high - low + 1;
			else
				tree[pos].freq = 0;
			if (low != high) {
				lazy[2 * pos + 1] += lazy[pos];
				lazy[2 * pos + 2] += lazy[pos];
			}
			lazy[pos] = 0;
		}
		if (qlow > high || qhigh < low) {
			return;
		}
		if (qlow <= low && qhigh >= high) {
			tree[pos].value = high - low + 1 + tree[pos].value;
			if (tree[pos].value % 3 == 0)
				tree[pos].freq = high - low + 1;
			else
				tree[pos].freq = 0;
			if (low != high) {
				lazy[2 * pos + 1]++;
				lazy[2 * pos + 2]++;
			}
			return;
		}
		int mid = (low + high) >> 1;
		update(tree, lazy, qlow, qhigh, low, mid, 2 * pos + 1);
		update(tree, lazy, qlow, qhigh, mid + 1, high, 2 * pos + 2);
		tree[pos].value = (tree[2 * pos + 1].value + tree[2 * pos + 2].value);
		tree[pos].freq = tree[2 * pos + 1].freq + tree[2 * pos + 2].freq;

	}

	static long query(N[] tree, long[] lazy, int qlow, int qhigh, int low, int high, int pos) {
		if (low > high)
			return 0;
		if (lazy[pos] != 0) {
			tree[pos].value += lazy[pos];
			if (tree[pos].value % 3 == 0)
				tree[pos].freq = high - low + 1;
			else
				tree[pos].freq = 0;
			if (low != high) {
				lazy[2 * pos + 1] += lazy[pos];
				lazy[2 * pos + 2] += lazy[pos];
			}

		}
		if (qlow > high || qhigh < low)
			return 0;
		if (qlow <= low && qhigh >= high)
			return tree[pos].freq;
		int mid = (low + high) >> 1;
		long q1 = query(tree, lazy, qlow, qhigh, low, mid, 2 * pos + 1);
		long q2 = query(tree, lazy, qlow, qhigh, mid + 1, high, 2 * pos + 2);
		tree[pos].value = (tree[2 * pos + 1].value + tree[2 * pos + 2].value);
		tree[pos].freq = (tree[2 * pos + 1].freq + tree[2 * pos + 2].freq);
		return (q1 + q2);
	}

}

class N {
	long value, freq;

	N(long value, long freq) {
		this.value = value;
		this.freq = freq;
	}

	N() {

	}
}

