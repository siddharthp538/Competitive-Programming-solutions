package com.siddharth;

import java.util.Scanner;

class SGRID {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			char a[][] = new char[n][n];
			int j = 0;
			for (int i = 0; i < a.length; i++) {
				String str = s.next();
				for (j
						= 0; j < a.length; j++) {
					a[i][j] = str.charAt(j);
				}
			}
			int count = 0;
			int i1 = n - 1;
			j = -1;
			while (i1 >= 0) {
				j++;
				for (int i = n - 1; i >= 0; i--) {
					if (a[i][j] == '#') {
						// continue;
						break;
					} else {
						{
							if (IsValid(a, i, j, i, n - 1)) {
								count++;
							}
						}
					}

				}
				i1--;
			}
			System.out.println(count);
		}
	}

	static boolean IsValid(char[][] a, int x1, int y1, int x2, int y2) {
		for (int i = y1; i <= y2; i++) {
			if (a[x1][i] == '#')
				return false;
		}

		return true;
	}

}
