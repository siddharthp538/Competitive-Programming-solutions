package SiddharthJUNE17;

import java.io.*;
import java.util.*;

class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PrintWriter w = new PrintWriter(System.out);
		int t = s.nextInt();
		int cases = 1;
		while (t-- > 0) {
			int n = s.nextInt(), q = s.nextInt();
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = s.nextLong();
			long tree[];
			if ((n & (n - 1)) == 0)
				tree = new long[2 * n - 1];
			else {
				n = (int) (Math.log(n) / Math.log(2));
				n++;
				n = 1 << n;
				tree = new long[2 * n - 1];

			}
			Arrays.fill(tree, Integer.MAX_VALUE);
			make_tree(a, tree, 0, a.length - 1, 0);

			w.println("Scenario #" + (cases++) + ":");
			while (q-- > 0) {
				long l = s.nextLong(), r = s.nextLong();

				w.println(query(tree, l - 1, r - 1, 0, a.length - 1, 0));
			}
		}
		w.close();
	}

	static void make_tree(long a[], long[] tree, long low, long high, long pos) {
		if (low == high) {
			tree[(int) pos] = a[(int) low];
			return;
		}
		long mid = (low + high) >> 1;
		make_tree(a, tree, low, mid, 2 * pos + 1);
		make_tree(a, tree, mid + 1, high, 2 * pos + 2);

		tree[(int) pos] = Math.min(tree[(int) (2 * pos + 1)], tree[(int) (2 * pos + 2)]);

	}

	static long query(long[] tree2, long qlow, long qhigh, long low, long high, long pos) {
		if (qlow <= low && qhigh >= high)
			return tree2[(int) pos];
		if (qlow > high || qhigh < low)
			return Integer.MAX_VALUE;
		long mid = (low + high) >> 1;
		long q1 = query(tree2, qlow, qhigh, low, mid, 2 * pos + 1);
		long q2 = query(tree2, qlow, qhigh, mid + 1, high, 2 * pos + 2);
		return Math.min(q1, q2);
	}

}
