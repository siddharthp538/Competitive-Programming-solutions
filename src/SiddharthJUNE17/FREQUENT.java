package SiddharthJUNE17;

import java.util.Scanner;

class FREQUENT {
	static int n;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		while (true) {
			int q = s.nextInt();
			long[] a = new long[n];
			long count = 0, num = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				a[i] = s.nextLong();
				if (a[i] != num) {
					count++;
					num = a[i];
				}
			}
			num = a[0];
			long[] left = new long[(int) count];
			long[] right = new long[(int) count];
			long[] pre_tree = new long[(int) count];
			left[0] = 0;
			int index = 0;
			count = 1;
			for (int i = 0; i < n - 1; i++) {
				if (a[i] == a[i + 1])
					count++;
				else {
					// count++;
					pre_tree[index] = count;
					count = 1;
					right[index] = i;
					left[++index] = i + 1;
				}

			}
			pre_tree[index] = count;

			count = 1;
			right[index] = a.length - 1;
			long tree[];
			int temp = pre_tree.length;
			if ((temp & (temp - 1)) == 0)
				tree = new long[2 * temp - 1];
			else {
				temp = (int) (Math.log(temp) / Math.log(2));
				temp++;
				temp = 1 << temp;
				tree = new long[2 * temp - 1];

			}
			for (int i = 0; i < tree.length; i++) {
				tree[i] = (Integer.MIN_VALUE);
			}
			make_tree(pre_tree, tree, 0, pre_tree.length - 1, 0);
			while (q-- > 0) {
				long l = s.nextLong(), r = s.nextLong();
				l--;
				r--;
				long ans = 0;
				int ql = binarySearch(left, l);
				int qr = binarySearch(right, r);
				if (qr == -1) {
					ans = r - l + 1;
				} else if (left[ql] != l && right[qr] != r) {

					long max1 = right[ql] - l + 1, max3 = r - left[qr + 1] + 1;
					long max2 = query(tree, ql + 1, qr, 0, pre_tree.length - 1, 0);
					ans = Math.max(Math.max(max1, max2), max3);

				} else if (left[ql] == l && right[qr] != r) {
					long max1 = query(tree, ql, qr, 0, pre_tree.length - 1, 0);
					long max2 = r - left[qr + 1] + 1;
					ans = Math.max(max1, max2);
				} else if (left[ql] != l && right[qr] == r) {
					long max1 = query(tree, ql + 1, qr, 0, pre_tree.length - 1, 0);
					long max2 = right[ql] - l + 1;
					ans = Math.max(max1, max2);
				} else {
					ans = query(tree, ql, qr, 0, pre_tree.length - 1, 0);
				}
				System.out.println(ans);
			}
			n = s.nextInt();
			if (n == 0)
				break;
		}

	}

	static int binarySearch(long a[], long key) {
		int low = 0, high = a.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == key) {
				high = mid;
				break;
			} else if (a[mid] > key)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return high;

	}

	static void make_tree(long[] a, long[] tree, int low, int high, int pos) {

		if (low == high) {
			tree[pos] = a[low];
			return;
		}
		int mid = (low + high) >> 1;
		make_tree(a, tree, low, mid, 2 * pos + 1);
		make_tree(a, tree, mid + 1, high, 2 * pos + 2);
		if (tree[2 * pos + 1] > tree[2 * pos + 2])
			tree[pos] = tree[2 * pos + 1];
		else
			tree[pos] = tree[2 * pos + 2];
	}

	static long query(long[] tree, long qlow, long qhigh, long low, long high, long pos) {
		if (qlow <= low && qhigh >= high)
			return tree[(int) pos];
		if (qlow > high || qhigh < low) {
			return (Integer.MIN_VALUE);
		}
		long mid = (low + high) >> 1;
		long q1 = query(tree, qlow, qhigh, low, mid, 2 * pos + 1);
		long q2 = query(tree, qlow, qhigh, mid + 1, high, 2 * pos + 2);
		return Math.max(q1, q2);

	}

}
