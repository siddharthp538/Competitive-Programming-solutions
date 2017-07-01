package SiddharthJUNE17;

import java.util.Scanner;

class GSS1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = s.nextLong();
		Node[] tree;
		if ((n & (n - 1)) == 0)
			tree = new Node[2 * n - 1];
		else {
			n = (int) (Math.log(n) / Math.log(2));
			n++;
			n = 1 << n;
			tree = new Node[2 * n - 1];
		}
		for (int i = 0; i < tree.length; i++)
			tree[i] = new Node();
		make_tree(tree, a, 0, a.length - 1, 0);
		int q = s.nextInt();
		while (q-- > 0) {
			int l = s.nextInt(), r = s.nextInt();
			System.out.println(query(tree, l - 1, r - 1, 0, a.length - 1, 0).best);
		}

	}

	static void make_tree(Node[] tree, long[] a, int low, int high, int pos) {
		if (low == high) {
			tree[pos].best = a[low];
			tree[pos].left = a[low];
			tree[pos].right = a[low];
			tree[pos].sub = a[low];
			tree[pos].total = a[low];
			return;
		}
		int mid = (low + high) >> 1;
		make_tree(tree, a, low, mid, 2 * pos + 1);
		make_tree(tree, a, mid + 1, high, 2 * pos + 2);
		tree[pos].left = Math.max(tree[2 * pos + 1].left, tree[2 * pos + 1].total + tree[2 * pos + 2].left);
		tree[pos].right = Math.max(tree[2 * pos + 2].right, tree[2 * pos + 2].total + tree[2 * pos + 1].right);
		tree[pos].total = tree[2 * pos + 1].total + tree[2 * pos + 2].total;
		tree[pos].sub = Math.max(Math.max(tree[2 * pos + 1].right, tree[2 * pos + 2].left),
				(tree[2 * pos + 1].right + tree[2 * pos + 2].left));
		tree[pos].best = Math.max(Math.max(tree[pos].left, tree[pos].right), Math.max(tree[pos].total, tree[pos].sub));
	}

	static Node query(Node[] tree, int qlow, int qhigh, int low, int high, int pos) {
		if (qlow <= low && qhigh >= high)
			return tree[pos];

		if (qlow > high || qhigh < low) {
			Node temp = new Node();
			temp.best = Integer.MIN_VALUE;
			return temp;

		}
		int mid = (low + high) >> 1;
		Node q1 = query(tree, qlow, qhigh, low, mid, 2 * pos + 1);
		Node q2 = query(tree, qlow, qhigh, mid + 1, high, 2 * pos + 2);
		if (q1.best < 0 || q2.best < 0) {
			if (q1.best > q2.best)
				return q1;
			return q2;
		}
		Node m = new Node();
		long x1 = q1.total + q2.total, x2 = q1.total + q2.left, x3 = q2.total + q1.right;
		x1 = Math.max(x1, q1.total + q2.left);
		x1 = Math.max(x1, q2.total + q1.right);
		x1 = Math.max(x1, q1.left);
		x1 = Math.max(x1, q2.right);
		m.total = x1;
		return m;

	}

}

class Node {
	long left, right, sub, total, best;
}
