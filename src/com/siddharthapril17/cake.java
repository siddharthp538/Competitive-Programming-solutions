package com.siddharthapril17;

import java.util.Scanner;

public class cake {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt(), cn = 0;
		while (t-- > 0) {
			int r = s.nextInt(), c = s.nextInt();
			char[][] a = new char[r][c];
			for (int i = 0; i < r; i++) {
				String str = s.next();
				for (int j = 0; j < c; j++) {
					a[i][j] = str.charAt(j);
				}
			}
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (a[i][j] == '?') {
						if (i - 1 >= 0 && a[i - 1][j] != '?') {
							a[i][j] = a[i - 1][j];

						} else if (j + 1 < c && a[i][j + 1] != '?') {
							a[i][j] = a[i][j + 1];

						} else if (i + 1 < r && a[i + 1][j] != '?') {
							a[i][j] = a[i + 1][j];
						} else if (i - 1 >= 0 && a[i - 1][j] != '?') {
							a[i][j] = a[i - 1][j];
						} else {
							a[i][j] = 'A';
						}

					}
				}
			}
			System.out.println("Case #" + (++cn) + ": ");
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					System.out.print(a[i][j]);
				}
				System.out.println();
			}

		}

	}
}
