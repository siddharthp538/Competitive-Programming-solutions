package SiddharthJUNE17;

import java.util.*;
import java.io.*;

public class ALGOCRUSH {
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
			int l = s.nextInt(), r = s.nextInt(), val = s.nextInt();
			update(tree, lazy, l - 1, r - 1, 0, temp - 1, 0, val);
		}
		w.println(rmq(tree, lazy, 0, temp - 1, 0, temp - 1, 0));
		w.close();
	}

	static void update(long[] tree, long[] lazy, int qlow, int qhigh, int low, int high, int pos, int val) {
		if (low > high)
			return;
		if (lazy[pos] != 0) {
			tree[pos] += lazy[pos];
			if (low != high) {
				lazy[2 * pos + 1] += lazy[pos];
				lazy[2 * pos + 2] += lazy[pos];
			}
			lazy[pos] = 0;
		}
		if (qlow > high || qhigh < low)
			return;
		if (qlow <= low && qhigh >= high) {
			tree[pos] += val;
			if (low != high) {
				lazy[2 * pos + 1] += val;
				lazy[2 * pos + 2] += val;
			}
			return;
		}
		int mid = (low + high) >> 1;
		update(tree, lazy, qlow, qhigh, low, mid, 2 * pos + 1, val);
		update(tree, lazy, qlow, qhigh, mid + 1, high, 2 * pos + 2, val);
		tree[pos] = Math.max(tree[2 * pos + 1], tree[2 * pos + 2]);
	}

	static long rmq(long[] tree, long[] lazy, int qlow, int qhigh, int low, int high, int pos) {
		if (low > high)
			return Integer.MIN_VALUE;
		if (lazy[pos] != 0) {
			tree[pos] += lazy[pos];
			if (low != high) {
				lazy[2 * pos + 1] += lazy[pos];
				lazy[2 * pos + 2] += lazy[pos];
			}
			lazy[pos] = 0;
		}
		if (qlow > high || qhigh < low) {
			return Integer.MIN_VALUE;
		}
		if (qlow <= low && qhigh >= high) {
			return tree[pos];
		}
		int mid = (low + high) >> 1;
		return Math.max(rmq(tree, lazy, qlow, qhigh, low, mid, 2 * pos + 1),
				rmq(tree, lazy, qlow, qhigh, mid + 1, high, 2 * pos + 1));

	}

}

