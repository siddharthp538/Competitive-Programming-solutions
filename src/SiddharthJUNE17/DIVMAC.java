package SiddharthJUNE17;

import java.util.*;
import java.io.*;

class DIVMAC {
	static int[] lpd;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		seive();
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt(), q = s.nextInt(), temp = n;
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = s.nextInt();
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
			make_tree(tree, a, 0, temp - 1, 0);
			while (q-- > 0) {
				int qn = s.nextInt(), l = s.nextInt() - 1, r = s.nextInt() - 1;
				if (qn == 0)
					update(tree, lazy, l, r, 0, temp - 1, 0);
				else
					System.out.print(query(tree, lazy, l, r, 0, temp - 1, 0) + " ");
			}
			System.out.println();

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
		if (lpd[(int) tree[2 * pos + 1]] > lpd[(int) tree[2 * pos + 2]])
			tree[pos] = tree[2 * pos + 1];
		else
			tree[pos] = tree[2 * pos + 2];
	}

	static void update(long[] tree, long[] lazy, int qlow, int qhigh, int low, int high, int pos) {

		if (lazy[pos] != 0) {
			tree[pos] = tree[pos] / (lazy[pos] * lpd[(int) tree[pos]]);
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
			tree[pos] = tree[pos] / lpd[(int) tree[pos]];

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
		if (lpd[(int) tree[2 * pos + 1]] > lpd[(int) tree[2 * pos + 2]])
			tree[pos] = tree[2 * pos + 1];
		else
			tree[pos] = tree[2 * pos + 2];

	}

	static long query(long[] tree, long[] lazy, int qlow, int qhigh, int low, int high, int pos) {

		if (lazy[pos] != 0) {
			tree[pos] = tree[pos] / lpd[(int) tree[pos]];
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
			return lpd[(int) tree[pos]];

		int mid = (low + high) >> 1;
		long q1 = (query(tree, lazy, qlow, qhigh, low, mid, 2 * pos + 1));
		long q2 = query(tree, lazy, qlow, qhigh, mid + 1, high, 2 * pos + 2);
		return Math.max(q1, q2);

	}

	public static void seive() {
		lpd = new int[1000005];
		lpd[0] = lpd[1] = 1;
		boolean[] a = new boolean[1000005];
		for (long i = 2; i <= 1000000; i++) {
			if (!a[(int) i]) {
				lpd[(int) i] = (int) i;
				for (long j = i * i; j <= 1000000; j += i) {
					if (lpd[(int) j] == 0)
						lpd[(int) j] = (int) i;
					a[(int) j] = true;
				}
			}
		}
	}

}

