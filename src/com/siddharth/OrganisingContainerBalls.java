package com.siddharth;

import java.util.Arrays;
import java.util.Scanner;

public class OrganisingContainerBalls {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- > 0) {
			int n = s.nextInt();
			long[][] m = new long[n][n];
			long[] sizes = new long[n];
			long[] types = new long[n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					m[i][j] = s.nextInt();
				}
			}
			long sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					sum += m[j][i];
				}
				types[i] = sum;
				sum = 0;

			}
			sum = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					sum += m[i][j];
				}
				sizes[i] = sum;
				sum = 0;
			}
			sum = 0;
			Arrays.sort(sizes);
			Arrays.sort(types);
			boolean ok = true;
			for (int i = 0; i < n; i++) {
				if (types[i] != sizes[i]) {
					ok = false;
					break;
				}
			}
			System.out.println(ok ? "Possible" : "Impossible");
		}

	}

}
