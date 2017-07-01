package SiddharthJUNE17;

import java.util.*;
import java.io.*;

class FLIPCOIN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PrintWriter w = new PrintWriter(System.out);
		int n = s.nextInt(), q = s.nextInt(), temp = n;
		long[] tree, lazy;
		if (((n) & (n - 1)) == 0) {
			tree = new long[2 * n - 1];
			lazy = new long[2 * n - 1];
		} else {
			n = (int) (Math.log(n) / Math.log(2));
			n++;
			n = 1 << n;
			tree = new long[2 * n - 1];
			lazy = new long[2 * n - 1];
		}
		while (q-- > 0) {
			int type = s.nextInt(), l = s.nextInt(), r = s.nextInt();
			if (type == 1)
				w.println(query(tree, lazy, l, r, 0, temp - 1, 0));
			else
				update(tree, lazy, l, r, 0, temp - 1, 0);
		}
		w.close();

	}

	static void update(long[] tree, long[] lazy, int qlow, int qhigh, int low, int high, int pos) {

		if (lazy[pos] != 0) {
			if (lazy[pos] % 2 == 1) {
				tree[pos] = high - low + 1 - tree[pos];

			}
			if (low != high) {
				if (pos == 0) {
					lazy[2 * pos + 1]++;
					lazy[2 * pos + 2]++;
				} else {
					if (lazy[pos] == 0) {
						lazy[2 * pos + 1]++;
						lazy[2 * pos + 2]++;
					} else {
						lazy[2 * pos + 1] += lazy[pos];
						lazy[2 * pos + 2] += lazy[pos];
					}
				}
			}
			lazy[pos] = 0;
		}
		if (qlow > high || qhigh < low) {
			return;
		}
		if (qlow <= low && qhigh >= high) {

			tree[pos] = high - low + 1 - tree[pos];
			if (low != high) {
				if (pos == 0) {
					lazy[2 * pos + 1]++;
					lazy[2 * pos + 2]++;
				} else {
					if (lazy[pos] == 0) {
						lazy[2 * pos + 1]++;
						lazy[2 * pos + 2]++;
					} else {
						lazy[2 * pos + 1] += lazy[pos];
						lazy[2 * pos + 2] += lazy[pos];
					}
				}
			}
			return;
		}

		int mid = (low + high) >> 1;

		update(tree, lazy, qlow, qhigh, low, mid, 2 * pos + 1);
		update(tree, lazy, qlow, qhigh, mid + 1, high, 2 * pos + 2);
		tree[pos] = tree[2 * pos + 1] + tree[2 * pos + 2];

	}

	static long query(long[] tree, long[] lazy, int qlow, int qhigh, int low, int high, int pos) {

		if (lazy[pos] != 0) {
			if (lazy[pos] % 2 == 1)
				tree[pos] = high - low + 1 - tree[pos];
			if (low != high) {
				if (pos == 0) {
					lazy[2 * pos + 1]++;
					lazy[2 * pos + 2]++;
				} else {
					if (lazy[pos] == 0) {
						lazy[2 * pos + 1]++;
						lazy[2 * pos + 2]++;
					} else {
						lazy[2 * pos + 1] += lazy[pos];
						lazy[2 * pos + 2] += lazy[pos];
					}
				}
			}
			lazy[pos] = 0;
		}
		if (qlow > high || qhigh < low) {
			return 0;
		}
		if (qlow <= low && qhigh >= high)
			return tree[pos];

		int mid = (low + high) >> 1;
		return (query(tree, lazy, qlow, qhigh, low, mid, 2 * pos + 1)
				+ query(tree, lazy, qlow, qhigh, mid + 1, high, 2 * pos + 2));

	}

}