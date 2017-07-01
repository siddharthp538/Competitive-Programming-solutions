package SiddharthMay17;

import java.util.Scanner;

class SnackB {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			if (n % 2 == 0)
				System.out.println("no");

			else {

				boolean ok = true;

				if (a[0] != 1 || a[n - 1] != 1) {
					System.out.println("no");
					continue;
				}
				for (int i = 1; i <= n / 2; i++) {
					if (a[i] - a[i - 1] != 1) {
						ok = false;
						break;
					}

				}
				for (int i = n / 2; i < a.length - 1; i++) {
					if (a[i] - a[i + 1] != 1) {
						ok = false;
						break;
					}
				}
				System.out.println(ok ? "yes" : "no");

			}
		}

	}

}
