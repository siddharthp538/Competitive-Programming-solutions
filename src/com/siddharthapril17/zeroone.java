
package com.siddharthapril17;

import java.util.Scanner;

class zeroone {
	public static void main(String[] args) throws java.lang.Exception {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}
			int z = 0;
			boolean ok = false;
			for (int i = 0; i < n - 1; i++) {
				if (a[i] == 0) {
					ok = true;
					z++;

				} else if (ok) {
					if (a[i + 1] == 0) {
						a[i] = 0;
					} else
						ok = false;

				}

			}
			int ans = 0;
			z = 0;
			for (int i = 0; i < n; i++) {
				if (a[i] == 0) {
					z++;
				} else {
					if (z > 1) {
						ans += z - 2;

					}
					z = 0;

				}

			}
			if (z > 1) {
				ans += z - 2;
			}
			z -= 2;
			System.out.println(ans % 2 == 0 ? "Bob" : "Alice");
			
			

		}
	}
}
