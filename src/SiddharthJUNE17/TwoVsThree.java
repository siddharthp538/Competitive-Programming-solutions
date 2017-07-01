package SiddharthJUNE17;

import java.util.Scanner;

class TwoVsThree {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str = s.next();
		long[] a = new long[n];
		long[] copy = new long[n];
		int shift = 0;
		for (int i = 0; i < n; i++) {
			a[i] = Character.getNumericValue(str.charAt(i));
			copy[i] = a[i];
		}
		long[] decide = new long[n];
		decide[n - 1] = 0;
		for (int i = n - 2; i >= 0; i--)
			decide[i] = decide[i + 1] + a[i];
		for (int i = n - 1; i >= 0; i--) {
			if (copy[i] == 1) {
				if (shift % 2 == 0)
					copy[i] = 1;
				else
					copy[i] = 2;

			}
			shift++;
		}

		long[] tree;
		if ((n & (n - 1)) == 0) {
			tree = new long[2 * n - 1];
		} else {
			n = (int) (Math.log(n) / Math.log(2));
			n++;
			n = 1 << n;

			tree = new long[2 * n - 1];
		}
		make_tree(tree, copy, 0, copy.length - 1, 0);

		int q = s.nextInt();
		while (q-- > 0) {
			int type = s.nextInt();
			if (type == 1) {
				int r = s.nextInt();
				int index = r;
				if (a[r] == 0) {
					a[r] = 1;

					int val = 1;
					r = a.length - 1 - r;
					if (r % 2 == 1)
						val = 2;
					update(tree, index, 0, a.length - 1, 0, val);
					for (int i = index; i >= 0; i--)
						decide[i]++;
				}
				continue;
			}
			int l = s.nextInt(), r = s.nextInt();
			boolean ok = false;
			if (decide[r] % 2 == 0)
				ok = true;
			System.out.println(query(tree, l, r, 0, a.length - 1, 0, ok));
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
		tree[pos] = tree[2 * pos + 1] + tree[2 * pos + 2];
		tree[pos] %= 3;
	}

	static long query(long[] tree, int qlow, int qhigh, int low, int high, int pos, boolean ok) {
		if (qlow <= low && qhigh >= high) {
			if (ok)
				return tree[pos];
			if (tree[pos] == 1)
				return 2;
			if (tree[pos] == 2)
				return 1;
			return 0;

		}
		if (qlow > high || qhigh < low)
			return 0;
		int mid = (low + high) >> 1;
		return (query(tree, qlow, qhigh, low, mid, 2 * pos + 1, ok)
				+ query(tree, qlow, qhigh, mid + 1, high, 2 * pos + 2, ok)) % 3;

	}

	static void update(long[] tree, int index, int low, int high, int pos, int val) {
		if (index < low || index > high)
			return;
		tree[pos] += val;
		tree[pos] %= 3;
		if (low != high) {
			int mid = (low + high) >> 1;
			update(tree, index, low, mid, 2 * pos + 1, val);
			update(tree, index, mid + 1, high, 2 * pos + 2, val);
		}
	}

}
