package SiddharthMay17;

import java.util.Arrays;
import java.util.Scanner;

class SnackC {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {

			int n = s.nextInt(), q = s.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = s.nextInt();
			Arrays.sort(a);
			while (q-- > 0) {
				int x = s.nextInt();
				int l = 0, r = n - 1, m = 0;
				while (l <= r) {
					m = l + (r - l) / 2;

					if (a[m] == x)
						break;

					if (a[m] < x)
						l = m + 1;

					else
						r = m - 1;
				}
				int count = 0, res = 0, index = 0;
				if (l <= r) {
					res = m - 1;
					count = n - m;
					index = m - 1;
				} else {
					res = r;
					count = n - r - 1;
					index = r;
				}

				if (index > 0 && index < a.length && x - a[index] <= res) {
					count++;

				}

				System.out.println(count);
			}

		}

	}

}
