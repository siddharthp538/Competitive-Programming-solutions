package com.siddharth;

import java.util.Scanner;

public class AbsPer {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			int k = s.nextInt();

			int[] b = new int[n + 1];
			if (k == 0) {

				for (int i = 1; i <= n; i++)
					System.out.print(i + " ");
			} else if (n % 2 == 0 && n % k == 0) {
				for (int i = 1; i <= b.length - 1; i++) {
					if (b[i] == 0) {
						b[i] = k + i;

						b[i + k] = i;
					}
				}
				for (int i = 1; i <= b.length - 1; i++) {
					System.out.print(b[i] + " ");
				}

			} else
				System.out.print(-1);
			System.out.println();
		}

	}

}
