package SiddharthJULY17;

import java.io.PrintWriter;
import java.util.Scanner;

class TSEC_C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PrintWriter w = new PrintWriter(System.out);
		int t = s.nextInt();
		while (t-- > 0) {
			int k = s.nextInt(), n = s.nextInt();
			int[] a = new int[n];

			int max = -1;
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
				max = Math.max(max, a[i]);
			}
			boolean[] vis = new boolean[max + 1];
			for (int i = 0; i < k - 1; i++) {
				w.print(-1 + " ");
				vis[a[i]] = true;

			}
			for (int i = k - 1; i < a.length; i++) {
				vis[a[i]] = true;
				w.print(search(vis, a, i + 1 - k + 1) + " ");
			}
			w.println();
		}
		w.close();

	}

	public static int search(boolean[] vis, int[] a, int k) {
		int count = 0;
		for (int i = 0; i < vis.length; i++) {
			if (vis[i] == true)
				count++;
			if (count == k)
				return i;
		}

		return -1;
	}

}
